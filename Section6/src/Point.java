public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        //return the distance between this Point and Point 0,0 as double
        double p = Math.sqrt(((x-0)*(x-0))+ ((y-0)*(y-0)));
        return p;
    }

    public double distance(int x, int y){
        double p = Math.sqrt(((this.x - x)*(this.x -x))+((this.y - y)*(this.y - y)));
        return p;
    }

    public double distance(Point point){
        double p = Math.sqrt(((this.x - point.x)*(this.x - point.x)) +
                ((this.y - point.y) * (this.y - point.y)));
        return p;
    }
}
