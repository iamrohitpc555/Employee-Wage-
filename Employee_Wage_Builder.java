public class Emp_computation1
{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    
    public String company;
    int Emp_Rate_Per_Hr;
    int Num_Of_Working_Days;
    int Max_Hrs_In_Month;
    

    public Emp_computation1(String company,int Emp_Rate_Per_Hr ,int Num_Of_Working_Days, int Max_Hrs_In_Month)
    {
    		this.company=company;
    		this.Emp_Rate_Per_Hr=Emp_Rate_Per_Hr;
    		this.Num_Of_Working_Days=Num_Of_Working_Days;
    		this.Max_Hrs_In_Month=Max_Hrs_In_Month;
    }
    
    
    public void evaluateEmpWage() 
    {
        int empHrs = 0;
        int totalEmpWage=0;
        int totalEmpHrs = 0; 
        int totalWorkingDays = 0;
        
        
        
        while (totalEmpHrs <= Max_Hrs_In_Month && totalWorkingDays < Num_Of_Working_Days)
        {
           totalWorkingDays++;
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
          
           switch (empCheck)
           {
           		case IS_PART_TIME:
	               empHrs = 4;
	               break;
	           
	           case IS_FULL_TIME:
	               empHrs = 8;
	               break;
	           
	           default:
	               empHrs = 0;
           }
           totalEmpHrs+= empHrs;
        }
        
      totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
     System.out.println("Company: \"+company+\" Total Employee Wage: "+ totalEmpWage);
   }
    
    public static void main(String[] args)
   {
	   
	   System.out.println("--------------------------------------------------------------------");
       System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       System.out.println("--------------------------------------------------------------------");
       
       Emp_computation1 Apple= new Emp_computation1("Apple" ,12,34,56);
       Emp_computation1 Google=new Emp_computation1("Google", 14,44,16);
       Emp_computation1 Microsoft=new Emp_computation1("Microsoft", 15,44,26);
       
       Apple.evaluateEmpWage();
       Google.evaluateEmpWage();
       Microsoft.evaluateEmpWage();
       
   }
}
