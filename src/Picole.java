//Nome: José Augusto Gomes Martinho - RA: 2349647
public final class Picole extends Sorvete {
    
    private String formato;
    private boolean ehPintaLingua;

    public Picole() {}
    // Sobrecarga
    public Picole(String saborPrincipal, String saborSecundario, double preco, int peso, Adicional adicional, String formato, boolean ehPintaLingua) {
        super(saborPrincipal, saborSecundario, preco, peso, adicional);
        this.formato = formato;
        this.ehPintaLingua = ehPintaLingua;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean getEhPintaLingua() {
        return ehPintaLingua;
    }

    public void setEhPintaLingua(boolean ehPintaLingua) {
        this.ehPintaLingua = ehPintaLingua;
    }
}
