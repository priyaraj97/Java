import java.util.*;  
import java.util.stream.Collectors;  
  
class Product2{  
    int id;  
    String name;  
    float price;  
      
    public Product2(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class StreamMethod {  
  
    public static void main(String[] args) {  
          
        List<Product2> productsList = new ArrayList<Product2>();  
          
        productsList.add(new Product2(1,"HP Laptop",25000f));  
        productsList.add(new Product2(2,"Dell Laptop",30000f));  
        productsList.add(new Product2(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product2(4,"Sony Laptop",28000f));  
        productsList.add(new Product2(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList = productsList.stream().filter(p -> p.price < 30000).map(Product2::getPrice).collect(Collectors.toList());  
        System.out.println(productPriceList);  
    }  
}  