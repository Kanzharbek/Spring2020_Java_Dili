package day38_Constructors;

public class SalaryCalculator {
    /*
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAfterTax(): returns the salary after tax as double
                stateTax(): returns the total state tax as double
                federalTax(): returns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
     */
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - (stateTax() + federalTax());
    }

    public String toString(){
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }
}
 class employeeSalary{

     public static void main(String[] args) {

         SalaryCalculator dilnaz = new SalaryCalculator(55, 40, 0.0725, 0.22);
         System.out.println(dilnaz.salary());
         System.out.println(dilnaz);

     }


 }
