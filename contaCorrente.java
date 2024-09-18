package contacorrente;

public class contaCorrente {
    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private String saldo;

    public static void main(String[] args) {

        contaCorrente conta = new contaCorrente();
        conta.setnumeroConta("19344");
        conta.setnumeroAgencia("77892");
        conta.setnomeCliente("Gilvan da Silva Tolentono ");
        conta.setdataNascimento("04/05/2005");
        conta.setsaldo("30.000.00");

        System.out.println("Conta: " + conta.getnumeroConta());
        System.out.println("Agência: " + conta.getnumeroAgencia());
        System.out.println("Cliente: " + conta.getnomeCliente());
        System.out.println("Data de Nascimento: " + conta.getdataNascimento());
        System.out.println("Saldo: " + conta.getsaldo());
    }

    public String getnumeroConta() {
        return numeroConta;
    }

    public void setnumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getnumeroAgencia() {
        return numeroAgencia;
    }

    public void setnumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getnomeCliente() {
        return nomeCliente;
    }

    public void setnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getsaldo() {
        return saldo;
    }

    public void setsaldo(String saldo) {
        this.saldo = saldo;
    }
}
