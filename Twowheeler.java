package week2.day2;

public class Twowheeler {

		int noOfwheels=2; 
		short noofmirrors=2;
		long chassisNumber=960005248l;
		boolean ispunctured=false;
		String bikename="SUZUKI";
		double runningKM=500000;
		
		public static void main(String args[])
		{
			Twowheeler bike=new Twowheeler();
			System.out.println(bike.noOfwheels);
			System.out.println(bike.noofmirrors);
			System.out.println(bike.chassisNumber);
			System.out.println(bike.ispunctured);
			System.out.println(bike.bikename);
			System.out.println(bike.runningKM);
			
		}
			
		
	

}
