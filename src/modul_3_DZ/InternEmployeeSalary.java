package modul_3_DZ;


public class InternEmployeeSalary implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 0.8;
    }
}
