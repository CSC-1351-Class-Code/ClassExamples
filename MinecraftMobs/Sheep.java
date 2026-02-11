package MinecraftMobs;

public class Sheep extends PassiveMob{
	private boolean isSheared;
	private boolean isFed;

	public Sheep(int h, int mS, boolean iS, boolean iF){
		// Since health and movementSpeed are made by the parent
		// super needs to be used here to invoke that constructor
		super(h, mS);
		isSheared = iS;
		isFed = iF;
	}

	public void setSheared(boolean isSheared) {
		this.isSheared = isSheared;
	}

	public void setFed(boolean isFed) {
		this.isFed = isFed;
	}

	public boolean getSheared(){
		return isSheared;
	}

	public boolean getFed(){
		return isFed;
	}

	@Override
	public void sound() {
		super.sound();
		System.out.println("Baaaaaaaaaaa!");
	}

}
