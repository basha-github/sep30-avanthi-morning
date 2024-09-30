import java.util.Scanner;


/*
 * 
 * 
 * Sum of two numbers where one number is represented as array of digits

Given an array arr[] of digits and an integer K, the task is to find num(arr) + K where num(arr) is the number formed by concatenating all the digits of the array.

Examples: 


Input: arr[] = {2, 7, 4}, K = 181 
Output: 455 
274 + 181 = 455

2*10+7--27*10+4--274





Input: arr[] = {6}, K = 815 
Output: 821 
6 + 815 = 821 


 * 
 * 
 * 
 * 
 * 
 */
public class Problem1 {

	public static void main(String[] args) {

		//Sum of two numbers where one number is 
		//represented as array of digits
		int[] arr;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of elements");
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("enter all "+size+"  elements");
		
		for(int i=0;i<size;i++) {
			
			int element = sc.nextInt();
			arr[i]=element;
				
		}
		
		int k;
		System.out.println("enter k element");
		k = sc.nextInt();
		
		// 274
		int num = 0;
		// num * 10+ arr[i]
		// 0 * 10+ 2
		// 2 *10+7--- 27
		// 27 * 10+4
		//274
		
		for(int i=0;i<arr.length;i++) {
			num = num * 10 +arr[i];
		}
		System.out.println(num+k);
	}

}
