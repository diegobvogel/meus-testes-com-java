import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class ValidParenteses {

    public static void main(String[] args) {
        String s = "[([]])";
        ValidParenteses vp = new ValidParenteses();
        boolean resultado = vp.isValid(s);
        System.out.println(resultado);
    }

    public boolean isValid(String s) {
        Map<Character, Character> fechadores = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Deque<Character> pilha = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (fechadores.containsValue(c)) {
                pilha.push(c);
            } else {
                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();

                if (topo != fechadores.get(c)) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }
    
}
