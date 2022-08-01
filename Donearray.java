class Donearray
{
    public static void main(String args[])
    {
        int sum=0;
       /* int[] m=new int[5]; or */ int[] m={1,2,3,4,5};

/*       m[0]=1;
        m[1]=2;
        m[2]=3;
        m[3]=4;
        m[4]=5;
        System.out.println(m[0]);
         System.out.println(m[1]);
          System.out.println(m[2]);
           System.out.println(m[3]);
            System.out.println(m[4]);*/
            //or
          
          for(int i=0;i< 5;i++)

          {
            sum=sum+m[i];
            System.out.println(sum);
          }
    System.out.println(sum);
}}