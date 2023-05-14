//Nome: José Augusto Gomes Martinho - RA: 2349647
public final class Casquinha extends Sorvete implements Calcular {

  private String saborCasquinha;
  private String temperatura;

  public Casquinha() {}
  // Sobrecarga
  public Casquinha(String saborPrincipal, String saborSecundario, double preco, int peso, Adicional adicional,
    String saborCasquinha, String temperatura) {
    super(saborPrincipal, saborSecundario, preco, peso, adicional);
    this.saborCasquinha = saborCasquinha;
    this.temperatura = temperatura;
  }

  public String getSaborCasquinha() {
    return saborCasquinha;
  }

  public void setSaborCasquinha(String saborCasquinha) {
    this.saborCasquinha = saborCasquinha;
  }

  public String getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(String temperatura) {
    this.temperatura = temperatura;
  }
  // Sobrescrita
  @Override
  public void calcularQualidade() {
    if (saborCasquinha.length() + getPreco() > 30) {
      System.out.println("Qualidade boa!");
    } else {
      System.out.println("Qualidade ruim!");
    }
  }
}
