package Tests.test;

import static org.junit.Assert.*;

import Tests.ItemVenda;
import org.junit.Test;

public class ItemVendaTest {

  @Test
  public void testCalcularValorTotal() {
    ItemVenda item = new ItemVenda("Produto1", 50.0, 3.0);
    assertEquals(50.0 * 3.0, item.calcularValorTotal(), 0.001);
  }

  @Test
  public void testCalcularValorTotalComQuantidadeZero() {
    ItemVenda item = new ItemVenda("Produto1", 50.0, 0.0);

    assertEquals(0.0, item.calcularValorTotal(), 0.001);
  }

  @Test
  public void testCalcularValorTotalComValorUnitarioZero() {
    ItemVenda item = new ItemVenda("Produto1", 0.0, 3.0);

    assertEquals(0.0, item.calcularValorTotal(), 0.001);
  }
}
