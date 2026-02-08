package modul_3_DZ;


public class PermanentEmployeeSalary implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.2;
    }
}
