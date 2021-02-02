package EmpWage;

public class Daily_Emp_Wage 
{
		public static void main(String[] args)
		{	
			float Per_Hour= 20;
			float Full_Day= 8;
			float Part_Time = 4;
			double Emp_Type=(Math.floor(Math.random() *10 ) % 2);
			System.out.println(Emp_Type);
			float Daily_wage;
			if (Emp_Type == 1)
			{
			Daily_wage= (Per_Hour * Full_Day);
			System.out.println(Daily_wage);
			}
			else
			{	
			Daily_wage=(Per_Hour * Part_Time);
			System.out.println(Daily_wage);
			}
		}

}
