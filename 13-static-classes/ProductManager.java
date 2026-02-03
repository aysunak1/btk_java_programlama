public class ProductManager {
    public ProductManager(){
        System.out.println("Yapıcı blok çalıştı.");
    }
    public void add(Product product){
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)){
            System.out.println("Ürün eklendi.");
        }else {
            System.out.println("Ürün hatalı olduğu için eklenemedi.");
        }

    }

}
