import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String titular;
    double saldo;

    public ContaTerminal() {
        preencherCadastro();
        System.out.println(toString());
    }

    private void preencherCadastro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta: ");
        this.numero = scanner.nextInt();
        System.out.println("Digite o agencia da conta: ");
        this.agencia = scanner.next();
        System.out.println("Digite o titular da conta: ");
        this.titular = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        this.saldo = scanner.nextDouble();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + getTitular() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() +", conta "+ getNumero()+" e seu saldo "+ getSaldo() +" já está disponível para saque";
    }
}
