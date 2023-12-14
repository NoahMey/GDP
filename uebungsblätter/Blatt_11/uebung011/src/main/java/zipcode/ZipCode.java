package zipcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.tools.FileObject;

public class ZipCode {

    Map<Integer, String> zipCodeMap = new HashMap<>();
    Map<String, LinkedList<String>> nameWithCantonsMap = new HashMap<>();

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
                nameWithCantonsMap.put(splited[1], new LinkedList<>().add(splited[0]));
            }
        } catch (Exception e) {
            throw e;
        }
        
    }

    /**
     * Gibt den Namen des Ortes zu der übergebenen Postleitzahl zurück. Falls die
     * Postleitzahl nicht existiert, wird eine NoSuchElementException geworfen
     */
    String getNameForZipCode(int plz) throws NoSuchElementException {

        // Ihre Implementation
        return "";
    }

    /**
     * Gibt eine Liste mit allen Kantonen zurück, in denen der übergebene Ortsname
     * vorkommt. Falls der Ort nicht existiert wird eine leere Liste zurückgegeben.
     */
    LinkedList<String> getAllCantonsForName(String name) {

        // Ihre Implementation
        return null;
    }

    public static void main(String[] args) throws Exception {
        File fileObject = new File("uebung011/src/test/resources/Adressdaten.csv");
        try {
            new ZipCode(fileObject);
        } catch (Exception e) {
            throw e;
        }
        
        
    }

}
