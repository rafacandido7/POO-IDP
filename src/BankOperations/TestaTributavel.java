package BankOperations;

public class TestaTributavel {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(100);
    cc.printSaldo();
    double tributoCC = cc.calculaTributos();

    SeguroDeVida seguroDeVida = new SeguroDeVida();
    double tributoSeguroDeVida = seguroDeVida.calculaTributos();
  }
}
