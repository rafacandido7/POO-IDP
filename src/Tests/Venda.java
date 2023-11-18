package Tests;

import java.util.List;

public class Venda {
  private String cliente;
  private List<ItemVenda> itens;
  private double valorDesconto;

  public Venda(String cliente, List<ItemVenda> itens, double valorDesconto) {
    this.cliente = cliente;
    this.itens = itens;
    this.valorDesconto = valorDesconto;
  }

  public double calcularValorTotal() {
    double valorTotal = 0.0;

    for (ItemVenda item : itens) {
      valorTotal += item.calcularValorTotal();
    }

    valorTotal -= valorDesconto;

    return valorTotal < 0.0 ? 0.0 : valorTotal;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public List<ItemVenda> getItens() {
    return itens;
  }

  public void setItens(List<ItemVenda> itens) {
    this.itens = itens;
  }

  public double getValorDesconto() {
    return valorDesconto;
  }

  public void setValorDesconto(double valorDesconto) {
    this.valorDesconto = valorDesconto;
  }
}
