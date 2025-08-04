package basic.access.a;

public class AccessData {

    public int publicfield;
    int defaultfield;
    private int privatefield;

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    public void innerAccess() {
        System.out.println("AccessData의 innerAccess");
        publicfield = 100;
        defaultfield = 200;
        privatefield = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }


}
