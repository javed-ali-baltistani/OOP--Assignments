class Encap
{
    private int x;
    public int getx()
    {
       return  x;
    }
    public void  setX(int a)
    {
        x=a;
    }

}

public class Encapsulation {
    public static void main(String args[])
    {
        Encap e = new Encap();
        System.out.println(e.getx());
        e.setX(10);
        System.out.println(e.getx());
    }
}


