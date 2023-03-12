public class Phone  extends Product implements  Comparable{
    String id,productName,color;
  private  int price,discount,stock,memory;
  private   double screenSize;
 Brand brand;
     public Phone() {};


    public Phone(String id, String productName, Brand brand, String color, int price, int discount, int stock,
                 int memory, double screenSize) {
        super(price,discount,stock,id,productName,screenSize);
        this.brand = brand;
        this.memory = memory;
        this.color = color;
    }
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
