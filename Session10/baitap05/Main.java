package Session10.baitap05;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new OfficeStaff("An", 8000);
        employees[1] = new Manager("Bình", 15000, 5000);
        for (Employee emp : employees) {
            emp.display();
            double salary = emp.calculateSalary();
            System.out.println("Lương cuối: " + salary);
            if (emp instanceof BonusCalculator) {
                double bonus =
                        ((BonusCalculator) emp).getBonus(); // Downcasting
                System.out.println("Thưởng KPI: " + bonus);
            } else {
                System.out.println("Thưởng KPI: Không có");
            }
            System.out.println("----------------------");
        }
    }
}
