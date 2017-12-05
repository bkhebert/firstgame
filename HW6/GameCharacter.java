/**
 * Barrington K Hebert
 * Dr. Summa
 * 12-4-2017
 **/
public class GameCharacter
{
    //instance variables
    private String name;
    private int health;
    private int attack;

    //constructor
    public GameCharacter(String name, int health, int attack)
    {
        this.name = name;
        if (health > 100 || health <=0){
			
            throw new IllegalArgumentException("Health must be a positive value less than 100.");
			
        }
		else{
        this.health = health;
		}
        if (attack > 20 || attack<=0){
			
         throw new IllegalArgumentException("The attack value can't be more than 20.");
		 
        }
		else {
        this.attack = attack;
		}
    }
	
    // getter methods
    public String getName()
    {
        return this.name;
    }
  
    public int getHealth()
    {
        return this.health;
    }
	public int getAttack()
    {
        return this.attack;
    }

    //setter methods
    public void setHealth(int health)
    {
      this.health = health;
    }

    public void setAttack(int attack)
    {
        this.attack = attack;
    }

    public String toString()
    {
        return String.format("%s stats: Health : %d, Attack Power: %d", this.name, this.health, this.attack);
    }

}//end class
