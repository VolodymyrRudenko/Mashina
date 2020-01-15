package com.company;

public class SuperCar {
    public String Marka,
            Colir;
    public double rozhid,
            objem,
            probig,
            distan,
            km;

    public SuperCar(String colir, String marka, double rozhid, double objem, double probig) {
        this.Colir = colir;
        this.Marka = marka;
        this.rozhid = rozhid;
        this.objem = objem;
        this.probig = probig;
    }

    void drive(int km) {
        distan = 100 / this.rozhid * this.objem;
        System.out.println("Відстань:" + distan + "," + "Загальний пробіг:" + (probig + distan));
    }

    public void Ref(int objem) {
        if (distan >= km) {
            System.out.println("Бензин закінчився");
        }
    }

    public void distan1() {
        System.out.println(this.Colir + " " + this.Marka + ", пробіг: " + (probig + distan));
    }
}
