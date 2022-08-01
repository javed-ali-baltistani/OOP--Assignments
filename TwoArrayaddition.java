class TwoArrayaddition
{
    
    public static void main (String arg[])
 {
  int i;
  int p;  
   /* int a[][]={{1,3},{5,7}};
    int b[][]={{2,4},{8,10}};
    int c[][]=new int [2][2];*/
    
    int a[][]=[arg.length][arg.length];
    int b[][]=[arg.length][arg.length];
    int c[][]=[arg.length][arg.length];
for( i=0;i< a.length;i++)
{
    for( p=0;p<a[i].length;p++)
    {
        c[i][p]=a[i][p]+b[i][p];

        System.out.println(c[i][p]);
    }
   // System.out.println(c[i][j]);
}

   //System.out.println(c[i][p]);
 }
}