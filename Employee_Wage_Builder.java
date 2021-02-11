interface EmpWageBuilder 
{

    public void evaluateEmpWage( Companyempwage obj );
}


public class  Emp_computation1 implements EmpWageBuilder
{
    
	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public  int  evaluateEmpWage(Companyempwage companyEmployee)
    {
    		
    	int empHrs = 0;
        int totalEmpWage=0;
        int totalEmpHrs = 0; 
        int totalWorkingDays = 0;
        int Emp_Rate_Per_Hr=0;
        
        
        
        while (totalEmpHrs <= companyEmployee.getMax_Hrs_In_Month() && totalWorkingDays < companyEmployee.getNum_Of_Working_Days())
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
      return totalEmpWage;
     
   }
    
    class Companyempwage
    {
    	public String company="";
        int Emp_Rate_Per_Hr=0;
        int Num_Of_Working_Days=0;
        int Max_Hrs_In_Month=0;
        int totalEmpWage=0;
        
       public Companyempwage(String company,int Emp_Rate_Per_Hr ,int Num_Of_Working_Days, int Max_Hrs_In_Month)
       {
    	   this.company=company;
    	   this.Emp_Rate_Per_Hr=Emp_Rate_Per_Hr;
    	   this.Num_Of_Working_Days=Num_Of_Working_Days;
    	   this.Max_Hrs_In_Month=Max_Hrs_In_Month;
       }
       
       public String getcompany()
       {
    	   return company;
       }
       
       public int getEmp_Rate_Per_Hr()
       {
    	   return Emp_Rate_Per_Hr;
       }
       
       public int getNum_Of_Working_Days()
       {
    	   return Num_Of_Working_Days;
       }
       
       public int getMax_Hrs_In_Month() 
       {
    	   return Max_Hrs_In_Month;
       }
       public void setTotalEmpWage( int totalEmpWage)
       {
    	   this.totalEmpWage = totalEmpWage;
       }
       
    }
    public static void main(String[] args)
   {
	   
	   System.out.println("--------------------------------------------------------------------");
       System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       System.out.println("--------------------------------------------------------------------");
       
       Emp_computation1 emp = new Emp_computation1();
       int []wages= new int[3];
       
       wages[0]=emp.evaluateEmpWage("ThoughWorks", 40, 20, 100);
       System.out.println("Employee Monthly Wage "+wages[0] + " In ThoughtWorks");
       wages[1]=emp.evaluateEmpWage("Wipro", 30, 22, 120);
       System.out.println("Employee Monthly Wage "+wages[1]+" In Wipro ");
       wages[2]=emp.evaluateEmpWage("Infosys", 45, 18, 90);
       System.out.println("Employee Monthly Wage "+wages[2]+" In Infosys ");
       
       
}
	 {
		
		
	}
}
