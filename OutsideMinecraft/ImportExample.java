package OutsideMinecraft;

import MinecraftMobs.AggressiveMob;
import MinecraftMobs.Creeper;
import MinecraftMobs.Mob;
import MinecraftMobs.Zombie;

public class ImportExample {
	public static void main(String[] args){
		Mob def = new Mob(10, 10);
		AggressiveMob ag = new AggressiveMob(10, 10, 10, 10, 10);
		Creeper captainSparklez = new Creeper(30, 5, 40, 30, 1);
		Zombie carl = new Zombie(100, 2, 10, 20, 3);

		def.sound();
		ag.sound();
		captainSparklez.sound();
		carl.sound();

		// We can't use the commented out code because it is a protected function
		// we can still use the Zombie attack since it is public
		//System.out.println(captainSparklez.attack());
		System.out.println(carl.attack());
	}
}
