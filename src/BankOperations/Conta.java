package BankOperations;

import java.util.UUID;

public class Conta {
  private final UUID id;
  private double saldo;

  public Conta(double saldo) {
    this.id = UUID.randomUUID();
    this.saldo = saldo;
  }

  public UUID getId() {
    return this.id;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void printSaldo() {
    System.out.println("A conta " + this.getId() + " possui R$" + this.getSaldo());
  }

  public double sacar (double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido!");

      return 0;
    }

    double saldoConta = this.getSaldo();

    if (saldoConta <= 0) {
      System.out.println("A conta nao possui saldo positivo!");

      return 0;
    }

    if (valor > saldoConta) {
      System.out.println("Saldo insuficiente!");

      return 0;
    }

    this.saldo = this.saldo - valor;

    if (this.saldo < 0) {
      System.out.println("Erro ao sacar!");

      return 0;
    }

    return valor;
  }

  public double depositar (double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido!");

      return 0;
    }

    double saldoConta = this.getSaldo();

    this.saldo = saldoConta + valor;

    return getSaldo();
  }
}
