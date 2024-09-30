package polyprograms;

public class SuperChild extends SuperParent {
	String name = "hii";
	public void show() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		SuperChild obj = new SuperChild();
		obj.show();

	}

}
