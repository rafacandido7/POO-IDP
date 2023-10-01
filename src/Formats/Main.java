package Formats;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("JSON x YAML x XML\n");

    System.out.println("Escolha sua opcao:");
    System.out.println("Veiculo Eletrico   (1)");
    System.out.println("Unidade Federativa (2)");
    int option = scanner.nextInt();

    System.out.println("Escolha o formato:");
    System.out.println("JSON (1)");
    System.out.println("XML  (2)");
    System.out.println("YAML (3)");
    int format = scanner.nextInt();

    if (option == 1) {
      VeiculoEletrico veiculo = new VeiculoEletrico("Modelo1", "Marca1", 300, 150, 50000);

      if(format == 1)
          System.out.println(veiculo.toJson());

      if(format == 2)
          System.out.println(veiculo.toXml());

      if(format == 3)
          System.out.println(veiculo.toYaml());

    }

    if (option == 2) {
      String[] tresMaioresCidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte"};
      UnidadeFederativa uf = new UnidadeFederativa("São Paulo", "SP", "São Paulo", "23.5505° S, 46.6333° W", 45000000, 248219.481, tresMaioresCidades);

      if(format == 1)
        System.out.println(uf.toJson());

      if(format == 2)
        System.out.println(uf.toXml());

      if(format == 3)
        System.out.println(uf.toYaml());
      }
    }


}
