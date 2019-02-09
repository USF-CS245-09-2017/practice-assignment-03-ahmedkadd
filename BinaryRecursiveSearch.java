public class BinaryRecursiveSearch implements Practice03Search {

	public String searchName() {
		return "binary recursive search";
	}

	public int search(int [] arr, int target) {
		return search(arr, target, 0, arr.length - 1);
	}

	public int search(int [] arr, int target, int start, int end) {
		if (end > start) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (arr[mid] == target) {
			return mid;
		} else if (target < arr[mid]) {
			return search(arr, target, start, mid - 1);
		} else {
			return search(arr, target, mid + 1, end);
		}
	}
}
