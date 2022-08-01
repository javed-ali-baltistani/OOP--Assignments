class LinearMethod
{
    int linear(int[] s , int k)
    {
        int index =-1;
        for(int i=0;i<s.length;i++)
        {
            if (s[i]=k)
            {
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String arg[])
    {

          int [] m=new int[arg.length];
            int key=4;
         (int i=0; i<m.length; i++) 
         {
              m[i]=Integer.parseInt(arg[i]);

          }
          LinearMethod o=new LinearMethod();
          int index=o.linear(m,key);
          if(index>-1){
            System.out.println("Search is sucessful");
            System.out.println("value at",+ index + "and valu is "+m[index]);
          }
          if(index==-1)
          {
            System.out.println("search is not sucess full");
          }
    }
}