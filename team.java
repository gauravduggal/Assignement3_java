import java.util.*;


public class team
{
  //Attributes
  public String name;
  public rock r;
  public paper p;
  public scissors s;
  public int round_score;
  public ArrayList<weapon> weapon_list = new ArrayList<weapon>();
  public int score;  
  public team(String name) {
   
   this.name = new String(name);
   Random rand = new Random();
   r = new rock("rock");
   p = new paper("paper");
   s = new scissors("scissors");
   this.r.set_strength(rand.nextInt(50) + 1);
   this.s.set_strength(rand.nextInt(50) + 1);
   this.p.set_strength(rand.nextInt(50) + 1);
   this.weapon_list.add(r);
   this.weapon_list.add(p);
   this.weapon_list.add(s);
   this.round_score = 0;
   this.score=0;
   }
 
   public String get_name()
   {
      return this.name;
   } 

   public boolean round(team t)
   {
    rock tr1 = new rock("rock");
    paper tp1 = new paper("paper");
    scissors ts1 = new scissors("scissors");

    rock tr2 = new rock("rock");
    paper tp2 = new paper("paper");
    scissors ts2 = new scissors("scissors");

while(! (t.round_score==2 | this.round_score==2))
{
    int t2_w = pick_random_weapon();
    int t1_w = pick_random_weapon();
    //System.out.println(t1_w + " "+ t2_w);
    switch(t1_w)
    {
      case 0:
      
      tr1 = (rock)this.weapon_list.get(t1_w);
      
      if(t2_w==0 && tr1.flag==false)
      {
        tr2 = (rock)t.weapon_list.get(t2_w);
        //
        if (tr2.flag==false)
        {
        //System.out.println("r v r FIGHT");
          
        if(tr2.battle(tr1) )
          this.round_score++;
        else
          t.round_score++;
        this.r.flag=true;
        t.r.flag=true;
        }
      }
      if(t2_w==1 && tr1.flag==false)
      {
        tp2 = (paper)t.weapon_list.get(t2_w);
        //
        if (tp2.flag == false )
        {
        //System.out.println("r v p FIGHT");  
        if(tr1.battle(tp2) )
          this.round_score++;
        else
          t.round_score++;
        
        this.r.flag=true;
        t.p.flag=true;
        }
      }
      if(t2_w==2 && tr1.flag==false)
      {
        ts2 = (scissors)t.weapon_list.get(t2_w);
        //
        if(ts2.flag == false )
        {
        //System.out.println("r v s FIGHT");  
        if(  tr1.battle(ts2))
          this.round_score++;
        else
          t.round_score++;
        this.r.flag=true;
        t.s.flag=true;
        }
      }
      
      //unused weapon
   
      break;

      case 1:
      tp1 = (paper)this.weapon_list.get(t1_w);
      if(tp1.flag == false & t2_w==0 )
      {
        tr2 = (rock)t.weapon_list.get(t2_w);
        //
        if(tr2.flag==false )
        {
        //System.out.println("p v r FIGHT");  
        if(tr2.battle(tp1))
          this.round_score++;
        else
          t.round_score++;
        this.p.flag=true;
        t.r.flag=true;
        }
      }
      if(tp1.flag == false & t2_w==1)
      {
        tp2 = (paper)t.weapon_list.get(t2_w);
        //
        if (tp2.flag==false)
        {
        //System.out.println("p v p FIGHT");  
        if(tp1.battle(tp2) )
          this.round_score++;
        else
          t.round_score++;
        
        this.p.flag=true;
        t.p.flag=true;
        }
      }
      if(tp1.flag == false & t2_w==2)
      {
        ts2 = (scissors)t.weapon_list.get(t2_w);
        //
        if(ts2.flag==false)
        {
        //System.out.println("p v s FIGHT");  
        if( tp1.battle(ts2))
          this.round_score++;
        else
          t.round_score++;
        this.p.flag=true;
        t.s.flag=true;
       }
      }
      break;

      case 2:
      ts1 = (scissors)this.weapon_list.get(t1_w);
      if(t2_w==0 && ts1.flag==false)
      {
        tr2 = (rock)t.weapon_list.get(t2_w);
        //
        if (tr2.flag==false)
        {
        //System.out.println("s v r FIGHT");  
        if( tr2.battle(ts1) )
          this.round_score++;
        else
          t.round_score++;
        this.s.flag=true;
        t.r.flag=true;
        }
      }
      if(t2_w==1 && ts1.flag==false)
      {
        tp2 = (paper)t.weapon_list.get(t2_w);
        //System.out.println("s v p FIGHT");
        if(ts1.flag == false)
        {
        if(ts1.battle(tp2) )
          this.round_score++;
        else
          t.round_score++;
        
        this.s.flag=true;
        t.p.flag=true;
        }
      }
      if(t2_w==2 && ts1.flag==false)
      {
        ts2 = (scissors)t.weapon_list.get(t2_w);
        //
        if(ts2.flag == false)
        {
        //System.out.println("s v s FIGHT");   
        if( ts1.battle(ts2)  )
          this.round_score++;
        else
          t.round_score++;
        this.s.flag=true;
        t.s.flag=true;
        }
      }
      break;
    }

   } 

   //this.round_score=0;
   if (t.round_score == 2) 
   {
    System.out.println("TEAM "+t.name+" won this round " + t.round_score+" to "+this.round_score );
    t.score++;
    this.reset_round(t);
    return false;
  }
  else
  { 
    System.out.println("TEAM "+this.name+" won this round " + this.round_score+" to "+t.round_score );
    this.score++;
    this.reset_round(t);

    return true;
  }
    }


    public void reset_round(team t)
    {
      this.round_score = 0;
      t.round_score=0;
      rock r = new rock("rock");
      paper p = new paper("paper");
      scissors s = new scissors("scissors");

      r = (rock)t.weapon_list.get(0);
      p = (paper)t.weapon_list.get(1);
      s = (scissors)t.weapon_list.get(2);
      r.flag=false;
      p.flag=false;
      s.flag=false;

      r = new rock("rock");
      p = new paper("paper");
      s = new scissors("scissors");
      r = (rock)this.weapon_list.get(0);
      p = (paper)this.weapon_list.get(1);
      s = (scissors)this.weapon_list.get(2);

      r.flag=false;
      p.flag=false;
      s.flag=false;


    }

   public int pick_random_weapon()
   {
    Random w = new Random();
    int a =  w.nextInt(3)+0;
    //System.out.println(a);
    return a;
   }

   public void show()
   {
    System.out.println();
    System.out.println(this.name);
   // System.out.println("rflag "+r.flag);
    System.out.println("rock "+this.r.get_strength());
   // System.out.println("pflag "+p.flag);
    System.out.println("paper "+this.p.get_strength());
   // System.out.println("sflag "+s.flag);
    System.out.println("scissors "+this.s.get_strength());
    System.out.println("score "+this.score);
    System.out.println();
   }
   
}