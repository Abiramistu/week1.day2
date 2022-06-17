package week2.day2;

public class empdetails
{
	
		void printempname(String empname, int empID)
		{
		
			System.out.println(empname+" , "+empID);
			
		}
void printempaddress(String empAddress)		

{
	System.out.println(empAddress);
	
	}

void printempsalary(double empsalary)

{
	System.out.println(empsalary);
}

void printEmpmobileno(long mobileNO)

{
	System.out.println(mobileNO);
	
}
public static void main(String args[])
{
	empdetails employee=new empdetails();
	
	employee.printempname("Nandhini", 22626);
	employee.printempaddress("peramburchennai");
	employee.printempsalary(35000);
	employee.printEmpmobileno(960001);
}

}
