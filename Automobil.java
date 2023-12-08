public class Automobil implements Comparable<Automobil>{
    private int anProducere;
    private String denumire;
    public Automobil(int anProducere, String denumire) {
        this.anProducere = anProducere;
        this.denumire = denumire;
    }
    @Override
    public int compareTo(Automobil o) {
        return o.getAnProducere()-this.getAnProducere();
    }

    public int getAnProducere() {
        return anProducere;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "anProducere=" + anProducere +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
