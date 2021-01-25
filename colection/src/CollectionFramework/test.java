package CollectionFramework;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        Product product = new Product(2,"a",2);
        Product product1 = new Product(3,"ab",3);
        Product product2 = new Product(4,"abc",4);
       ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product1);
        productManager.add(product2);
        productManager.display();
    }
}
