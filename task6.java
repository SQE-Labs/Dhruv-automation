package training;
//Find largest number in array
public class task6 {

	public static void main(String[] args) {

		
		        int[] arr = {3, 8, 1, 9, 6};
		        int max = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }

		        System.out.println("Largest number: " + max);
		    }
		}

	


