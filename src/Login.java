import java.util.Scanner;
//third class ( login system )    
public class Login {
    
    //public myLogin log;
    private String user;
    
    public Login(){
        
        Scanner input = new Scanner(System.in);
        
        //login system show menu
        System.out.println("**** WELCOME TO TOREY BANK ****");
        System.out.println("***** LOGIN SYSTEM ******");
        System.out.println("\n1-Admin \n2-Customer \n3-Exit");
        System.out.println("==============================================================================");
        System.out.println("Enter Your Option");
        System.out.println("==============================================================================");
        System.out.print("->");
        String option = input.next();
        
        if (option.equalsIgnoreCase("1")){ //admin
            
        		System.out.print("Enter Username: ");
                        user = input.next();
                        
                        System.out.print("Enter Password : ");
                        String pass = input.next();
                       
			if(user.equals("Qistina") && (pass.equals("2201"))){
				System.out.println("\nWelcome " + user + " To Torey Bank !");
			}
                        
			else if(user.equals("Aiman") && (pass.equals("2601"))){
				System.out.println("\nWelcome " + user + " To Torey Bank !");
			}
                        
                        else{
                           System.out.println("Wrong Username/Password !!!");   
                           System.exit(0);
                        }
                        
                       admin min = new admin();
                        min.menu();
                     
        }

        else if (option.equalsIgnoreCase("2")){ // customer
            
        		System.out.print("Enter Username: ");
                        
                        String user = input.next();
                        Account acc = new Account();
                        acc.setUser(user);
                        
                        System.out.print("Enter Password : ");
                        String pass = input.next();
        
                        //username&password : Fadhlin(2201),Aqilah(2003),Zafirah(1712),Faqihah(1410)
			  
                   try{
                        
			if(user.equals("Fadhlin") && (pass.equals("2201"))){
				System.out.println("\nWelcome " + user + " To Torey Bank !");
			}
			else if(user.equals("Aqilah") && (pass.equals("2003"))){
				System.out.println("\nWelcome " + user + " To Torey Bank !");
			}
			else if(user.equals("Zafirah") && (pass.equals("1712"))){
				System.out.println("\nWelcome " + user + " To Torey Bank !");
			}
			else if(user.equals("Faqihah") && (pass.equals("1410"))){
				System.out.println("\nWelcome " + user + " To Torey Bank !");
			}
			else{
				System.out.println("Wrong Username/Password !!!");
                                System.exit(0);
                        }
                        
                        acc.menu();
                    }
                    catch(Exception e){
                        System.out.println("Wrong Username/Password !!!");     
                        System.out.println("Failed to Proceed! Logged out");
                        
                    }
                     
        }
        
        else if (option.equalsIgnoreCase("3")){ // exit
        		System.out.println("\nThanks For Banking");
        		System.exit(0);
        }
    }
}