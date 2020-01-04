package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] firstArray= {"Russia","Iran","China","India","Turkey"};
		//2. print the third element in the array
		System.out.println(firstArray[2]);
		//3. set the third element to a different value
		firstArray[2]="pringle";
		//4. print the third element again
		System.out.println(firstArray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<5;i++) {
			System.out.println(firstArray[i]);
		}
		
		//6. make an array of 50 integers
		int [] secondArray=new int[50];
		for(int i=0;i<50;i++) {
			secondArray[i]=i;
		}
		//7. use a for loop to make every value of the integer array a random number
		int smallestNumber=50;
		int largestNumber=0;
		for(int i=0;i<50;i++) {
			int n=new Random().nextInt(50);
			secondArray[i]=n;
			if(n<smallestNumber) {
				smallestNumber=n;
			}
			if(n>largestNumber) {
				largestNumber=n;
			}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		for(int i=0;i<50;i++) {
			System.out.println(secondArray[i]);
		}
		//10. print the largest number in the array.
		System.out.println(largestNumber);
	}
}
