package Sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class SortingRunner {
	public static void main(String[] args){
		/* int[] test = makearr(10);

		printarr(test);
		quickSortIter(test);
		printarr(test); */

		timeSorting();
	}

	public static void timeSorting(){
		long start;
		long end;
		for(int size = 10; size <= 100000000; size *= 10){
			int[] arr = makearr(size);
			int[] arrCopy = arr.clone();

			System.out.printf("Arrays of size %d%n", size);

			if(size <= 100000){
				start = System.nanoTime();
				bubbleSort(arrCopy);
				end = System.nanoTime();
				System.out.printf("\tBubble sort took %d milliseconds%n", (end-start)/1000);
				arrCopy = arr.clone();

				start = System.nanoTime();
				bubbleSortSC(arrCopy);
				end = System.nanoTime();
				System.out.printf("\tBubble sort with short circuit took %d milliseconds%n", (end-start)/1000);
				arrCopy = arr.clone();

				start = System.nanoTime();
				selectionSort(arrCopy);
				end = System.nanoTime();
				System.out.printf("\tSelection sort took %d milliseconds%n", (end-start)/1000);
				arrCopy = arr.clone();


				start = System.nanoTime();
				insertionSort(arrCopy);
				end = System.nanoTime();
				System.out.printf("\tInsertion sort took %d milliseconds%n", (end-start)/1000);
				arrCopy = arr.clone();
			}

			start = System.nanoTime();
			mergeSort(arrCopy);
			end = System.nanoTime();
			System.out.printf("\tMerge sort took %d milliseconds%n", (end-start)/1000);
			arrCopy = arr.clone();

			start = System.nanoTime();
			quickSort(arrCopy);
			end = System.nanoTime();
			System.out.printf("\tQuick sort took %d milliseconds%n", (end-start)/1000);
			arrCopy = arr.clone();

			start = System.nanoTime();
			quickSortIter(arrCopy);
			end = System.nanoTime();
			System.out.printf("\tIterative Quick sort took %d milliseconds%n", (end-start)/1000);
		}
	}

	public static int[] makearr(int size){
		int[] arr = new int[size];

		Random rng = new Random();
		//int bound = 10;
		int bound = Integer.MAX_VALUE;

		for(int i = 0; i < size; i++){
			arr[i] = rng.nextInt(bound);
		}

		return arr;
	}

	public static void printarr(int[] arr){
		System.out.print("[");

		for(int e : arr){
			System.out.printf("%d, ", e);
		}

		System.out.println("]");
	}

	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){

			for(int j = 0; j<arr.length-i-1; j++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void bubbleSortSC(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			boolean swap  = false;

			for(int j = 0; j < arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp =  arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}

			if(!swap){
				break;
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for(int i=0; i< arr.length-1; i++){
			int minIndex = i;

			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[minIndex]){
					minIndex =j;
				}
			}

			int smallerNumber = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	public static void insertionSort(int[] arr) {
		int i;
		int key;
		int j;

		for (i = 1; i < arr.length; i++){
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;
		}
	}

	public static void mergeSort(int[] arr) {
		if (arr.length < 2){
			return;
		}

		int mid = arr.length / 2;
		int[] l = new int[mid];
		int[] r = new int[arr.length - mid];

		for (int i = 0; i < mid; i++){
			l[i] = arr[i];
		}

		for (int i = mid; i < arr.length; i++){
			r[i - mid] = arr[i];
		}

		mergeSort(l);
		mergeSort(r);

		merge(arr, l, r, mid, arr.length - mid);
	}

	public static void merge(int[] array, int[] l, int[] r, int left, int right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				array[k] = l[i];
				i++;
			}
			else {
				array[k] = r[j];
				j++;
			}
			k++;
		}

		while (i < left){
			array[k++] = l[i++];
		}

		while (j < right){
			array[k++] = r[j++];
		}
	}

	public static void quickSort(int[] arr){
		/* PLANNING
		Steps of alg
		1. pick a random element of the array
		2. call this the partition
		3. compare rest of elements to partition
			3a. if less than or equal partition put in left
			3b. if greater then partition put in right
		4. repeat step 3 until arrays are of size 1 or 0

		Data structures and programming needs
		- integer arrays (dynamic)
			- Arraylist
		- while loop
		- recursion
		- random number generator
		*/


		/*
			[3, 1, 6, 2, 5, 7, 4]
			PartitionValue: 4
			PartitionIndex: 1

			Left: [3,1,2]
			Right: [6,5,7]

			[3,1,2] + 4 + [6,5,7]
			arr: [3,1,2,4,6,5,7]
			SeparatorIndex: 3

			LeftIndices: 0:2
			RightIndices: 4:6

			[3,1,2,4,6,5,7]

			operating between 0:2
			nextInt(3)
			[1,2,3,4,6,5,7]

			operating between 4:6
			nextInt(3)+4
			[1,2,3,4,5,6,7]

		*/

		if(arr.length <= 1){
			return;
		}

		//1. pick a random element of the array
		Random rng = new Random();
		int partitionIndex = rng.nextInt(arr.length);

		//2. call this the partition
		int partitionValue = arr[partitionIndex];

		//3. compare rest of elements to partition
		// Unoptimized source

		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(i == partitionIndex){
				continue;
			}
			//3a. if less than or equal partition put in left
			if(arr[i] <= partitionValue){
				left.add(arr[i]);
			}

			//3b. if greater then partition put in right
			if(arr[i] > partitionValue){
				right.add(arr[i]);
			}

		}

		//4. repeat step 3 until arrays are of size 1 or 0
		//Recursion Helpful
		int[] staticLeft = convertIntegers(left);
		int[] staticRight = convertIntegers(right);

		quickSort(staticLeft);
		quickSort(staticRight);

		//5. Merge left and right array

			//5a. merge left array into arr
			for(int i = 0; i < staticLeft.length; i++){
				arr[i] = staticLeft[i];
			}

			arr[staticLeft.length] = partitionValue;

			//5b. merge right array into arr
			for(int i = 0; i < staticRight.length; i++){
				arr[i + staticLeft.length + 1] = staticRight[i];
			}
	}

	public static int[] convertIntegers(ArrayList<Integer> integers){
		int[] ret = new int[integers.size()];
		for (int i=0; i < ret.length; i++){
			ret[i] = integers.get(i).intValue();
		}
		return ret;
	}

	public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    static void qSort(int arr[], int low, int high)
    {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

	public static void quickSortIter(int[] arr){
		Stack<int[]> stack = new Stack();
		int l,h;


		int[] bounds = {0,arr.length -1};
        stack.push(bounds);

        while (!stack.isEmpty()) {
			bounds = stack.pop();
			l = bounds[0];
            h = bounds[1];

            int p = partition(arr, l, h);

            if (p - 1 > l) {
				bounds[0] = l;
				bounds[1] = p - 1;
				stack.push(bounds);
            }

            if (p + 1 < h) {
				bounds[0] = p + 1;
				bounds[1] = h;
				stack.push(bounds);
            }
        }
	}
}
