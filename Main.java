//Importa uma biblioteca que tem como função gerar um Scanner para ter um input de dados direto com o usuário.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mensagem fixa inicial
        System.out.println("---Bem vindo ao Banco Zuco!---\nFaça já seu cadastro:");
        //Inicia um Scanner
        Scanner scanner = new Scanner(System.in);
        //Cria o método 'conta' para acrecentar dados na Class 'ContaBancaria'.
        ContaBancaria conta = new ContaBancaria();
        //Mensagem para informar o usuário oque ele deve digitar.
        System.out.println("Digite o nome: ");
        //Cria uma variável de linha de scanner que captura mensagens enviadas nela.
        String nome= scanner.nextLine();
        //Ultiliza a variável criada a cima para enviar dados para 'conta' ('ContaBancaria').
        conta.setNome(nome);
        System.out.println("Digite sua idade: ");
        int idade= scanner.nextInt();
        conta.setIdade(idade);
        //Cria uma variável inteira para se ultilizar no método de escolha abaixo.
        int opcao;

        //Caso a idade informada pelo usuário seja maior de 18 o usuário terá acesso as funções do banco.
        if (conta.getIdade() > 18) {
            //'do' define que tudo que está dentro de suas {} será realizado e depois ele verificará se seu valor continua positivo no while().
            do{
                //Gera uma mensagem de opções visuais para o usuário fazer a escolha de opções.
                System.out.println("\n-----Banco Zuco-----\n Opções:\n 1- Consultar Saldo\n 2-Depositar\n 3- Saque\n 0- Sair\n Digite a opção desejada: ");
                //A variável criada acima se torna uma linha de scanner e apartir do momento todo valor inteiro digitado na linha será atribuído a variável.
                opcao =scanner.nextInt();
                //Switch é como uma serie de If´s, abaixo vamos ver que temos varios casos se o valor da variável 'opcao' seja 1, 2, 3 ou 0 cada um terá seu modo.
                switch (opcao) {
                        //Define que se o valor da variável 'opcao' seja 1 ele irá puxar do método 'conta' ou seja da Class 'ContaBancaria' o obejeto 'exibirDados'.
                    case 1:
                        conta.exibirDados();
                        //Break quebra o caso depois que executado.
                        break;
                    case 2:
                            //Printa uma mensagem de instrução a que o usuário deve digitar.
                            System.out.println("Digite o valor de deposito: ");
                            //Cria a variável depoisito que será uma linha de scanner e reberá dados. 
                            double deposito = scanner.nextDouble();
                            //Define que a variável criada acima deve ser atribuída a ao método 'Depositar' da class 'ContaBancaria'.
                            conta.Depositar(deposito);
                            break;
                    case 3:
                        System.out.println("Digite o valor de saque: ");
                        double saque = scanner.nextDouble();
                        conta.Sacar(saque);
                        break;
                        //Caso o valor digitado for 0 ele somente executará uma mensagem "Saindo...".
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    //Se o valor diigitado for diferente de todos esses casos ele mandará o usuário digitar novamente.
                    default:
                        System.out.println("Opção invalida, Digite novamente");
                }
                //Caso a opcao seja 0 o 'do' se torna falso e acaba o programa.
            }while(opcao!=0);
        //Caso o usuário digitar em sua idade um valor abaixo de 18 o programa não executará as funções acima e somente dará a mensagem: "nomedapessoa seu acesso foi negado :( \n (quebra linha) por conta de sua idade ser menor que 18..."
        }else{
            System.out.printf("%s seu acesso foi negado :(\n por conta de sua idade ser menor que 18...");
        }
        //Fecha o scanner.
        scanner.close();

    }
}
