import java.util.*;
 class a{
    public void m1(){
        System.out.println("hello students");
    }
}
class b extends a{
    public void m2()
    {
        System.out.println("hello teachers");
    }
}
 class c extends b{
    public void m3()
    {
        System.out.println("hello proffessors");
    }
}
 class multilevelin {
    public static void main(String args[])
    {
        c obj=new c();
        obj.m1();
        obj.m2();
        obj.m3();
    }

    
}
