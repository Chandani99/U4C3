package firstProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayPrintElem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter the size of array");
			
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter the element of array");
			for(int i=0; i<arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter the index of element to access");
			int index=sc.nextInt();
		
			System.out.println("The array element at index "+index +" = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(IndexOutOfBoundsException eob){
			System.out.println( "java.lang.ArrayIndexOutOfBoundsException ");	
		}
		catch(NumberFormatException nfe){
			System.out.println("java.lang.NumberFormatException");	
		}
		catch(InputMismatchException ime){
			System.out.println("java.util.InputMismatchException");	
		}
		
	}

}
