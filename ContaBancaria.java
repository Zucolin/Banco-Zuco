public class ContaBancaria {
    //Todas variáveis em private, menos a Saque por se tratar de uma variável temporária.
    private String nome;
    private int idade;
    private double saldo;
    double Saque;

    //Set (Método que altera o valor da variável private), com contrutores para facilitar a troca de dados.
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Cria se uma variável para receber a variável private.
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public double getSaldo() {
        return saldo;
    }
    //Ao atribuir um valor no Depositar ele acrecenta ao saldo.
    public void Depositar(double saldo) {
        this.saldo += saldo;
    }
    //Caso o saldo seja maior que o saque ele irá diminuir o valor do saldo conforme o valor atribuido a variável Saque. 
    public void Sacar(double saldo) {
        if (saldo >= Saque) {
            this.saldo -= saldo;
        }else{
            //Caso o valor do Saque seja maior que o valor do saldo ele irá printar "Saldo insuficiente".
            System.out.println("Saldo insuficiente");
        }

    }
    public double getSaque() {
        return Saque;
    }
    //Esse objeto exibira os dados caso ultilizado, irá printar a mensagem "Olá nomedapessoa!, Seu saldo atualmente é de: R$0.00 (valor saldo). 
    public void exibirDados() {
        System.out.printf("Olá "+nome+"!, Seu saldo atualmente é de: R$" + saldo);
    }
}
