
import java.util.*;
interface a{
    abstract void m1();
}
interface b{
    abstract void m2();
}
class c implements a,b
{
    public void m1()
    {
        System.out.println("helloo Students ");
    }
    public void m2()
    {
        System.out.println("hello teachers");
    }
    public void m3()
    {
        System.out.println("hello professors");
    }
}
public class multiplein {
    public static void main(String args[]){
        c obj=new c();
        obj.m1();
        obj.m2();
        obj.m3();
    }
    
}
