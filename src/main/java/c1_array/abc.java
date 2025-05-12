package c1_array;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		
	//Find the repeated character of string or number
/*	
	int[] a= {2,1,2,7,7,5,5};
	//String s="yogiraj yadav form pune";
	
	int l=a.length;
	Map<Integer,Integer> map=new HashMap<>();
	
	
		for(int i=0;i<l;i++) {
			int c=a[i];
			if(map.containsKey(c)) {
				int count=map.get(c);
				map.put(c, ++count);
			}else {
				map.put(c, 1);
			}
		
	}
	System.out.println(map);
	
	*/
	/*
		//Find the repeated character of string or number
		String s="yogiraj yadav form pune";
		
		char[] x=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<x.length;i++) {
			int count=1;
			char c=x[i];
			if(map.containsKey(c)) {
				map.put(c, ++count);
			}
			else {
				map.put(c, count);
			}
			
		}
		System.out.println(map);
	*/	
	
		/*
		//Reverse each word in the string at same position

	String a="yogiraj krushna yadav";
	
		String[] b=a.split(" ");
		String e="";
		for(int j=0;j<b.length;j++) {
		String c=b[j].toString();
		String d="";
		for(int i=c.length()-1;i>=0;i--) {
			 d=d+c.charAt(i);
		}
		 e=e+d+" ";
		}
	System.out.println(e);
	
	*/
	/*
		
		//To find no is even or odd

		//int a=16;
		System.out.println("please enter the number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	
	*/
	/*	
		//Write a Java Program to Compute the Sum of Array Elements.
		//[ 2, 4, 6, 7, 9]
  
	        int[] a={2,4,6,7,9};
	        int sum1=0;
	        for(int i=0;i<a.length;i++){
	            sum1=sum1+a[i];
	        }
	        System.out.println(sum1);
	        
	  */
		/*
		// Java Program to Find the Largest Element in Array
		//[ 7, 2, 5, 1, 4]
		
		 public static void findLargestNumber(int[] a){
		        int b=0;
		        for(int j=0;j<a.length-1;j++){
		            for(int i=j+1;i<a.length;i++){
		                if(a[i]>a[j]){
		                    b=a[j];
		                    a[j]=a[i];
		                    a[i]=b;
		                }
		            }
		        }
		        System.out.println(a[0]);
		        
		    }
		    public static void main(String[] args) {
		        
		        // Java Program to Find the Largest Element in Array
				//[ 7, 2, 5, 1, 4]
				
				int[] a={7,2,5,1,4,8};
		        findLargestNumber( a);
		    }
		
		*/
	/*	
		//TO FIND ARMSTRONG NO -for loop (3 DIGIT AND 4 DIGIT]
		
		int a=156;
		int d=a;
		int b=0;
		int c=0;
		while(a%10>0) {
			b=a%10;
			 c=c+b*b*b;
			 a=a/10;
		}
		
		if(d==c) {
			System.out.println("this is armstrong number");
		}else {
			System.out.println("this is not armstrong number");
		}
		
		//or
		
		int n=153;
		int temp=n;
		int sum=0;
		for(int i=n;i>0;i=i/10)
		{
          int rem=i%10;
          sum=sum+rem*rem*rem;
		}
		if(sum==temp)
		{
			System.out.println("number is armstrong  "+sum);
		}else {
			System.out.println("number is not armstrong numbr "+temp);
		}
		
		*/
		/*
		//To find no is even or odd

		int a=6;
		
		if(a%2==0) {
			System.out.println("given number is even");
		}else {
			System.out.println("given number is odd");
		}
		
		//or
		
		int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			//	System.out.println("Number is even numer=="+i);
			}else
			{
				System.out.println("Number is odd numer=="+i);
			}
		}
		
		*/
		
		//Fibonacci series 0,1,2,3,5,8
		//n=10
		/*
		int a=0;
		int b=1;
		
		System.out.println(a+","+b);

		for(int i=0;i<=10;i++) {
			int c=a+b;
			System.out.println(","+c);
		}
		//above is wrong
		//or
		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.print(sum+",");
		}
		
		*/
		//To find the factorial of no n=4
		/*
		for(int i=4;i>0;i--) {
			
			int a=i
		}
		
		//or
		
		int n=8;
		int sum=1;
		for(int i=n;i>0;i--)
		{
			sum=sum*i;
			
		}
		System.out.print(sum);

		*/

		
		//armstrong number by for loop
		
		int n=156;
		int temp=n;
		int sum=0;
		for(int i=n;i>0;i=i/10) {
			int rem=i%10;
		sum=sum+rem*rem*rem;
		}
		if(sum==temp) {
			System.out.println("armstrong number");
		}else {
			System.out.println("Not armstrong number");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
