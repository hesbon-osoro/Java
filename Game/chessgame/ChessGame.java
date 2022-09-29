package chessgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessGame {
    public static void main(String[] args) throws IOException {
        LinkedList<Piece> ps = new LinkedList<>();
        BufferedImage all = ImageIO.read(new File("./chessgame/chess.png"));
        Image imgs[] = new Image[12];
        int ind = 0;
        for (int y = 0; y < 400; y += 200) {
            for (int x = 0; x < 1200; x += 200) {
                imgs[ind] = all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                ind++;
            }
        }
        Piece brook = new Piece(0, 0, false, "rook", ps);
        Piece bknight = new Piece(1, 0, false, "knight", ps);
        Piece bbishop = new Piece(2, 0, false, "bishop", ps);
        Piece bqueen = new Piece(3, 0, false, "queen", ps);
        Piece bking = new Piece(4, 0, false, "king", ps);
        Piece bbishop2 = new Piece(5, 0, false, "bishop", ps);
        Piece bknight2 = new Piece(6, 0, false, "knight", ps);
        Piece brook2 = new Piece(7, 0, false, "rook", ps);
        Piece bpawn = new Piece(0, 1, false, "pawn", ps);
        Piece bpawn2 = new Piece(1, 1, false, "pawn", ps);
        Piece bpawn3 = new Piece(2, 1, false, "pawn", ps);
        Piece bpawn4 = new Piece(3, 1, false, "pawn", ps);
        Piece bpawn5 = new Piece(4, 1, false, "pawn", ps);
        Piece bpawn6 = new Piece(5, 1, false, "pawn", ps);
        Piece bpawn7 = new Piece(6, 1, false, "pawn", ps);
        Piece bpawn8 = new Piece(7, 1, false, "pawn", ps);

        Piece wrook = new Piece(0, 7, true, "rook", ps);
        Piece wknight = new Piece(1, 7, true, "knight", ps);
        Piece wbishop = new Piece(2, 7, true, "bishop", ps);
        Piece wqueen = new Piece(3, 7, true, "queen", ps);
        Piece wking = new Piece(4, 7, true, "king", ps);
        Piece wbishop2 = new Piece(5, 7, true, "bishop", ps);
        Piece wknight2 = new Piece(6, 7, true, "knight", ps);
        Piece wrook2 = new Piece(7, 7, true, "rook", ps);
        Piece wpawn = new Piece(0, 6, true, "pawn", ps);
        Piece wpawn2 = new Piece(1, 6, true, "pawn", ps);
        Piece wpawn3 = new Piece(2, 6, true, "pawn", ps);
        Piece wpawn4 = new Piece(3, 6, true, "pawn", ps);
        Piece wpawn5 = new Piece(4, 6, true, "pawn", ps);
        Piece wpawn6 = new Piece(5, 6, true, "pawn", ps);
        Piece wpawn7 = new Piece(6, 6, true, "pawn", ps);
        Piece wpawn8 = new Piece(7, 6, true, "pawn", ps);

        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);
        JPanel pn=new JPanel(){
            @Override
            public void paint(Graphics g){
                boolean white = true;
                for(int y=0;y<8;y++){
                    for(int x=0;x<8;x++){
                        if(white){
                            g.setColor(new Color(235,235,208));
                        }else{
                            g.setColor(new Color(119,148,85));
                        }
                        g.fillRect(x*64, y*64, 64, 64);
                        white=!white;
                    }
                    white=!white;
                }
                for(Piece p: ps){
                    int ind = 0;
                    if(p.name.equalsIgnoreCase("king")){
                        ind = 0;
                    }
                    if(p.name.equalsIgnoreCase("queen")){
                        ind = 1;
                    }
                    if(p.name.equalsIgnoreCase("bishop")){
                        ind = 2;
                    }
                    if(p.name.equalsIgnoreCase("knight")){
                        ind = 3;
                    }
                    if(p.name.equalsIgnoreCase("rook")){
                        ind = 4;
                    }
                    if(p.name.equalsIgnoreCase("pawn")){
                        ind = 5;
                    }
                    if(!p.isWhite){
                        ind+=6;
                    }
                    g.drawImage(imgs[ind], p.xp*64, p.yp*64, this);
                }
            }
        };
        frame.add(pn);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
