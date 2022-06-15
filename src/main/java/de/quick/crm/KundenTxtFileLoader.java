package de.quick.crm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KundenTxtFileLoader {
  public String getKundenTxt() {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/kunden.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line).append("\n");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return sb.toString();
  }

}
