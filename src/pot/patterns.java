package patt;
public class patterns {

	public static void main(String[] args) {
		
		int n=8;
		/*
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("* ");           //right triangle
	    	}
	    	System.out.println("");
	    }
	    
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	    	for(int s=1;s<=2*(n-i);s++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("* ");              //left triangle
	    	}
	    	System.out.println("");
	    } 
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	    	for(int s=1;s<=(n-i);s++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("* ");              //pyramid
	    	}
	    	System.out.println("");
	    	
	    } 
	    
	    
	   for(int i=1;i<=n;i++)
	    {
	    	for(int s=1;s<=(n-i);s++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)
	    	{
	    		if(j==1)
	    		System.out.print("*");                  
	    		else {
	    			System.out.print("**");
				}
	    	}
	    	System.out.println("");
	    } 
	    for(int i=n-1;i>=1;i--)
	    {
	    	for(int s=1;s<=n-i;s++)					 //diamond
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)
	    	{
	    		if(j==1)
	    		{
	    			System.out.print("*"); 
	    		}
	    		else 
	    		{
	    			System.out.print("**"); 
				}
	    	}
	    	System.out.println("");
	    }
	    
	    
	     for(int i=n;i>=1;i--)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("* ");      //downward triangle
	    	}
	    	System.out.println("");
	    }
	    
	    
	   
	 for(int i=1;i<=n;i++)
	  {
		  for(int s=1;s<=n-i;s++)
		  {
			  System.out.print(" ");
		  }									//mirror right triangle
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println("");
	  }
	  
	    
	    for(int i=n;i>=1;i--)
	    {
	    	for(int s=1;s<=n-i;s++)
	    	{
	    		System.out.print(" "); 		//reverse pyramid
	    	}
	    	for(int j=i;j>=1;j--)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println("");
	    }
	    
	    
	    for(int i=n;i>=1;i--)
	    {
	    	for(int s=1;s<=n-i;s++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)		//right down mirror
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println("");
	    }											//right pascals triangle
	    for(int i=n-1;i>=1;i--)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println("");
	    }
	    
	    */
	 /*  for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	for(int s=1;s<=2*(n-i);s++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	      											//butterfly
	    for(int i=n-1;i>=1;i--)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	for(int s=1;s<=2*(n-i);s++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++)	
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	   */
		
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1||i==n||k==(2*i-1))
				{								//triangle with spaces
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		*/
		
		
		/*
		for(int i=n/2;i>=1;i--)
		{
			for(int k=1;k<=n/2;k++)
			{
				if(k==1||k==n/2||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=1;i<=n/2;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i=1;i<=n/2;i++)
		{
			for(int k=1;k<=n/2;k++)
			{
				if(k==1||k==n/2)
				{											//alphabet star
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		*/
		
		
		

	}

}
