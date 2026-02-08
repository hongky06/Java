package Session10.baitap05;

public class Manager extends Employee implements BonusCalculator {
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Gọi constructor cha
        this.bonus = bonus;
    }
    @Override
    public double getBonus() {
        return bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}
