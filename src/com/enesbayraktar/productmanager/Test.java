package com.enesbayraktar.productmanager;

import com.enesbayraktar.productmanager.classes.Category;
import com.enesbayraktar.productmanager.classes.Price;
import com.enesbayraktar.productmanager.classes.Product;

import java.util.ArrayList;

public class Test {
    static String[] products = {"Baklava", "Sufle", "Kazandibi"};

    /**
     * Test Durumu
     *
     * Tatlılar ismindeki kategoriye Baklava, Sufle ve Kazandibini rastgele fiyatlarla ekliyoruz.
     * Eklediğimiz ürünleri ekranda fiyatlarıyla beraber listeliyoruz.
     * Ürünlerin fiyatlarını rastgele olarak bir fiyat sınıfından türetiyoruz.
     */

    public static void main(String[] args) {
        Price price = new Price();

        price
                .setMax(220);

        Category category = new Category();

        category
                .setName("Tatlılar");

        for (int productsSize = 0; productsSize < products.length; productsSize++) {

            Product product = new Product();

            product
                    .setName(products[productsSize])
                    .setPrice(price.random())
                    .setCategory(category);

            ArrayList<Object> productInfo = product.getInfo();

            System.out.printf("Ürün Bilgileri\n\n Adı: %s \n Fiyatı: %s \n Kategorisi: %s",
                    productInfo.get(1),
                    productInfo.get(2),
                    ((Category) productInfo.get(3)).getName()
            );
            System.out.println("\n");

        }

        ArrayList<Object> categoryInfo = category.getInfo();

        System.out.printf("Kategori Bilgileri\n Adı: %s \n Ürünleri:\n", categoryInfo.get(1));

        @SuppressWarnings("unchecked")
        ArrayList<Product> categoryProducts = (ArrayList<Product>) categoryInfo.get(2);


        for (int productsSize = 0; productsSize < categoryProducts.size(); productsSize++) {
            System.out.println("  " + categoryProducts.get(productsSize).getName());
        }
    }

}