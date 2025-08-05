package basic.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String string = "Hello java";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String decoString = decoUtil1.deco(string);
        System.out.println("decoString = " + decoString);

    }

}
