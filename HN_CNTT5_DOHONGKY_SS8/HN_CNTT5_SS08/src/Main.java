import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students;
    static int n;

    public static void main(String[] args) {
        int luachon;
        do {
            System.out.println("1. Nhập danh sách sinh viên ");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("chọn chức năng: ");
            luachon = sc.nextInt();
            sc.nextLine();

            switch (luachon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    hienthi();
                    break;
                case 3:
                    timtheohocluc();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    System.out.println("Da thoat!");
                    break;
                default:
                    System.out.println("Lua chon sai!");
            }
        } while (luachon != 5);
    }


    static void nhap() {
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhap ma SV: ");
                id = sc.nextLine();
                if (id.startsWith("SV") && id.length() == 5) {
                    break;
                }
                System.out.println("Ma SV khong hop le!");
            }

            System.out.print("Nhap ho ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap diem TB: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

    static void hienthi() {
        if (students == null) {
            System.out.println("Chua co du lieu!");
            return;
        }

        for (int i = 0 ; i < students.length ; i++ ) {
            System.out.println(students[i].getId());
            System.out.println(students[i].getName());
            System.out.println(students[i].getScore());

        }
    }

    static void timtheohocluc() {
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String luchoccantim = sc.nextLine();

        boolean found = false;
        for (int i = 0 ; i < students.length ; i++ ) {
            if (students[i].getRank().equalsIgnoreCase(luchoccantim)) {
                System.out.println(students[i].getId());
                System.out.println(students[i].getName());
                System.out.println(students[i].getScore());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    static void sapxep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
