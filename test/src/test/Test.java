package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a project test.");
		System.out.println("This is an update.");
		//
		// 0(1) constant
		System.out.println("This is constant notation");
		
		// O(n) linear growth with input
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		for (int i = 0; i < arr.length; i++) {
			// syso is still o(1) constant runtime
			System.out.println(arr[i]);
		}
		int count = 0;
		// O(n^2) 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("outer loop at: " + i);
			for (int j = 0; j < arr.length; j++) {
				System.out.println("inner loop at: " + j);
				if (arr[i] != arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
