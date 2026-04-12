package CollectionsClass;

public class ArrayList<T> {
	private T[] arr;
	private int size;

	public ArrayList(){
		arr = (T[]) new Object[10];
		size = 0;
	}

	public ArrayList(T[] a){
		arr = a;
		size = a.length;
	}

	public void add(T elem){
		if(size < arr.length){
			arr[size] = elem;
			size++;
			return;
		}

		// ===============
		T[] temp = (T[]) new Object[arr.length+10];

		for(int i = 0; i < arr.length; i++){
			temp[i] = arr[i];
		}

		temp[arr.length] = elem;
		arr = temp;
		size++;
	}

	public void add(T elem, int index) throws IndexOutOfBoundsException{
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("Index provided is out of array bounds");
		}

		arr[index] = elem;
	}

	public int remove(T elem){
		int location = linearSearch(elem);

		if(location >= 0){
			for(int i = location; i < size-1; i++){
				arr[i] = arr[i+1];
			}
			size--;
		}

		return location;
	}

	private int linearSearch(T elem){

		for(int i = 0; i < arr.length; i++){
			if(arr[i].equals(elem)){
				return i;
			}
		}

		return -1;
	}
}
