package conditionalStatement;

public class NestedifStatement {

	   public static void main(String[] args) {
		
		 //Test case 1	
			//Launch browser  -faqiled
			   //Navigate 
			   //Verify google logo
		   
		   boolean step1=false;
		   
		boolean step2=false;
			boolean step3=false;   
		   
	if(step1)
	{
		System.out.println("step 1 is passed");
		
		if(step2)
		{
			System.out.println("step 2 is passed");
          
			if(step3)
			{
				System.out.println("step 3 is passed");
			}else {
				System.out.println("step 3 is failed");
			}
			
			}else {
				System.out.println("step 2 is failed");
			}
	}else {
		System.out.println("step 1 is failed");
				
		}
	}
		   
	}

