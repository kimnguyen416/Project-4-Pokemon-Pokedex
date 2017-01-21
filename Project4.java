//Name: Kim Nguyen
//80813737
//Section#:9504
//TA: Val
//Project Number: 4
//Brief Description of File Contents:Creating a Pokedex to become a Pokemon Master
import java.util.Scanner; //import Scanner
public class Project4 {
	public static void main(String[] args) {
	//Create Scanner object
	Scanner input = new Scanner(System.in);
	
	//Declaration of variables
	boolean x = true;// for big while loop
	boolean y = true;//to check for invalid input for first scenario
	int userInput;
	int pkmChoice;//user's choice for pkmMenu
	String pkmName; //Option 2 of pkmMenu, I made it a Pokemon datatype
	String checkPkm;//Option 3 for checking stats
	int count = 0;
	
	//JUST A BASIC OUTLINE: SOME PARTS ARE NOT ACCURATE!!!!
	
	System.out.println("Welcome to your new PokeDex!");
	System.out.print("How many Pokemon are in your region?: ");
	
	while(x == true){
		userInput = input.nextInt();
		//calls Pokedex Constructor here, now you have your pkmList array size
		Pokedex pkmList = new Pokedex(userInput);
		
		//Tests for invalid input for statement above.
		while (y == true){
			if (userInput <= 0){
				System.out.println();
				System.out.println("That's not a valid input choice. Try again!");
				System.out.println();
				System.out.print("How many Pokemon are in your region?: ");
				userInput = input.nextInt();
				
			}
			else{
				y = false;
				break;
			}
		}
		
		System.out.println();
		System.out.println("Your new Pokedex can hold " + userInput + " pokemon. Let's " +
		"start using it!");
		System.out.println();
		
		boolean z = true;//for while loop below, to let it continue until you press exit
		//Creates a while loop for the menu options
		while (z == true){
			//pulls up pkmMenu method menu
			pkmMenu();
			System.out.println();
			System.out.print("What would you like to do? ");
			pkmChoice = input.nextInt();
			
			//test for invalid choice
			if (pkmChoice < 1 || pkmChoice > 5){
				System.out.println();
				System.out.println("That's not a valid input choice. Try again!");
				System.out.println();
				continue;
			}
			
			//Option 1: List Pokemon
			if (pkmChoice == 1){
				//call the listPokemon method from the Pokedex class
				if (count == 0){
					System.out.println("Your Pokedex is currently empty!");
				}
				else{
					pkmList.listPokemon();
				}
				System.out.println();//line gap after list is printed
			}
			
			//Option 2: Add Pokemon
			else if (pkmChoice == 2){
				//boolean l = false;
				//while ()
				System.out.println();
				System.out.print("Please enter the Pokemon's name: ");
				pkmName = input.next();
				//convert the String(addPkm) to an object
			    int attack = (pkmName.length() * 4) + 2; 
				int defense = (pkmName.length()* 2) + 7;
				int speed = (pkmName.length() * 3) + 5;
				//creates a new object for the pokemon with stats		
				Pokemon pkm = new Pokemon(pkmName, attack, defense, speed);
				pkmList.addPokemon(pkm);
				//random for loop just to change the cunt to a different number
				for (int h = 0; h < 3; h++){
					count++;
				}
				System.out.println();
			}
			
			//Option 3: Check a Pokemon's Status
			else if (pkmChoice == 3){
				System.out.println();
				System.out.print("Please enter the Pokemon of interest: ");
				checkPkm = input.next();
				//call the checkStats method from the Pokedex Object/class
				pkmList.checkStats(checkPkm);
				System.out.println();
			}
			
			//Option 4: Sort Pokemon
			else if (pkmChoice == 4){
				//just call the method from the Pokedex class to sort original array to 
				//an organized array here
				pkmList.sortPokemon();
				System.out.println();//creates the gap after the methods are carried out
			}
			
			//Option 5: Exit
			else{
				z = false;//exits out of current loop
				x = false;//exits out of the main loop
				System.exit(1);
			}
		}//end of pkmChoice loop
		
		
	}//end of the big while loop
	
	}//end of the main method
	
	//METHODS
	public static void pkmMenu(){
		//loads up the menu every time it is called to the main method
		System.out.println("1. List Pokemon");
		System.out.println("2. Add Pokemon");
		System.out.println("3. Check a Pokemon's Stats");
		System.out.println("4. Sort Pokemon");
		System.out.println("5. Exit");
	}
	
}//end of the overall class 