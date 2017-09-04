public class paper extends weapon
{
  //Attributes
  public String name;
  private int strength;
  public boolean flag;

  public paper(String name) {
     
   this.name = new String(name);
   this.strength = 0;
   flag = false;
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

   public  boolean battle(paper p)
   {
      if (p.get_strength() > this.get_strength())
        return false;
      else return true;
   }

   //paper always wins against rock
   public  boolean battle(rock p)
   {
      this.set_strength(this.get_strength()*2);
      p.set_strength(p.get_strength()/2);
      return true;
   }

   //paper always loses against scissors
   public  boolean battle(scissors s)
   {
      this.set_strength(this.get_strength()/2);
      s.set_strength(s.get_strength()*2);
      return false;
   }

  
}