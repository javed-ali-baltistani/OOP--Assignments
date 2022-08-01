class Circle {
    private double r;

   public Circle(double a) {
        r = a;
    }

    public void setr(double a) {
        r = a;
    }

    public double getr() {
        return r;
    }

   public double getcircumfarance() {
        double c = 2 * 3.14 * r;
        return c;
    }

   public double getArea() {
        double A = 3.14 * r * r;
        return A;
    }
}
public class  Testcircle
{
    public static void main (String args[])
    {
        Circle c=new Circle(10);
        c.setr(2);
        System.out.println(c.getr());
        System.out.println(c.getcircumfarance());
        System.out.println(c.getArea());
    }



}