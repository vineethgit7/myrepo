package kannur;

public class KannurMain {

	public static void main(String[] argsabc) {
		// TODO Auto-generated method stub
//System.out.println("hello folks ..this is a small work on kannur");
//corporation mycorporation= new corporation();
 //  panchayat mypanchayat= new panchayat();
   //mypanchayat.cherukunnu();
  // mypanchayat.kannapuram();
  // mypanchayat.pappinsery();
		
		double balance = 6000, rateOfInterest = 0.10, interest = 0;
	    double withdrawal = 500, deposit = 600;
	    for(int i = 1; i <= 12; i++) {
	      balance += deposit;
	      balance -= withdrawal;
	      interest = balance * rateOfInterest;
	      balance += interest;
	      System.out.println("The interest for the month " + i + " is " + interest);
	    }
	    System.out.println("The balance at the end of the year is " + balance);
  
	}

}
