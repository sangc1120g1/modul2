package CollectionFramework;

import javax.print.DocFlavor;
import java.util.*;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void update(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                repairProducts(i);
            }
        }
    }

    public Product delete(String name){
        Product product = new Product();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                product = products.remove(i);
            }
        }
        return product;
    }

    public void display(){
        System.out.println(products.toString());
    }

    public void sortUp(){
        Comparator<Product> sorts = updateSortUp();
        Collections.sort(products,sorts);
    }

    public void sortDown(){
        Comparator<Product> sorts = updateSortDown();
        Collections.sort(products,sorts);
    }

    private Comparator<Product> updateSortUp() {
        Comparator<Product> sorts = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()>o2.getPrice()){
                    return 1;
                } else if (o1.getPrice()==o2.getPrice()){
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        return sorts;
    }

    private Comparator<Product> updateSortDown() {
        Comparator<Product> sorts = (o1, o2) -> {
            if (o1.getPrice()<o2.getPrice()){
                return 1;
            } else if (o1.getPrice()==o2.getPrice()){
                return 0;
            } else {
                return -1;
            }
        };
        return sorts;
    }

    public Product search(String name){
        Product product = new Product();
        for (Product value : products) {
            if (value.getName().equals(name)) {
                product = value;
            }
        }
        return product;
    }
    private void repairProducts(int i) {
        if (Menu()==1) {
            Scanner SC = new Scanner(System.in);
            System.out.print("Input name ");
            String names = SC.nextLine();
            products.get(i).setName(names);
        } else if (Menu()==2){
            Scanner SC = new Scanner(System.in);
            System.out.print("Input price ");
            int prices = Integer.parseInt(SC.nextLine());
            products.get(i).setPrice(prices);
        } else if (Menu()==3){
            Scanner SC = new Scanner(System.in);
            System.out.print("Input id ");
            int ID = Integer.parseInt(SC.nextLine());
            products.get(i).setId(ID);
        }
    }

    private int Menu() {
        System.out.println("1: repair name");
        System.out.println("2: repair price");
        System.out.println("3: repair id");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Chose menu");
        return Integer.parseInt(Sc.nextLine());
    }
}
