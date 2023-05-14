//Nome: José Augusto Gomes Martinho - RA: 2349647
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

  public String entDados(String rotulo) {
    String input = "";

    InputStreamReader keyboard = new InputStreamReader(System.in);
    BufferedReader buff = new BufferedReader(keyboard);

    try {
      System.out.println(rotulo);
      input = buff.readLine();
    } catch (IOException ioe) {
      System.out.println("\nERRO de sistema: RAM - TECLADO");
    }

    return input;
  }
}
