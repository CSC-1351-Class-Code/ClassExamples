package MinecraftMobs;

public class Zombie extends AggressiveMob{
	public Zombie(int h, int mS, int d, int dR, double aS){
		// Since all data members are made by the parent
		// super needs to be used here to invoke that constructor
		super(h, mS, d, dR, aS);
	}

	// This is to show the specific implementation
	// of sound() and attack() for the Zombie class
	@Override
	public void sound(){
		System.out.println("Groan");
	}

	// NOTE - even though the parent attack() is protected,
	// child classes can always make things more available but never stricter
	// private -> protected -> public
	@Override
	public int attack(){
		return (int)(super.attack()*.5);
	}
}
