public class Oveiding {
public static void main (String args[])
{
    int [] m=new  int[args.length];
    int sum=0;
    double avg;
    for (int i=0;i<m.length;i++)
    {
        m[i] = Integer.parseInt(args[i]);

    }
    for (int i=0;i<m.length;i++)
    {
        System.out.println(m[i]);
    }
    for (int i=0;i<m.length;i++)
    {
        sum=sum+m[i];
    }
    avg=(double)sum / m.length;
    System.out.println("Average"+avg);
}
}