
package bank_management_system;

import java.util.*;
public class UserAccount {
    String Name,Gender,Address,Religion;
    int Age,PhoneNo,depoAmount,PIN;
    int customer_no=0;
    private int accountNo=1000;
    private static int nxtacc=1;
    
    
    UserAccount(String N,String G,String Ad, String R,int A,int P,int da,int pin){
        this.Name=N;
        this.Gender=G;
        this.Address=Ad;
        this.Religion=R;
        this.Age=A;
        this.PhoneNo=P;
        this.depoAmount=da;
        this.PIN=pin;
        accountNo=accountNo+nxtacc;
        nxtacc++;
        
   }
    public void UserDetail(){
        //Can be used in case you want to show user detail
        System.out.println("Name :"+ this.Name+"\n"+"AccountNo:"+this.accountNo+"\n"+"Gender:"+this.Gender+"\n"+"Address:"+this.Address+"\n"+"Religion:"+this.Religion+"\n"+"Age:"+this.Age
        +"\n"+"PhoneNo:"+this.PhoneNo+"\n");
    }
    public void deposit(){
        Scanner sc =new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount>0){
            this.depoAmount+=amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdrawal(){
        Scanner sc =new Scanner(System.in);
        int wamount=sc.nextInt();
        if(wamount<=this.depoAmount){
            this.depoAmount-=wamount;
        }
        else{
            System.out.println("You don't have enough balance to withdraw");
        }

    }
    public void checkBalance(){
        System.out.println(this.depoAmount);
    }
}
