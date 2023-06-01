
/**
 * Write a description of class Credit_Card here.
 *
 * @author (Parshuram Yadav)
 * @version (a version number or a date)
 */
public class Credit_Card extends Bank_Card
{
   private int CVC_Number;
   private double Credit_limit;
   private double Interest_rate;
   private String Expiration_Data;
   private int Grace_period;
   private boolean Is_Granted;
   
   public Credit_Card(int Card_Id,String Client_Name,String Issuer_Bank,String Bank_Account,Double Balance_Amount,int CVC_Number,double Interest_rate,String Expiration_Data)
   {
       super(Card_Id,Bank_Account,Issuer_Bank,Balance_Amount);
       this.CVC_Number=CVC_Number;
       this.Interest_rate=Interest_rate;
       this.Expiration_Data=Expiration_Data;
       this.Is_Granted=false;
       
   }
   // Accessor method for required Attributes.
   // allow user to accesss private attributes.
   public int getCVC_Number (){
       return CVC_Number;
   }
   public double getCredit_limit()
   {
     return this.Credit_limit;
   }
   public double getInterest_rate(){
       return Interest_rate;
   }
   public String getExpiration_Data(){
       return Expiration_Data;
   }
   public int getGrace_period(){
       return Grace_period;
   }
   public boolean getIs_Granted(){
       return Is_Granted;
   }
   // Mutator Method for creditLimitAmount and gracePeriod.
   // Set the value of a variable within an object.
   public void setCredit_limit(double newCredit_limit, int newGrace_period){
       if (this.Credit_limit >= (2.5 * this.getBalance_Amount())){
           this.Credit_limit=newCredit_limit;
           this.Grace_period=newGrace_period;
           this.Is_Granted= true;     
       }
       else{
           System.out.println("Sorry,Credit cannot be issued!");
       }
    }
      // remove the client's credit card.
       public void cancelCredit_Card(){
          
             if( this.Is_Granted){
               this.CVC_Number=0;
               this.Credit_limit=0;
               this.Grace_period=0;
               this.Is_Granted=false;
               
           }
           
       }
       //Display Details
       public void dispayDetails(){
           super.Display();
           if(this.Is_Granted){
            System.out.println("CVC Number:" + this.CVC_Number);
            System.out.println("Credit Limit:" + this.Credit_limit);
            System.out.println("Interest Rate:" + this.Interest_rate);
            System.out.println("Expiration Date:" + this.Expiration_Data);
            System.out.println("Grace Period:" + this.Grace_period);
           }
           else{
               System.out.println("No credit card has been granted yet.");
           }
       }
   }


