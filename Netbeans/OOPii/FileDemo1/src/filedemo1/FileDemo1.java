
package filedemo1;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FileDemo1 extends JFrame implements ActionListener {
private TextArea inputTextArea = new TextArea();
private JButton saveButton = new JButton("save");
private FileWriter outFile;
public static void main(String[] args) {
    new FileDemo1();
}

public FileDemo1() {
    setSize(300, 300);
    setTitle("File Output Demo");
    add("Center", inputTextArea);
    JPanel bottom = new JPanel();
    bottom.add(saveButton);
    add("South", bottom);
    saveButton.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == saveButton) {
            try {
                outFile = new FileWriter("testout.txt", true);
                outFile.write(inputTextArea.getText());
                outFile.close();
                }
            catch (IOException e) {
                System.err.println("File Error: " + e);
                System.exit(1);
                 }
            }
        }
}