package Db;

import java.sql.SQLException;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException {
        String paramsConexao = "jdbc:h2:mem:testdb";
        String usuario = "";
        String senha = "";

        DbService service = new DbService(paramsConexao, usuario, senha);

        String criacaoSql = "create table pessoa (id UUID primary key, nome varchar(150), quantidadeAcesso int, naturalidade varchar(75))";
        service.createTable(criacaoSql);

        Pessoa[] pessoas = new Pessoa[5];

        pessoas[0] = new Pessoa(UUID.randomUUID(), "Alice", 10, "Brasília");
        pessoas[1] = new Pessoa(UUID.randomUUID(), "Bob", 5, "São Paulo");
        pessoas[2] = new Pessoa(UUID.randomUUID(), "Charlie", 15, "Rio de Janeiro");
        pessoas[3] = new Pessoa(UUID.randomUUID(), "David", 8, "Belo Horizonte");
        pessoas[4] = new Pessoa(UUID.randomUUID(), "Eva", 12, "Porto Alegre");

      service.insertPessoasIntoPessoaTable(pessoas);

      service.selectPersonsFromPessoa();

      System.out.println("\nTchau, até a próxima\n\n\t\t:-)");
    }

}
