package Interface;
//This is similar to WebDriver driver = new firefoxdriver()
public class ImplInterface implements MyInterface {
	
	static ImplInterface ifo;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyInterface interf = new ImplInterface();
		interf.sayHello();
//		System.out.println("Variable" + MyInterface.hello);
		ifo = new ImplInterface();
		ifo.sayhi();		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Saying Hello");
		System.out.println("Calling with interface instance: Variable = " + MyInterface.hello);
		System.out.println("Calling without interface instance: Variable = " + hello);
		}
//	As you can see, accessing a variable from an interface is very similar to accessing a static variable in a class.
	
	public void sayhi() {
		System.out.println("Saying Hi");
	}
}
