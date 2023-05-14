//Nome: José Augusto Gomes Martinho - RA: 2349647
public abstract class Sorvete {

  private String saborPrincipal;
  private String saborSecundario;
  private double preco;
  private int peso;

  public Adicional adicional;

  public Sorvete() {
    saborPrincipal = "";
    saborSecundario = "";
    preco = 0;
    peso = 0;
    adicional = new Adicional();
  }
  // Sobrecarga
  public Sorvete(String saborPrincipal, String saborSecundario, double preco, int peso, Adicional adicional) {
    this.saborPrincipal = saborPrincipal;
    this.saborSecundario = saborSecundario;
    this.preco = preco;
    this.peso = peso;
    this.adicional = adicional;
  }

  public String getSaborPrincipal() {
    return saborPrincipal;
  }

  public void setSaborPrincipal(String saborPrincipal) {
    this.saborPrincipal = saborPrincipal;
  }

  public String getSaborSecundario() {
    return saborSecundario;
  }

  public void setSaborSecundario(String saborSecundario) {
    this.saborSecundario = saborSecundario;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double quantidade) {
    this.preco = quantidade;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) throws PesoNegativoException {
    if (peso < 0) {
      throw new PesoNegativoException();
    } else {
      this.peso = peso;
    }
  }

  public Adicional getAdicional() {
    return adicional;
  }

  public void setAdicional(Adicional adicional) {
    this.adicional = adicional;
  }
}
