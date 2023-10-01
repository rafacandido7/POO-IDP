package Formats;

import org.json.*;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.HashMap;
import java.util.Map;

class VeiculoEletricoData {
  private final String modelo;
  private final String marca;
  private final double autonomiaKm;
  private final double velocidadeMaximaKmh;
  private final double precoSugerido;

  public VeiculoEletricoData(String modelo, String marca, double autonomiaKm, double velocidadeMaximaKmh, double precoSugerido) {
    this.modelo = modelo;
    this.marca = marca;
    this.autonomiaKm = autonomiaKm;
    this.velocidadeMaximaKmh = velocidadeMaximaKmh;
    this.precoSugerido = precoSugerido;
  }
}

public class VeiculoEletrico implements Formats {
  private final String modelo;
  private final String marca;
  private final double autonomiaKm;
  private final double velocidadeMaximaKmh;
  private final double precoSugerido;

  public VeiculoEletrico(String modelo, String marca, double autonomiaKm, double velocidadeMaximaKmh, double precoSugerido) {
    this.modelo = modelo;
    this.marca = marca;
    this.autonomiaKm = autonomiaKm;
    this.velocidadeMaximaKmh = velocidadeMaximaKmh;
    this.precoSugerido = precoSugerido;
  }


  @Override
  public String toJson() {
    JSONObject jsonVeiculo = new JSONObject();
    jsonVeiculo.put("modelo", this.modelo);
    jsonVeiculo.put("marca", this.marca);
    jsonVeiculo.put("autonomiaKm", this.autonomiaKm);
    jsonVeiculo.put("velocidadeMaximaKmh", this.velocidadeMaximaKmh);
    jsonVeiculo.put("precoSugerido", this.precoSugerido);

    return jsonVeiculo.toString();
  }

  @Override
  public String toYaml() {
    Map<String, Object> veiculoData = new HashMap<>();
    veiculoData.put("modelo", this.modelo);
    veiculoData.put("marca", this.marca);
    veiculoData.put("autonomiaKm", this.autonomiaKm);
    veiculoData.put("velocidadeMaximaKmh", this.velocidadeMaximaKmh);
    veiculoData.put("precoSugerido", this.precoSugerido);

    DumperOptions options = new DumperOptions();
    options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
    options.setPrettyFlow(true);

    Yaml yaml = new Yaml(options);

    String yamlString = yaml.dump(veiculoData);

    return yamlString;
  }

  @Override
  public String toXml() {
    JSONObject jsonVeiculo = new JSONObject();
    jsonVeiculo.put("modelo", this.modelo);
    jsonVeiculo.put("marca", this.marca);
    jsonVeiculo.put("autonomiaKm", this.autonomiaKm);
    jsonVeiculo.put("velocidadeMaximaKmh", this.velocidadeMaximaKmh);
    jsonVeiculo.put("precoSugerido", this.precoSugerido);

    String xml = XML.toString(jsonVeiculo);

    return xml;
  }
}
