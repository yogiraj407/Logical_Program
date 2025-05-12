package c1_array;

import java.util.*;

public class Logical_Array_Program {
	
	public int addNumbers(int[] numbers) {
		int c=0;
		for(int i=0;i<numbers.length;i++) {
		 c=c+numbers[i];
		}
		return c;
		//System.out.println(c);
	}
	
	public static void 	logic(int[] array) {
		
		for(int j=0;j<array.length;j++) 
		 {
			for(int i=j+2;i<array.length;i++) 
			 {
					System.out.print("["+array[j]+","+array[i]+"]"+",");
			 	}
			}
			
			}
	
	public static void findDuplicate(int[] ar) {
		
		int l=ar.length;
		int[] arr1=new int[l];
		String duplicate="";
		for(int j=0;j<l-1;j++) {
			for(int i=j+1;i<l;i++) {
				if(ar[i]==ar[j]) {
					 duplicate=duplicate+ar[j]+",";
				}
			}
		}
		System.out.println(duplicate);
	}
	
	
	
	
	public static void main(String[] args) {

		
		
		
//Find duplicate no's from array		
//	int[] ar= {1,5,3,4,5,1,4,3};
//	findDuplicate( ar);
//	int l=ar.length;
//	int[] arr1=new int[l];
//	String duplicate="";
//	for(int j=0;j<l-1;j++) {
//		for(int i=j+1;i<l;i++) {
//			if(ar[i]==ar[j]) {
//				 duplicate=duplicate+ar[j]+",";
//			}
//		}
//	}
//	System.out.println(duplicate);
//	
		
//Convert the given string into sequence of Alphabets
//		String a="this is a car";
//		char[] b=a.toCharArray();
//		int l=b.length;
//		char c;
//		for(int j=0;j<l-1;j++) {
//			for(int i=j+1;i<l;i++) {
//				if(b[i]<b[j]) {
//					c=b[j];
//					b[j]=b[i];
//					b[i]=c;
//				}
//			}
//		}
//		for(int i=0;i<l-1;i++) {
//		System.out.print(b[i]);
//		}
//		
//Reverse String 
//		
String[] letter= {"yogiraj yadav krushna"};
//		String s="yogiraj krushna yadav ";
//		////String s=Arrays.toString(letter);
String s1=String.join("", letter);
System.out.print(s1.charAt(0));
//		String[] b=s.split(" ");
//		for(int i=b.length-1;i>=0;i--) {
//		System.out.print(b[i]+" ");
//		}
//		
		
//Write a Program in Java to Add two Numbers.
		
//		int[] numbers= {1,2,4,6,8,9};
//		
//		Logical_Array_Program codeClass=new Logical_Array_Program();
//		
//		int result=codeClass.addNumbers(numbers);
//		
//		System.out.println(result);
//		
		
//Write a Program to Swap Two Numbers
		
		
//		int a=3;
//		int b=7;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("b="+b+" "+"a="+a);

		
//Java Program to Check if a Given Integer is Odd or Even
		
//		Scanner a=new Scanner(System.in);
//		System.out.println("Enter Number:");
//		int a1=a.nextInt();
//		if(a1%2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
		
		
		
//Java Program to Check Armstrong Number between Two Integers
		
//		for(int i=100;i<=200;i++) {
//		int num= i;
//		int temp=num;
//		int	num1=0;
//		int	num2=0;
//		while(num>0) {
//		num1=num%10;
//		num2=num2+num1*num1*num1;
//		num=num/10;
//		}
//		if(num2==temp) {
//	System.out.println(num2);
//		
//		}
//		else {
//			
//		}
//		}
		
		
//Java Program to Check If a Number is Neon Number or Not

		
//		int a=11;
//		
//		int b=a*a;
//		
//		int c=b%10;
//		int d=b/10;
//		int e=c+d;
//		
//		if(e==a) {
//		System.out.println("it is neon number");
//		}else {
//			System.out.println("it is not neon number");
//		}
		
		
		
//	Java Program to Print Right Triangle Star Pattern

//		for(int j=0;j<=5;j++) {
//		for(int i=0;i<=j;i++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}
		
		
		
//Java Program to Print Left Triangle Star Pattern
	
//		for(int j=0;j<=5;j++) {
//		for(int i=5;i>=j;i--) {
//		System.out.print(" ");
//		}
//		for(int k=0;k<=j;k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}
//		
		
		
//Java Program to Print Pyramid Number Pattern
		
// Java Program to Print Reverse Pyramid Star Pattern
		
//		for(int k=7;k>0;k--) {
//		for(int i=7;i>k;i--) {
//		System.out.print(" ");
//		}
//		for(int j=k;j>0;j--) {
//		System.out.print("* ");
//		}
//		System.out.println();
//		}
		
		
//		int [] array= {5, 1, 3, 2, 4, 6};
//		logic(array);
//			
//			ArrayList list=new ArrayList<>();
//			
//			list.add(10);
//			list.add("one");
//		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
		
	}

