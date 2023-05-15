//Nome: José Augusto Gomes Martinho - RA: 2349647
public class Principal {
  public static void main(String[] args) {
    Leitura leitura = new Leitura();
    Picole picole = new Picole();
    Casquinha casquinha = new Casquinha();
    Pote pote = new Pote();
    
    String tipo = "";

    tipo = leitura.entDados("Qual o tipo de sorvete?\n[1] - Picole\n[2] - Casquinha\n[3] - Pote");

    switch (tipo) {
      case "1":
        picole.setSaborPrincipal(leitura.entDados("Qual o sabor principal do picole?"));
        picole.setSaborSecundario(leitura.entDados("Qual o sabor secundario do picole?"));
        picole.setPreco(Double.parseDouble(leitura.entDados("Qual o preco do picole?")));
        try {
          picole.setPeso(Integer.parseInt(leitura.entDados("Qual o peso do picole?")));
        } catch (PesoNegativoException pne) {
          pne.impPesoNegativo();
          picole = (Picole) pne.corrigePesoNegativoSorvete(picole);
        }
        picole.getAdicional().setNome(leitura.entDados("Qual o nome do adicional?"));
        picole.getAdicional().setValor(Double.parseDouble(leitura.entDados("Qual o valor do adicional?")));
        picole.setFormato(leitura.entDados("Qual o formato do picole?"));

        String opcPl = leitura.entDados("O picole eh pinta lingua?\n[1] - SIM\n[2] - NAO");

        if (opcPl.equals("1")) {
          picole.setEhPintaLingua(true);
        } else {
          picole.setEhPintaLingua(false);
        } 

        System.out.println("SABOR PRINCIPAL DO PICOLE: " + picole.getSaborPrincipal());
        System.out.println("SABOR SECUNDARIO DO PICOLE: " + picole.getSaborSecundario());
        System.out.println("PRECO DO PICOLE: " + picole.getPreco());
        System.out.println("PESO DO PICOLE: " + picole.getPeso());
        System.out.println("NOME DO ADICIONAL: " + picole.getAdicional().getNome());
        System.out.println("VALOR DO ADICIONAL: " + picole.getAdicional().getValor());
        System.out.println("FORMATO DO PICOLE: " + picole.getFormato());
        
        if (picole.getEhPintaLingua()) {
          System.out.println("EH PINTA LINGUA");
        } else {
          picole.getEhPintaLingua();
          System.out.println("NAO EH PINTA LINGUA");
        }
        break;
      case "2":
        casquinha.setSaborPrincipal(leitura.entDados("Qual o sabor principal da casquinha?"));
        casquinha.setSaborSecundario(leitura.entDados("Qual o sabor secundario da casquinha?"));
        casquinha.setPreco(Double.parseDouble(leitura.entDados("Qual o preco da casquinha?")));
        try {
            casquinha.setPeso(Integer.parseInt(leitura.entDados("Qual o peso da casquinha?")));
        } catch (PesoNegativoException pne) {
          pne.impPesoNegativo();
          casquinha = (Casquinha) pne.corrigePesoNegativoSorvete(casquinha);
        }
        casquinha.getAdicional().setNome(leitura.entDados("Qual o nome do adicional?"));
        casquinha.getAdicional().setValor(Double.parseDouble(leitura.entDados("Qual o valor do adicional?")));
        casquinha.setSaborCasquinha(leitura.entDados("Qual o sabor da casquinha?"));
        casquinha.setTemperatura(leitura.entDados("Qual a temperatura da casquinha?"));

        System.out.println("SABOR PRINCIPAL DA CASQUINHA: " + casquinha.getSaborPrincipal());
        System.out.println("SABOR SECUNDARIO DA CASQUINHA: " + casquinha.getSaborSecundario());
        System.out.println("PRECO DA CASQUINHA: " + casquinha.getPreco());
        System.out.println("PESO DA CASQUINHA: " + casquinha.getPeso());
        System.out.println("NOME DO ADICIONAL: " + casquinha.getAdicional().getNome());
        System.out.println("VALOR DO ADICIONAL: " + casquinha.getAdicional().getValor());
        System.out.println("SABOR DA CASQUINHA: " + casquinha.getSaborCasquinha());
        System.out.println("TEMPERATURA DA CASQUINHA: " + casquinha.getTemperatura());
        casquinha.calcularQualidade();
        break;
      case "3":
        pote.setSaborPrincipal(leitura.entDados("Qual o sabor principal do pote?"));
        pote.setSaborSecundario(leitura.entDados("Qual o sabor secundario do pote?"));
        pote.setPreco(Double.parseDouble(leitura.entDados("Qual o preco do pote?")));
        try {
            pote.setPeso(Integer.parseInt(leitura.entDados("Qual o peso do pote?")));
        } catch (PesoNegativoException pne) {
          pne.impPesoNegativo();
          pote = (Pote) pne.corrigePesoNegativoSorvete(pote);
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
