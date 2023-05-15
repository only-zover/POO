//Nome: José Augusto Gomes Martinho - RA: 2349647
public class PesoNegativoException extends Exception {

  Leitura leitura = new Leitura();

  public void impPesoNegativo() {
    System.out.println("Peso negativo");
  }

  public Sorvete corrigePesoNegativoSorvete(Sorvete sorvete) {

    try {
      sorvete.setPeso(Integer.parseInt(leitura.entDados("Peso invalido, digite um peso maior que 0")));
    } catch (PesoNegativoException pne) {
      pne.impPesoNegativo();
      sorvete = pne.corrigePesoNegativoSorvete(sorvete);
    } 

    return sorvete;
  }
}
