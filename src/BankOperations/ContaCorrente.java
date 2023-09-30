package BankOperations;

public class ContaCorrente extends Conta implements Tributavel{
  public ContaCorrente(double saldo) {
    super(saldo);
  }

  @Override
  public double calculaTributos() {
    double saldoAtual = getSaldo();
    double TAXA_CONTA_CORRENTE = 0.01;

    double tributos = saldoAtual*TAXA_CONTA_CORRENTE;

    System.out.println("Os tributos da conta " + this.getId() + " : R$" + tributos);

    return tributos;
  }
}
