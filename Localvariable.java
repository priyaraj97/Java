public class Localvariable
{
String name = "Student name";

public void id()
{
String name = " Staff name";
System.out.println(name);
}
public static void main(String arg[])
{
Localvariable dept = new Localvariable();
System.out.println(dept.name);
dept.id();
System.out.println(dept.name);

}

}