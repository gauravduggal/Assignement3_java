
public class assignment3
{
	public static void main(String []args) 
	{

		//t1.s.set_strength(50);
		//t1.show();
		
		//t2.s.set_strength(45);
		//t2.show();
		//System.out.println(t2.s.battle(t1.s));
		team t2 = new team("Yogi Yahooes");
		team t1 = new team("Really Rottens");
		for (int i=0;i<20;i++)
			{
				
				System.out.print("Round "+(i+1)+". ");
				t1.round(t2);
				//t1.show();
				//t2.show();
			}
		//t1.round(t2);
		t1.show();
		t2.show();
	}


}