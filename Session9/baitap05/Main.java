package Session9.baitap05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new OfficeEmployee("An", 10_000_000));
        employees.add(new ProductionEmployee("Bình", 500, 20_000));
        employees.add(new OfficeEmployee("Chi", 12_000_000));
        double tongLuong = 0;
        for (Employee e : employees) {
            tongLuong += e.calculateSalary(); // Đa hình ở đây
        }
        System.out.printf("Tổng lương: %f" , tongLuong);
    }
}
