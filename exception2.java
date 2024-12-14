public class exception2 {
    public static void main(String args[])
    {
        try{
            throw new Exception("error"); 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
