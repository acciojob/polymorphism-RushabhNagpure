package com.driver;


public  class Main {
      static class  Product{
        public int product(int x, int y) {
            return product(x,y);
        }

        public int product(int x, int y, int z) {
            return product(x, y, z);
        }

        public double product(double x, double y) {
            return product(x,y);
        }


     }


    public  static void main(String[] args) {
        Product p = new Product();
       p.product(10,30);

       Product p2 = new Product();
       p.product(20,50,60);

       Product p3 = new Product();
       p.product(90,80);



    }
}