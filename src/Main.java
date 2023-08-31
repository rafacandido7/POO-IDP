public class Main {
    public static void main(String[] args) {
        Conta alana = new Conta();
        alana.cliente = "Alana";
        alana.agencia = 1234;
        alana.numero = 5694;
        alana.saldo = 300.10;

        Conta paulo = new Conta();
        paulo.cliente = "Paulo";
        paulo.agencia = 5354;
        paulo.numero = 400;
        paulo.saldo = 12.1;

        Conta dylan = new Conta();
        dylan.cliente = "Dylan";
        dylan.agencia = 1100;
        dylan.numero = 57;
        dylan.saldo = 1205.74;

        alana.exibeConta();
        dylan.exibeConta();
        paulo.exibeConta();
    }
}
