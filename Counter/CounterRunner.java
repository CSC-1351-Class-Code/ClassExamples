package Counter;

public class CounterRunner {
	public static void main(String[] args){

		Counter ctr1 = new Counter();
		Counter ctr2 = new Counter();

		// Show that the counters start the same
		ctr1.Display();
		ctr2.Display();
		System.out.println("====================================");

		for(int i = 0; i < 10; i++){
			// We increment the counters at different points
			// ctr1 is incremented every time
			// ctr2 is incremented every 3 passes of the loop
			ctr1.Click();
			if(i%3==0){
				ctr2.Click();
			}

			// show they are updating differently
			System.out.printf("Run %d :\n", i+1);
			ctr1.Display();
			ctr2.Display();
			System.out.println("====================================");

		}

		// Show that the reset only affects the instance that called it
		ctr1.Reset();
		ctr1.Display();
		ctr2.Display();
		System.out.println("====================================");
	}
}
