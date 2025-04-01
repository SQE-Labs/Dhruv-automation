package training;
//Write a program to find the second largest element from array.
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 5, 8, 15};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second largest element: " + second);
	}

}
