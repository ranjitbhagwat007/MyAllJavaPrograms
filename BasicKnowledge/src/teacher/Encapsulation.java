package teacher;
class Amazon{
	private String un="grotechminds.com";

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Amazon a1=new Amazon();
		a1.setUn("Manish");
		System.out.println(a1.getUn());

	}

}
