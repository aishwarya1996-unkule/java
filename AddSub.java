import java.util.Scanner;
public class AddSub {
	int a,b,d,e;
	
	public AddSub(int a, int b)
	{
		super();
		this.a=a;
		this.b=b;
		double c=a+b;
		System.out.println("Addition"+c);
	}
	
	
	public void AddSub1(int d, int e )
	{
		
		this.d=d;
		this.e=e;
		double c=d-e;
		System.out.println("Subtraction"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		AddSub a=new AddSub(sc.nextInt(),sc.nextInt());
		a.AddSub1(sc.nextInt(), sc.nextInt());
		

	}

}
