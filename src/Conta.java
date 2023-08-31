public class Conta {

    String cliente;
    int agencia;
    int numero;
    double saldo;

    public void exibeConta() {
        System.out.println("------------------------------");
        System.out.println(this.cliente);
        System.out.println(this.numero);
        System.out.println(this.cliente);
        System.out.println(this.saldo);
        System.out.println("------------------------------");
    }
}
