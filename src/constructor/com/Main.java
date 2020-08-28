package constructor.com;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Employee name is: "  + employee.getEmployeeName() + "\n" + "Employee title is: "  + employee.getTitle() + "\n" + "Employee salary is: $" + employee.salaryCalc() );

	}

}
