package Db;

import java.sql.*;

public class DbService {
  private final Connection conn;

  public DbService(String connectionString, String user, String password) throws SQLException {
    this.conn = createConnection(connectionString, user, password);
  }

  private Connection createConnection(String connectionString, String user, String password) throws SQLException {
    return DriverManager.getConnection(connectionString, user, password);
  }

  private Connection getConnection() {
    return this.conn;
  }

  public void createTable(String createString) throws SQLException {
    if (createString == null || createString.length() <= 6 || createString.trim().isEmpty()) {
      throw new Error("Query de criação de tabela errada!");
    }

    try (Statement st = getConnection().createStatement()) {
      st.executeUpdate(createString);
    } catch (SQLException error) {
      System.err.println("Erro ao criar a tabela: " + error.getMessage());
      throw error;
    }
  }

  public void insertPessoasIntoPessoaTable(Pessoa[] iterable) throws SQLException {
    StringBuilder query = new StringBuilder("insert into pessoa (id, nome, quantidadeAcesso, naturalidade) values ");

    for (Pessoa pessoa : iterable) {
      query.append(String.format("('%s', '%s', %d, '%s'), ", pessoa.getId(), pessoa.getNome(), pessoa.getQuantidadeAcesso(), pessoa.getNaturalidade()));
    }
    query.delete(query.length() - 2, query.length() - 1);
    query.append(";");

    try (Statement st = getConnection().createStatement()) {
      st.executeUpdate(query.toString());
    } catch (SQLException error) {
      System.err.println("Erro ao inserir dados na tabela: " + error.getMessage());
    }
  }

  public void selectPersonsFromPessoa() throws SQLException {
    String query = "select * from pessoa\n";

    try (Statement st = getConnection().createStatement()) {
      System.out.println("Query: %s".formatted(query));
      ResultSet resultSet = st.executeQuery(query);

      while (resultSet.next()) {
        String id = resultSet.getString("id");
        String nome = resultSet.getString("nome");
        int quantidadeAcesso = resultSet.getInt("quantidadeAcesso");
        String naturalidade = resultSet.getString("naturalidade");

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Acesso: " + quantidadeAcesso);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println();
      }

      resultSet.close();
    } catch (SQLException error) {
      System.err.println("Erro ao consultar a tabela: " + error.getMessage());
    }
  }
}
