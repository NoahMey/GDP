package kassenbon;

public class Adresse {
    

    String veranstaltung;
    String organisation;
    String strasse;
    String nummer;
    String plz;
    String ort;

    public Adresse(String veranstaltung, String organisation, String strasse, String nummer, String plz, String ort){
        this.veranstaltung = veranstaltung;
        this.organisation = organisation;
        this.strasse = strasse;
        this.nummer = nummer;
        this.plz = plz;
        this.ort = ort;
    }
    

    private String center(int kassenbonBreite, String string){
        String returnString = "";
        int einugVerans =  (kassenbonBreite - ((kassenbonBreite%string.length())/2)-2);
        returnString += String.format("|%" + einugVerans + "s" +"%" +(string.length()/2-2)+ "s|", string, "");
        returnString += "\n";
        return returnString;
    }

    public void print(){
        int kassenbonBreite = 30;
        String printString = "";
        // printString += center(kassenbonBreite, veranstaltung);
        // printString += center(kassenbonBreite, organisation);
        System.out.println(printString);
        
        
        //System.out.println(String.format("|%" + einugVerans + "s" +"%" +(veranstaltung.length()/2-2)+ "s|", veranstaltung, ""));
        //System.out.println(String.format("|%" + einzugOrg + "s" +"%" +(einzugOrg.length()/2-2)+ "s|", einzugOrg, ""));
        
    }
    
}
