public class rock extends weapon
{
  //Attributes
  public String name;
  private int strength;
  public boolean flag;

  public rock(String name) {
     
   this.name = new String(name);
   this.strength=0;
   }
 
   public String get_name()
   {
      return this.name;
   } 
   public int get_strength()
   {
      return this.strength;
   }
   public void set_strength(int strength)
   {
      this.strength = strength;
   }

   public  boolean battle(rock r)
   {
      if (r.get_strength() > this.get_strength())
        return false;
      else return true;
   }

   //rock always loses against paper
   public  boolean battle(paper p)
   {
      this.set_strength(this.get_strength()/2);
      p.set_strength(p.get_strength()*2);
      return false;
   }

   //rock always wins against scissors
   public  boolean battle(scissors s)
   {
      this.set_strength(this.get_strength()*2);
      s.set_strength(s.get_strength()/2);
      return true;
   }
  
}