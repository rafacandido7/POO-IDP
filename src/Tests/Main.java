package Tests;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ItemVenda item1 = new ItemVenda("Produto1", 50.0, 2.0);
    ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3.0);

    List<ItemVenda> itens = new ArrayList<>();
    itens.add(item1);
    itens.add(item2);

    Venda venda = new Venda("Cliente1", itens, 10.0);

    double valorTotal = venda.calcularValorTotal();
    System.out.println("Valor total da venda: R$ " + valorTotal);
  }
}
