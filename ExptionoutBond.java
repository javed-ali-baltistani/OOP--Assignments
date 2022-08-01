class ExptionoutBond
{
public static void main (String args[])
{
int a=60;
try
{
int c=a/args.length;
System.out.println(c);
args[5]="Ali";
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("after catch");
}
}