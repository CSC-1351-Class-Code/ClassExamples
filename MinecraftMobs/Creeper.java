package MinecraftMobs;

public class Creeper extends AggressiveMob{

	public Creeper(int h, int mS, int d, int dR, double aS){
		// Since all data members are made by the parent
		// super needs to be used here to invoke that constructor
		super(h, mS, d, dR, aS);
	}

	// This is to show the specific implementation
	// of sound() and attack() for the Creeper class
	@Override
	public void sound(){
		System.out.println("Hisssssssssssss!");
	}

	@Override
	protected int attack(){
		return (int)(super.attack()*100);
	}

}
