package basic.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String string = "Hello java";

        DecoUtil2.deco(string); // Using static method directly from DecoUtil2
        String decoString = DecoUtil2.deco(string);

        System.out.println("decoString = " + decoString);

    }

}
