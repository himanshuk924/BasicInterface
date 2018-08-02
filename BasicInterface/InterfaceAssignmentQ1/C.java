package InterfaceAssignmentQ1;

public class C implements B {
	public static void main(String[] args) {
		C c = new C();
		c.disp1();// invoking disp1 default method of interface A
		c.disp2();// invoking disp2 default method of interface B
	}
}
