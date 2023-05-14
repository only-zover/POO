//Nome: José Augusto Gomes Martinho - RA: 2349647
public final class Pote extends Sorvete implements Calcular {
    
    private int volume;
    private String marca;

    public Pote() {}
    // Sobrecarga
    public Pote(String saborPrincipal, String saborSecundario, double preco, int peso, Adicional adicional, int volume, String marca) {
        super(saborPrincipal, saborSecundario, preco, peso, adicional);
        this.volume = volume;
        this.marca = marca;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    // Sobrescrita
    @Override
    public void calcularQualidade() {
        if (getPeso() + getPreco() > 20) {
            System.out.println("Qualidade boa!");
        } else {
            System.out.println("Qualidade ruim!");
        }
    }
}
