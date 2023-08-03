import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog, scanner);

        }while (option!=6);
    }

    public static void printMenu(){

    }

    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner){
        switch (option){
            case 1:
                //citim de la tastatura detaliile produsului
                //ne instantiem un produs cu aceste detalii
                //pasam obiectul creat la metoda addProduct
                String name = scanner.nextLine();
                double fats = scanner.nextDouble();
                double carbs = scanner.nextDouble();
                double proteins = scanner.nextDouble();
                Product newProduct = new Product(name, fats, carbs, proteins);
                boolean result = productCatalog.addProduct(newProduct);

        }
}
}