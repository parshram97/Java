  
/**
 * Write a description of class lab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BankGUI implements ActionListener 

{
  ArrayList<Bank_Card> bank_AL = new  ArrayList<Bank_Card> ();     
   private JFrame frame;
   private JPanel panel;
   private JLabel title, cardid, clientname, issuerbank,pin,withdrawalamt, creditlmt,bankaccount,balanceamt,cvcnumber,intrestrate,graceperiod,withdrawaldate,expiredate;
   private JTextField cardid1, clientname1, issuerbank1,pin1,withdrawalamt1, creditlmt1,bankaccount1,balanceamt1,cvcnumber1,intrestrate1,graceperiod1;
   private JComboBox<String> DT1, DT2, DT3, DT001,DT002,DT003,DT0001,DT0002,DT0003 ;
   private JButton CREDIT,DEBIT,WITHDRAWAL,LIMIT,CANCEL,GRACE,DISPLAYD,DISPLAYC,CLEAR;   
    

   
 public BankGUI(){
     
       frame = new JFrame("Islington International college");
       panel = new JPanel();
       title = new JLabel("[  BANK GUI FORM  ]");
       title.setBounds(600,50,170,30);
       
       cardid = new JLabel("Card ID");
       cardid1 = new JTextField();
       
      cardid.setBounds(10,80,130,30);
      cardid1.setBounds(60,80,170,30);
           
                 
       clientname = new JLabel("Client Name : ");
       clientname1 = new JTextField();
       clientname.setBounds(50,150,130,70);
       clientname1.setBounds(150,165,200,30);
                
       issuerbank = new JLabel("Issuer Bank : ");
       issuerbank1 = new JTextField();
         
      issuerbank.setBounds(500,150,130,70);
      issuerbank1.setBounds(600,165,200,30);
                
        pin = new JLabel("Pin Number : ");
        pin1 = new JTextField();
         pin.setBounds(850,150,130,70);
         pin1.setBounds(950,165,200,30);
                
        withdrawalamt= new JLabel("Withdrawal Amount : ");
        withdrawalamt1 = new JTextField();
        
        withdrawalamt.setBounds(40,450,130,70);
        withdrawalamt1.setBounds(160,465,200,30);
        
        bankaccount = new JLabel("Bank Account : ");
        bankaccount1 = new JTextField();
          
          bankaccount.setBounds(50,250,130,70);
          bankaccount1.setBounds(150,265,200,30);
       
        balanceamt = new JLabel("Balance Amount : ");
        balanceamt1 = new JTextField();
    
         balanceamt.setBounds(480,250,130,70);
        balanceamt1.setBounds(600,265,200,30);
        
          
        cvcnumber = new JLabel("CVC Number : ");
        cvcnumber1 = new JTextField();
        
          cvcnumber.setBounds(50,350,130,70);
          cvcnumber1.setBounds(150,365,200,30);
       
        creditlmt= new JLabel("credit limit : ");
        creditlmt1= new JTextField();
    
          creditlmt.setBounds(50,535,130,70);
          creditlmt1.setBounds(150,550,200,30);
               
        intrestrate = new JLabel("Intrest rate (%) : ");
        intrestrate1= new JTextField();
        
          intrestrate.setBounds(480,350,130,70);
          intrestrate1.setBounds(600,365,200,30);
         
        graceperiod = new JLabel("grace period : ");
        graceperiod1 = new JTextField();
        
          graceperiod.setBounds(490,535,130,70);
          graceperiod1.setBounds(600,550,200,30);
         
        
        
    

          
           
              //an array of Address
        JLabel Date = new JLabel("Today Date: ");
         String[] Day = {"Day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
         String[] Month ={"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
         String[] Year = {"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};

            DT1=new JComboBox<>(Year);
            DT2=new JComboBox(Day);
            DT3 =new JComboBox(Month);
            
           Date.setBounds(1120,15,80,30);
            DT1.setBounds(1230,15,80,30);
            DT2.setBounds(1315,15,80,30);
            DT3.setBounds(1400,15,80,30);
                    
                       
        JLabel Withdrawal_Date  = new JLabel("Withdrawal_Date: ");
          String[] DaY001= {"Day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
          String[] Month002 ={"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
          String[] Year003 = {"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};

             DT001=new JComboBox<>(Year);
             DT002=new JComboBox<>(Day);
             DT003 =new JComboBox<>(Month);
             
            Withdrawal_Date .setBounds(480,465,150,30);
             DT001.setBounds(600,465,80,30);
             DT002.setBounds(680,465,80,30);
             DT003.setBounds(760,465,80,30);
             

             
          
            
        JLabel Expiration_Date  = new JLabel(" Expiration_Date : ");
           String[] Day01= {"Day","1","2","3","4","5","7","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","29","30"};
           String[] Month02={"Month","1","2","3","4","5","6","7","8","9","10","11","12"};
           String[] Year03 = {"Year","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028"};

             DT0001=new JComboBox(Year);
             DT0002=new JComboBox(Day);
             DT0003 =new JComboBox(Month);
        
               Expiration_Date .setBounds(850,360,150,30);
              DT0001.setBounds(960,360,80,30);
              DT0002.setBounds(1040,360,80,30);
              DT0003.setBounds(1120,360,80,30);
              
              
                 
            
            
            
        
           
    
                     //Button
                DEBIT =new JButton("Add Debit Card");
                 DEBIT.setBounds(940,250,200,35);
                CREDIT =new JButton("Add Crebit Card");
                   CREDIT.setBounds(1250,350,200,35);
                WITHDRAWAL =new JButton("WithdrawaL");
                  WITHDRAWAL.setBounds(950,450,200,35);
                LIMIT =new JButton("Set Credit Limit");
                  LIMIT.setBounds(850,550,200,35);
                CANCEL =new JButton("Cancel Credit limit");
                 CANCEL.setBounds(400,670,200,35);
                DISPLAYD =new JButton("DISPLAY Debit");
                 DISPLAYD.setBounds(670,670,200,35);
                DISPLAYC =new JButton("DISPLAY Credit");
                   DISPLAYC.setBounds(950,670,200,35);
                   CLEAR =new JButton("Clear");
                    CLEAR.setBounds(670,730,200,35);
        
                     
                     
           
                panel.add(Date);
                panel.add(DT1);
                panel.add(DT2);
                panel.add(DT3);
                panel.add(Withdrawal_Date);
                panel.add(DT001);
                panel.add(DT002);
                panel.add(DT003);
                
                
                  
                panel.add(Expiration_Date);
                panel.add(DT0001);
                panel.add(DT0002);
                panel.add(DT0003);
                
                panel.add(title);
                panel.add(cardid);
                panel.add(cardid1);
                panel.add(clientname);
                panel.add(clientname1);
                panel.add(issuerbank);
                panel.add(issuerbank1);
                panel.add(pin);
                panel.add(pin1);
                panel.add(withdrawalamt);
                panel.add(withdrawalamt1);
                panel.add(bankaccount);
                panel.add(bankaccount1);
                panel.add(balanceamt);
                panel.add(balanceamt1);
                panel.add(cvcnumber);
                panel.add(cvcnumber1);
                panel.add(creditlmt);
                panel.add(creditlmt1);
                panel.add(intrestrate);
                panel.add(intrestrate1);
                panel.add(graceperiod);
                panel.add(graceperiod1);
               // panel.add(l12);
                //panel.add(t12);
                
              //adding button 
                panel.add(CREDIT);
                panel.add(DEBIT);
                panel.add(WITHDRAWAL);
                panel.add(CANCEL);
                panel.add(LIMIT);
                panel.add(DISPLAYD);
                panel.add(DISPLAYC);
                panel.add(CLEAR);
                CLEAR.setBackground(Color.RED);
                DEBIT.addActionListener(this);
                CREDIT.addActionListener(this);
                WITHDRAWAL.addActionListener(this);
                LIMIT.addActionListener(this);
                CANCEL.addActionListener(this);
                DISPLAYD.addActionListener(this);
                DISPLAYC.addActionListener(this);
                CLEAR.addActionListener(this);
                
                
        
                  
      
        
            panel.setLayout(null);
            panel.setSize(1550,850);
            frame.add(panel);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(1550,850);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              panel.setBackground(Color.CYAN);
               
     
 }
  public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == DEBIT)
    {
          if (cardid.getText().isEmpty ()|| clientname1.getText().isEmpty ()||issuerbank1.getText().isEmpty ()||balanceamt1.getText().isEmpty() ||bankaccount1.getText().isEmpty ()||pin1.getText().isEmpty ())
          {
              JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
          }
          else 
          {
            try {
                int cardid = Integer.parseInt(cardid1.getText());
                String clientname = clientname1.getText();
                String isseuerbank  = issuerbank1.getText();
                double balanceamount = Double.parseDouble(balanceamt1.getText());
                String bankaccount  = bankaccount1.getText();
                int pinnum = Integer.parseInt(pin1.getText());
                boolean bull = true;
                for(Bank_Card eachdebit : bank_AL)
                {
                     if(eachdebit instanceof Debit_Card )
                     {    
                         Debit_Card db = (Debit_Card) eachdebit;
                         if (cardid==db.getCard_Id())
                         {
                             bull = false ;
                         }
                     }
                       
                }
                if(bull == true)
                     {
                         Debit_Card raw = new Debit_Card(cardid,bankaccount,clientname,isseuerbank,balanceamount,pinnum);
                         bank_AL.add(raw);
                        //JOptionPane.showMessageDialog(frame, "Debit sucessfull Addedd \n CARD ID: \n Client Name:  \n Issuer Bank: " + cardid  +clientname + issuerbank  ,"Alert", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(frame, "Debit successful added:\n\nCard ID: " + cardid + "\nClient Name: " + clientname + "\nIssuer Bank: " + isseuerbank + "\nBalance Amount: " + balanceamount + "\nBank Account: " + bankaccount + "\nPin_Number: " + pinnum    ,  "Alert", JOptionPane.INFORMATION_MESSAGE);

                     }
                else{
                         JOptionPane.showMessageDialog(frame, "debit of this  card id is already exit t", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
            
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers in the textboxes!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
          }
    }
    else if(ae.getSource() ==CREDIT)
    {
        if( cardid.getText().isEmpty ()|| clientname1.getText().isEmpty ()||issuerbank1.getText().isEmpty ()||balanceamt1.getText().isEmpty() ||issuerbank1.getText().isEmpty ()||pin1.getText().isEmpty()||cvcnumber1.getText().isEmpty() || DT0001.getSelectedItem(

        )=="Year" ||DT0002.getSelectedItem()=="Day" ||  DT0003.getSelectedItem() =="Month")
        {
             JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try {
                    int cardid = Integer.parseInt(cardid1.getText());
                    String clientname = clientname1.getText();
                    String isseuerbank  = issuerbank1.getText();
                    double balanceamount = Double.parseDouble(balanceamt1.getText());
                    String bankaccount  = bankaccount1.getText();
                    int pinnum = Integer.parseInt(pin1.getText());
                    int cvcnum = Integer.parseInt(cvcnumber1.getText());
                    int intrest =Integer.parseInt(intrestrate1.getText());
                    String jcombo1 =(String) DT0001.getSelectedItem();
                    String jcombo2 =(String) DT0002.getSelectedItem();
                    String jcombo3=(String) DT0003.getSelectedItem();
                    String time = jcombo1 + " " + jcombo2 + " " +jcombo3;
                    boolean bull = true;
                    for(Bank_Card eachcredit : bank_AL)
                        {
                         if(eachcredit instanceof Credit_Card ){
                             
                             Credit_Card db = (Credit_Card) eachcredit;
                             if (cardid==db.getCard_Id())
                             {
                                 bull = false ;
                             }
                          }
                    }
                     if(bull == true)
                         {
                             Credit_Card raw = new Credit_Card(cardid,clientname,isseuerbank,bankaccount,balanceamount,cvcnum,intrest,time);
                             bank_AL.add(raw);
                              JOptionPane.showMessageDialog(frame, "Credit successful added: \n\nCard ID: " + cardid + "\nClient Name: " + clientname + "\nIssuer Bank: " + isseuerbank + "\nBalance Amount: " + balanceamount + "\nBank Account: " + bankaccount + "\nPin_Number: " + pinnum + "\nCvc   Number: " + cvcnum  + "\nIntrest Rate: " + intrest + "\n Expire Date: " + time ,  "Alert", JOptionPane.INFORMATION_MESSAGE);

                            //JOptionPane.showMessageDialog(frame, " credit sucessfull Addedd\n Cardid: " + cardid ,"Alert", JOptionPane.INFORMATION_MESSAGE);
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(frame, "credit of this  card id is already exit !", "Alert", JOptionPane.ERROR_MESSAGE);
                         }   
            
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers in the textboxes!", "", JOptionPane.ERROR_MESSAGE);
                }
        }
    } 
     else if (ae.getSource() == WITHDRAWAL)
    {
           if(cardid1.getText().isEmpty ()||withdrawalamt1.getText().isEmpty ()||  pin1.getText().isEmpty ()|| DT001.getSelectedItem()=="Year" ||DT002.getSelectedItem()=="Day" ||  DT003.getSelectedItem() =="Month")
              
        {
           JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
          
    }
       else
        {
              try {
                int cardid = Integer.parseInt(cardid1.getText());
                double withdrawalamt = Double.parseDouble(withdrawalamt1.getText());
                int pinnum = Integer.parseInt(pin1.getText());
                String jcombo1 =(String) DT001.getSelectedItem();
                String jcombo2 =(String) DT002.getSelectedItem();
                String jcombo3=(String) DT003.getSelectedItem();
                String time = jcombo1 + " " + jcombo2 + " " +jcombo3;
                boolean bull = true;
                    for(Bank_Card withdraw : bank_AL)
                        {
                         if(withdraw instanceof Debit_Card ){    
                         Debit_Card db = (Debit_Card) withdraw;
                        if (cardid==db.getCard_Id())
                        {
                            bull = true ;
                            if(pinnum == db.getPIN_Number())
                             { 
                                 if(withdrawalamt <= db.getBalance_Amount())
                                 {
                                     db.Withdraw(withdrawalamt,time,pinnum);
                                      JOptionPane.showMessageDialog(frame, "sucessfull withdrawal Done: \n\n Card Id:  "  + cardid + "\nWithdrawal Amount: " + withdrawalamt + "\nPin Number: " + pinnum + "\nTime: " + time  , "Alert", JOptionPane.INFORMATION_MESSAGE);
                                 
                                }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(frame, "insufficent balance", "Alert", JOptionPane.ERROR_MESSAGE);
                                 }
                             }
                             else
                             {
                             JOptionPane.showMessageDialog(frame, "Incorrect pin", "Alert", JOptionPane.ERROR_MESSAGE);
                                 }
                            break;
                        }
                        else{
                            bull = false;
                        }
                    }
                }
                if(bull ==false )
                {
                JOptionPane.showMessageDialog(frame, "Card_id not found", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Number format exception", "Alert", JOptionPane.ERROR_MESSAGE);
                }
        }
    } 
    else if(ae.getSource() ==LIMIT)
    {
        if( cardid.getText().isEmpty ()|| creditlmt1.getText().isEmpty ()||graceperiod1.getText().isEmpty ())
        {
             JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try {
                    int cardid = Integer.parseInt(cardid1.getText());
                    int newperiod = Integer.parseInt(graceperiod1.getText());
                    double newlimit = Double.parseDouble(creditlmt1.getText());
                    boolean Bull = false;
                    for(Bank_Card limit : bank_AL)
                        {
                          if(limit instanceof Credit_Card )
                          {
                                 Credit_Card c = (Credit_Card) limit;
                                 if (cardid==c.getCard_Id())
                                 {
                                     Bull = true ;
                                     if(newlimit <= 2.5 * c. getBalance_Amount())
                                     {
                                         c.setCredit_limit(newlimit,newperiod);
                                        JOptionPane.showMessageDialog(frame, "credit limit sucessfull: \n\n Card ID: "  + cardid + "\nnew period"  + newperiod  + "\n New Limit: " + newlimit , "Alert", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                     else
                                     {
                                         JOptionPane.showMessageDialog(frame, "credit limit too high", "Alert", JOptionPane.ERROR_MESSAGE);
                                     }  
                                     break;
                                 }
                           else{
                            Bull = false;
                            }
                        }
                    }
                    if(Bull ==false )
                        {
                            JOptionPane.showMessageDialog(frame, "Card_id not found", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
                }
        }
    }
    else if(ae.getSource() ==CANCEL)
    {
        if( cardid.getText().isEmpty ())
        {
             JOptionPane.showMessageDialog(frame, "Empty text !","Alert", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try {
                int cardid = Integer.parseInt(cardid1.getText());
                boolean flag = false;
                for(Bank_Card cancel : bank_AL)
                    {    
                        if(cancel instanceof Credit_Card ){
                            Credit_Card cd = (Credit_Card) cancel;
                            if (cardid== cd.getCard_Id())
                            {
                                cd.cancelCredit_Card ();
                                flag = true;
                                 break;
                                } 
                                else{
                                    flag= false;
                                }
                            }            
                    }                              
                 if(flag == true)
                 {
                  JOptionPane.showMessageDialog(frame, "Cancel sucessfull: \n\n Card ID: "  + cardid , "Alert", JOptionPane.INFORMATION_MESSAGE);
                  }
                 else
                 {
                 JOptionPane.showMessageDialog(frame, "No card id", "Alert", JOptionPane.ERROR_MESSAGE);
                             } 
                } 
                catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
                }
        }
    } 
    else if (ae.getSource() == DISPLAYD)
    { try{
           for(Bank_Card displayd : bank_AL)
                {    
                if(displayd instanceof Debit_Card )
                   {
                     Debit_Card dc = (Debit_Card)displayd ;
                     dc.display();
                     
                  }            
             } 
            }catch (NumberFormatException e)
            {
                    JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
             }
    }
    else if (ae.getSource() == DISPLAYC)
    {
        try{
            
             for(Bank_Card display : bank_AL)
             
            {    
                    if(display instanceof Credit_Card )
                   {
                     Credit_Card dc = (Credit_Card)display ;
                     dc.dispayDetails();
                     
                  }            
             } 
        }
        
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "number format exception!", "", JOptionPane.ERROR_MESSAGE);
            }
    }
    else if (ae.getSource() == CLEAR)
    {
        cardid1.setText(" ");
        clientname1.setText(" ");
        issuerbank1.setText(" ");
        bankaccount1.setText(" ");
        balanceamt1.setText(" ");
        pin1.setText(" ");
        withdrawalamt1.setText(" ");
        creditlmt1.setText(" ");
        bankaccount1.setText(" ");
        cvcnumber1.setText(" ");
        intrestrate1.setText(" ");
        graceperiod1.setText(" ");
        DT001.setSelectedIndex(0);
        DT0002.setSelectedIndex(0);
        DT0003.setSelectedIndex(0);
        DT0001.setSelectedIndex(0);
        DT0002.setSelectedIndex(0);
        DT0003.setSelectedIndex(0); 
        {
             JOptionPane.showMessageDialog(frame, "Clear sucessfull" , "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    }
public static void main(String []args){
        BankGUI frame = new BankGUI();

    
 }
}


