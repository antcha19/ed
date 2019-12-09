package iesserpis.ed;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int max(int[] v) {
		int max = v[0];
		for (int i = 1; i < v.length ; i++) {

			if (v[i] > max)
				max = v[i];

		}
		return max;
	}

	public static int min(int[] v) {
		int min = v[0];
		for (int i = 1; i < v.length ; i++) {

			if (v[i] < min)
				min = v[i];

		}
		return min;
	}
}
