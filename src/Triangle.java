import java.awt.geom.Point2D;

public class Triangle {
    protected double s1;
    protected double s2;
    protected double s3;

    public Triangle(double s1, double s2, double s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public double getPerimeter()
    {
        return (this.s1+this.s2+this.s3);
    }

    public double getArea()
    {
        double p = getPerimeter()/2;

        return Math.sqrt(p*(p-this.s1)*(p-this.s2)*(p-this.s3));
    }
}


