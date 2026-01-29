import java.util.Scanner;

public class Main {
    public static void menu () {
        System.out.printf("1. Hiển thị \n");
        System.out.printf("2. Thêm mới \n");
        System.out.printf("3. Cập nhật \n");
        System.out.printf("4. Xóa \n");
        System.out.printf("5 . tìm kiếm \n");
        System.out.printf("6. thoát  \n");


    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[]  MSSV = {"B2101234" ,"B2101235" } ;
        int luachon ;
        do {
            menu();
            System.out.printf("lua chon : ");
            luachon = Integer.valueOf(input.nextLine());
            System.out.println(luachon);

            switch (luachon) {
                case 1:
                    for (int i = 0; i < MSSV.length; i++) {
                        System.out.println(MSSV[i]);
                    }
                    break;

                case 2:
                    String newId;
                    do {
                        System.out.print("Nhap MSSV moi: ");
                        newId = input.nextLine();
                        if (!newId.matches("B\\d{7}")) {
                            System.out.println("Sai dinh dang (VD: B2101234)");
                        }
                    } while (!newId.matches("B\\d{7}"));


                    String[] newMSSV = new String[MSSV.length + 1];


                    for (int i = 0; i < MSSV.length; i++) {
                        newMSSV[i] = MSSV[i];
                    }
                    newMSSV[newMSSV.length - 1] = newId;

                    MSSV = newMSSV;

                    System.out.println("Them thanh cong");
                    break;





                case 3:
                    System.out.print("Nhap index can sua: ");
                    int index = Integer.parseInt(input.nextLine());
                    if (index < 0 || index >= MSSV.length || MSSV[index] == null) {
                        System.out.println("Index khong hop le");
                    } else {
                        String updateId;
                        do {
                            System.out.print("Nhap MSSV moi: ");
                            updateId = input.nextLine();
                            if (!updateId.matches("B\\d{7}")) {
                                System.out.println("Sai dinh dang");
                            }
                        } while (!updateId.matches("B\\d{7}"));

                        MSSV[index] = updateId;
                        System.out.println("Cap nhat thanh cong");
                    }
                    break;



                case 4:
                    System.out.print("Nhap MSSV can xoa: ");
                    String idXoa = input.nextLine();
                    int vitri = -1;

                    // Tìm vị trí MSSV cần xóa
                    for (int i = 0; i < MSSV.length; i++) {
                        if (MSSV[i].equals(idXoa)) {
                            vitri = i;
                            break;
                        }
                    }

                    if (vitri == -1) {
                        System.out.println("Khong tim thay MSSV");
                    } else {
                        // Tạo mảng mới nhỏ hơn 1
                        String[] MSSVmoi = new String[MSSV.length - 1];
                        int indexNew = 0;

                        for (int i = 0; i < MSSV.length; i++) {
                            if (i != vitri) {
                                MSSVmoi[indexNew++] = MSSV[i];
                            }
                        }

                        MSSV = MSSVmoi;
                        System.out.println("Xoa thanh cong");
                    }
                    break;





                case 5:
                    System.out.print("Nhap chuoi can tim: ");
                    String key = input.nextLine().toLowerCase();
                    boolean found = false;

                    for (int i = 0; i < MSSV.length; i++) {
                        if (MSSV[i] != null && MSSV[i].toLowerCase().contains(key)) {
                            System.out.println(MSSV[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong co MSSV phu hop");
                    }
                    break;


                case 6 :
                    System.out.print("thoat thanh cong ");
                    break;
            }




        }while ( luachon != 6);
    }
}