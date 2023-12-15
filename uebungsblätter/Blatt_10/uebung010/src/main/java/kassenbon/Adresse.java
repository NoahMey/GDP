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
    

    // private String center(int kassenbonBreite, String string){
    //     String returnString = "";
    //     int gesamtleerschlag = kassenbonBreite - string.length();
    //     int vorLeerschlag = (gesamtleerschlag/2)-1; //-1, da noch | am Anfang
    //     int nachLeerschlag = vorLeerschlag;
    //     if ((gesamtleerschlag % 2 != 0) &&(string.length() %2 != 0)) { //1element auf 3 felder= | |x| | vs 2 elemente auf 2 felder = | |x|x| |
    //         nachLeerschlag += 1;
    //     }
    //     returnString = String.format("|%"+vorLeerschlag+"s"+string+"%"+nachLeerschlag+"s| \n", "", "");
    //     return returnString;
    // }

    String center(int kassenbonBreite, String string){
        int vorschlag = (kassenbonBreite - string.length())/2;
        int nachschlag = kassenbonBreite-string.length()-vorschlag;
        return String.format("|%"+vorschlag+"s"+string+"%"+nachschlag+"s| \n", "", "");
    }

    public void print(int kassenbonBreite){
        String printString = "";
        printString += center(kassenbonBreite, veranstaltung);
        printString += center(kassenbonBreite, organisation);
        printString += center(kassenbonBreite, strasse+" "+nummer);
        printString += center(kassenbonBreite, plz+" "+ort);
        //printString -= "\n"; das würdie ich hier gerne tun ;)
        System.out.println(printString.substring(0, printString.length()-2)); // workaround mit substring
        
        //System.out.println(String.format("|%" + einugVerans + "s" +"%" +(veranstaltung.length()/2-2)+ "s|", veranstaltung, ""));
        //System.out.println(String.format("|%" + einzugOrg + "s" +"%" +(einzugOrg.length()/2-2)+ "s|", einzugOrg, ""));
        
    }
    
}
