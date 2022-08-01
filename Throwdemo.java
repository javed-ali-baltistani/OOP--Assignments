class Throwdemo
{
    static void demp()
    {
        try{
           //NullPointerException ne =new NullPointerException("refrance not");
           //or
           throw new NullPointerException("Demo");
            //throw ne;
        }
        catch (NullPointerException e){
        System.out.println("Recaught"+e);
            System.out.println("caught inside demo");
            throw e;
        }
    }

public static void main (String args[])
{
   try{
        demp();

    }
   catch(NullPointerException e){
       System.out.println("Recaught"+e); 
       System.out.println("Recaught"+e.toString());
    }
}}
