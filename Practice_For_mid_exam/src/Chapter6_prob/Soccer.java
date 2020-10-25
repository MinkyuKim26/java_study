package Chapter6_prob;

class Sports
{
	String getName()
	{
		return "아직 결정되지 않음";
	}
	int getPlayer()
	{
		return 0;
	}
}

public class Soccer extends Sports{

	String getName()
	{
		return "축구";
	}
	int getPlayer()
	{
		return 11;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer sc = new Soccer();
		System.out.println("경기이름 : " + sc.getName());
		System.out.println("경기자 수 : " + sc.getPlayer());
	}

}
