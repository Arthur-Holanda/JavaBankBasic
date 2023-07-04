
import java.util.Scanner;

public class JavaBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 2000.59;
        String nome  = "Connor Kent";
        String tipoConta = "Corrente";

        System.out.println("**Bem vindo ao JavaBank**");
        System.out.println("*************************\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n***********************");

        while(true){
            System.out.println("**Selecione a opção desejada**");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber um pix");
            System.out.println("3- fazer um pix");
            System.out.println("0- Sair");
            int opcao = scanner.nextInt();
            double pix;
            switch (opcao) {
                case 1:
                    System.out.println("*************************\n");
                    System.out.println("Saldo atual: " +  saldo);
                    System.out.println("\n***********************");
                    break;
                case 2:
                    System.out.println("Valor da quantia recebida: ");
                    pix = scanner.nextDouble();
                    saldo += pix;
                    System.out.println("Operação realizada com sucesso!");
                    break;
                case 3:
                    System.out.println("Valor da quantia que sera transferida: ");
                    pix = scanner.nextDouble();
                    if(pix <= saldo)
                    {
                        saldo -= pix;
                        System.out.println("Operação realizada com sucesso!");
                    }
                    else
                    {
                        System.out.println("Operação não permitida, valor maior que o saldo atual!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo... bye bye");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida"); 
                    break;
            }
        }
    }
}