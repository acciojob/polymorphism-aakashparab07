package com.driver;

public class Main {
    public static void main(String []args)
    {
        Product p=new Product();

        int product1 = p.product(10,5);
        int product2 = p.product(10,5,7);
        double productBool = p.product(27.0,35.0);

        System.out.println(product1+" "+product2+" "+productBool);

    }
    public static class Product
    {
        public int product(int x, int y)
        {
            return x*y;
        }
        public int product(int x, int y, int z)
        {
            return x*y*z;
        }
        public double product(double x, double y)
        {
            return x*y;
        }
    }
}