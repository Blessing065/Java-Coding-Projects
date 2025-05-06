public class Point {

    private int x;
    private int y;

    public Point() {
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
        double distance = (this.x - 0)*(0 - this.x) + (0- this.y)*(this.y - 0);
        if(distance < 0){
            distance = distance * -1;

               return Math.sqrt(distance);}
        else{

        return Math.sqrt((this.x - 0)*(0 - this.x) + (0- this.y)*(this.y - 0));
    }}

    public double distance (Point parameter){

        double distance = (this.x - parameter.getX()) * (parameter.getX() - this.x) + (parameter.getY() - this.y) * (this.y - parameter.getY());
        if (distance < 0) {
            distance = distance * -1;
            return Math.sqrt(distance);
        } else {
            return Math.sqrt((this.x - parameter.getX()) * (parameter.getX() - this.x) + (parameter.getY() - this.y) * (this.y - parameter.getY()));
        }

    }
    public double distance(int x,int y) {
        double distance = (this.x - x) * (x - this.x) + (y - this.y) * (this.y - y);
        if (distance < 0) {
            distance = distance * -1;
            return Math.sqrt(distance);
        } else {
            return Math.sqrt((this.x - x) * (x - this.x) + (y - this.y) * (this.y - y));
        }
    }}
