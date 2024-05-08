public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays o índice inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice i = " + i + " é " + alunos[i]);
        }
    }
}
