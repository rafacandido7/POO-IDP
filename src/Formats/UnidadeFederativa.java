package Formats;

import org.json.*;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class UnidadeFederativa implements Formats {
  private final String nome;
  private final String sigla;
  private final String capital;
  private final String coordenadasGeograficas;
  private final long populacao;
  private final double area;
  private final double densidade;
  private final String[] tresMaioresCidades;

  public UnidadeFederativa(String nome, String sigla, String capital, String coordenadasGeograficas, long populacao, double area, String[] tresMaioresCidades) {
    this.nome = nome;
    this.sigla = sigla;
    this.capital = capital;
    this.coordenadasGeograficas = coordenadasGeograficas;
    this.populacao = populacao;
    this.area = area;
    this.densidade = populacao / area;
    this.tresMaioresCidades = tresMaioresCidades;
  }

  @Override
  public String toJson() {
    JSONObject jsonUF = new JSONObject();
    jsonUF.put("nome", this.nome);
    jsonUF.put("sigla", this.sigla);
    jsonUF.put("capital", this.capital);
    jsonUF.put("coordenadasGeograficas", this.coordenadasGeograficas);
    jsonUF.put("populacao", this.populacao);
    jsonUF.put("area", this.area);
    jsonUF.put("densidade", this.densidade);
    jsonUF.put("tresMaioresCidades", this.tresMaioresCidades);

    return jsonUF.toString();
  }

  @Override
  public String toYaml() {
    Map<String, Object> ufData = new LinkedHashMap<>();
    ufData.put("nome", this.nome);
    ufData.put("sigla", this.sigla);
    ufData.put("capital", this.capital);
    ufData.put("coordenadasGeograficas", this.coordenadasGeograficas);
    ufData.put("populacao", this.populacao);
    ufData.put("area", this.area);
    ufData.put("densidade", this.densidade);
    ufData.put("tresMaioresCidades", Arrays.asList(this.tresMaioresCidades));

    DumperOptions options = new DumperOptions();
    options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
    options.setPrettyFlow(true);

    Yaml yaml = new Yaml(options);
    String yamlString = yaml.dump(ufData);

    return yamlString;
  }

  @Override
  public String toXml() {
    JSONObject jsonUF = new JSONObject();
    jsonUF.put("nome", this.nome);
    jsonUF.put("sigla", this.sigla);
    jsonUF.put("capital", this.capital);
    jsonUF.put("coordenadasGeograficas", this.coordenadasGeograficas);
    jsonUF.put("populacao", this.populacao);
    jsonUF.put("area", this.area);
    jsonUF.put("densidade", this.densidade);
    jsonUF.put("tresMaioresCidades", this.tresMaioresCidades);

    String xml = XML.toString(jsonUF);

    return xml;
  }
}
