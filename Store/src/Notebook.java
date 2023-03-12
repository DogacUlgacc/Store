public class Notebook extends Product implements Comparable{
    private String id, productName;
    private int price, discount, stock, ram;
    private double screenSize;
    Brand brand;
    public Notebook(){};

    public Notebook(String id, String productName, Brand brand, int price, int discount, int stock, int ram, double screenSize) {
        super(price,discount,stock,id,productName,screenSize);
        this.brand = brand;
        this.ram = ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}