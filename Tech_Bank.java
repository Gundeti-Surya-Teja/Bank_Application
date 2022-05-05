import java.util.*;
class Customer_Account  ///////main class-2//////////
{//a(1)
//https://www.knowprogram.com/java/array-of-objects-in-java/
	private String Accno;
	private String cif;
	private String name;
	private String Acc_type;
	private double balance;

	private double withdraw;
	private double deposit; 
	private double Perivous_transaction;

 	Scanner input=new Scanner(System.in);

	//getter
	public String getAccno()
        {
	 	return Accno;
	}
	public String getcif()
        {
	 	return cif;
	}
	public String getname()
        {
	 	return name;
	}
	public String getAcc_type()
        {
	 	return Acc_type;
	}
	public double getbalance()
        {
	 	return balance;
	}


	//constructer
	public Customer_Account(String Accno, String cif, String name, String Acc_type,double balance)
	{
		this.Accno = Accno;
		this.cif= cif;
		this.name = name;
		this.Acc_type = Acc_type;
		this.balance = balance;
	}

	//check_balance
	public void check_balance()
	{
	System.out.println("--------------------------------------------------------------------------------------");
	 System.out.println("\tAccount.No                  : " +Accno);
	 System.out.println("\tCIF code                    : " +cif);
	 System.out.println("\tName of AccountHolder       : " +name);
	 System.out.println("\tAccount type                : " +Acc_type);
	 System.out.println("\tCurrent Balance             : " +Math.abs(balance));
	System.out.println("--------------------------------------------------------------------------------------");
	}

	//deposit
	public void deposit()
	{
	 System.out.print("\tEnter the amount(Deposit)   : ");
	 deposit = input.nextDouble();
	 balance = balance + deposit;
	 Perivous_transaction = deposit;
	// check_balance();
	 System.out.println("\tDeposited Amount is         : " +deposit);
	 System.out.println("=====================================================================================");
	 System.out.println("\tCurrent Balance is          : " +balance);
	 System.out.println("-------------------------------------------------------------------------------------");
	}

	//withdrawl
	public void withdraw()
	{
	 System.out.print("\tEnter the WithDrawl Amount  : ");
	 withdraw = input.nextDouble();
	 if(balance >= withdraw)
		{
		 balance = balance - withdraw;
		 Perivous_transaction = - withdraw;
	        // check_balance();
		 System.out.println("\tWithdrawl Amount is         : " +withdraw);
	 System.out.println("=====================================================================================");
		 System.out.println("\tCurrent Balance is          : " +balance); 
		System.out.println("------------------------------------------------------------------------------");
		}
	 else if( withdraw == 0)
	 {
		System.out.println("----------------------------------ERROR---------------------------------------");
		System.out.println("\t\tSorry! "+withdraw +" Amount of Withdrawl is not possible");
		System.out.println("------------------------------------------------------------------------------");
	 }
	 else
	 {
		System.out.println("----------------------------------ERROR---------------------------------------");
		System.out.println("\t\tYour Balance is less than Withdrawl amount");
		System.out.println("------------------------------------------------------------------------------");
	 }

	}
	
	// search
	public boolean search(String Ac_no)
	{
	 if (Accno.equals(Ac_no))
	 {
	  check_balance();
	  return true;
	 }
	   return false;
	 
	}

	//previous Transistion
	public void Perivous_transaction()
	{
	 if(Perivous_transaction > 0)
		{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\tPervious Transacation was Deposit and  Amount is : "+Perivous_transaction);
		System.out.println("------------------------------------------------------------------------------");
		}
	else if(Perivous_transaction < 0)
		{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\tPervious Transacation was Withdrawl and Amount is : "+Math.abs(Perivous_transaction));
		System.out.println("------------------------------------------------------------------------------");
		}
		else
		{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\t\t\tNO Transation occured");
		System.out.println("------------------------------------------------------------------------------");
		}
	}

	//office
	public void office()
	{

	System.out.println( "\t"+name          +"\t\t"+Accno+  "\t\t"+cif       +" "+Acc_type+       "\t"+Math.abs(balance) );
	System.out.println( "-------------------------------------------------------------------------------------" );
	}

	

 
	



}//a(1)



class Tech_Bank        ///////main class-1//////////
{//1(s)


   public static void main(String args[])         /////////main method//////
   {//2(s)

     Scanner input=new Scanner(System.in);
     System.out.println("------------------------------------------------------------------------------------------------------------------------------");
     System.out.println("-----------------------------------------WELCOME TO DIGITAL BANKING-----------------------------------------------------------");
     System.out.println("\t\t\t\t\t\tOpen Zero Balance");
     System.out.println("\t\t\t\t\tSaving account in few minutes upto  ");
     System.out.println("\t\t\t\t3.5 % interest p.a along with other benefits.");
////////custmor///////////////
	System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	int size = 5;	Boolean found= false;	String Ac_no;

        //Declaring, and creating array objects
	Customer_Account[] Account=new Customer_Account[size];

 		//initializing Student array locations
			Account[0] = new Customer_Account("100200300101","10030040012","Venkat","Saving Account",0.00);

			Account[1] = new Customer_Account("100200300102","20034000010","Mahesh","Saving Account",0.00);

			Account[2] = new Customer_Account("100200300103","30120040023","Vamsi ","Saving Account",0.00);

			Account[3] = new Customer_Account("100200300104","40065700195","Zakir ","Saving Account",0.00);

			Account[4] = new Customer_Account("100200300105","50030040045","Tarun ","Saving Account",0.00);

		// user id to enter into application dashboard
		int userid1= 1000; 	
		int userid2= 2000;
		int userid3= 3000;
		int userid4= 4000;
		int userid5= 5000;



	int userid ;
	
	do{ //6(s)
	System.out.print("Please! Enter your USER ID : ");
	userid= input.nextInt();

	if( userid == userid1 || userid == userid2 || userid == userid3 || userid == userid4 || userid == userid5 )
	{//5(s)
	while(true)
     	{//3(s)
	 System.out.println("-------------------------------------------------------------------------------------");
	 System.out.println("*************************************************************************************");
	 System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("\tPlease choose from below options:");
		System.out.println("\t\t1.Search Account \t\t2.Deposit");
		System.out.println("\t\t3.Withdrawl      \t\t4.Perivous Transaction");
		System.out.println("\t\t5.Office         \t\t6.Exit");
	 System.out.println("-------------------------------------------------------------------------------------");
	 System.out.println("*************************************************************************************");
	 System.out.println("-------------------------------------------------------------------------------------");

		System.out.print("\tEnter the option: ");
		int option = input.nextInt();
	System.out.println("--------------------------------------------------------------------------------------");
				System.out.println("\t\t\tIFSE code:SEC07\t\t\t\tBRANCH : SECUNDERABAD");

	if( option < 7 )
	{//4(s)

		switch (option)
		{
			// searching and checking balance
		    	case 1 :

			
		                System.out.println("\tEntered the option is: 1.Searching and checking Balance");
				System.out.print("\tEnter the Account Number: ");
				Ac_no = input.next();
				//Boolean found = false;
 
				for( int i = 0 ;i < size;i++)
				{
					found = Account[i].search(Ac_no);
					if(found)
					{	
						break;
					}
				}
					if(!found)
					{
	System.out.println("---------------------------------------ERROR------------------------------------------");
						System.out.println("\tThe entered Account number is not found.\n \tPlease enter correct Account number ");
	System.out.println("--------------------------------------------------------------------------------------");
											
					}
					

				
				break;
			

		    	case 2: // for deposit
			
		                System.out.println("\tEntered the option is: 2.Deposit");
				System.out.print("\tEnter the Account Number: ");
				Ac_no = input.next();
				//Boolean found = false;
				for( int i = 0 ;i < size;i++)
				{
					found = Account[i].search(Ac_no);
					if(found)
					{	
						Account[i].deposit();
						break;
					}
				}
					if(!found)
					{
	System.out.println("---------------------------------------ERROR------------------------------------------");
						System.out.println("\tThe entered Account number is not found.\n \tPlease enter correct Account number ");

	System.out.println("--------------------------------------------------------------------------------------");
					}
				
				
				break;
			

		    	case 3:  //for withdrawl
			
		                System.out.println("\tEntered the option is: 3.Withdrawl");
				System.out.print("\tEnter the Account Number: ");
				Ac_no = input.next();
				//Boolean found = false;

				for( int i = 0 ;i < size;i++)
				{
					found = Account[i].search(Ac_no);
					if(found)
					{	
						Account[i].withdraw();
						break;
					}
				}
					if(!found)
					{
	System.out.println("-----------------------------------ERROR----------------------------------------------");
						System.out.println("\tThe entered Account number is not found.\n \tPlease enter correct Account number ");
					}
				
				
				break;
			

		    	case 4: // previous transistion
			
		                System.out.println("\tEntered the option is: 4.Previous Transistion");
				System.out.print("\tEnter the Account Number: ");
				Ac_no = input.next();
				//Boolean found = false;
				for( int i = 0 ;i < size;i++)
				{
					found = Account[i].search(Ac_no);
					if(found)
					{	
						//Account[i].check_balance();	
						Account[i].Perivous_transaction();			
						
						break;
					}
				}
					if(!found)
					{

	System.out.println("------------------------------------------ERROR----------------------------------------");
						System.out.println("\tThe entered Account number is not found.\n \tPlease enter correct Account number ");
					}
				

				break;
 			

		    	case 5: //office
			
		                System.out.println("\tEntered the option is: 5.Office use");
				System.out.println("\tThis option is only for office use:");
				int ref_key = 1432;
				System.out.print("\tEnter the KEY: ");
				int key = input.nextInt();                           
				if ( ref_key == key)
				{
	System.out.println("-------------------------------------------------------------------------------------");
	System.out.println("\tName of Customer   Acc.no           CIF-code   Account-Type   Current-Balance");
	System.out.println("-------------------------------------------------------------------------------------");
					for(int i = 0;i < size;i++ )
					{
						Account[i].office();
					}
				}
				else
				{
       System.out.println("-------------------------------------------ERROR----------------------------------------");
					System.out.println("\tThe entered KEY is INCORRECT.\n \tPlease enter correct key.");
				}
				break;
			

		    	default:
			{
			    System.out.println("\t\t\t\tTHANK YOU for using our service.");
				System.exit(0);
			}

		 }//SWITCH
	}//4(e)
		else
		{
        	System.out.println("----------------------------------------ERROR-----------------------------------------");
		System.out.println("\t\t\tSorry yor entered a invalid option");
		System.out.println("\t\t\t<<<<<<<<<<< TRY AGAIN >>>>>>>>>>>>");
		}
        }//3(e)WHILE

	}//5(e)

	else
	{
        	System.out.println("----------------------------------------ERROR-----------------------------------------");
		System.out.println("\t\t\tPlease! enter correct USER ID or do you want exit PRESS CTRL+c");
 
	}

        }while(userid !=0) ;    //6(e)
	






  }//2(e)main
	
}//1(e)class
	
	