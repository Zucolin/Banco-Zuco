import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Bem vindo ao Banco Zuco!---\nFaça já seu cadastro:");
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Digite o nome: ");
        String nome= scanner.nextLine();
        conta.setNome(nome);
        System.out.println("Digite sua idade: ");
        int idade= scanner.nextInt();
        conta.setIdade(idade);
        int opcao;

        if (conta.getIdade() > 18) {
            do{
                System.out.println("\n-----Banco Zuco-----\n Opções:\n 1- Consultar Saldo\n 2-Depositar\n 3- Saque\n 0- Sair\n Digite a opção desejada: ");
                opcao =scanner.nextInt();
                switch (opcao) {
                    case 1:
                        conta.exibirDados();
                        break;
                    case 2:
                            System.out.println("Digite o valor de deposito: ");
                            double deposito = scanner.nextDouble();
                            conta.Depositar(deposito);
                            break;
                    case 3:
                        System.out.println("Digite o valor de saque: ");
                        double saque = scanner.nextDouble();
                        conta.Sacar(saque);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção invalida, Digite novamente");
                }
            }while(opcao!=0);
        }else{
            System.out.printf("%s seu acesso foi negado :(\n por conta de sua idade ser menor que 18...");
        }
        scanner.close();

    }
}