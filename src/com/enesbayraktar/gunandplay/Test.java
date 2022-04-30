package com.enesbayraktar.gunandplay;

import com.enesbayraktar.gunandplay.classes.*;

public class Test {

    /**
     * Test Durumu
     *
     * 600mt'de duran bir Geyiğimiz var. Yanımızdaki Deagle tabanca ve Sniper ile sırasıyla ateş ediyoruz
     * ancak tabancanın menzili yetersiz olduğu için hedefi ıskalıyoruz, Sniper'a yeltendiğimizde ise mermi olmadığından silah ateşlenmiyor.
     * Silahı doldurup tekrardan tetiğe basıyoruz ve akşam yemeğinde Geyiğimizi afiyetle yiyoruz ^
     */

    public static void main(String[] args) {
        Clip clip1 = new Clip(14, 14);
        Clip clip2 = new Clip(20, 0);

        Gun gun1 = new Gun(500, "Desert Eagle");
        Gun gun2 = new Gun(1500, "Sniper");
        Gun gun3 = new Gun(700, "MP5");

        Target target = new Target(600, "Geyik");

        gun1
                .setClip(clip1)
                .fire(target); // Hedef, Silahın menzili dışında

        gun2
                .setClip(clip2)
                .fire(target) // Sialhta mermi yok!
                .reload()
                .fire(target); // Hedef Geyik öldürüldü

        gun3.fire(target); // Silahta bir şarjör mevcut değil!
    }

}
