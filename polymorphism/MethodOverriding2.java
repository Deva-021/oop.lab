class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double calculateShipping() {
        return 5.0;
    }

    void displayProductDetails() {
        System.out.println("Product: " + name + ", Price: " + price + ", Shipping: " + calculateShipping());
    }
}

class ElectronicsProduct extends Product {
    ElectronicsProduct(String name, double price) {
        super(name, price);
    }

   
    double calculateShipping() {
        return super.calculateShipping() + 10.0;
    }

   
    void displayProductDetails() {
        System.out.println("Electronics: " + name + ", Price: " + price + ", Shipping: " + calculateShipping());
    }
}

class ClothingProduct extends Product {
    ClothingProduct(String name, double price) {
        super(name, price);
    }

   
    double calculateShipping(){
        return 0.0;
    }

    
    void displayProductDetails(){
        System.out.println("Clothing: " + name + ", Price: " + price + ", Free Shipping!");
    }
}

public class  MethodOverriding2{
    public static void main(String[] args) {
        Product generalProduct = new Product("Book", 20.0);
        ElectronicsProduct laptop = new ElectronicsProduct("Laptop", 1200.0);
        ClothingProduct shirt = new ClothingProduct("Shirt", 30.0);

        generalProduct.displayProductDetails();
        laptop.displayProductDetails();
        shirt.displayProductDetails();
    }
}