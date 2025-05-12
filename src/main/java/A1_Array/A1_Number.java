package A1_Array;

import java.util.Scanner;

public class A1_Number {

	public static void main(String[] args) {
		
		
		/*	// forward array printing
		
		int a []= {12,13,45,65,98};
		
		int size= a.length;
		
		System.out.println("size="+ size);
		
	 	for (int i=0;  i<a.length ; i++)
		{
			System.out.print(a[i]+ ",");
		}
		
	 */      //System.out.println(a[2]); to print value by its index number

	//********************************************************************
			
	/*		// reverse array printing
			
			int a []= {2,4,6,8,10,12};
			
			int size =a.length; 
		    int lastindex=a.length-1;      

		    int b[]= new int[6];
			 
			System.out.println("size="+ size);
		   
			
			for (int i=0; i<size; i++)
			{
			
				b[i]=a[lastindex-i];
				
			}
			a=b;
			
			for (int i=0; i<size ; i++)
			{
				System.out.print( a[i] +",");
			}
		*/	
	//********************************************************************
			// sort array in descending order
		/*	
			int a[]= {15,4,9,7,2};
			int x=0;
			
			int size= a.length;
			
			
			for (int i=0; i<size ; i++)
			{
				for(int j=i+1; j<size;j++)
				{
				  if (a[i]<a[j])
				    {
					  x=a[i];
					  a[i]=a[j];
					  a[j]=x;
					 }
				}
			}
			for(int i=0; i<size; i++)
			{
			 System.out.print(a[i]+",");
			}
		*/
		
	//********************************************************************		
		/*	
			// to find duplicate number from array
			
			int a[] = {21,65,45,21,65,55,67,55};
			
			int size= a.length;
			
				for(int i=0; i<size; i++)
				{
					for(int j=i+1; j<size; j++)
					{
						if(a[i] == a[j])
						{
							System.out.print(a[i] + ","+a[j]+",");
						}
					}
				}
		*/	
	//********************************************************************		
		/*	
			// To find duplicate string in array
			
			String a[] = { "yogiraj","priya","krushna","sunita","yogiraj","priya"};
			
			int size= a.length;
			
				for(int i=0; i<size; i++)
				{
					for(int j=i+1; j<size; j++)
					{
						if(a[i] == a[j])
						{
							     //System.out.print(a[i] + ","+a[j]+",");
							      
							      
							System.out.println(a[i] + " is duplicate string");
						}
					}
				}        //Is this a right logic???
	//********************************************************************	
	*/     
			// find prime no. from array
			
	/*		int a []= {12,13,45,65,98};
			
			int size= a.length;
			
			System.out.println("size="+ size);
			
		 	for (int j=0;  j<a.length ; j++)
			{
		 		 int m=0,flag=0;
		 		 
		 		int n,i;//it is the number to be checked 
		 		     n=j;
		 		 
		 	         m=n/2; 
		 		  
		 	    if(n==0||n==1)
		 		  {  
		 		   System.out.println(n+" is not prime number");      
		 		  }
		 		  else
		 		  {  
		 		   for(i=2;i<=m;i++)
		 		   {      
		 		    if(n%i==0){      
		 		     
		 		    	System.out.println(n+" is not prime number");      
		 		     
		 		    	flag=1;      
		 		    
		 		    	break;      
		 		    }      
		 		   }      
		 		  
		 		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		 		  
		 		  }//end of else  
		 		}
		 		//System.out.print(a[i]+ ",");
			}
	       // no proper output
		}

		*/
		
	//Find the repeated number from Array
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
		//Find duplicate character from string and its count
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
		
		for(int j=0;j<b.length;j++) 
		{
			String c=b[j].toString();
			String d="";
			
			for(int i=c.length()-1;i>=0;i--) 
			{
			 d=d+c.charAt(i);
				}
		 	e=e+d+" ";
		}
	System.out.println(e);
	
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
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
