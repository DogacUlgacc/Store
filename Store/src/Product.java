public class Product implements Admin {
    private  int price,discount,stock;
    private String id, productName;
    private  double screenSize;
    public  Product(){};

    public Product(int price, int discount, int stock, String id, String productName, double screenSize) {
        super();
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.id = id;
        this.productName = productName;
        this.screenSize = screenSize;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreensize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public int addStock(Product product,int item) {
        return product.stock + item;

    }

    @Override
    public int deleteStock(Product product,int item) {
        return product.stock - item;
    }
}
