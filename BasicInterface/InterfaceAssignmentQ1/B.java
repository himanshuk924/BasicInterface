package InterfaceAssignmentQ1;

public interface B extends A{
	default void disp2() {
		System.out.println("this is interface B");
	}
}
