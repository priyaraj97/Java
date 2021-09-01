package inheritance;

public class Android extends Mobiles 
{ 
	String AndroidName;
	int Androidversion1;
	int man_year;
	
	public String getAndroidName() {
		return AndroidName;
	}
	public void setAndroidName(String androidName) {
		AndroidName = androidName;
	}
	public int getMan_year() {
		return man_year;
	}
	public void setMan_year(int man_year) {
		this.man_year = man_year;
	}
	public int getAndroidversion1() {
		return Androidversion1;
	}
	public void setAndroidversion1(int androidversion1) {
		Androidversion1 = androidversion1;
	}
	
	
	
	
	
	public void Androidversion(String AndroidName,int Androidversion1)
	{
	this.AndroidName=AndroidName;
	this.Androidversion1=Androidversion1;
	
	}
	public void Man_Year(int man_year)
	{
	 this.man_year=man_year;
	 			
	}
}

