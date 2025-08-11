package basic.poly.diamond;

public class Child implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Child's implementation of methodA from InterfaceA.");
    }

    @Override
    public void methodB() {
        System.out.println("Child's implementation of methodB from InterfaceB.");
    }

    public void methodCommon() {
        System.out.println("Child class specific method.");
    }
}
