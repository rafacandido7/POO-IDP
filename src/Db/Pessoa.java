package Db;

import java.util.UUID;

public class Pessoa {

    private final UUID id;
    private final String nome;
    private final Integer quantidadeAcesso;
    private final String naturalidade;

    public Pessoa(UUID id, String nome, Integer quantidadeAcesso, String naturalidade) {
      this.id = UUID.randomUUID();
      this.nome = nome;
      this.quantidadeAcesso = quantidadeAcesso;
      this.naturalidade = naturalidade;
    }

    public String getId() {
      return this.id.toString();
    }
    public String getNome() {
      return this.nome;
    }

    public Integer getQuantidadeAcesso() {
      return this.quantidadeAcesso;
    }

    public String getNaturalidade() {
      return this.naturalidade;
    }
}
