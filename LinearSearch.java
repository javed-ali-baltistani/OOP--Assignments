class LinearSearch
{
	public static void main(String[] arg)
	{
		int[] m= new int[arg.length];
		int key=4, index=-1;
		boolean flag;
		//initialize array element through command line arg
		for(int i=0;i<m.length; i++)
		{
			m[i]=Integer.parseInt(arg[i]);	
		}
		flag=false;
		for(int i=0;i<m.length; i++)
		{
			if(m[i]==key)
			{
				index=i;
				flag=true;
				break;
			}	
		}
		if(flag==true)
		{
System.out.print("Search is Successfule:");
System.out.print("Value at:"+ index + "and value is"+m[index]);					
		}
		if(flag==false)
		{
			System.out.print("Search is Not Successfule:");		
		}

	}

}