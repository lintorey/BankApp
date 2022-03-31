import java.util.Scanner;
//second class(account will be represent for customer menu in login system)
public class Account {
        
    //variable
        private double balance=1000;
        private String user;
        double balance2;
    	Scanner sc = new Scanner(System.in);
        double amount;
        double amount2;
        int num;
        
        //customer
        public String getUser(){
            return user;
        }
        
        public void setUser(String user){
            this.user = user;
        }
        //show balance
    	void statement(double amount){
    		balance2 = balance-amount;
    		System.out.println("Current Balance is: RM " + balance2);
    	}
        //user can update their phone no.
        void phone(int num){
            num=sc.nextInt();
        }
    
    //show menu for customer
        void menu(){ 
            balance = 1000;
            while (true)
            {
            
    		System.out.println(" \n1-Check Balance \n2-Transfer \n3-Previous Transaction \n4-Update Details \n5-Mini Statement \n6-Exit");//hey user!choose la !
    		System.out.println("==============================================================================");
        	System.out.println("Enter Your Option");
        	System.out.println("==============================================================================");
        	System.out.print("->");
                String option = sc.next();
            
        	if (option.equalsIgnoreCase("1")){ // balance
                        System.out.println("Current Balance is: RM " + balance);
                }
                
        	else if (option.equalsIgnoreCase("2")){ //transaction
                    System.out.print("\nTransfer to account : ");
                    int acc = sc.nextInt();
        		System.out.print("Enter Amount : RM ");
        		amount2 = sc.nextDouble();
        		transfer(amount2);
                        
        	}
                
                else if (option.equalsIgnoreCase("3")){ //previous transaction
        		System.out.println("\nPrevious Transaction is RM " + amount2);
        	}
                
                else if (option.equalsIgnoreCase("4")){//no phone
                    System.out.print("Update Number Phone : " + num);
                    num=sc.nextInt();
                    System.out.println("Phone Number Updated !!");
        	}
                
                else if (option.equalsIgnoreCase("5")){ //mini statement
                    
                        System.out.println("**** WELCOME TO TOREY BANK ****");
                        System.out.println("Name : " + getUser());
                        System.out.println("Balance : RM  " + balance2);
                        System.out.println("Transfer History : RM  " + amount2);
                        System.out.println("Update Details (No.Phone) : 0" + num);
                }
             
        	else if (option.equalsIgnoreCase("6")){ //exit
        		System.out.println("\nThanks For Using Our Banking System");
        		System.exit(0);
        	}
                 
        	else
        	{
                    //if invalid output, this output will be pop-up
        		System.out.println("Invalid Option, Please Choose Other");
        	}
    	}
    }
    //method
        public double transfer(double amount2){//make transfer to other acc
            
            if (amount2<balance)
            {
    		
    		System.out.println("\nSucceed!");
    		balance2 = balance-amount2;
    		System.out.println("Balance After Transfer : RM " + balance2);
            }
            
            else
            {
                System.out.println("Sorry Insufficient Funds !!!!");
            }
            
            return balance2;
    }
  
}