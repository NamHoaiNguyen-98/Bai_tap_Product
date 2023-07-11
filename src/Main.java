import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Bim Bim", 5000, 100, "Ngon ngọt, giòn tan");
        Product product2 = new Product(2, "Thuốc Lá", 30000, 50, "Phê pha sảng khoái");
        Product product3 = new Product(3, "Mỳ tôm", 4000, 200, "Sợi dai vị chua cay");
        Product product4 = new Product(4, "Sữa tươi", 10000, 300, "Thơm ngon bổ dưỡng");
        Product product5 = new Product(5, "Giấy ăn", 3000, 1000, "Mềm mại, thơm tho");
        Product[] array = {product1, product2, product3, product4, product5};
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("___________________________________________________________________________");
            System.out.println("Menu");
            System.out.println("1. Tạo mới 1 đối tượng Product và thêm vào mảng ");
            System.out.println("2. Sửa thông tin 1 đối tượng Product dựa theo id nhập vào ");
            System.out.println("3. Xóa 1 đối tương Product khỏi mảng dựa theo id nhập vào ");
            System.out.println("4. Hiển thị tất cả các Product có trong mảng ");
            System.out.println("5. Hiển thị các Product có giá lớn nhất ");
            System.out.println("6. Hiển thị các Product có giá nhỏ nhất ");
            System.out.println("7. Hiển thị các Product có số lượng lớn nhất ");
            System.out.println("8. Hiển thị các Product có số lượng nhỏ nhất ");
            System.out.println("9. Tính tổng tiền hàng hiện có ");
            System.out.println("----------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin Product");
                    System.out.println("input ID");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("input name");
                    String name = input.nextLine();
                    System.out.println("input price");
                    double price = input.nextDouble();
                    System.out.println("input quantity");
                    int quantity = input.nextInt();
                    input.nextLine();
                    System.out.println("input description");
                    String description = input.nextLine();
                    Product[] arr1 = new Product[array.length + 1];
                    Product product6 = new Product(id, name, price, quantity, description);
                    for (int i = 0; i < arr1.length - 1; i++) {
                        arr1[i] = array[i];
                    }
                    arr1[arr1.length - 1] = product6;
                    System.out.println("product sau khi thêm: ");
                    System.out.println(product6);
                    System.out.println("Mảng khi thêm là: ");
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.println(arr1[i]);
                    }
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm muốn sửa: ");
                    int id1 = input.nextInt();
                    boolean flag1 = true;
                    for (int i = 0; i < array.length; i++) {
                        if (id1 == array[i].getId()) {
                            flag1 = false;
                            System.out.println("edit id: ");
                            array[i].setId(input.nextInt());
                            input.nextLine();
                            System.out.println("edit Name: ");
                            array[i].setName(input.nextLine());
                            System.out.println("edit Price: ");
                            array[i].setPrice(input.nextInt());
                            input.nextLine();
                            System.out.println("edit Quantity: ");
                            array[i].setQuantity(input.nextInt());
                            input.nextLine();
                            System.out.println("edit Description: ");
                            array[i].setDescription(input.nextLine());
                            System.out.println("Product sau khi sửa: ");
                            System.out.println(array[i]);
                            break;
                        }
                    }
                    if (flag1) {
                        System.out.println("Không tìm thấy sản phẩm với id = " + id1);
                    }
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm muốn xóa: ");
                    int id2 = input.nextInt();
                    boolean flag2 = true;
                    for (int i = 0; i < array.length; i++) {
                        if (id2 == array[i].getId()) {
                            flag2 = false;
                            break;
                        }
                    }
                    if (flag2) {
                        System.out.println("Không tìm thấy sản phẩm với id = " + id2);
                    }
                    else {
                        Product[] arr2 = new Product[array.length - 1];
                        int index = 0;
                        for (int i = 0; i < array.length; i++) {
                            if (id2 != array[i].getId()) {
                                arr2[index] = array[i];
                                index++;
                            }
                        }
                        System.out.println("Danh sách sản phẩm sau khi xóa:");
                        for (int i = 0; i < arr2.length; i++) {
                            System.out.println(arr2[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Display product of Array:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                case 5:
                    double maxPrice = array[0].getPrice();
                    int index = 1;
                    for (int i = 0; i < array.length; i++) {
                        if(array[i].getPrice()>maxPrice) {
                            maxPrice = array[i].getPrice();
                            index =i+1;
                        }
                    }
                    System.out.println("Display Max price Product :");
                    System.out.println("product"+index +" is price= "+maxPrice);
                    break;
                case 6:
                    double minPrice = array[0].getPrice();
                    int index1 = 1;
                    for (int i = 0; i < array.length; i++) {
                        if(array[i].getPrice()>minPrice) {
                            minPrice = array[i].getPrice();
                            index1 =i+1;
                        }
                    }
                    System.out.println("Display Min price Product :");
                    System.out.println("product"+index1 +" is price= "+minPrice);
                    break;
                case 7:
                    double maxQuantity = array[0].getQuantity();
                    int index2 = 1;
                    for (int i = 0; i < array.length; i++) {
                        if(array[i].getPrice()>maxQuantity) {
                            maxQuantity = array[i].getQuantity();
                            index2 =i+1;
                        }
                    }
                    System.out.println("Display Max quantity Product :");
                    System.out.println("product"+index2 +" is quantity= "+maxQuantity);
                    break;
                case 8:
                    double minQuantity = array[0].getQuantity();
                    int index3 =1;
                    for (int i = 0; i < array.length; i++) {
                        if(array[i].getPrice()<minQuantity) {
                            minQuantity = array[i].getQuantity();
                             index3 =i+1;
                        }
                    }
                    System.out.println("Display Min quantity Product :");
                    System.out.println("product"+index3 +" is quantity= "+minQuantity);
                    break;
                case 9:
                    int sum=0;
                    for (int i = 0; i < array.length; i++) {
                       sum+= array[i].getPrice()*array[i].getQuantity();
                    }
                    System.out.println("Tổng tiền của tất cả sản phẩm hiện có là: "+sum);
                    break;
            }

        }
    }
}
