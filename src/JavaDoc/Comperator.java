package JavaDoc;

import java.util.Comparator;

public class Comperator implements Comparator<Product>{

    public Comperator() {
    }

    public int compare(Product firstProduct, Product secondProduct) {
        return firstProduct.getPrijs() - secondProduct.getPrijs();
    }

}
