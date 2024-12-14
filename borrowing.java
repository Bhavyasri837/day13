import java.util.*;
class library
{
    String name;
    int bb;
    library(String name)
    {
    this.name=name;
    this.bb=0;
    }
public boolean count()
{
    return false;
}
public void bob()
{
    if(count())
    {
        bb++;
        System.out.println("borrowed books are "+bb);
    }
    else{
        System.out.println("limit exceede");
    }
}
}
class student extends library 
{
    student(String name)
    {
        super(name);
    }
    public boolean count()
    {
        return bb<3;
    }
}
class teacher extends library{
    teacher(String name)
    {
        super(name);

    }
    public boolean count()
    {
        return bb<10;
    }
}
public class borrowing
{
    public static void main(String args[])
    {
        library a=new student("amar");
        library b1=new student("radhika");
        library b=new teacher("dr.prem kumar");
        b.bob();
        a.bob();
        a.bob();
        b.bob();
        
     }
}