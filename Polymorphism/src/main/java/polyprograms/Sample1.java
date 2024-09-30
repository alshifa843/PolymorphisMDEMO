package polyprograms;

public class Sample1 {
	String name ;
	int age ;
	int sal ;
	Sample1(String name,int age,int sal)
	{
		this.name=name;
		this.age = age;
		this.sal = sal;
	}
	
	
	public void show()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		
		
	}

	public static void main(String[] args) {
		Sample1 obj = new Sample1("appu",12,2456);
		obj.show();

	}

}
