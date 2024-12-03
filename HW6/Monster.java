/**
 * Barrington K Hebert
 * Dr. Summa
 * 12-4-2017
 **/
public class Monster extends GameCharacter
{
    private int xp;

    //constructor
    public Monster(String name, int health, int attack, int xp)
    {
        super(name, health, attack);
        this.xp = xp;
    }

    public void attack(Hero myHero)
    {
        myHero.setHealth(myHero.getHealth() - super.getAttack());
        System.out.println("The Foul beast slaps you in the face for" + super.getAttack());
    }

	//getter method for experience
	    public int getXP()
    {
        return this.xp;
    }


    public String toString()
    {
      String message = super.toString();
      message = message + " xp:"+ this.xp;
      return message;
    }

}//end class
