
import afds.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Principal t = new Principal();
        //t.faca2();
        t.faca3();
    }

    /**
     * Esse método lê o arquivo AFD.XML e imprime seu conteudo formatado.
     *
     * @param w
     */
    @SuppressWarnings("empty-statement")
    public void faca1(String w) {
        AFD a = new AFD();
        try {
            a.ler("./test/AFD.XML");
            System.out.println("AFD M = " + a);
            if (a.Aceita(w)) {
                System.out.println("Aceitou " + w);
            }
            System.out.println("Pe(q0," + w + "):" + a.pe(a.getEstadoInicial(), w));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void faca2() {
        AFN a = new AFN();
        try {
            a.ler("./test/AFN01.XML");
            System.out.println("AFN M = " + a);
            
            Scanner reader = new Scanner(System.in);
            System.out.print("Tamanho: ");
            int n = reader.nextInt();
            System.out.println("Todas as palavras de tamanho " + n + " que a linguagem aceita");
            a.printAllWords(n);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void faca3() {
        AFN a = new AFN();
        try {
            a.ler("./test/AFN01.XML");
            System.out.println("AFN M = " + a);
            
            //Scanner reader = new Scanner(System.in);
            System.out.print("Tamanho: ");
            int n = 50; //reader.nextInt();
            System.out.println("Todas as palavras de tamanho " + n + " que a linguagem aceita");
            
            HashSet<String> allWords = a.getAllWords(n);
            System.out.println(allWords.size());
            
//            for (String word : allWords) {
//                System.out.println(word);
//            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
