
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int raiseSalary;
    int totalSalary;
    int salaryWithTaxAndBonus;
    int currentYear = 2021;
    int year = currentYear - hireYear;
    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax(){
        if(salary < 1000)  tax = 0;
        else tax = salary / 100 * 3;
        return tax;
    }
    public int bonus(){
        if(workHours > 40) bonus = (workHours - 40) * 30;  
        else   bonus = 0;  
        return bonus;
    }
    public int raiseSalary(){
        if(year < 10)  raiseSalary = salary / 100 * 5;      
        else if(year > 9 && year < 20)  raiseSalary = salary / 100 * 10;  
        else   raiseSalary = salary / 100 * 15;    
        return raiseSalary;
    }
    public String toString(){
        return 
"Adı: " + name + " Maaşı: " + salary + " Çalışma Saati: " + workHours + " Başlangıç Yılı: " + hireYear + " Vergi: " + tax() + " Bonus: " + bonus() + " Maaş Artışı: " + raiseSalary() + " Vergi ve Bonuslarla Birlikte Maaş: " + (salary + bonus() - tax()) + " Toplam Maaş: " + (salary + bonus() - tax() + raiseSalary());
    }
}
