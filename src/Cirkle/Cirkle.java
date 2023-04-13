package Cirkle;

public class Cirkle {
    private double radius = 0;

    public Cirkle(double radius) throws Exception {
        if(radius<0){
            throw new Exception("radius cannot be negative");
        }
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Exception {
        if(radius<0){
            throw new Exception("radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(getRadius(),2) * Math.PI;
    }
}
