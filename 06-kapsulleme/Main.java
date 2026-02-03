public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(5);
        product.setName("Laptop");
        product.setStockAmount(8);
        product.setPrice(5000);

        ProductManager productManager= new ProductManager();
        productManager.Add(product);

    }
}
