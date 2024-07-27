import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    private Map<String, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product in the inventory
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Retrieve a product from the inventory
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    // Print all products in the inventory
    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();

       
        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 20, 499.99);

        
        inventoryManagement.addProduct(product1);
        inventoryManagement.addProduct(product2);

        
        inventoryManagement.printInventory();

        
        product1.setPrice(899.99);
        inventoryManagement.updateProduct(product1);

        
        inventoryManagement.printInventory();

       
        inventoryManagement.deleteProduct("2");

     
        inventoryManagement.printInventory();
    }
}
