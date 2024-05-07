import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pelo scanner os valores digitados no terminal

        // Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome!");
        String sobrenome = scanner.next();

        double saldo = 237.48;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Olá, ");
        stringBuilder.append(nome);
        stringBuilder.append(" ");
        stringBuilder.append(sobrenome);
        stringBuilder.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
        stringBuilder.append(agencia);
        stringBuilder.append(", conta ");
        stringBuilder.append(conta);
        stringBuilder.append(" e seu saldo R$ ");
        stringBuilder.append(saldo);
        stringBuilder.append(" reais, já está disponível para saque.");
        System.out.println(stringBuilder);

    }
}
