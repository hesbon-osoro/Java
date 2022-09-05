ONTENT)
            else:
                # invalid url
                self.send_head(http.client.NO_CONTENT)
        # =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        elif self.path.startswith("/result"):
            match = result_pattern.match(self.path)

            if match:
                job_id = match.groups()[0]

                job = self.server.getJobID(job_id)

                if job:
                    self.server.stats("", "Sending result to client")

                    zip_filepath = job.getResultPath("results.zip")
                    with zipfile.ZipFile(zip_filepath, "w") as zfile:
                        for frame in job.frames:
                            if frame.status == netrender.model.FRAME_DONE:
                                for filename in frame.results:
                                    filepath = job.getResultPath(filename)

                                    zfile.write(filepath, filename)


                    f = open(zip_filepath, 'rb')
                    self.send_head(content = "application/x-zip-compressed")
                    shutil.copyfileobj(f, self.wfile)
                    f.clos