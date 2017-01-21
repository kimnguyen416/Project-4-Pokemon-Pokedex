//Outlining stuff
public class Pokemon {
	// data fields/ variables
	//Attributes
	public String species;
	public int attack;
	public int defense;
	public int speed;
	
	//Constructors
	//A constructor to print out the pkm's attack, defense, and speed
	public Pokemon(String species, int attack, int defense, int speed){
		//code here
		//use this to keep the original names in the parameter, but refers
		//back to the variables above
		this.species = species;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
	}
	
	
	// Methods/Actions
	//boosters
	public void grow(int boost){
		//this method increases the pokemon's attack
		attack += boost;
	}
	public void harden(int boost){
		//this method increases the pokemon's defense
		defense += boost;
	}
	public void haste(int boost){
		//this method increases the pokemon's speed
		speed += boost;
	}
	
	//Getters and Setter methods for each attribute
	
	//getter of species
	public String getSpecies(){
		return species;
	}
	//setter of species
	public void setSpecies(String spc){
		//updates the species every time its invoked
		species = spc;
	}
	
	//getter of attack
	public int getAttack(){
		return attack;
	}
	//setter of attack
	public void setAttack(int atk){
		//updates the attack every time its invoked
		attack = atk;
	}
	
	//getter of defense
	public int getDefense(){
		return defense;
	}
	//setter of defense
	public void setDefense(int def){
		//updates the defense every time its invoked
		defense = def;
	}
	
	//getter of speed
	public int getSpeed(){
		return speed;
	}
	//setter of speed
	public void setSpeed(int spd){
		//updates the speed every time its invoked
		speed = spd;
	}
}
