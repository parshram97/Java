
/**
 * Write a description of class Debit_Card here.
 *
 * @author (PARSHURAM YADAV)
 * @version (a version number or a date)
 */
public class Debit_Card extends Bank_Card
{
   private int PIN_Number;
   private double Withdrawal_Amount;
   private String Data_Of_Withdrawal;
   private boolean Has_withdrawn;
 public Debit_Card(int Card_Id, String Bank_Account,String Client_Name, String Issuer_Bank, double Balance_Amount,int PIN_Number){
      //call made to the supperclass constructor
       super(Card_Id,Bank_Account,Issuer_Bank,Balance_Amount);
       super.setClient_Name(Client_Name);
       this.PIN_Number = PIN_Number;
       this.Withdrawal_Amount = Withdrawal_Amount;
       this.Has_withdrawn=false;
       }
       // Accessor method for corresponding attributes.
       // allow user to accesss private attributes.
 public int getPIN_Number()
       {
       return this.PIN_Number;
       
}
public double getWithdrawal_Amount(){
    return this.Withdrawal_Amount;
}
public String getDate_Of_Withdrawal(){
    return this.Data_Of_Withdrawal;
    

}
public boolean getHas_withdrawn(){
    return this.Has_withdrawn;
}
// Mutator method for withdrawalAmount
// Set the value of a variable within an object.
public void setWithdrawa_Amount(int withdrawal_Amount)
{
this.Withdrawal_Amount = Withdrawal_Amount;
}

public void Withdraw(double Withdrawal_Amount,String Data_Of_Withdrawal,int PIN_Number){
    
    
  if (PIN_Number == this.PIN_Number && super.getBalance_Amount() >= Withdrawal_Amount) {
    super.setBalance_Amount(super.getBalance_Amount()- Withdrawal_Amount);
     this.Withdrawal_Amount=Withdrawal_Amount;
     this.Data_Of_Withdrawal=Data_Of_Withdrawal;
     this.Has_withdrawn=true;
     System.out.println("Withdrawal successfully! your New balance is" );
    }
   else
            System.out.println(" insufficient balance withdrawal failed.");
}

 public void display() {
        super.Display();
        System.out.println("Pin_Number: " + this.PIN_Number);
        if (this.Has_withdrawn) {
            System.out.println("Withdrawal Amount: " + this.Withdrawal_Amount);
            System.out.println("Date of Withdrawal: " + this.Data_Of_Withdrawal);
    }
    else{
       System.out.println("Try again, not any transaction to show");
    }
}
}

    




