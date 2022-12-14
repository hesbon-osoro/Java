package assignment;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SpiralCode extends JPanel implements Runnable {

    public static final int WIDTH = 500;

    public static final double PIX_RES = 3;
    public static final double WEIGHT = PIX_RES / WIDTH;

    public static final long SLEEP_TIME = 10;

    private final GeneralPath topRight = new GeneralPath();
    private final GeneralPath topLeft = new GeneralPath();
    private final GeneralPath bottomLeft = new GeneralPath();
    private final GeneralPath bottomRight = new GeneralPath();

    public SpiralCode(){
        this(WIDTH);
    }

    public SpiralCode(final int width) {
        super();
        this.setPreferredSize(new Dimension(width, width));
        topRight.moveTo(width, 0);
        topLeft.moveTo(0, 0);
        bottomLeft.moveTo(0, width);
        bottomRight.moveTo(width, width);
    }

    @Override
    public void paintComponent(final Graphics g) {
        final Graphics2D g2 = (Graphics2D) g;
        g2.draw(topLeft);
        g2.draw(topRight);
        g2.draw(bottomLeft);
        g2.draw(bottomRight);
    }

    /**
     * generated by eclipse
     */
    private static final long serialVersionUID = -756842929825603438L;

    @Override
    public void run() {
        while (true) {
            iterate();
            this.repaint();
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void iterate() {
        final double dx = topRight.getCurrentPoint().getX()
                - topLeft.getCurrentPoint().getX();
        final double dy = -topRight.getCurrentPoint().getY()
                + topLeft.getCurrentPoint().getY();
        final Point2D pTR = topRight.getCurrentPoint();
        final Point2D pTL = topLeft.getCurrentPoint();
        final Point2D pBL = bottomLeft.getCurrentPoint();
        final Point2D pBR = bottomRight.getCurrentPoint();

        topRight.lineTo(pTR.getX() - dx * WEIGHT, pTR.getY() + dy * WEIGHT);
        topLeft.lineTo(pTL.getX() + dy * WEIGHT, pTL.getY() + dx * WEIGHT);
        bottomRight.lineTo(pBR.getX() - dy * WEIGHT, pBR.getY() - dx * WEIGHT);
        bottomLeft.lineTo(pBL.getX() + dx * WEIGHT, pBL.getY() - dy * WEIGHT);
    }

    public static void main(String... args) {
        final JFrame frame = new JFrame("Spiral Code");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // who cares
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final SpiralCode spiral = new SpiralCode();

        frame.setContentPane(spiral);
        frame.pack();
        frame.setVisible(true);

        (new Thread(spiral)).start();
    }
}
