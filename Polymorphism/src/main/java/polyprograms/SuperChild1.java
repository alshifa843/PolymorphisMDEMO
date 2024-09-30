package polyprograms;

public class SuperChild1 extends SuperParent1 {
	public void show()
	{  super.show();
		System.out.println("hello world");
		
	}

	public static void main(String[] args) {
		SuperChild1 obj = new SuperChild1();
		obj.show();

	}

}
