package com.enesbayraktar.customer;

import com.enesbayraktar.customer.classes.Customer;
import java.time.LocalDate;
import java.time.Month;

public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer
                .setName("Enes")
                .setSurName("Bayraktar")
                .setMarried(false)
                .setBirthDate(LocalDate.of(2000, Month.SEPTEMBER, 25));

        System.out.printf("%s %s \n%s \n%d", customer.getName(), customer.getSurName(), customer.getMarried() ? "Evli" : "Bekar", customer.getAge());

    }

}
