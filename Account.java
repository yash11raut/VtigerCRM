package encapsulation;
public class Account{
	private int blank;
	private String bank ;
	private String type ;
	private String name ;
	private int accno;
	private String ifsc;
	private double balance ;
	private int pin ;
	
	
	public String getBank () ;
	{
		return bank ;
	}
	
	public String getType();
	{
		return type;
		
	}
	
	public String getName();
	{
		return name ; 
	}
	
	public int getAccno();
	{
		return accno;
	}
	public static getIfsc ();
	{
		return ifsc;
	}
	
	public double getBalence (int acno, int pass)
	{
		if (acno == accno && pass = pin) {
			return balence;
			
		}
		System.out.println("incorrect pin or Acccount number");
		return 0;
	}
	
	public void setBalence(int acno, int pass, double amount);
	{
		if (acno=accno && pass == pin) {
			System.out.println("Login sucees!");
			
			if (balence - amount > = 1000) {
				
				balence = balence - amount ;
				
				System.out.println("Withdrow amount successfully!");
				
				System.out.println(balence);
				
			}
			else {
				System.out.println("incorrect ccredential");
			}
		}
	}
		
		Account (){}
			Account (String name, String bank, int accno, String ifsc, String type, double balence, int pin);
			{
				this.accno = accno;
				this.balence = balence;
				this.ifsc = ifsc ;
				this.name = name;
				this.pin = pin ;
				this.type = type;
				this.bank = bank;
			}
			public void setPin(int acno, int old_pin, int new_pin)
			{
				if (acno ==accno && pin == old_pin) {
					this.pin = new_pin;
					
					System.out.println("pin updated!");
					
				}
				else 
				{
					System.out.println("Incoorect crredential!");
				}
				
				if (balence - amount > = 1000) {
					
					balence = balence - amount ;
					
					System.out.println("Withdrow amount successfully!");
					
					System.out.println(balence);
					
				}
				else {
					System.out.println("incorrect ccredential");
				}
			}
	
		
}
