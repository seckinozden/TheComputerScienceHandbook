import java.util.LinkedList;

public class HashSet {

	public LinkedList<Integer>[] buckets;
	public int bucketsize = 10;
	public int size = 0;
	public static final double COLLISION_CHANCE = 0.3;

	@SuppressWarnings("unchecked")
	public HashSet() {
		buckets = new LinkedList[bucketsize];
		for (int i = 0; i < bucketsize; i++) {
			buckets[i] = new LinkedList<Integer>();
		}
		size = 0;
	}

	public int getHash(int x, int hashSize) {
		return x % hashSize;
	}

	public void resize() {
		int newBucketSize = bucketsize * 2;

		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] newBuckets = new LinkedList[newBucketSize];

		for (int i = 0; i < newBucketSize; i++) {
			newBuckets[i] = new LinkedList<Integer>();
		}

		for (int i = 0; i < bucketsize; i++) {
			for (int item : buckets[i]) {
				int hash = getHash(item, newBucketSize);
				newBuckets[hash].push(item);
			}
		}

		buckets = newBuckets;
		bucketsize = newBucketSize;
	}

	public boolean insert(int num) {

		int hash = getHash(num, bucketsize);
		LinkedList<Integer> currentBucket = buckets[hash];

		if (currentBucket.contains(num))
			return false;

		currentBucket.push(num);
		if ((float) size / bucketsize >= COLLISION_CHANCE)
			resize();

		size++;
		return true;
	}

	public boolean contains(int num) {
		int hash = getHash(num, bucketsize);
		return buckets[hash].contains(num);
	}

	public boolean remove(int num) {

		int hash = getHash(num, bucketsize);

		if (buckets[hash].contains(num))
			size--;

		return buckets[hash].remove((Integer) num);
	}
}
