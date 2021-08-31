package inheritance;

public class Main {
	public static void main(String arg[])
	{
	Samsung s=new Samsung();
	Redmi r=new Redmi();
	RealMe re=new RealMe();
	s.setAndroid_version("Android pie");
	s.setColor("Black");
	s.setCost(10000);
	s.setRAM("3GB");
	r.setAndroid_version("Android pie");
	r.setColor("Navie Red");
	r.setCost(15000);
	r.setRAM("6GB");
	re.setAndroid_version("Android pie");
	re.setColor("Green");
	re.setCost(11000);
	re.setRAM("4GB");
	System.out.println("Samsung Android version:"+s.getAndroid_version());
	System.out.println("Mobile Color:"+s.getColor());
	System.out.println("Mobile Color:"+s.getCost());
	System.out.println("Mobile Color:"+s.getRAM());
	System.out.println("Redmi Android version:"+s.getAndroid_version());
	System.out.println("Mobile Color:"+r.getColor());
	System.out.println("Mobile Color:"+r.getCost());
	System.out.println("Mobile Color:"+r.getRAM());
	System.out.println("RealMe Android version:"+s.getAndroid_version());
	System.out.println("Mobile Color:"+re.getColor());
	System.out.println("Mobile Color:"+re.getCost());
	System.out.println("Mobile Color:"+re.getRAM());
}
}
