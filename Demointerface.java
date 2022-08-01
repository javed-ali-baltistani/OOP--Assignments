interface Myinf1{
double compute(double n);
}
interface Myinf
{
double sum(double a,double b);

void show();
}
class Myclass implements Myinf,Myinf1
{
double ans;
public double sum(double x,double y)
{
ans=x+y;
return ans;
}
public double compute(double num)
{
return num*num)
}

public void show()
{
System.out.println("interface show method"+"  "+ans);
}
}
class Demointerface
{
public static void main (String args [])
{
Myclass p=new Myclass();
double ans1=p.sum(10,20);
p.show();
System.out.println(ans1);
System.out.println("compute method"+p.compute(6));

}
}