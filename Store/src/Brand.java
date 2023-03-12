import java.util.ArrayList;
import java.util.List;

public class Brand {
    private String brand ;
    private String name;
    List brandList = new ArrayList<>();


    public Brand() {};
    public Brand(String Name){
        this.name  = Name;
    }


    public void AddBrand(List brand){

    brandList.add(brand);
    }
    public void deleteBrand(Brand brand){
        brandList.remove(brand);
    }
    public  void clearBrand(List a){
        brandList.clear();
    }

    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
