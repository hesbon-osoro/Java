package assignment;

public abstract class DrawableShape {


    private int x,y;
    private String color;

    void moveTo(int len,int wid){
       this.x=len;
       this.y=wid;

    }
    abstract void draw();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

       public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
