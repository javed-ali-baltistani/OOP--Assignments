class DemoExp
{
public static void main (String args[])
{
int a=60;
int c=a/args.length;
System.out.println(c);
}
catch(ArithematicException e)
{
System.out.println("can not divide by zero");
}
System.out.println("after catch");
}