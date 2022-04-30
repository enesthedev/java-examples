package com.enesbayraktar.productmanager.classes;

import java.util.ArrayList;
import java.util.UUID;

public class Category {
    UUID uuid;
    String name;
    ArrayList<Product> products;

    /**
     * Kategori sınıfı
     *
     * Bu sınıfta bir kategori kimliği, kategori adı ve dinamik ürün listesini değer alan elemanlar atadım. Elemanların getter ve setterlarını oluşurdum.
     * Kategorinin bilgilerini obje biçiminde dinamik liste olarak dönen getInfo metodunu oluşturdum, böylelikle teker teker getter yazmama gerek kalmadı.
     *
     * addProduct ve removeProduct isminde iki metod oluşturdum. Bu metodlar Product sınıfından türetilmiş objeleri argüman olarak alıp Kategori sınıfındaki
     * dinamik ürün listesine ekliyor ve siliyor.
     */

    public Category() {
        this.uuid = UUID.randomUUID();
        this.products = new ArrayList<Product>();
    }

    public Category setName(String categoryName) {
        this.name = categoryName;
        return this;
    }

    public Category setProducts(ArrayList<Product> categoryProducts) {
        this.products = categoryProducts;
        return this;
    }

    public Category addProduct(Product categoryProduct) {
        if (this.products.contains(categoryProduct)) {
            return this;
        }

        this.products.add(categoryProduct);
        return this;
    }

    public Category removeProduct(Product categoryProduct) {
        if (!this.products.contains(categoryProduct)) {
            throw new RuntimeException("Product dont found at Category!");
        }

        this.products.remove(categoryProduct);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public ArrayList<Object> getInfo() {
        ArrayList<Object> product = new ArrayList<Object>();

        product.add(this.uuid);
        product.add(this.name);
        product.add(this.products);

        return product;
    }

}