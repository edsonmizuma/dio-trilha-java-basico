public class TiposVariaveis {
    public static void main(String[] args) {
        boolean condicao1 = false;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        } else if (condicao1 || condicao2) {
            System.out.println("umas das condições são verdadeiras");
        } else {
            System.out.println("Ambas são falsas");
        }
    }
}
