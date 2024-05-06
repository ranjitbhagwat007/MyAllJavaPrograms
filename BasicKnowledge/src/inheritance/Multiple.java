package inheritance;
interface Gmail
{
	void watch();
	void play();
}
interface Youtube extends Gmail
{
	void send();
	void payment();
}
public class Multiple implements Gmail, Youtube{

	public static void main(String[] args) {

	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
