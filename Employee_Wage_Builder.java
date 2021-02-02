public class Part_Time {

	public static void main(String[] args) 
	{
		
		int IS_PART_TIME = 1;
	     int IS_FULL_TIME = 2;
	    int Emp_Rate_Per_Hr = 20;
	    int emp_hrs=0;
	    int emp_wage=0;
	    double Emp_Check= Math.floor(Math.random() *10) % 3;
	    
	    if (Emp_Check == IS_PART_TIME)
	    	emp_hrs=4;
	    else if( Emp_Check == IS_FULL_TIME)
	    	emp_hrs=8;
	    else
	    	emp_hrs=0;
		float Daily_Wage= (emp_hrs * Emp_Rate_Per_Hr);
				System.out.println(Daily_Wage);
	}
}
