package Jannineteen;
class A
{
	int x=5;
	{
		//anonymous block
		System.out.println(x);
		x=10;
	}
	A()
	{
		System.out.println(x);
		x=20;
	}
	void display()
	{
		System.out.println(x);
	}
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		ob.display();
		A ob2=new A();
		ob2.display();
	}

}
