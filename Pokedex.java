//Outling stuff, can add more stuff
public class Pokedex {
	// data fields/variables
	public Pokemon[] pkmList;
	int holds = 0;//to account for the length of the list as it increases
	
	//Constructors
	public Pokedex(int size){
		//initialize the size of the Pokemon list
		pkmList = new Pokemon[size];
	}
	
	// Methods/Actions
	public void listPokemon(){
		//prints out the pokemon that the the user input
		int numPkm = 0;
		for (int x = 0;x < holds;x++){
			numPkm++;
			System.out.println(numPkm + ". " + pkmList[x].getSpecies());
		}
		
	}
	
	public void addPokemon(Pokemon pkm){
		//Adds pokemon to the Pokedex
		//If the pokemon is alrdy in there, does not add
		//If user reaches the maximum amount, they cannot add anymore pokemon.
		
		for(int x = 0; x < pkmList.length; x++){
			if (pkmList[x] == null){
				pkmList[x] = pkm;
				holds++;
				break;
			}
			else if (pkmList[x].getSpecies().equalsIgnoreCase(pkm.getSpecies()) == true){
				System.out.println("Your Pokedex is already storing that Pokemon!");
				break;
			}
			else if (x == pkmList.length - 1){
				System.out.println("Your Pokedex is already holding the max amount!");
			}
		}
	}
	
	public void checkStats(String pkm_nm){
		boolean xx = false;
		int count = 0;
		for (int x = 0; x < holds; x++){
			if (pkm_nm.equalsIgnoreCase(pkmList[x].getSpecies()) == true){
				xx = true;
				count = x;
			}

		}
		if(xx == true) {
			System.out.println();
			System.out.println("The stats for " + pkm_nm + " are:");
			System.out.println("Attack: " + pkmList[count].getAttack());
			System.out.println("Defense: " + pkmList[count].getDefense());
			System.out.println("Speed: " + pkmList[count].getSpeed());
		}
		else{
			System.out.println();
			System.out.println("The Pokemon could not be found!");
		}
			
	}
	
	public void sortPokemon(){
		//sorts the pokemon list when user invokes this method
		for (int x = 0; x < holds;x++){
			Pokemon currentMin = pkmList[x];
			int currentMinIndex = x;
			
			for(int y = x + 1; y < holds; y++){
				if (currentMin.getSpecies().compareToIgnoreCase(pkmList[y].getSpecies()) > 0){
					currentMin = pkmList[y];
					currentMinIndex = y;
				}
			}
			
			if (currentMinIndex != x){
				pkmList[currentMinIndex] = pkmList[x];
				pkmList[x] = currentMin;
			}
			
		}
}
	
}
