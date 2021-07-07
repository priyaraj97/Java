public class Staticvariable
{
public static String Myvarcal = "operation performance successfully";

public static void main(String arg[])
{
Staticvariable Add = new Staticvariable();
Staticvariable Sub = new Staticvariable();
Staticvariable Mul = new Staticvariable();

System.out.println(Add.Myvarcal);
System.out.println(Sub.Myvarcal);
System.out.println(Mul.Myvarcal);

Mul.Myvarcal="Mul method wrong";
System.out.println(Add.Myvarcal);
System.out.println(Sub.Myvarcal);
System.out.println(Mul.Myvarcal);
}
}