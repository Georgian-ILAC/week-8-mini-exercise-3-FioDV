public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee (1752, 20.0,"Fiorella", "Donayre",70);
        System.out.println(employee);
        System.out.println("Old Hourly Pay is: " + employee.getHourlyPay());
        System.out.println("New Hourly Pay is: " + employee.getRaise());
        System.out.println("Weekly Pay is: " + employee.payDay(45));

    }
}