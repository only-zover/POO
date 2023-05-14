//Nome: José Augusto Gomes Martinho - RA: 2349647
public class Adicional {
    
    private String nome;
    private double valor;

    public Adicional() {}
    // Sobrecarga
    public Adicional(String nome, double preco){
        this.nome = nome;
        this.valor = preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setValor(double preco){
        this.valor = preco;
    }
}    
