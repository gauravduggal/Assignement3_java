
public class assignment3
{
	public static void main(String []args) 
	{

		team t2 = new team("yogi yahooes");
		team t1 = new team("muttley");
		//t1.s.set_strength(50);
		t1.show();
		
		//t2.s.set_strength(45);
		t2.show();
		//System.out.println(t2.s.battle(t1.s));
		for (int i=0;i<20;i++)
			t1.round(t2);
		//t1.round(t2);
		t1.show();
		t2.show();
	}


}