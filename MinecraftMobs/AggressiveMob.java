package MinecraftMobs;

// This class allows to define aggressive mobs that attack
public class AggressiveMob extends Mob{
	protected int damage;
	protected int detectionRadius;
	protected double attackSpeed;

	public AggressiveMob(int h, int mS, int d, int dR, double aS){
		// Since health and movementSpeed are made by the parent
		// super needs to be used here to invoke that constructor
		super(h, mS);
		damage = d;
		detectionRadius = dR;
		attackSpeed = aS;
	}

	public int getDamage() {
		return damage;
	}

	public int getDetectionRadius() {
		return detectionRadius;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	// Default definition for the attack() function
	// if children don't implement their own, this one will be called
	protected int attack(){
		return (int)(damage * attackSpeed);
	}

}
