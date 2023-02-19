package com.driver;
import  java.lang.Override;

public  class Main {

    static class  Product{
        public int product(int x, int y) {
            return (x*y);
        }

        public int product(int x, int y, int z) {
            return (x* y *z);
        }

        public double product(double x, double y) {
            return (x*y);
        }


     }


    public  static void main(String[] args) {
        Product p = new Product();
       p.product(10,30);
       p.product(20,50,60);
       p.product(9.0,8.0);



    }
}