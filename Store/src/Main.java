import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Brand Samsung = new Brand();
        Brand Asus = new Brand();
        Brand Casper = new Brand();
        Brand HP = new Brand();
        Brand Huawei = new Brand();
        Brand Lenovo = new Brand();
        Brand Monster = new Brand();
        Brand Xiaomi = new Brand();
        Brand Apple = new Brand();
        Brand Redmi = new Brand();

        Brand brand = new Brand();
        brand.brandList.add(Samsung);
        brand.brandList.add(Asus);
        brand.brandList.add(Casper);
        brand.brandList.add(HP);
        brand.brandList.add(Huawei);
        brand.brandList.add(Lenovo);
        brand.brandList.add(Monster);
        brand.brandList.add(Xiaomi);
        brand.brandList.add(Apple);
        brand.brandList.add(Redmi);



        Phone SamsungP = new Phone("1", "SAMSUNG GALAXY A51", Samsung, "Black",
                10200, 20, 300, 128, 6.5);
        Phone AppleP = new Phone("2", "IPhone 11 64 GB   ", Apple, "Red",
                17500, 10, 450, 64, 6.1);
        Phone RedmiP = new Phone("3", "Redmi Note 10 Pro", Redmi, "White",
                6500, 15, 150, 64, 6.3);


        Notebook HuaweıN = new Notebook("4", "HUAWEI Matebook 14", Huawei,
                15000, 12, 150, 16, 14.0);

        Notebook LenovoN = new Notebook("5", "LENOVO V14 IGL    ", Lenovo,
                17000, 16, 160, 16, 14.0);
        Notebook AsusN = new Notebook("6", "ASUS Tuf Gaming", Asus,
                20000, 7, 195, 32, 15.6);


        System.out.println(LenovoN.addStock(LenovoN,5));
        System.out.println(LenovoN.getStock());
        System.out.println(LenovoN.addStock(LenovoN,15));



        List<String> brandList = new ArrayList<>();
        brandList.add("-Samsung");
        brandList.add("-Asus");
        brandList.add("-Casper");
        brandList.add("-HP");
        brandList.add("-Huawei");
        brandList.add("-Lenovo");
        brandList.add("-Monster");
        brandList.add("-Xiaomi");
        brandList.add("-Apple");
        brandList.add("-Redmi");


        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(SamsungP);
        phoneList.add(AppleP);
        phoneList.add(RedmiP);

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(HuaweıN);
        notebooks.add(LenovoN);
        notebooks.add(AsusN);

        System.out.println("***************************************");
        System.out.println("1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "0 - Çıkış Yap");
        System.out.println("***************************************");
        System.out.print("Lütfen yapacağınız işlemi seçiniz: ");

        try {
            int key = sc.nextInt();
            if (key == 0) {
                System.out.println("Sistemden çıkış yapılıyor!");
            } else if (key == 1) {
                Collections.sort(notebooks);
                System.out.println("Notebook Listesi");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("|Id|\t  " + "|Ürün Adı| \t\t " + "   |Fiyat|  \t\t" + "  |Ram| \t\t" + "|Screen Size| \t");
                System.out.println("----------------------------------------------------------------------------------------------------");

                for (Notebook p : notebooks) {
                    System.out.println("|" + p.getId() + "|" + " \t" + p.getProductName() + " \t\t" + p.getPrice() + "TL \t\t  "
                            + p.getRam() + "GB" + " \t\t\t  " + p.getScreenSize() + " inch");

                }
            } else if (key == 2) {
                Collections.sort(phoneList);
                System.out.println("Cep telefonu listesi");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("|Id|\t  " + "|Ürün Adı| \t\t " + "   |Fiyat|  \t\t" + "|Hafıza| \t" + "|Screen Size| \t");
                System.out.println("----------------------------------------------------------------------------------------------------");
                for (Phone p : phoneList) {
                    System.out.println("|" + p.getId() + "|" + " \t" + p.getProductName() + "\t\t" + p.getPrice() + "TL\t\t\t  " + p.getMemory() + "GB" +
                            "\t\t\t" + p.getScreenSize() + " inch");

                }

            } else if (key == 3) {
                Collections.sort(brandList);
                for (int i = 0; i < brandList.size(); i++) {
                    System.out.println(brandList.get(i));
                }
            } else {
                System.out.println("Lütfen geçerli bir işlem giriniz!");

            }

        }
        catch (InputMismatchException e){
            System.out.println("Lütfen geçerli bir işlem seçiniz.");
        }
            sc.close();
       }
    }
