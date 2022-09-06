package shapes;

public class Circle {
    public double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    public Double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }




}
