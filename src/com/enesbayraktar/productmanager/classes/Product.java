package com.enesbayraktar.productmanager.classes;

import java.util.ArrayList;
import java.util.UUID;

public class Product {
    UUID uuid;
    String name;
    Double price;
    Category category;

    /**
     * Ürün sınıfı
     *
     * Bu sınıfta dinamik ürün kimliği üretebilmek için bir property tanımladım ve tipini uuid olarak ayarladım.
     * Ürün ismini, fiyatını ve kategorisini alan diğer propertyleri de tanımladım. Kategori propertysi bir kategori sınıfı ile many to one ilişkisi içerisinde.
     *
     * getInfo metodunda bir dinamik obje referansı alan ArrayList oluşturdum ve içerisinde ürünün bilgilerini sırasıyla ekledim.
     * Bu metod sayesinde teker teker getter kullanmadan tüm ürün bilgilerini kodumuzda kullanabiliyoruz.
     *
     * Kategori setter fonksiyonunda ise Kategori sınıfındaki addProduct ve removeProduct fonksiyonlarınlarını kullanıyorum.
     * Fonksiyonlar ile alakalı daha fazla bilgi için kategori sınıfına bakabilirsiniz.
     */

    public Product() {
        this.uuid = UUID.randomUUID();
    }

    public Product setName(String productName) {
        if (productName.length() == 0) {
            throw new RuntimeException("productName length must be longer then 0");
        }
        this.name = productName;
        return this;
    }

    public Product setPrice(Double productPrice) {
        this.price = productPrice;
        return this;
    }

    public Product setCategory(Category productCategory) {
        if (this.hasCategory()) {
            this.category.removeProduct(this);
        }
        this.category = productCategory;
        this.category.addProduct(this);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    public UUID getId() {
        return this.uuid;
    }

    public Boolean hasCategory() {
        return !(this.category == null);
    }

    public ArrayList<Object> getInfo() {
        ArrayList<Object> product = new ArrayList<Object>();

        product.add(this.uuid);
        product.add(this.name);
        product.add(this.price);
        product.add(this.category);

        return product;
    }

}