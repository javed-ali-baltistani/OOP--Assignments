class MainDemoLinearSearchMethod
{
	int LinearSearch(int[] s, int k)
	{
		
		int index=-1;
		
		for(int i=0;i<s.length; i++)
		{
			if(s[i]==k)
			{
				index=i;
				break;
			}	
		}
		return index;
	}//LinearSearch End
	public static void main(String[] arg)	{
		int[] m= new int[arg.length];
		int key=4;
		//initialize array element through command line arg
		for(int i=0;i<m.length; i++){
			m[i]=Integer.parseInt(arg[i]);	
		}
		MainDemoLinearSearchMethod o=new MainDemoLinearSearchMethod();
		int index=o.LinearSearch(m,key);
		if(index>-1){
System.out.print("Search is Successfule:");
System.out.print("Value at:"+ index + "and value is"+m[index]);					
		}
		if(index==-1){
			System.out.print("Search is Not Successfule:");		
		}
	}
}