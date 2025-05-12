package c1_array;

public class Basic {
	
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
	}	
	}

