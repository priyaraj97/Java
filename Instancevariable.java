public class Instancevariable
{
String name = "Employee name";

public static void main(String arg[])
{
Instancevariable day = new Instancevariable();
Instancevariable day2 = new Instancevariable();
Instancevariable day3 = new Instancevariable();

System.out.println(day.name);
System.out.println(day2.name);
System.out.println(day3.name);

day.name="Unemployee name";

System.out.println(day.name);
System.out.println(day2.name);
System.out.println(day3.name);
}
}


