package Recursion.Fibonacci;

public class FibRunner {
	public static void main(String[] args){

		System.out.printf("%-10s%-15s%-20s%-10s%n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
		System.out.println("==========================================================");
		for(int i = 10; i <= 50; i += 10)
		{
			//Calculate time in nano second for recursive Fibonacci
			long start= System.nanoTime();
			fibRecursive(i);
			long elapsedRec = System.nanoTime() - start;

			//Calculate time in nano second for iterative Fibonacci
			start= System.nanoTime();
			long fib = fibIterative(i);
			long elapsedIter = System.nanoTime() - start;

			System.out.printf("%-10d%-15d%,-20d%,-10d%n", i, fib, elapsedRec, elapsedIter);
		}
		System.out.println("==========================================================");
	}

	public static long fibRecursive(int n){
		// Base case
		// Fib(1) = 1
		// Fib(2) = 1
		if(n <= 2){
			return 1;
		}

		return fibRecursive(n-1) + fibRecursive(n-2);
	}

	public static long fibIterative(int n){
		long fib = 1; // fib and Fib(n-1)
		long n_2 = 1; // Fib(n-2)

		while(n > 2){
			// Can view the below line as the following:
			// fib = Fib(n-1) + Fib(n-2)
			fib += n_2;

			// Need to update Fib(n-2) for the next loop
			// Update needs to make n_2 = Fib(n-1) of this loop
			// Since fib is now Fib(n-1) + Fib(n-2)
			// and n_2 is Fib(n-2)
			// the following sets n_2 to this loop's Fib(n-1)
			n_2 = fib - n_2;

			// Decrement n to know how many more runs we have
			// What we decrement here increments the n of the Fib function
			// The current status of fib and n_2
			// fib = Fib(n-1) + Fib(n-2) = Fib(n)
			// n_2 = Fib(n-1)
			// When if another run of the loop happens,
			// we 'increase' the n we are using, so
			// in the next loop, our current n will be n-1
			// Thus, the variable in the next loop will represent
			// fib = Fib(n-1)
			// n_2 = Fib(n-1 -1) = Fib(n-2)
			n--;
		}

		return fib;
	}
}
