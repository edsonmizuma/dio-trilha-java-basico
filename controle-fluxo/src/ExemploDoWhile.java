import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        int contadorTocadas = 0; // Inicializa o contador de toques do telefone

        do {
            // Incrementa o contador de toques e imprime a mensagem
            contadorTocadas++;
            System.out.println("Telefone tocando    ---------------->    Toque número: " + contadorTocadas + ".");

        } while (tocando());

        System.out.println("O telefone tocou " + contadorTocadas + " vezes até ser atendido.");
        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(50) == 1;
        // System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }

}
