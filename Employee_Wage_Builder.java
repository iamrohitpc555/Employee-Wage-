interface EmpWageBuilder {

    public void evaluateEmpWage( Companyempwage obj );
}

// Implements EmpWageBuilder interface

public class Emp_computation1 implements EmpWageBuilder{
    // Constant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // Method to compute employee wage
    public void evaluateEmpWage(Companyempwage companyEmployee){
        // Variable
        int empHrs = 0;
        int totalEmpWage=0;
        int totalEmpHrs = 0; 
        int totalWorkingDays = 0;
        int Emp_Rate_Per_Hr=0;

        while (totalWorkingDays < companyEmployee.getNumOfWorkingDays() && totalEmpHrs <= companyEmployee.getMaxHrsInMonth()) {

            int empCheck = (int) ((Math.random() * 10) % 3);

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        companyEmployee.setTotalEmpWage( totalEmpHrs * companyEmployee.empRatePerHr );
        System.out.println("Employee Monthly Wage of " + companyEmployee.getCompanyName() + " is " + companyEmployee.getTotalEmpWage());
    }
    public static void main(String arg[]) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        Emp_computation1 emp = new Emp_computation1();

        //Array of object of Companyempwage class
        Companyempwage[] company = new Companyempwage[10];
        // assign value to object of Companyempwage
        company[0] = new Companyempwage("ThoughWorks", 40, 20, 100);
        emp.evaluateEmpWage(company[0]);
        company[1] = new Companyempwage("Wipro", 30, 22, 120);
        emp.evaluateEmpWage(company[1]);
        company[2] = new Companyempwage("Infosys", 45, 18, 90);
        emp.evaluateEmpWage(company[2]);
    }
}

class Companyempwage{

    public String companyName=" ";
    public int empRatePerHr=0;
    public int noOfWorkDay=0;
    public int maxHrsInMonth=0;

    public int totalEmpWage=0;

    public Companyempwage(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth){
        this.companyName=companyName;
        this.empRatePerHr=empRatePerHr;
        this.noOfWorkDay=noOfWorkDay;
        this.maxHrsInMonth=maxHrsInMonth;
    }

    //GETTERS method to get variables
    public String getCompanyName(){
        return companyName;
    }
    public int getEmpRatePerHour(){
        return empRatePerHr;
    }

    public int getNumOfWorkingDays(){
        return noOfWorkDay;
    }

    public int getMaxHrsInMonth(){
        return maxHrsInMonth;
    }

    public void setTotalEmpWage( int totalEmpWage ){
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage(){
        return totalEmpWage;
    }

}
