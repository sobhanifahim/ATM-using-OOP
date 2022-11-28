
package bank_management_system;


import java.util.*;

public class ATM {
    public static void main(String[] args) {
      ArrayList<UserAccount> user=new ArrayList<UserAccount>();
      UserAccount useracc1 = new UserAccount("Md.Amir Abdal Sobhani","Male","Dhaka","Islam",25,1912717231,5000,2432);
      UserAccount useracc2 = new UserAccount("L.Messi","Male","Argentina","Catholic",35,1923415245,50000,2332);
      UserAccount useracc3 = new UserAccount("Neymar","Male","Brazil","Catholic",30,1913417924,50000,2234);
      
      user.add(useracc1);
      user.add(useracc2);
      user.add(useracc3);
      
      while(true){
              System.out.println("********** Welcome to Bangladesh BANK ATM **********\n\n");
              System.out.println("Press number to get operation done\n\n");
              System.out.println("1.Create Account\n2.Login\n3.Exit");
              Scanner sc=new Scanner(System.in);
              int operation=sc.nextInt();
              switch(operation){
                      case 1: String Name,Gender,Address,Religion;
                              int Age,PhoneNo,depoAmount,PIN;
                              Scanner inp=new Scanner(System.in);
                              System.out.println("Enter your Name:");
                              Name=inp.nextLine();
                              System.out.println("Enter your Gender:");
                              Gender=inp.nextLine();
                              System.out.println("Enter your Address:");
                              Address=inp.nextLine();
                              System.out.println("Enter your Religion:");
                              Religion=inp.nextLine();
                              System.out.println("Enter your Age:");
                              Age=inp.nextInt();
                              System.out.println("Enter your PhoneNo:");
                              PhoneNo=inp.nextInt();
                              System.out.println("Enter your Initial Deposit Amount:");
                              depoAmount=inp.nextInt();
                              System.out.println("Enter your PIN for this account:");
                              PIN=inp.nextInt();
                              UserAccount useracc4=new UserAccount(Name,Gender,Address,Religion,Age,PhoneNo,depoAmount,PIN);
                              user.add(useracc4);
                              break;
                      case 2: System.out.println("Enter your PIN to Login");
                              int pin=sc.nextInt();
                              boolean f=false;
                              for(UserAccount ob: user){
                                       if(ob.PIN==pin){
                                       f=true;
                                       System.out.println("login Successful\n\n");
                                       System.out.println("Welcome "+ob.Name+"\n\n");
                                       boolean loop=true;
                                           while(loop){
                                           System.out.println("1.Withdraw Cash\n2.Deposit Cash\n3.CheckBalance\n4.exit\n");
                                           int operation2=sc.nextInt();
                                            
                                               switch(operation2){
                                                   case 1: ob.withdrawal();break;
                                                   case 2: ob.deposit();break;
                                                   case 3: ob.checkBalance();break;
                                                   case 4: loop=false;
                                                   default : System.out.println("Invalid Operation");
                                                   
                                               }
                                               
                                               
                                           }
                                       }
                               }
                              if(f){
                                    System.out.println("");
                              }
                              else{
                                    System.out.println("Invaid Input");
                              }
                              break;
                      case 3: return;
                      default: System.out.println("Invalid Entry");
                      
              }
              
      }
      
      
      
      
      
      
    }
}