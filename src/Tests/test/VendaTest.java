package Tests.test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import Tests.ItemVenda;
import Tests.Venda;

public class VendaTest {

  @Test
  public void testCalcularValorTotalSemDesconto() {
    ItemVenda item1 = new ItemVenda("Produto1", 50.0, 2.0);
    ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3.0);
    List<ItemVenda> itens = new ArrayList<>();
    itens.add(item1);
    itens.add(item2);

    Venda venda = new Venda("Cliente1", itens, 0.0);

    assertEquals(50.0 * 2.0 + 30.0 * 3.0, venda.calcularValorTotal(), 0.001);
  }

  @Test
  public void testCalcularValorTotalComDesconto() {
    ItemVenda item1 = new ItemVenda("Produto1", 50.0, 2.0);
    ItemVenda item2 = new ItemVenda("Produto2", 30.0, 3.0);
    List<ItemVenda> itens = new ArrayList<>();
    itens.add(item1);
    itens.add(item2);

    Venda venda = new Venda("Cliente1", itens, 10.0);

    assertEquals((50.0 * 2.0 + 30.0 * 3.0) - 10.0, venda.calcularValorTotal(), 0.001);
  }

  @Test
  public void testCalcularValorTotalSemItens() {
    List<ItemVenda> itens = new ArrayList<>();
    Venda venda = new Venda("Cliente1", itens, 5.0);

    assertEquals(0.0, venda.calcularValorTotal(), 0.001);
  }
}
