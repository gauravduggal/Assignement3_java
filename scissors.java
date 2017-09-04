public class scissors extends weapon
{
  //Attributes
  public String name;
  private int strength;
  public boolean flag;

  public scissors(String name) {
     
   this.name = new String(name);
   this.strength = 0;
   flag = false;
   }
 
   public String get_name()
   {
      return this.name;
   } 

   public void set_strength(int strength)
   {
      this.strength = strength;
   }

   public int get_strength()
   {
      return this.strength;
   }

   public  boolean battle(scissors s)
   {
      if (s.get_strength() > this.get_strength())
        return false;
      else return true;
   }

   public  boolean battle(paper p)
   {
      //this.set_strength(this.get_strength()*2);
      //p.set_strength(p.get_strength()/2);
      if (2*this.get_strength() > p.get_strength()/2)
      return true;
      else
      return false;
   }

   public  boolean battle(rock r)
   {
    //  this.set_strength(this.get_strength()/2);
    //  r.set_strength(r.get_strength()*2);
    if (this.get_strength()/2 > r.get_strength()*2)
      return true;
      else
      return false;
   }

  
}