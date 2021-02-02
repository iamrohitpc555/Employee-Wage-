public class UC7EmpWageBuilderRefactorClass{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int Emp_Rate_Per_Hr = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;

    public static int evaluateEmpWage() {
        int empHrs = 0 , totalEmpHrs = 0 , totalWorkingDays = 0;
        while (totalEmpHrs <= Max_Hrs_In_Month &&
              totalWorkingDays < Num_Of_Working_Days){
           totalWorkingDays++;
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
           switch (empCheck){
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
        System.out.println("Day: " + totalWorkingDays +"  "+ "Employee working hours:" + empHrs );
     }
     int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
     System.out.println("Total Employee Wage is "+ totalEmpWage);
     return totalEmpWage;
   }
   public static void main(String args[]){
       evaluateEmpWage();
   }
}
