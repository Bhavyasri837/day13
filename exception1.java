public class exception1 {
public static void main(String args[])    
{
    try{
        int d=90/0;
    }
    catch(ArithmeticException e){
System.out.println(e);
    }
    try{
        int d=100/0;
    }
    catch(ArithmeticException v)
    {
        System.out.println(v);
    }
    finally{
        System.out.println("executed");
    }
}
}
