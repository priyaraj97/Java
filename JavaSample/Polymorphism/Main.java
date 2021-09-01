package inheritance;

public class Main {
	public static void main(String arg[])
	{
	Samsung s=new Samsung();
	Redmi r=new Redmi();
	RealMe re=new RealMe();
	s.setAndroidversion("Android pie");
	s.setAndroidversion1(5);
    s.setMan_year(2020);
	s.setColor("Black");
	s.setCost(10000);
	s.setRAM("3GB");
	r.setAndroidversion("Android oreo");
	r.setAndroidversion1(3);
	r.setMan_year(2018);
	r.setColor("Navie Red");
	r.setCost(15000);
	r.setRAM("6GB");
	re.setAndroidversion("Android nougat");
	re.setAndroidversion1(6);
	re.setMan_year(2017);
	re.setColor("Green");
	re.setCost(11000);
	re.setRAM("4GB");
	System.out.println("Samsung Android version:"+s.getAndroidversion());
	System.out.println("Samsung Android version1:"+s.getAndroidversion1());
	System.out.println("Samsung Manufacturing Year:"+s.getMan_year());
	System.out.println("Mobile Color:"+s.getColor());
	System.out.println("Mobile Cost:"+s.getCost());
	System.out.println("Mobile RAM:"+s.getRAM());
	System.out.println("Redmi Android version:"+r.getAndroidversion());
	System.out.println("Redmi Android version1:"+r.getAndroidversion1());
	System.out.println("Redmi Manufacturing Year:"+r.getMan_year());
	System.out.println("Mobile Color:"+r.getColor());
	System.out.println("Mobile Cost:"+r.getCost());
	System.out.println("Mobile RAM:"+r.getRAM());
	System.out.println("RealMe Android version:"+re.getAndroidversion());
	System.out.println("RealMe Android version1:"+re.getAndroidversion1());
	System.out.println("RealMe Manufacturing Year:"+re.getMan_year());
	System.out.println("Mobile Color:"+re.getColor());
	System.out.println("Mobile Cost:"+re.getCost());
	System.out.println("Mobile RAM:"+re.getRAM());
}
}
