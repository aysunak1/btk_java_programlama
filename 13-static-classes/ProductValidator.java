public class ProductValidator {
    public boolean isValid(Product product){
        if (!product.name.isEmpty() && product.price>0){
            return true;
        }else{
            return false;
        }
    }

}
