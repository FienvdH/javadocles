package JavaDoc;

public class Product {
    String naam;
    int prijs;

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPrijs() {
        return this.prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    Product(String naam, int prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
}


