package org.example;

public class Main {
    public static void main(String[] args) {
        // Değişkenler
        // Value Types
        String metin = "Merhaba, Turkcell Geleceği Yazanlar!";
        System.out.println(metin);

        int ogrenciSayisi = 45;
        double ogrenciNotOrtalamasi = 85.5;
        boolean dersBitis = false;


        int ogrenciSayisi2 = ogrenciSayisi; // değer atama
        ogrenciSayisi2 = ogrenciSayisi2 + 10;
        System.out.println(ogrenciSayisi2);
        System.out.println(ogrenciSayisi);

        // Set
        // Reference Types
        int[] ogrenciNotlari = { 90, 85, 95, 100, 75 };
        int[] ogrenciNotlari2 = ogrenciNotlari;
        ogrenciNotlari2[0] = 100;

        for (int i = 0; i < ogrenciNotlari.length; i++) {
            System.out.println(ogrenciNotlari[i]);
        }

        if (ogrenciNotlari[0] >= 80) {
            System.out.println("Geçti");
        }
        else if (ogrenciNotlari[0] == 80) {
            System.out.println("Sınırdan Geçti");
        } else {
            System.out.println("Kaldı");
        }

        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setUnitPrice(5000);
        product1.setDiscounted(true);
        product1.setDiscountRate(0.10);
        product1.buy();

        Product product2 = new Product();
        product2.setName("Mouse");
        product2.setUnitPrice(100);
        product2.setDiscounted(false);
        product2.setDiscountRate(0.0);
        product2.buy();

        Product product3 = new Product("Keyboard", 100, true, 0.15);
        product3.buy();

        Product[] products = { product1, product2, product3 };
        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("05321234567");
        individualCustomer.setFirstName("Ersin");
        individualCustomer.setLastName("Elmas");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("67890");
        corporateCustomer.setPhone("05321234568");
        corporateCustomer.setCompanyName("Turkcell");
        corporateCustomer.setTaxNumber("1234567890");

        Customer[] customers = { individualCustomer, corporateCustomer };

        ICustomerService customerService = new CustomerManager();
        customerService.add();
        customerService.delete();
        customerService.update();

    }
}