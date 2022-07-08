
import afds.*;
import java.util.HashSet;

public class Principal {

    public static void main(String[] args) {        
        int n = 17;
        
        AFN a = new AFN();
        try {
            a.ler("./test/AFN01.XML");
            System.out.println("AFN M = " + a + "\n");       
            System.out.println("Todas as palavras de tamanho " + n + " que a linguagem aceita\n");
            
            long startTime = System.nanoTime();
            HashSet<String> byTransition = a.getAllWordsByTransition(n, false); // o booleano indica que nao desejamos printar 
            long byTransitionTime = System.nanoTime() - startTime;
            startTime = System.nanoTime();
            HashSet<String> byAccepting = a.getAllWordsByAccepting(n, false);
            long byAcceptingTime = System.nanoTime() - startTime;
            
            System.out.println("Usando o metodo de transicoes:");
            System.out.println("\t- Numero de palavras encontradas: " + byTransition.size());
            System.out.println("\t- Tempo necessario: " + byTransitionTime/1000000 + "ms");
            
            System.out.println("");
            
            System.out.println("Usando o metodo de aceitacao:");
            System.out.println("\t- Numero de palavras encontradas: " + byAccepting.size());
            System.out.println("\t- Tempo necessario: " + byAcceptingTime/1000000 + "ms");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
