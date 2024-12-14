import java.util.*;
class a{
public void m1()
{
    System.out.println("helloo everyone");
}
}
class b extends a{
public void m2(){
System.out.println("good morning");
}
}
public class singlein{
public static void main(String args[])
{
b obj=new b();
obj.m1();
obj.m2();
}
}