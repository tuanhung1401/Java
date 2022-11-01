package controller;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("001", "chuột máy tính", "chuột để điều khiển", 20, 150000, "con");
        Product product2 = new Product("002", "bàn phím máy tính", "bàn phím để nhập dữ liệu", 10, 390000, "cái");
        Product product3 = new Product("003", "màn hình máy tính", "hiển thị thông tin", 3, 3490000, "cái");
        Product product4 = new Product("004", "màn hình máy tính 2", "hiển thị thông tin", 2, 77000, "cái");
        Product product5 = new Product("005", "màn hình máy tính 3", "hiển thị thông tin", 10, 49000, "cái");
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        loopPrint(products);
        System.out.println("Mời bạn nhập từ khóa theo tên sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        String nameKeyword = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().contains(nameKeyword)) {
                product.printInfo();
            }
        }
        System.out.println("Mời bạn nhập từ khóa theo id: ");
        String idKeyword = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId().equals(idKeyword)) {
                products.remove(products.get(i));
                System.out.println("Sản phẩm này đã được xóa");
            }
        }
        loopPrint(products);
        System.out.println("Sản phẩm có số lượng <5: ");
        for (int i = 0; i <products.size(); i++) {
            Product product = products.get(i);
            if (product.getQuantity()<5){
                product.printInfo();
            }
        }
        System.out.println("Tìm sản phẩm theo mức giá: ");
        System.out.println("1. Dưới 50.000 đồng");
        System.out.println("2. Từ 50.000 đồng đê 100.000 đồng");
        System.out.println("3. Trên 100.000 đồng");
        int option = sc.nextInt();
        sc.nextLine();
        if (option ==1){
            System.out.println("Các sản phẩm có giá dưới 50.000 đồng: ");
            for (int i = 0; i < products.size(); i++){
                Product product = products.get(i);
                if (product.getPrice()<50000){
                    product.printInfo();
                }
            }
        }
        if (option ==2){
            System.out.println("Các sản phẩm có giá từ 50.000 đồng đến 100.000 đồng: ");
            for (int i = 0; i < products.size(); i++){
                Product product = products.get(i);
                if (product.getPrice()>50000 && product.getPrice()<100000){
                    product.printInfo();
                }
            }
        }
        if (option == 3){
            System.out.println("Các sản phẩm có giá trên 100.000 đồng: ");
            for (int i = 0; i < products.size(); i++){
                Product product = products.get(i);
                if (product.getPrice()>100000){
                    product.printInfo();
                }
            }
        }
    }

    public static void loopPrint(ArrayList<Product> products){
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            product.printInfo();
        }
    }
}