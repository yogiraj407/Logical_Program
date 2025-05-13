package C1_OtherLogical_Program;

public class AllProgram {
	
	//(All Progarm List: odd even, number addition,fabonnacci series,prime number
   //  largest number of four,
	// odd even
	
		public static void main(String[]args)
		{
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
      int a= 96;
		int b=a%2;
		
		if(b==0)
		 {
			System.out.println("even");
		 }
		
		else
		{
			System.out.println("odd");
		}
		
		--------------------------------------------------------------------------
		      addition of numbers
		
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		int e=a+b+c+d;
		
		System.out.println(e);
		
	--------------------------------------------------------------------------
	*/
			
/*	//fabonnacci series program practice

	//      Fibonacci series

	public static void main(String[] args) {
		
		int n1=0, n2=1,n3 ;
		int count =10;
		
		System.out.print(n1+ " " +n2);
		
		for(int i=2; i<=count; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;	
		}	
	}                         // showing right output 1st program
	
*/	
/*	
	public static void main(String[]args) {
      
  int add=8,a=0,b=1,c;

  for(int i=1 ; i<=add ;i++)
    {
      System.out.println(a);
      c=a+b;
      a=b;
      b=c;
      
     }

	}
	
	*/                     // showing right output 2nd program 
		//--------------------------------------------------------------------------


	/*	// prime number program
	 public static void main(String args[]){
  
	  int i,m=0,flag=0;
	  
	  int n=3;//it is the number to be checked    

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
	*/
//***************************************************************
	 // find largest number of four numbers
	
		/*		int a=11,b=12,c=13,d=14;
				
				if (a>b)
				 {
				   if(a>c)
					{ 
					  if (a>d)
					  {
						  System.out.println("a is largest number");
					  }
			         else
				    {
					  if (b>c)
		  			 {
						if(b>d)
							{
								System.out.println("b is largest number");
							}
			else
			    {
				  if (c>d)
				  {
					  System.out.println("c is largest number");
				  }
		          
			         System.out.println("d is largest number");
		          
				
			    }
		     		}
				}
				 }                   // not showing output
				 }
		*/	
	//********************************************************************
				// find largest number of four numbers	
		
		/*	int a=18,b=45,c=65,d=74;
			
			if (a>b && a>c && a>d)
			  {
				System.out.println("a is largest number");
			  }
			
			else
			  {
			    if (b>c && b>d)
			      {
			        System.out.println("b is largest");
			      }
			  
			else
			  {
				if(c>d)
				{
					System.out.println("c is largest");
				}
				else
				{
				
				System.out.println("d is largest");
			   }
			  }
			  }                   // showing right output
		
			*/	//********************************************************************
			
			//Find ArmStrong Number
  	

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        	}

        if(result == number)
        {
            System.out.println(number + " is an Armstrong number.");
       
        	}
        else {
            	System.out.println(number + " is not an Armstrong number.");
        		}
        
        
        
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
		  
    	//********************************************************************
	
	//reverse string
		
	
//	String l= "priyanka";
//	String x="";
//	for (int i=(l.length()-1);  i>=0 ; i--)
//	{
//	    x = x+ l.charAt(i);
//	}
//	
//	//l=x;
//		System.out.println(x);        
//	          
    	//********************************************************************
        
        
        String a ="Earn 2 reward points on every 100  Spends,"
		 		+ " 4 reward points on every 100 International Spends, "
		 		+ "and 1 reward point on Domestic  100 on Utilities and Insurance.";
		 
		int i= a.indexOf("Domestic ");
		System.out.println(i);

		if(i>=0) {
//			int j=a.lastIndexOf("Domestic");
//			if(j>=0) {
			System.out.println("feature present");
//			}
		}
		else {
			System.out.println("feature removed succesfully");

		}
		//System.out.println(i);
		 
        
		//******************************************************************** 
        
		//int a=20,b=30,c;
				/*
				 * //1. Swaping Two Numbers
				 * 
				 * int a=1,b=3,c;
				 * 
				 * c=a; a=b; b=c;
				 * 
				 * System.out.println("a="+a); System.out.println("b="+b);
				 */
				
				/*
				 * //2.Approach
				 * 
				 * int a=1,b=3,c;
				 * 
				 * a=a+b; b=a-b; a=a-b; System.out.println("a="+a); System.out.println("b="+b);
				 */
				
				
				/*
				 * //3.Approach
				 * 
				 * a=a*b; b=a/b; a=a/b;
				 * 
				 * System.out.println("a="+a); System.out.println("b="+b);
				 */
				
				//4. Approach (single Statement)
				
				//--------------------------------------------------------------------------	
					// reverse Number
					
				/*int	num=1234,rev=0;
					
					while(num>0)
					{
					    rev=rev*10+num%10;
					    num=num/10;
					}
					System.out.println(rev);
				*/
				//--------------------------------------------------------------------------             
			
				  //REVERSE STRING
				
					/*
					 * String a="ABCD"; String x=""; int l=a.length();
					 * 
					 * for (int i=l-1;i>=0;i--) 
					 * { 
					 * 		x=x+a.charAt(i); 
					 * }
					 * 
					 * System.out.println(x);
					 */
				         
				//--------------------------------------------------------------------------
				
				// PALINDROM NUMBER
				
				
				 int num=12321,rev=0; int org_num=num; 
				  while(num>0) 
				 { rev=rev*10+num%10;
				    num=num/10; 
				     } ;
				  
				  System.out.println(rev);
				  
				  if (org_num==rev) 
				  { 
				     System.out.println("yes,its palindrom number ");
				   	} 
				   else 
				   {
				      System.out.println("no, its not palindrom number");
				   	}
				
				//--------------------------------------------------------------------------
				
				// count no.of digit in a number
				
				/*
				 * long num= 1234565435; 
				 * long count=0; 
				 * while(num>0) 
				 * { 
				 * num=num/10; 
				 * 	count++; 
				 * }
				 * 
				 * System.out.println("Total number of digit in a number is:"+count);
				 */
				
				//--------------------------------------------------------------------------
				
				// number of even and odd digit in a number
				
				/*
				 * int num=123456,even=0,odd=0;
				 * 
				 * while (num>0) 
				 * { int rem=num%10; 
				 * 	if (rem%2==0) 
				 *	 { 
				 *		even++; 
				 *		} 
				 *	else 
				 *	{ 
				 *		odd++;
				 *	 }
				 * 
				 * 	num=num/10; 
				 * 		}
				 * 
				 * System.out.println("number of even digit in a number:"+even);
				 * 
				 * System.out.println("number of odd digit in a number:"+odd);
				 */
				//--------------------------------------------------------------------------
				
				/*
				 * //sum of digit in a number int num=12345, rem=0;
				 * 
				 * while (num>0) { rem=rem+num%10; num=num/10; } System.out.println(rem);
				 */
				
				//--------------------------------------------------------------------------

				/*
				 * // Largest of three numbers int a=1121,b=5,c=3;
				 * 
				 * if (a>b && a>c) { System.out.println("a is the largest number"); } else if
				 * (b>c && b>a) { System.out.println("b is largest"); } else {
				 * System.out.println("c is largest"); }
				 */
				
				//--------------------------------------------------------------------------

				/*
				 * // Print Fibonacci Number
				 * 
				 * int n1=0,n2=1,sum=0; int upto=8-1;
				 * 
				 * System.out.print(n1+" "+n2); for(int i=2; i<upto;i++) { sum=n1+n2;
				 * System.out.print(" "+sum); n1=n2; n2=sum; }
				 */
				//--------------------------------------------------------------------------

				//prime no. or not
//				
//				int num=12;
//				
//				for(int i=2;i<num;i++)
//				{
//					if(num%i==0)
//					{
//						
//					}
//				}
//				System.out.println("this is prime no.");
//				
//				/*
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
//				
				
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
//					int[] ar= {1,5,3,4,5,1,4,3};
//					findDuplicate( ar);
//					int l=ar.length;
//					int[] arr1=new int[l];
//					String duplicate="";
//					for(int j=0;j<l-1;j++) {
//						for(int i=j+1;i<l;i++) {
//							if(ar[i]==ar[j]) {
//								 duplicate=duplicate+ar[j]+",";
//							}
//						}
//					}
//					System.out.println(duplicate);
				//	
						
				//Convert the given string into sequence of Alphabets
//						String a="this is a car";
//						char[] b=a.toCharArray();
//						int l=b.length;
//						char c;
//						for(int j=0;j<l-1;j++) {
//							for(int i=j+1;i<l;i++) {
//								if(b[i]<b[j]) {
//									c=b[j];
//									b[j]=b[i];
//									b[i]=c;
//								}
//							}
//						}
//						for(int i=0;i<l-1;i++) {
//						System.out.print(b[i]);
//						}
//						
				//Reverse String 
//						
				String[] letter= {"yogiraj yadav krushna"};
//						String s="yogiraj krushna yadav ";
//						////String s=Arrays.toString(letter);
				String s1=String.join("", letter);
				System.out.print(s1.charAt(0));
//						String[] b=s.split(" ");
//						for(int i=b.length-1;i>=0;i--) {
//						System.out.print(b[i]+" ");
//						}
//						
						
				//Write a Program in Java to Add two Numbers.
						
//						int[] numbers= {1,2,4,6,8,9};
//						
//						Logical_Array_Program codeClass=new Logical_Array_Program();
//						
//						int result=codeClass.addNumbers(numbers);
//						
//						System.out.println(result);
//						
						
				//Write a Program to Swap Two Numbers
						
						
//						int a=3;
//						int b=7;
//						
//						a=a+b;
//						b=a-b;
//						a=a-b;
//						
//						System.out.println("b="+b+" "+"a="+a);

						
				//Java Program to Check if a Given Integer is Odd or Even
						
//						Scanner a=new Scanner(System.in);
//						System.out.println("Enter Number:");
//						int a1=a.nextInt();
//						if(a1%2==0) {
//							System.out.println("even");
//						}else {
//							System.out.println("odd");
//						}
						
						
						
				//Java Program to Check Armstrong Number between Two Integers
						
//						for(int i=100;i<=200;i++) {
//						int num= i;
//						int temp=num;
//						int	num1=0;
//						int	num2=0;
//						while(num>0) {
//						num1=num%10;
//						num2=num2+num1*num1*num1;
//						num=num/10;
//						}
//						if(num2==temp) {
//					System.out.println(num2);
//						
//						}
//						else {
//							
//						}
//						}
						
						
				//Java Program to Check If a Number is Neon Number or Not

						
//						int a=11;
//						
//						int b=a*a;
//						
//						int c=b%10;
//						int d=b/10;
//						int e=c+d;
//						
//						if(e==a) {
//						System.out.println("it is neon number");
//						}else {
//							System.out.println("it is not neon number");
//						}
						
						
						
//					Java Program to Print Right Triangle Star Pattern

//						for(int j=0;j<=5;j++) {
//						for(int i=0;i<=j;i++) {
//						System.out.print("*");
//						}
//						System.out.println();
//						}
						
						
						
				//Java Program to Print Left Triangle Star Pattern
					
//						for(int j=0;j<=5;j++) {
//						for(int i=5;i>=j;i--) {
//						System.out.print(" ");
//						}
//						for(int k=0;k<=j;k++) {
//						System.out.print("*");
//						}
//						System.out.println();
//						}
//						
						
						
				//Java Program to Print Pyramid Number Pattern
						
				// Java Program to Print Reverse Pyramid Star Pattern
						
//						for(int k=7;k>0;k--) {
//						for(int i=7;i>k;i--) {
//						System.out.print(" ");
//						}
//						for(int j=k;j>0;j--) {
//						System.out.print("* ");
//						}
//						System.out.println();
//						}
						
						
//						int [] array= {5, 1, 3, 2, 4, 6};
//						logic(array);
//							
//							ArrayList list=new ArrayList<>();
//							
//							list.add(10);
//							list.add("one");
//						
					
					
					
					
					
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
				
				
        
	          
	}          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          

}
