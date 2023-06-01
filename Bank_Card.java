
/**
 * 
 * Write a description of class Bank_Card here.
 *
 * @author (PARSHURAM_YADAV)
 * @version (a version number or a date)
 */
public class Bank_Card
{
  private String Client_Name;
  private int Card_Id;
  private String Bank_Account;
  private String Issuer_Bank;
  private double Balance_Amount;
  
  public Bank_Card(int Card_Id, String Bank_Account, String Issuer_Bank, double Balance_Amount){
       this.Client_Name="";
       this.Card_Id=Card_Id;
       this.Bank_Account=Bank_Account;
       this.Issuer_Bank=Issuer_Bank;
       this.Balance_Amount=Balance_Amount;
    
    

  }
   //Accessor (getmethd)for the Attributes
  public int getCard_Id()
    {
    return this.Card_Id;
  }
  public String getBank_Account()
    {
    return this.Bank_Account;
}

  public String getIssuer_Bank()
    {
    return this.Issuer_Bank;
}
  public double getBalance_Amount()
    {
    return this.Balance_Amount;
}
//mutators (setMethod)Method for required Attributes
public void setClient_Name(String newName){
     this.Client_Name = newName;
    
}
public void  setBalance_Amount(Double newName){
    this.Balance_Amount= newName;
    
}
//this method display the massage according to the input of Attributes
public void Display(){
    System.out.println("The card id is: "+this.Card_Id);
    System.out.println("The issuer bank is:" + this.Issuer_Bank);
    System.out.println("The Bank account is:" + this.Bank_Account);
    System.out.println("The Balance amount is:" + this.Balance_Amount);
    
    if (this.Client_Name==" " ){
        System.out.println("client name is invalid");
    }
    else
    {
       System.out.println(this.Client_Name); 
    }
    
    }
}








