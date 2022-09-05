string \- obtain human\-readable
error message
.SH "SYNOPSIS"
.IX Header "SYNOPSIS"
.Vb 1
\& #include <openssl/err.h>
\&
\& char *ERR_error_string(unsigned long e, char *buf);
\& void ERR_error_string_n(unsigned long e, char *buf, size_t len);
\&
\& const char *ERR_lib_error_string(unsigned long e);
\& const char *ERR_func_error_string(unsigned long e);
\& const char *ERR_reason_error_string(unsigned long e);
.Ve
.SH "DESCRIPTION"
.IX Header "DESCRIPTION"
\&\fIERR_error_string()\fR generates a human-readable string representing the
error code \fIe\fR, and places it at \fIbuf\fR. \fIbuf\fR must be at least 120
bytes long. If \fIbuf\fR is \fB\s-1NULL\s0\fR, the error string is placed in a
static buffer.
\&\fIERR_error_string_n()\fR is a variant of \fIERR_error_string()\fR that writes
at most \fIlen\fR characters (including the terminating 0)
and truncates the string if necessary.
For \fIERR_error_string_n()\fR, \fIbuf\fR may