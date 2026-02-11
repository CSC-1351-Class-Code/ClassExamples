package MinecraftMobs;

// This class is to define mobs that don't attackor are otherwise passive
public class PassiveMob extends Mob{
	public PassiveMob(int h, int mS){
		// Since health and movementSpeed are made by the parent
		// super needs to be used here to invoke that constructor
		super(h, mS);
	}
}
