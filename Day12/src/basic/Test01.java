package basic;
interface A {
	void aa();
}

interface B{
	void aa();
	void bb();
}
interface C extends A, B{
	// void aa();
	// vdoi bb();
}
class D implements A, B, C{
	public void aa() {}
	public void bb() {} 
}
public class Test01 {

}




