import java.util.List;

public class Cleaner extends Employee {
    private List<String> scheduleOfTheDay;

    public Cleaner(String name, String cpf, double salary) {
        super(name, cpf, salary);
    }

    @Override
    public void displayDetails() {
        System.out.println("** CLEANER **");
        System.out.println("Employee Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salary: " + getSalary());
        System.out.println("Schedule of the day: " + scheduleOfTheDay);
    }

    public List<String> getScheduleOfTheDay() {
        return scheduleOfTheDay;
    }

    public void setScheduleOfTheDay(List<String> scheduleOfTheDay) {
        this.scheduleOfTheDay = scheduleOfTheDay;
    }
}
