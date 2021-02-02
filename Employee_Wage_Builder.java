public class Switchcase {

	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int Emp_Rate_Per_Hr = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;
    
	public static void main(String[] args) {
		
		int Emp_wage = 0;
	    int emp_hour = 0;
		int Emp_Check= (int) Math.floor(Math.random() * 10) % 3;
				
		switch (Emp_Check)
		{
		case  IS_FULL_TIME:
				emp_hour= 8;
				break;
		case IS_PART_TIME:
				emp_hour= 4;
				break;
			
		default:
				emp_hour= 0;
			
			Emp_wage = emp_hour * Emp_Rate_Per_Hr;
			System.out.println("Emp wage:" + Emp_wage);
		}
	}

}
