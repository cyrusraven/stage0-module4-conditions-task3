package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0 && salary <= 10000) {
            int num = salary / 100 * 15;
            int num1 = salary - num;
            System.out.println((double)num1);
        } else if (salary > 10000 && salary <= 20000) {
            int num = salary / 100 * 18;
            int num1 = salary - num;
            System.out.println((double) num1);
        } else if (salary > 20000) {
            int num = salary / 100 * 20;
            int num1 = salary - num;
            System.out.println((double) num1);
        } else if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
