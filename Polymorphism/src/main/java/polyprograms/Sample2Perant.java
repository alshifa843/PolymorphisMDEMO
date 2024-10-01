package polyprograms;

public class Sample2Perant {


		int a;
		int b;
		int c ;
		Sample2Perant(int a,int b,int c)
		{
		
			this.a = a;
			this.b = b;
			this.c = c;
			
		} 
		
	
		public void show()
		{
			int result = a*b*c;
			System.out.println(result);
			
		}
		
		public static void main(String[] args) {
			Sample2Perant obj = new Sample2Perant(2,4,6);
			obj.show();

}

}		
		
	

	

