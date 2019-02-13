
public class family
{
	private String Lastname;
	private int adults;
	private int teens;
	private int kids;
	private double income;
	
	public family (String lastname,double income )
	{
		Lastname=lastname;
		this.income=income;
		this.adults=0;
		this.teens=0;
		this.kids=0;
	}
		
	public void setIncome (double income)
	{
		this.income=income;
	}
	
	public double getIncome()
	{
		return this.income;
	}
	public void addPerson(int age)
	{
		if(age<=12)
		{
			this.kids++;
		}
		
		if (age>12 && age<18)
		{
			this.teens++;
		}
		else
		{
			this adults++;
		}
		public double getCreditPoints()
		{
			retun (this.adults)+(this.teens*0.7)+(this.kids*0.5);
		}
	
	}
