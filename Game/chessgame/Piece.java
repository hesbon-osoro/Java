package chessgame;

import java.util.LinkedList;

public class Piece {
    int xp;
    int yp;
    boolean isWhite;
    LinkedList<Piece> ps;
    String name;

    public Piece(int xp, int yp, boolean isWhite, String name, LinkedList<Piece> ps) {
        this.xp = xp;
        this.yp = yp;
        this.isWhite = isWhite;
        this.name = name;
        this.ps = ps;
        ps.add(this);
    }

    public void move(int xp, int yp) {
        ps.stream().filter((p)->(p.xp==xp&&p.yp==yp)).forEachOrdered((p)->{
            p.kill();
        });
        this.xp = xp;
        this.yp = yp;
    }

    public void kill() {
        ps.remove(this);
    }
}
