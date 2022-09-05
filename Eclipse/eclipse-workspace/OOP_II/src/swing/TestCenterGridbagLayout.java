package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TestCenterGridbagLayout {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JPanel mainPanel = new JPanel(new GridLayout(3, 3));
                for (int i = 0; i < 9; i++) {
                    mainPanel.add(new JButton("Button"));
                }
                mainPanel.setBorder(new TitledBorder("Main Panel"));

                JPanel wrapperPanel = new JPanel(new GridBagLayout());
                wrapperPanel.setPreferredSize(new Dimension(350, 300));
                wrapperPanel.add(mainPanel);
                wrapperPanel.setBorder(new TitledBorder("Wrapper panel with GridbagLayout"));

                JOptionPane.showMessageDialog(null, wrapperPanel);

            }
        });
    }
}