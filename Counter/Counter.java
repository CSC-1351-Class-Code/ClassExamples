package Counter;

// This class serves as a code example of a click counter
public class Counter {
	private int count;

	public Counter(){
		count = 0;
	}

	// increments the count of the instance
	public void Click(){
		count++;
	}

	// resets the count of the instance
	public void Reset(){
		count = 0;
	}

	// NOTE - this could also be a toString method or at least adapted to one
	public void Display(){
		System.out.println("Number of clicks :: " + count);
	}

}
