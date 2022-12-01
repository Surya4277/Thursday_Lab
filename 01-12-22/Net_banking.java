import java.util.Scanner;

public class Net_banking {
	
		Net_banking(){
			System.out.println("Welcome to Union Bank....");
			char accountType;//2 type
			//Scanner sc = new Scanner(System.in);
			System.out.println("press[c] to Create Account.\npress[l] to LOGIN.");
			accountType=sc.next().charAt(0);
			Net_banking obj3 = new Net_banking(accountType);
			
		}
		Net_banking(char a){
			
			if(a=='c') {
				create_account();
			}
			else if(a=='l') {
				login_account();
			}
			else {
			System.out.println("Invalid input.\nTry Again....");
			}
		}
		static Scanner sc = new Scanner(System.in);//---instance type....
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Net_banking obj = new Net_banking();

	}
	static void create_account() {
		String name,middlename,surname,id,pass;
		long contactNo;
		int age;
		System.out.println("....Creating Account....");
		System.out.print("Enter The Name:");
		name = sc.next();
		System.out.print("Enter The MiddleName:");
		middlename = sc.next();
		System.out.print("Enter The SurName:");
		surname = sc.next();
		System.out.print("Enter The Age:");
		age = sc.nextInt();
		System.out.print("Enter The ContactNo:");
		contactNo = sc.nextLong();
		System.out.print("Create your ID:");
		id=sc.next();
		System.out.print("Create Your Password:");
		pass=sc.next();
		System.out.println("Account Created Successfully...");
		System.out.println("-------------------------------");
		System.out.println("Name:"+name);
		System.out.println("MiddleName:"+middlename);
		System.out.println("SurName:"+surname);
		System.out.println("Age:"+age);
		System.out.println("Contact number:"+contactNo);
		System.out.println("-------------------------------");
		
		mainStuff();
		
		
	}
	static void login_account() {
		String og_id,og_pass,id,pass;
		char cont;
		og_id="Suru@123";
		og_pass="Surya@123";
		System.out.println("Welcome to Union Bank's \nLogin Page....");
		do{
			System.out.print("Enter The ID:");
			id=sc.next();
			System.out.print("Enter The Password:");
			pass=sc.next();
			if(og_id.equals(id) && og_pass.equals(pass)) {
				mainStuff();
			}
			else {
				System.out.println("Invalid Input...");
			}
			System.out.println("To Try Again Press[y].\nTo Exit Press[n].");
			cont = sc.next().charAt(0);
		}while(cont=='y');
		
		
	}
	static void mainStuff() {
		char b_Sys,cont;// b_Sys---Bank System,cont----continue.
		int d,c,b,n;
		int balance = 10000;
		do{
			System.out.println("press[d]for Deposit....\npress[c]to withdraw....\npress[b]for Check Balance....\npress[n]for NEFT....");
			b_Sys = sc.next().charAt(0);
			switch (b_Sys) {
			case 'c':
				System.out.print("Enter The Ammount To Deposit:");
				d=sc.nextInt();
				balance += d; // balance = balance + d;
				System.out.println("Credited sucessfully");
				System.out.println("Current Balance:"+balance);
				break;
			case 'd':
				System.out.print("Enter The Ammount To Withdraw:");
				c=sc.nextInt();
				balance -= c; // balance = balance - c;
				System.out.println("Debited sucessfully");
				System.out.println("Current Balance:"+balance);
				break;
			case 'b':
				System.out.println("Current Balance:"+balance);
				break;
			case 'n':
				System.out.print("Enter The Ammount To NEFT:");
				n=sc.nextInt();
				System.out.println(n+" Will be Debited in few hours...");
				break;
			}
			System.out.println("To Continue Press[y].\nTo Exit Press[n].");
			cont = sc.next().charAt(0);
		}while(cont=='y');
	}

}
