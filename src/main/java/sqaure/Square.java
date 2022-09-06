package sqaure;

public class Square {
    public double length;

    public Square (double length){
        this.length=length;
    }

    public Double calculateParameter() {
        return this.length*this.length;
    }
}
