import java.util.*;
class a{
    public void r()
    {
        System.out.println("hello");
    }
}
class b extends a{
    public void r1()
    {
        super.r();
        System.out.println("hello teachers");
    }
}
public class super1 {
    public static void main(String args[])
    {
        b o=new b();
        o.r1();
    }
    
}
