import java.util.ArrayList;
import java.util.List;

public class Buch {

    private String autor;
    private String titel;
    private ArrayList<Kapitel> kapitels;

    public Buch(String autor, String titel, ArrayList<Kapitel> kapitels) {
        this.autor = autor;
        this.titel = titel;
        this.kapitels = kapitels;
    }

    public Buch(String autor, String titel) {
        this.autor = autor;
        this.titel = titel;
    }

    public List<Kapitel> getKapitels() {
        return kapitels;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void addKapitel(Kapitel pKapitel){
        this.kapitels.add(pKapitel);
    }

    public void deleteKapitel(Kapitel pKapitel){
        this.kapitels.remove(pKapitel);
    }

    public void deleteKapitel(int pIndex){
        this.kapitels.remove(pIndex);
    }

    @Override
    public String toString() {
        return "Buch{" +
                "autor='" + autor + '\'' +
                ", titel='" + titel + '\'' +
                ", kapitels=" + kapitels +
                '}';
    }
}
