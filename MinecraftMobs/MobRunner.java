package MinecraftMobs;

public class MobRunner {
	public static void main(String[] args){
		String separator = "=========================================";

		Mob def = new Mob(10, 10);
		AggressiveMob ag = new AggressiveMob(10, 10, 10, 10, 10);
		Creeper captainSparklez = new Creeper(30, 5, 40, 30, 1);
		Zombie carl = new Zombie(100, 2, 10, 20, 3);
		Sheep baba = new Sheep(0, 0, false, false);


		// Here we see expected behavior that the classes that override the sound()
		// function have different results
		def.sound();
		ag.sound();
		captainSparklez.sound();
		carl.sound();
		baba.sound();

		System.out.println(separator);

		// Here we see that the calculations for a Creeper and Zombie are different
		// and in accordance to there implementation
		System.out.println(captainSparklez.attack());
		System.out.println(carl.attack());

		System.out.println(separator);

		Mob geoff = new Creeper(30, 5, 40, 30, 1);
		Mob karl = new Zombie(100, 2, 10, 20, 3);
		AggressiveMob jeff = new Creeper(30, 5, 40, 30, 1);
		AggressiveMob qarl = new Zombie(100, 2, 10, 20, 3);

		// We can still refer to all the different classes that inherit from Mob
		// as a Mob object
		// However, we can only use the functions and data members that Mob allows us
		// Also, we must a common parent of the elements of the list because Java is a strongly
		// typed language
		// This means the following list could use AggresiveMob as well
		Mob[] mobs = {captainSparklez, carl, geoff, karl, jeff, qarl};

		// All Mobs have a sound() function
		// If it is a child class, then that version is used
		// otherwise, the default on is used
		for(Mob m : mobs){
			m.sound();
		}

	}
}
