package zipcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.tools.FileObject;

public class ZipCode {

    Map<Integer, String> zipCodeMap = new HashMap<>();
    Map<String, LinkedList<String>> nameWithCantonsMap = new HashMap<>(); // das genau anschauen, dann ist auch klar, was gebraucht wird!

    /**
     * Kreiert ein neues Zip-Code Objekt mit den in der Datei file übergebenen
     * Daten.
     */
    ZipCode(File file) throws FileNotFoundException {
        try {
            Scanner scanObj = new Scanner(file);
            while (scanObj.hasNextLine()) {
                String currlentLine = scanObj.nextLine();
                String[] splited = currlentLine.split(";");
                zipCodeMap.put(Integer.parseInt(splited[2]), splited[1]); //(int oder Integer geht nicht?)splited[2] typecast mit (type)

                //nameWithCantonsMap.put(splited[1], splited[0]);
                if (nameWithCantonsMap.containsKey(splited[1])) {
                    LinkedList<String> temp = nameWithCantonsMap.get(splited[1]);
                    temp.addLast(splited[0]); 
                    nameWithCantonsMap.put(splited[1], temp);                
                }else{
                    LinkedList<String> temp = new LinkedList<String>(); 
                    temp.addLast(splited[0]);
                    nameWithCantonsMap.put(splited[1], temp);
                }
                
                //nameWithCantonsMap.put(splited[1], new LinkedList<>().add(splited[0]));
            }
            scanObj.close();
        } catch (Exception e) {
            throw e;
        }
        
    }

    /**
     * Gibt den Namen des Ortes zu der übergebenen Postleitzahl zurück. Falls die
     * Postleitzahl nicht existiert, wird eine NoSuchElementException geworfen
     */
    String getNameForZipCode(int plz) throws NoSuchElementException {
        if (zipCodeMap.containsKey(plz)) {
            return zipCodeMap.get(plz);
        } else{
            throw new NoSuchElementException("No valid Zip-Code");
        }
    }

    /**
     * Gibt eine Liste mit allen Kantonen zurück, in denen der übergebene Ortsname
     * vorkommt. Falls der Ort nicht existiert wird eine leere Liste zurückgegeben.
     */
    LinkedList<String> getAllCantonsForName(String name) { //oder mit .getOrDefault(name, LinkedList<String>())
        if (nameWithCantonsMap.containsKey(name)) {
            return nameWithCantonsMap.get(name);
        }else{
            return new LinkedList<String>();
        }
        
    }

    public static void main(String[] args) {
        File fileObject = new File("uebung011/src/test/resources/Adressdaten.csv");
        try {
            ZipCode zippo = new ZipCode(fileObject);
            System.out.println(zippo.getNameForZipCode(5610));
            System.out.println(zippo.getAllCantonsForName("Abtwils"));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        
        
        
    }

}
