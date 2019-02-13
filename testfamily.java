import java.util.*;
public class testfamily {

	/**
	 * @param args
	 */
	public static Scanner reader=new Scanner(System.in);
	public static void main(String[] args)
	{
	
		String name;
		double income;
		int age=0;
		
		System.out.println("eneter family name");
		name= reader.next();
		System.out.println("eneter income");
		income = reader.nextDouble();
		family g1= new family (name,income);	
	 System.out.println("age:");
		age = reader.nextInt();
		while (age != 999)
		{
			g1.addPerson(age);
			System.out.println("age");
			age=reader.nextInt();
			
			
		}
		System.out.println(g1.getCreditPoints());
	}

}
