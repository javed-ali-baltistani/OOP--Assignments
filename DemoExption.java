class DemoExption
{
public static void main (String args[])
{
int a=60;
try
{
int c=a/args.length;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("can not divide by zero");
}
System.out.println("after catch");
}
}