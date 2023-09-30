package BankOperations;

import java.util.UUID;

public class SeguroDeVida implements Tributavel {
  private final UUID id;

  public SeguroDeVida() {
    this.id = UUID.randomUUID();
  }

  public UUID getId() {
    return this.id;
  }

  @Override
  public double calculaTributos() {
    final double SEGURO_DE_VIDA_TRIBUTO = 42;

    System.out.println("Os tributos do seguro de vida " + this.getId() + " : R$" + SEGURO_DE_VIDA_TRIBUTO);


    return SEGURO_DE_VIDA_TRIBUTO;
  }
}
