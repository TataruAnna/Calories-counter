public class ProductCatalog {

        Product[] products;
        static final int maxNumberOfProducts = 100;

        int numberOfProducts;

        public ProductCatalog() {
            this.products = new Product[maxNumberOfProducts];
            this.numberOfProducts = 0;
        }

        public void printProducts(){
            //de completat
        }

        public boolean addProduct(Product product){
            return true;
        }
}
