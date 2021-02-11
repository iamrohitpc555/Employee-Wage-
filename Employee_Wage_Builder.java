// WAP to Calculate Employee Wage using interface :
import java.util.*;

interface EmpWageBuilder {

    public void wageComputation( EmployeeWage.Companyempwage obj );
}

// Implements EmpWageBuilder interface

public class EmployeeWage implements EmpWageBuilder {
    // Constant
    final int is_Part_Time = 1;
    final int is_Full_Time = 2;

    // ArrayList to Store daily Wage along with Monthly Wage

    ArrayList<Integer> empDailyMonthlyTotalWage = new ArrayList<Integer>();

    // Method to compute employee wage
    public void wageComputation(Companyempwage companyEmployee) {

        System.out.println(companyEmployee.getCompanyName() + " Employee Wage Computation");
        // Variable
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkDay = 0;
        int totalEmpWage = 0;
        int empDailyWage = 0;
        while (totalWorkDay < companyEmployee.getNumOfWorkingDays() && totalEmpHrs <= companyEmployee.getMaxHrsInMonth()) {

            int employee = (int) ((Math.random() * 10) % 3);

            switch (employee) {
                case is_Part_Time:
                    empHrs = 4;
                    break;
                case is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkDay++;
            totalEmpHrs = totalEmpHrs + empHrs;
            empDailyWage = empHrs * companyEmployee.getEmpRatePerHour();
            empDailyMonthlyTotalWage.add(empDailyWage);
        }
        totalEmpWage = (totalEmpHrs * companyEmployee.getEmpRatePerHour());
        empDailyMonthlyTotalWage.add(totalEmpWage);
        companyEmployee.setTotalEmpWage(totalEmpWage);
    }
    // Main Function

    public static void main(String arg[]) {

        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        System.out.println();
        EmployeeWage emp = new EmployeeWage();

        // ArrayList of multiple companies wage

        ArrayList<Companyempwage> company = new ArrayList<Companyempwage>();

        while (true) {

            System.out.println("Please Enter your choice to show Company Monthly Total Wage ");
            System.out.println("1:For Thoughtworks");
            System.out.println("2:For Wipro ");
            System.out.println("3:For Infosys");
            System.out.println("4:For Exit Computation");

            Scanner sobj = new Scanner(System.in);
            int choice = sobj.nextInt();
            switch (choice) {
                case 1:
                    company.add(new Companyempwage("Thoughtworks", 40, 20, 100));
                    emp.wageComputation(company.get(0));
                    System.out.println("Employee Total wage is: " + company.get(0).getTotalEmpWage());
                    System.out.println( );
                    break;

                case 2:
                    company.add(new Companyempwage("Wipro", 30, 22, 120));
                    emp.wageComputation(company.get(1));
                    System.out.println("Employee Total wage is: " + company.get(1).getTotalEmpWage());
                    System.out.println( );
                    break;

                case 3:
                    company.add(new Companyempwage("Infosys", 45, 18, 90));
                    emp.wageComputation(company.get(2));
                    System.out.println("Employee Total wage is: " + company.get(2).getTotalEmpWage());
                    System.out.println( );
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    System.exit(0);
            }

        }
    }

    public static class Companyempwage {

        public String companyName = " ";
        public int empRatePerHr = 0;
        public int noOfWorkDay = 0;
        public int maxHrsInMonth = 0;

        public int totalEmpWage = 0;

        public Companyempwage(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth) {
            this.companyName = companyName;
            this.empRatePerHr = empRatePerHr;
            this.noOfWorkDay = noOfWorkDay;
            this.maxHrsInMonth = maxHrsInMonth;
        }

        //GETTERS method to get variables
        public String getCompanyName() {
            return companyName;
        }

        public int getEmpRatePerHour() {
            return empRatePerHr;
        }

        public int getNumOfWorkingDays() {
            return noOfWorkDay;
        }

        public int getMaxHrsInMonth() {
            return maxHrsInMonth;
        }

        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }

        public int getTotalEmpWage() {
            return totalEmpWage;
        }
    }
}
