 package org.lessons.java.shop;

import java.util.Random;

    public class Prodotto {

        //ATTRIBUTI
        private int code;
        private String name;
        private String description;
        private double price;
        private double iva;

        //COSTRUTTORI

        public Prodotto( String name, String description, double price, int iva)throws IllegalArgumentException {
           if(name == null || name.isEmpty()){throw new IllegalArgumentException("Insert a valid name");}
            if(price< 0){throw new IllegalArgumentException("Insert a valid name");}
            if(iva< 0){throw new IllegalArgumentException("Insert a valid name");}
            this.code = code;
            this.name = name;
            this.description = description;
            this.price = price;
            this.iva = iva;
        }


        //GET AND SET

        public int getCode() {
            int codeProduct = randomCode.nextInt(1000000,99999999);
            return codeProduct;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public double getIva() {
            return iva;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setIva(double iva) {
            this.iva = iva;
        }

        //MODULI
        Random randomCode = new Random();

        private int codeProduct = randomCode.nextInt(10000,99999);

        public double priceIva(){
             return price + (price * iva / 100);
        }

        public String nameCode (){
            return name + codeProduct;
        }

}
