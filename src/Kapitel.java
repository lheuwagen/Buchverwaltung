public class Kapitel {

    private String ueberschrift, inhtalt;
    private int seitenzahl;

    public Kapitel(String ueberschrift, String inhtalt, int seitenzahl) {
        this.ueberschrift = ueberschrift;
        this.inhtalt = inhtalt;
        this.seitenzahl = seitenzahl;
    }

    public String getUeberschrift() {
        return ueberschrift;
    }

    public void setUeberschrift(String ueberschrift) {
        this.ueberschrift = ueberschrift;
    }

    public String getInhtalt() {
        return inhtalt;
    }

    public void setInhtalt(String inhtalt) {
        this.inhtalt = inhtalt;
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    public void setSeitenzahl(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    @Override
    public String toString() {
        return "Kapitel{" +
                "ueberschrift='" + ueberschrift + '\'' +
                ", inhtalt='" + inhtalt + '\'' +
                ", seitenzahl=" + seitenzahl +
                '}';
    }
}
