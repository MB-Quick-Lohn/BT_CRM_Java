package de.quick.crm;

/**
 * zeigt auf der Konsole ein (oder zwei) Tabellen, die einen Überblick geben, wie sich die Kundenversionen aufteilen
 */
public class KundenService {
  public void zeigeVerteilungDerKundenversionen() {
    String fileContent = new KundenTxtFileLoader().getKundenTxt();

    System.out.println(fileContent);
  }
}
