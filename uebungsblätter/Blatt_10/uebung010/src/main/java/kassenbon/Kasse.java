package kassenbon;

public class Kasse {
  public static void main(String[] args) {
    // Wenn Sie den Kommentar um den folgenden Block entfernen,
    // sollte Ihr Programm kompilieren und einen Kassenzettel
    // wie im Aufgabenblatt beschrieben ausgeben.
    
    
    Adresse adresse = new Adresse(
        "Herbstmesse Basel",
        "Uni Basel",
        "Petersplatz",
        "1",
        "4001",
        "Basel"
    );
    Kassenbon b = new Kassenbon( adresse);
    b.add( new Artikel("Marroni",2,5.40));
    b.add( new Artikel("Magebrot",5,1.10));
    b.add( new Artikel("Glühwein",2,6));
    b.print();
    
  }
}
