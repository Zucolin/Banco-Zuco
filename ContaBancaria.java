public class ContaBancaria {
    private String nome;
    private int idade;
    private double saldo;
    double Saque;

    public void setNome(String nome) {
        this.nome = nome;
    }
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
    public void Depositar(double saldo) {
        this.saldo += saldo;
    }
    public void Sacar(double saldo) {
        if (saldo >= Saque) {
            this.saldo -= saldo;
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
    public double getSaque() {
        return Saque;
    }
    public void exibirDados() {
        System.out.printf("Olá "+nome+"!, Seu saldo atualmente é de: R$" + saldo);
    }
}
