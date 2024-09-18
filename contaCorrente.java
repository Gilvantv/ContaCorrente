package contaCorrente;

public class contaCorrente {
    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private double saldo;


    public contaCorrente(String numeroConta, String numeroAgencia, String nomeCliente, String dataNascimento, double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldo = saldo;
    }



    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("saque realizado com sucesso😁. novo saldo: " + saldo);
        } else {
            System.out.println("saldo insuficiente para saque.");
        }
    }

    public void transferir(double valor, contaCorrente destino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("transfereencia realizada com sucesso😁.");
        } else {
            System.out.println("saldo insuficiente para transferencia😒.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("deposito realizado com sucesso. novo saldo🤩: " + saldo);
        } else {
            System.out.println("Valor invalido para deposito😒.");
        }
    }

    public void cancelarConta(String justificativa) {
        System.out.println("conta cancelada. Justificativa: " + justificativa);
    }

    public void consultarSaldo() {
        System.out.println("saldo atual: " + saldo);
    }

    public static void main(String[] args) {

        contaCorrente conta = new contaCorrente("19344", "77892", "gilvan da silva tolentino", "04/05/2005", 30000.00);
        conta.consultarSaldo();
        conta.sacar(1000.00);
        conta.transferir(20000.00, new contaCorrente("12345", "98765", "destinatario", "01/01/2000", 0.0));
        conta.depositar(1000.00);
        conta.cancelarConta("encerramento por mudança de banco🤬.");
    }
}
