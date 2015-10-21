import java.util.Scanner;
public class Validator {
	public static String getcourseCode(Scanner sc, String prompt)
	{
	    System.out.print(prompt);
	    String courseCode = sc.next();  // read user entry
	    sc.nextLine();  // discard any other data entered on the line
	    return courseCode;
	}
	public static int getCredit(Scanner sc, String prompt)
	{
	    int credit = 0;
	    boolean isValid = true;
	    while (isValid == true)
	    {
	        System.out.println(prompt);
	        credit= sc.nextInt(); 
	        if (credit >0 && credit<5)
	        {
	            
	            isValid = false;
	        }
	        else
	        {
	            System.out.println("Error! Try again.");
	        }
	        
	    }
	    return credit;
	}
	
	public static String getGrade(Scanner sc, String prompt)
	{
	    
	    String grade = "";  // read user entry
	    sc.nextLine(); 
	    boolean isValid = true;
	    while (isValid == true)
	    {
	    	System.out.print(prompt);
	    	grade=sc.next();
	        if (grade.equalsIgnoreCase("A"))
	        	{ isValid = false;
	        }
	        else if (grade.equalsIgnoreCase("B")){
	        	isValid= false;
	        }
	        else if(grade.equalsIgnoreCase("C")){
	        	isValid= false;
	        }
	        else if (grade.equalsIgnoreCase("D")){
	        	isValid= false;
	        }
	        else if (grade.equalsIgnoreCase("E")){
	        	isValid= false;
	        }
	        else {  
	        	System.out.println( "Error! Try again.");
	        }
	        
	    }
	    // discard any other data entered on the line
	    return grade;
	}
	
	public static double getQuality(Scanner sc, String prompt)
	{
	    double quality  = 0;
	    boolean isValid = true;
	    while (isValid == true)
	    {
	    	System.out.print(prompt);
	    	quality=sc.nextDouble();
	        if (quality>0 && quality<4)
	        { 
	            isValid = false;
	        }
	        else{
	            System.out.println( "Error! Try again.");
	        
	    }
	    }
	    return quality ;
	}
	
	

}
