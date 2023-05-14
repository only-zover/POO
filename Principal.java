//Nome: José Augusto Gomes Martinho - RA: 2349647
public class Principal {
  public static void main(String[] args) {
    Leitura leitura = new Leitura();
    Picole p = new Picole();
    Casquinha c = new Casquinha();
    Pote pote = new Pote();
    
    String tipo = "";

    tipo = leitura.entDados("Qual o tipo de sorvete?\n[1] - Picole\n[2] - Casquinha\n[3] - Pote");

    switch (tipo) {
      case "1":
        p.setSaborPrincipal(leitura.entDados("Qual o sabor principal do picole?"));
        p.setSaborSecundario(leitura.entDados("Qual o sabor secundario do picole?"));
        p.setPreco(Double.parseDouble(leitura.entDados("Qual o preco do picole?")));
        try {
          p.setPeso(Integer.parseInt(leitura.entDados("Qual o peso do picole?")));
        } catch (PesoNegativoException pne) {
          pne.impPesoNegativo();
          p = (Picole) pne.corPesoNegativoSorvete(p);
        }
        p.getAdicional().setNome(leitura.entDados("Qual o nome do adicional?"));
        p.getAdicional().setValor(Double.parseDouble(leitura.entDados("Qual o valor do adicional?")));
        p.setFormato(leitura.entDados("Qual o formato do picole?"));
        p.setEhPintaLingua(leitura.entDados("O picole eh pinta lingua?"));

        System.out.println("SABOR PRINCIPAL DO PICOLE: " + p.getSaborPrincipal());
        System.out.println("SABOR SECUNDARIO DO PICOLE: " + p.getSaborSecundario());
        System.out.println("PRECO DO PICOLE: " + p.getPreco());
        System.out.println("PESO DO PICOLE: " + p.getPeso());
        System.out.println("NOME DO ADICIONAL: " + p.getAdicional().getNome());
        System.out.println("VALOR DO ADICIONAL: " + p.getAdicional().getValor());
        System.out.println("FORMATO DO PICOLE: " + p.getFormato());
        System.out.println("EH PINTA LINGUA: " + p.getEhPintaLingua());
        break;
      case "2":
        c.setSaborPrincipal(leitura.entDados("Qual o sabor principal da casquinha?"));
        c.setSaborSecundario(leitura.entDados("Qual o sabor secundario da casquinha?"));
        c.setPreco(Double.parseDouble(leitura.entDados("Qual o preco da casquinha?")));
        try {
            c.setPeso(Integer.parseInt(leitura.entDados("Qual o peso da casquinha?")));
        } catch (PesoNegativoException pne) {
          pne.impPesoNegativo();
          c = (Casquinha) pne.corPesoNegativoSorvete(c);
        }
        c.getAdicional().setNome(leitura.entDados("Qual o nome do adicional?"));
        c.getAdicional().setValor(Double.parseDouble(leitura.entDados("Qual o valor do adicional?")));
        c.setSaborCasquinha(leitura.entDados("Qual o sabor da casquinha?"));
        c.setTemperatura(leitura.entDados("Qual a temperatura da casquinha?"));

        System.out.println("SABOR PRINCIPAL DA CASQUINHA: " + c.getSaborPrincipal());
        System.out.println("SABOR SECUNDARIO DA CASQUINHA: " + c.getSaborSecundario());
        System.out.println("PRECO DA CASQUINHA: " + c.getPreco());
        System.out.println("PESO DA CASQUINHA: " + c.getPeso());
        System.out.println("NOME DO ADICIONAL: " + c.getAdicional().getNome());
        System.out.println("VALOR DO ADICIONAL: " + c.getAdicional().getValor());
        System.out.println("SABOR DA CASQUINHA: " + c.getSaborCasquinha());
        System.out.println("TEMPERATURA DA CASQUINHA: " + c.getTemperatura());
        c.calcularQualidade();
        break;
      case "3":
        pote.setSaborPrincipal(leitura.entDados("Qual o sabor principal do pote?"));
        pote.setSaborSecundario(leitura.entDados("Qual o sabor secundario do pote?"));
        pote.setPreco(Double.parseDouble(leitura.entDados("Qual o preco do pote?")));
        try {
            pote.setPeso(Integer.parseInt(leitura.entDados("Qual o peso do pote?")));
        } catch (PesoNegativoException pne) {
          pne.impPesoNegativo();
          pote = (Pote) pne.corPesoNegativoSorvete(pote);
        }
        pote.getAdicional().setNome(leitura.entDados("Qual o nome do adicional?"));
        pote.getAdicional().setValor(Double.parseDouble(leitura.entDados("Qual o valor do adicional?")));
        pote.setVolume(Integer.parseInt(leitura.entDados("Qual o volume do pote?")));
        pote.setMarca(leitura.entDados("Qual a marca do pote?"));

        System.out.println("SABOR PRINCIPAL DO POTE: " + pote.getSaborPrincipal());
        System.out.println("SABOR SECUNDARIO DO POTE: " + pote.getSaborSecundario());
        System.out.println("PRECO DO POTE: " + pote.getPreco());
        System.out.println("PESO DO POTE: " + pote.getPeso());
        System.out.println("NOME DO ADICIONAL: " + pote.getAdicional().getNome());
        System.out.println("VALOR DO ADICIONAL: " + pote.getAdicional().getValor());
        System.out.println("VOLUME DO POTE: " + pote.getVolume());
        System.out.println("MARCA DO POTE: " + pote.getMarca());
        pote.calcularQualidade();
        break;
      default:
        System.out.println("Opcao invalida!");
        break;
    }
  }
}
