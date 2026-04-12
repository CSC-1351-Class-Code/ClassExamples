package CollectionsClass;

public class CollectionsRunner {
	public static void main(String[] args){
		ArrayList test = new ArrayList();
		/* long start, end;

		start = System.nanoTime();
		for(int i = 0; i < 1000000; i++){
			test.add(i);
		}
		end = System.nanoTime();
		System.out.printf("\tAdding elements took %d milliseconds%n", (end-start)/1000); */

		int size = 10;
		for(int i = 0; i < size; i++){
			test.add(i);
		}


		test.add(10);

		test.add(11, 3);

		test.remove(2);

		test.remove(5);

		test.add(12);

		System.out.println("Finished!");
	}
}
