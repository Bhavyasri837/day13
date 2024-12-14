import java.util.*;
class a{
    public void m1()
    {
        System.out.println("hello students");
    }
}
class b extends a{
    public void m2()
    {
        System.out.println("hello teachers");
    }
}
class c extends a{
    public void m3()
        {
            System.out.println("hello professors");
        }
}
public class hierachicalin {
    public static void main(String args[])
    {
        b obj1=new b();
        c obj2=new c();
        obj1.m1();
        obj1.m2();
        obj2.m1();
        obj2.m3();
    }
    
}
