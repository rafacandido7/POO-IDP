package ComercialOperationsAndFee;
import java.util.Scanner;
import java.util.UUID;

public class Product {
    private Scanner scanner = new Scanner(System.in);
    private final UUID id;
    private final String name;
    private final String description;
    private final double basePrice;
    private final double issFee;
    private final double ipiFee;
    private final double icmsFee;
    private final double price;

    private String getName() {
        System.out.println("Digite o nome do Produto a cadastrar:");
        return scanner.nextLine();
    }

    private String getDescription() {
        System.out.println("Digite a descrição do Produto:");
        return scanner.nextLine();
    }

    private double getBasePrice() {
        System.out.println("Digite o valor de custo do Produto:");
        return scanner.nextDouble();
    }

    public Product() {
        this.id = UUID.randomUUID();
        this.name = getName();
        this.description = getDescription();
        this.basePrice = getBasePrice();

        ISS iss = new ISS();
        this.issFee = iss.getISSFee(basePrice);

        IPI ipi = new IPI();
        this.ipiFee = ipi.getIPIFee(basePrice);

        ICMS icms = new ICMS();
        this.icmsFee = icms.getICMSFee(basePrice);

        this.price = this.basePrice + this.issFee + this.ipiFee + this.icmsFee;
    }

    public void printProductInfo() {
        System.out.println("-------------------------");
        System.out.println("Informações do Produto " + this.id);
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.println("Preço Base: R$" + basePrice);
        System.out.println("Taxa ISS (4.6%): R$" + issFee);
        System.out.println("Taxa IPI (25%): R$" + ipiFee);
        System.out.println("Taxa ICMS (17%): R$" + icmsFee);
        System.out.println("Preço Final: R$" + price);
        System.out.println("-------------------------");

    }
}
