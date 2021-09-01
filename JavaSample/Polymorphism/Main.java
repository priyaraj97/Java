package inheritance;

public class Main {
	public static void main(String arg[])
	{
	Samsung s=new Samsung();
	Redmi r=new Redmi();
	RealMe re=new RealMe();
	s.setAndroidName("Android pie");
	s.setAndroidversion1(5);
    s.setMan_year(2020);
	s.setColor("Black");
	s.setCost(10000);
	s.setRAM("3GB");
	s.setROM("32GB");
	r.setAndroidName("Android oreo");
	r.setAndroidversion1(3);
	r.setMan_year(2018);
	r.setColor("Navie Red");
	r.setCost(15000);
	r.setRAM("6GB");
	r.setROM("128GB");
	re.setAndroidName("Android nougat");
	re.setAndroidversion1(6);
	re.setMan_year(2017);
	re.setColor("Green");
	re.setCost(11000);
	re.setRAM("4GB");
	re.setROM("64GB");
	System.out.println("Samsung Android Name:"+s.getAndroidName());
	System.out.println("Samsung Android version1:"+s.getAndroidversion1());
	System.out.println("Samsung Manufacturing Year:"+s.getMan_year());
	System.out.println("Mobile Color:"+s.getColor());
	System.out.println("Mobile Cost:"+s.getCost());
	System.out.println("Mobile RAM:"+s.getRAM());
	System.out.println("Mobile ROM:"+s.getROM());
	System.out.println("Redmi Android Name:"+r.getAndroidName());
	System.out.println("Redmi Android version1:"+r.getAndroidversion1());
	System.out.println("Redmi Manufacturing Year:"+r.getMan_year());
	System.out.println("Mobile Color:"+r.getColor());
	System.out.println("Mobile Cost:"+r.getCost());
	System.out.println("Mobile RAM:"+r.getRAM());
	System.out.println("Mobile ROM:"+r.getROM());
	System.out.println("RealMe Android Name:"+re.getAndroidName());
	System.out.println("RealMe Android version1:"+re.getAndroidversion1());
	System.out.println("RealMe Manufacturing Year:"+re.getMan_year());
	System.out.println("Mobile Color:"+re.getColor());
	System.out.println("Mobile Cost:"+re.getCost());
	System.out.println("Mobile RAM:"+re.getRAM());
	System.out.println("Mobile ROM:"+re.getROM());
}
}
