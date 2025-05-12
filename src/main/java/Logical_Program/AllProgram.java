package Logical_Program;

public class AllProgram {
	
	//(All Progarm List: odd even, number addition,fabonnacci series,prime number
   //  largest number of four,
	// odd even
	
		public static void main(String[]args)
		{
			
		
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
					 * for (int i=l-1;i>=0;i--) { x=x+a.charAt(i); }
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
				 * long num= 1234565435; long count=0; while(num>0) { num=num/10; count++; }
				 * 
				 * System.out.println("Total number of digit in a number is:"+count);
				 */
				
				//--------------------------------------------------------------------------
				
				// number of even and odd digit in a number
				
				/*
				 * int num=123456,even=0,odd=0;
				 * 
				 * while (num>0) { int rem=num%10; if (rem%2==0) { even++; } else { odd++; }
				 * 
				 * num=num/10; }
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
//				
//				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
				
				
        
	          
	}          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          

}
