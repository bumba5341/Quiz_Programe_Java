import java.util.*;

class Parti
{

	String n;
	void input()
	  {
		Scanner sc =new Scanner(System.in);
		System.out.print("\n\t What Is Your name ? \n\t ");
		n=sc.nextLine();
	   }
}

interface Inter1
{
	public boolean round2();
	public void round3();
}



class Just extends Parti implements Inter1
{
	String name;
	
	
 void rule()
  {
	name=n;
    System.out.print("\t Welcome to "+name+" Our 'Give Answer And Win Prize Contest'\n\t");
	System.out.print( "Are  You know the rule ? "+n+"\n\t The rules are :\n\t 3 Questiones will  be thrown and You will have to give all the  answers correctly.\n\t If You able to  answer the all correctly you will get  10000 cash. \n\t If You give a wrong answer You are't elegible for the next round \n\t So be Carefull. ");
  }

	boolean round1()
	 {
		Random rand=new Random();
		int rand1=rand.nextInt(4);
		System.out.print("\n\n\t Let's  Start \n\n\t Your First Question Is .");
		Scanner sc =new Scanner(System.in);
		if(rand1==0)
		 {
			System.out.print("\n\n\t What Is the Capatil of India ? \n\t a:Delhi \t\t\t\t  b:Kolkata \n\t c:New Delhi \t\t\t\t  d:Mumbai");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);
			if((ans=='c')||(ans=='C'))
			  {
				System.out.print("\n\n\t Wow  You give the correct answer . You are qualifing for the next round ");
				return true;
			  }
			else
			  {
				System.out.print("\n\t Sorry. You are not elegible for the next round .");
				return false ;
			   }
		  }
		else if(rand1==1)
		  {
			System.out.print("\n\n\t What is the ratio length and width in our national flag ? \n\t a: 2:3  \t\t\t\t b: 3:2 \n\t c: 4:3 \t\t\t\t d: 3:4");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='a')||(ans=='A'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer . You are qualifing for the next round ");
					return true;
				}
			else 
				{
					System.out.print("\n\n\t Sorry. You are not elegible for the next round .");
					return false;
				}	
		   }
		else if(rand1==2)
		  {
			System.out.print("\n\n\t The full form of M.R.P : \n\t  a: Minimum Retail Price.  \n\t  b: Minimum  Rental Price.  \n\t  c:Maximum  Retail Price .  \n\t  d:Maximum Rental Price. ");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='c')||(ans=='C'))
			  {
				System.out.print("\n\t Wow You give the correct answer . You are qualifing for the next round ");
				return true;
			   }
			else
				{
					System.out.print("\n\t Sorry. You are not elegible for the next round .");
					return false;
			  	 }
		   }

		else if(rand1==3)
			{
				System.out.print("\n\n\t On which countrie's national flag the map of the country is present ?  \n\t\t a:Sweden \t\t\t\t b:spain\n\t\t c:Switzerland  \t\t\td:Cyprus");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='d')||(ans=='D'))
			  {
				System.out.print("\n\t Wow You give the correct answer . You are qualifing for the next round ");
				return true;
			   }
			else
				{
					System.out.print("\n\t Sorry. You are not elegible for the next round .");
					return false;
			  	 }



 
			}
		
	return true;
	  } 



	public boolean round2()
	 {

		Random rand=new Random();
		int rand2 =rand.nextInt(4);
		System.out.print("\n\n\t Congratulation ."+name+" Welcome to second round. " );
		Scanner sc =new Scanner(System.in);
		if(rand2==0)
		  	{
				System.out.print("\n\n\t  Which Country Won the 1986 FIFA World Cup ? \n\t\t a:Brazil  \t\t\t\t b:Italy   \n\t\t c:West Germany\t\t\t\t d:Argentina");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='d')||(ans=='D'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer . You are qualifing for the next round ");
					return true;
				}
			else 
				{
					System.out.print("\n\n\t Sorry. You are not elegible for the next round.");
					return false;
				}
			}
		
		else if(rand2==1)
			{
				System.out.print("\n\n\t  Which company is the tag line  'THINK DIFFERENT'?  \n\t\t a:Apple  \t\t\t\t b:Microsoft \n\t\t c:Facebook  \t\t\t\t d:Google");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='a')||(ans=='A'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer . You are qualifing for the next round ");
					return true;
				}
			else 
				{
					System.out.print("\n\n\t Sorry. You are not elegible for the next round.");
					return false;
				}
			}

		else if(rand2==2)
			{
				System.out.print("\n\n\t  Which country was known previously as Indo China? \n\t\t a:Laos \t\t\t\t b:Vietnam.  \n\t\t c:Combodia \t\t\t\t d:Mayanmar");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='b')||(ans=='B'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer . You are qualifing for the next round ");
					return true;
				}
			else 
				{
					System.out.print("\n\n\t Sorry. You are not elegible for the next round.");
					return false;
				}
			 }

		else if(rand2==3)
			{
				System.out.print("\n\n\t  Where is the Statue of Liberty situated?  \n\t\t a:New York City \t\t\t b:Washington, D.C. \n\t\t c:San Francisco  \t\t\t d:Boston"); 
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='a')||(ans=='A'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer . You are qualifing for the next round ");
					return true;
				}
			else 
				{
					System.out.print("\n\n\t Sorry. You are not elegible for the next round.");
					return false;
				}
			 
			}
				return true;
		  }

	public void round3()
		{
			Random rand=new Random();
			int rand3=rand.nextInt(4);
			System.out.print("\n\n\t Congratulation ."+name+" Welcome to final round. " );
			//System.out.print("Hellow");
			Scanner sc =new Scanner(System.in);
			if(rand3==0)
				{
					System.out.print("\n\n\t Which is the newest state in India ?  \n\t\t a:Jharkhand  \t\t\t\t b:Andhra Pradesh \n\t\t c:Telangana \t\t\t\t d:Haryana.");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='c')||(ans=='C'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer.You give all question correctly .\n\n\t Congratulation "+name+ "  You won the 10000 cash. \n\n\t A big clapping for "+name );
		
				}
			else 
				{
					System.out.print("\n\n\t Sorry.  The answer is wrong .\n\n\t You are not able the correct answer in the final round.\n\t Better Luck Next Time . THANK YOU.");
					
				}
			}
		else if(rand3==1)
			{
				System.out.print("\n\n\t In which year the capital of India transfer from Kolkata to Delhi ? \n\t\t a:1911  \t\t\t\t b:1912  \n\t\t c:1910  \t\t\t\t d:1913 ");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='a')||(ans=='A'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer.You give all question correctly .\n\n\t Congratulation "+name+ "  You won the 10000 cash. \n\n\t A big clapping for "+name );
		
				}
			else 
				{
					System.out.print("\n\n\t Sorry.  The answer is wrong .\n\n\t You are not able the correct answer in the final round.\n\t Better Luck Next Time . THANK YOU.");
					
				}
			}

		
	else if(rand3==2)
		{
			System.out.print("\n\n\t Which is the biggest lake in India ? \n\t\t a:Chilika Lake \t\t\t\t b:Loktak Lake \n\t\t c:Sambhar Lake   \t\t\t\t d:Wular Lake ");
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='d')||(ans=='D'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer.You give all question correctly .\n\n\t Congratulation "+name+ "  You won the 10000 cash. \n\n\t A big clapping for "+name );
		
				}
			else 
				{
					System.out.print("\n\n\t Sorry.  The answer is wrong .\n\n\t You are not able the correct answer in final round.\n\t Better Luck Next Time . THANK YOU.");
					
				}
		}

		else if(rand3==3)
		 {
			System.out.print("\n\n\t Suppose You are standing in 'M Chinnaswamy Stadium'.In which state are you present now ? \n\t\t a:Tamil Nadu. \t\t\t\t b:Andhra Pradesh. \n\t\t c:Karnataka. \t\t\t\t d:Telangana."); 
			System.out.print("\n\t What Is the correct answer ? "+name+ "\n\n\t Press 1 key. ");
			char ans=sc.next().charAt(0);

			if((ans=='c')||(ans=='C'))
			   {
					System.out.print("\n\n\t Wow You give the correct answer.You give all question correctly .\n\n\t Congratulation "+name+ "  You won the 10000 cash. \n\n\t A big clapping for "+name );
		
				}
			else 
				{
					System.out.print("\n\n\t Sorry.  The answer is wrong .\n\n\t You are not able the correct answer in the final round.\n\t Better Luck Next Time . THANK YOU.");
					
				}
		 }
			
		}
	 
} 

class Quiz
{
	public static void main(String args[])
	 {
		boolean type1,type2;
		Just obj=new Just();
		obj.input();
		obj.rule();
		type1=obj.round1();
		if(type1==true)
		  {
			type2=obj.round2();
			if(type2==true)
				{
					obj.round3();
				 }
			else
				System.out.print("\n\t Better Luck Next Time . THANK YOU.");
		   }
		else
		System.out.print("\n\t Better Luck Next Time . THANK YOU.");
		
			
	  }
}
