public class SalaryCalculator {
    double baseSalary = 1000.00;
    
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        var uncappedSalary = baseSalary * (salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return uncappedSalary < 2000 ?  uncappedSalary : 2000;
    } 
}
