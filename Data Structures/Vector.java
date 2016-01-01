import java.util.EmptyStackException;

public class Vector {
	private int[] arr;
	private int size;

	public Vector(int startSize) {
		arr = new int[startSize];
		this.size = 0;
	}

	public void resize() {

		int[] newArr = new int[2 * size];
		int counter = 0;
		for (int i : arr) {
			newArr[counter] = arr[counter++];
		}
		arr = newArr;
		// To test
		System.out.println("Resize Operation Performed");
	}

	public void push(int i) {
		if (size + 1 >= arr.length)
			resize();

		arr[size++] = i;
	}

	public int pop() {
		if (size == 0)
			throw new EmptyStackException();

		return arr[size--];
	}

	public int remove(int index) {

		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();

		int returnValue = arr[index];

		// shift elements backwards
		for (int i = index; i < size; i++) {
			arr[i] = arr[i + 1];
		}
		size--;

		return returnValue;
	}

	public int get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		return arr[index];
	}

	public void insert(int val, int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		// shift elements forward
		for (int i = index; i < size; i++) {
			arr[i + 1] = arr[i];
		}

		arr[index] = val;
	}
}
