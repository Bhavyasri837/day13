import java.util.*;
class gp{
    public void r()
    {
        System.out.println("hello i am grand parent");
    }
}
class p1 extends gp{
    public void r1()
    {
        System.out.println("hello i am parent 1");
    }
}
interface p2{
    abstract void r2();
}
class d extends p1 implements p2
{
    public void r2()
    {
        System.out.println("i am parent 2");
    }
    public void r3()
    {
        System.out.println("i am child class");
    }
}
public class hybridin {
    public static void main(String args[])
    {
        d obj=new d();
        obj.r();
        obj.r1();
        obj.r3();
        obj.r2();
    }
    
}
