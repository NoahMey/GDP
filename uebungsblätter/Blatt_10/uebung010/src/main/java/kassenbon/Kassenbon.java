package kassenbon;
import java.util.ArrayList;

public class Kassenbon {
    
    ArrayList <Artikel> itemList = new ArrayList<>();
    public Kassenbon(Adresse address){

    }


    public ArrayList add(Artikel artikel){
        itemList.add(artikel);
        return itemList;
    }

    public void print(){
        for(Artikel artikel : itemList){
            artikel.print();

        }
    }
    
}
