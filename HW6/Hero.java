/**
 * Barrington K Hebert
 * Dr. Summa
 * 12-4-2017
 **/
public class Hero extends GameCharacter
{
    private int mana;

    //constructor
    public Hero(String name, int health, int attack, int mana)
    {
        super(name, health, attack);
		//throw exception for Mana
        if (mana > 3 || mana < 0)
        {
            throw new IllegalArgumentException("The mana value must be 3 or less and non negative.");
        }
		else{
        this.mana = mana;
		}
    }
	


	// attack method
    public void attack(Monster myMonster)
    {
        myMonster.setHealth(myMonster.getHealth() - super.getAttack());
        System.out.println("You hit the monster with your ugly stick for" + super.getAttack());
    }
	// spell method
    public void castSpell(Monster myMonster)
    {
        myMonster.setHealth(myMonster.getHealth()/2);
        System.out.println("You weaken the monster with the power of Cthulu");
    }
	
	//take turn method
    public void takeTurn(Monster myMonster)
    {
        attack(myMonster);
    }

	//mana methods
    public void chargeMana()
    {
        this.mana += 1;
    }

    public void setMana(int mana)
    {
        this.mana = mana;
    }

    public int getMana()
    {
        return this.mana;
    }

    public String toString()
    {
        String message = super.toString();
        message = message + " mana:"+ this.mana;
        return message;
    }

}//end class
