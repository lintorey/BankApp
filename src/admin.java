import java.util.Scanner;
//first class (admin will be first choice in system login)
public class admin {
    
        private String user;
        private double balance = 1000;
    	Scanner ad = new Scanner(System.in);
        double amount;
        int num;
        
    	void statement(double amount){
    		balance = this.balance+amount;
    		System.out.println("Current Balance is: RM" + balance);
    	}
        
        void phone(int num){//update phone no.
            num=ad.nextInt();
        }
    
    
        void menu(){//show all menu
        admin c1 = new admin(); 
        
        System.out.print("Enter Customer Name:  ");//customer name
        user = ad.nextLine();
                        
        
            while (true)
            {
                    
    		System.out.println(" \n1-Check Balance \n2-Update Details \n3-Mini Statement \n4-Exit");//hey admin!choose la !
    		System.out.println("==============================================================================");
        	System.out.println("Enter Your Option");
        	System.out.println("==============================================================================");
        	System.out.print("->");
                String option = ad.next();
            
        	if (option.equalsIgnoreCase("1")){ // balance
        		c1.statement(amount);
        	}
                
                else if (option.equalsIgnoreCase("2")){//no phone
                    System.out.print("Update Number Phone : " + num);
                    num=ad.nextInt();
                    System.out.println("Phone Number Updated !!");
                }
                
                else if (option.equalsIgnoreCase("3")){ //mini statement
                    
                        System.out.println("**** WELCOME TO TOREY BANK ****");
                        System.out.println("Name : " + user);
                        System.out.println("Balance : RM  " + balance);
                        System.out.println("Update Details (No.Phone) : 0" + num);
                }
             
        	else if (option.equalsIgnoreCase("4")){ //exit
        		System.out.println("\nThanks For Using Our Banking System");
        		System.exit(0);
        	}
                 
        	else
        	{
        		System.out.println("Invalid Option, Please Choose Other");
        	}
    	}
    }
}