public class LambdaComInterface {

    public interface InterfaceQaulquer {
        String fazerQlqCoisa(String param1, String param2);
    }

    public static void main(String[] args) {
        InterfaceQaulquer ic = (a, b) -> a.concat(" - ").concat(b);
        System.out.println(ic.fazerQlqCoisa("Diego", "Vogel"));
    }
}

