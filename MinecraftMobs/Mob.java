package MinecraftMobs;


// Overarching class that all mobs will inherit from
public class Mob {
	// all mobs have health and movement speed
	// we use protected here so the child classes can use them without getter and setter functions
	protected int health;
	protected int moveSpeed;

	public Mob(int h, int mS){
		health = h;
		moveSpeed = mS;
	}

	// getter and setter functions are still needed if data will be used outside of the classes
	protected void setHealth(int h){
		health = h;
	}

	public int getHealth() {
		return health;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}

	// we can provide a 'default' implementation of functions at the parent level
	// that the children can optionally override and change
	public void sound(){
		System.out.println("Deafult Sound. Please change in child");
	}

	public void damageTaken(int d){
		health -= d;
	}
}
