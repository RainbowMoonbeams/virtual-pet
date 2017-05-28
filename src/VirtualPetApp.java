import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/// implements a game loop.
		// asks for user input.
		// writes output to the console.

		writeLine("This is my story... \nI was out for a walk in the beautiful countryside and saw a figure in the distance. \nAs I got closer, I noticed that it was an animal... \nI got even closer and I saw that it was an alpaca! \nHave you ever happened upon an alpaca?? \nI approached slowly and he looked right at me. I saw that he was wearing a collar and that it said \'Albus\'. \nI said \'Hi, Albus, where do you belong?\' I swear, he smiled at me!\nIt was then that I saw a sign hanging from his collar. It read: \n'I'm a lovely pet and I want a new place to live. Please bring me home with you. -Albus\' \nI looked at him and exclaimed \'Did you write that note?!\' He nodded \'yes\'. \n\'Would you like to come home with me?\' Again, he nodded \'yes\' \nI'm telling you all of this because I need you to help me take care of him. Let me show you how...\n");
		VirtualPet myPet = new VirtualPet();

		writeLine("Type \'status\' to see what Albus needs right now.");
		String status = input.next();

		do {
			writeLine("\n1 Hunger : " + myPet.hunger + " (high number? feed him)" + "\n2 Thirst : " + myPet.thirsty
					+ " (high number? water him)" + "\n3 Bored : " + myPet.playWith + " (high number? play with him)"
					+ "\n4 Energy : " + myPet.energy + " (low number? nap time)" + "\n5 Sick : " + myPet.sick
					+ " (high number? tend to him)" + "\n6 Bathroom : " + myPet.loo + " (high number? take him out)"
					+ "\n7 Temperature : " + myPet.isHot + " (high number? time for a hair cut)"
					+ "\n8 Quit (bored? is Albus too needy? this is your only way out...)\n");

			writeLine("How would you like to interact with Albus? \nType the number that corresponds to the interaction.");

			String interact = input.next();

			switch (interact) {
			case "1":
				writeLine("Albus loves to eat! You can feed him: \n1 Grass\n2 Chopped carrots, apples & celery\n3 Chopped cabbage, parsley & brussels sprouts");
				String feed1 = input.next();
				if (feed1.equals("1")) {
					myPet.feed();
					writeLine("Albus is satisfied with munching on grass for a while. Why don't you go take a nap before he needs you again?");
				} else if (feed1.equals("2")) {
					myPet.feed();
					writeLine("Albus gives you a huge smile - he LOVES chopped fruits!");
				} else if (feed1.equals("3")) {
					myPet.feed();
					writeLine("His faaaaavorite meal! Albus gives you a huge smile because he knows you'll regret this decision later...\nHe didn't earn the name \"Gassy Alpacky\" for nothing!");
				}
				break;
			case "2":
				myPet.giveDrink();
				writeLine("You gave Albus a bucket of water from the natural spring out back.");
				break;
			case "3":
				writeLine("You want to play with Albus. What kind of game would you like to play? \n1 Play fetch \n2 Go for a jog \n3 Play soccer");
				String interact1 = input.next();
				if (interact1.equals("1")) {
					myPet.playWith();
					writeLine("Albus' favorite thing to fetch is a frisbee. \nYou're a terrible thrower but he can still retrieve the frisbee when it lands in lower tree branches. \nAfter a few really bad throws, he makes you fetch the frisbee and waits impatiently for you to fluff his hay so he can take a nap.");
				} else if (interact1.equals("2")) {
					myPet.playWith();
					writeLine("Albus loves jogging and frolicking!");
				} else if (interact1.equals("3")) {
					myPet.playWith();
					writeLine("Albus loves kicking the ball around. He's quick - don't let him score on you because he'll never let you live that one down.");
				}
				break;
			case "4":
				myPet.energy();
				writeLine("Albus was looking sleepy. You fluffed his hay and he took a nap. \nNow he is feeling refreshed and ready to frolick!");
				break;
			case "5":
				myPet.sick();
				writeLine("Albus is a little sniffly. You held the tissue while he blew his nose. What a mess!");
				break;
			case "6":
				myPet.loo();
				writeLine("You walk Albus to his favorite spot to relieve himself. \nYou have a collection of droppings to sell to your local nursery to use as fertilizer.");
				break;
			case "7":
				myPet.isHot();
				writeLine("Albus says, \"Ahhhh that's much better! I'm much cooler now\"\nYou called the groomer to shear Albus. He will be much cooler now. \nYou sell his fleece to the farmer down the road who will spin it into yarn.");
				break;
			default:
				writeLine("You just quit the game.\nAlbus teleported back to the field and another poor sucker happened upon him. \nHe remembers your time together fondly...");
				System.exit(0);
				break;
			}

			if (myPet.hunger >= 70 && myPet.hunger <= 199) {
				writeLine("\nAlbus says, \"I'm so hungry, I could eat a cow! \nJust kidding, I don't eat cows, but seriously, how's an Alpaca get any food around here??\"\nYou think to yourself that maybe you should have just left him in that field...");
			} else if (myPet.thirsty >= 70 && myPet.thirsty <= 199) {
				writeLine("\nAlbus says, \"I'm thirsty, dangit!\"\nYou roll your eyes and and reconsider bringing home a talking Alpaca...");
			} else if (myPet.playWith <= 30 && myPet.playWith <= 199) {
				writeLine("\n");
			} else if (myPet.energy >= 100) {
				writeLine("\nAlbus says, \"I've got ALL. THIS. ENERGY! Let's dooooo something.");
			} else if (myPet.loo >= 130 && myPet.loo <= 199) {
				writeLine("\nAlbus says, \"I gotta go. Like now... Should I just use any old corner?\" ");
			} else if (myPet.isHot >= 130 && myPet.isHot <= 199) {
				writeLine("\nAlbus says, \"Is it like a bazillion degrees in here or is it just me??\"\nYou try to give him a hair cut but fail miserably and he mocks you for it.\nFor such a needy pet, you'd think he'd be more self-sufficient...");
			}

			if (myPet.hunger >= 200) {
				writeLine("\nAlbus helps himself to the food in the refrigerator. The dog cleaned up after him...");
			} else if (myPet.thirsty >= 200) {
				writeLine("\nAlbus says, \"I'm thirsty, dangit!\"\nYou roll your eyes and and reconsider bringing home a talking Alpaca...");
			} else if (myPet.playWith >= 200) {
				writeLine("\nAlbus was so bored that he started organizing your closet, but your wardrobe was even more boring.\nYou find him napping in your bed...");
			} else if (myPet.energy >= 200) {
				writeLine("\nAlbus wants you to play with him but you're on a conference call.\nYou find him practicing his aim with spitting. He uses your grandmothers urn as a target...");
			} else if (myPet.loo >= 200) {
				writeLine("\nAlbus taught himself to use the toilet, but his aim is terrible. You spend the next 3 hours cleaning the bathroom.");
			} else if (myPet.isHot >= 200) {
				writeLine("\nAlbus convinced your 12 year old to trim his hair. That backfired. Hours later, you find him lounging in your pool...\nHe must be hot.");
			}

			myPet.tick();

		} while (myPet.energy >= 1);

		if (myPet.energy <= 0) {
			writeLine("Albus died :(");
		}
	}

	public static void writeLine(String message) {
		System.out.println(message);
	}
}
