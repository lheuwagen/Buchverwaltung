import java.sql.SQLOutput;
import java.util.ArrayList;

public class Verwaltung {

    public static void main(String[] args){
        System.out.println(newBook());
    }

    public static Buch newBook(){
        ArrayList<Kapitel> kapitel = new ArrayList<Kapitel>();

        kapitel.add(new Kapitel("Test1", "much inhalt very wow 1",1));
        kapitel.add(new Kapitel("Test2", "much inhalt very wow 2",12));
        kapitel.add(new Kapitel("Test3", "much inhalt very wow 3",123));
        kapitel.add(new Kapitel("Test4", "much inhalt very wow 4",1234));
        kapitel.add(new Kapitel("Test5", "much inhalt very wow 5",112345));

        Buch buch = new Buch("Tim Tester","Testbuch 123", kapitel);

        return buch;
    }
}
