package Week_1.DSA;

import java.io.IOException;
import java.util.*;

class Product implements Comparable<Product>{
    private final int ProductID;
    private final String ProductName;
    public final String category;

    public Product(int ProductID, String ProductName, String category) {
        this.ProductID=ProductID;
        this.ProductName=ProductName;
        this.category=category;
    }

    public int getProductID(){
        return ProductID;
    }

    public String getProductName(){
        return ProductName;
    }

    public String getCategory(){
        return category;
    }

    @Override
    public String toString(){
        return "ProductID: " + ProductID + ", ProductName: " + ProductName + ", Category: " + category;
    }

    public static Product Linear(Product[] products,int targetid){
        for(Product p:products){
            if(p.getProductID()==targetid){
                return p;
            }
        }
        return null;
    }

    public static Product Binary(Product[] products,int targetid){
        int left = 0, right = products.length - 1;
        while (left <=right)
        {
            int mid = (left + right) / 2;
            int midId = products[mid].getProductID();
            if (midId == targetid){
                return products[mid];
            }
            else if (midId < targetid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return null;
    }
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.ProductID, other.ProductID);
    }
}



public class Ecommerce{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[10];
        System.out.println("Enter 10 products (name and category):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(i + 1, name, category);
        }

        System.out.print("Enter product ID to search (1 to 10): ");
        int targetId = sc.nextInt();

        Product resultLinear = Product.Linear(products, targetId);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not found"));

        Arrays.sort(products);

        Product resultBinary = Product.Binary(products, targetId);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not found"));
    }
}