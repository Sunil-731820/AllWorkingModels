package StreamApIInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMainClass {
	static List<Employee> employees = new ArrayList<Employee>();
	static {
		employees.add(new Employee(
				"Shabbir","Dawoodi",5000.0,List.of("Project1","Project2")));
		employees.add(new Employee(
				"Nikhil","gupta",6000.0,List.of("Project 1","Project 3")));
		employees.add(new Employee(
				"Shivam","Kumar",5500.0,List.of("Project3 ,project 4")));
	}
	
	public static void main(String[] args) throws NoSuchFieldException {
		
//		The use of the Stream 
		
//		1 : forEach Loop 
		employees.stream()
		.forEach(employees-> System.out.println(employees));
		
//		2 : map	
		Set<Employee> increasedSal1 =  employees.stream()
		.map(employees->new Employee(
				employees.getFirstName(),
				employees.getLastName(),
				employees.getSalary()*1.10,
				employees.getProjects())).collect(Collectors.toSet());
		System.out.println("after increasing the salary is ");
		System.out.println(increasedSal1);
		
//		3 : Collect 
		
		List<Employee> employList = 
				employees.stream()
				.map(employees->new Employee(
						employees.getFirstName(),
							employees.getLastName(),
							employees.getSalary(),
							employees.getProjects()))
				.collect(Collectors.toList());
		
		System.out.println("the list of the EMployee is ");
		System.out.println(employList);
		
//		4 : the Use of the filter() 
		
		List<Employee> filterEmployee = 
				employees.stream()
				.filter(employees-> employees.getSalary()>5000.0)
				.map(employees -> new Employee(
						employees.getFirstName(),
						employees.getLastName(),
						employees.getSalary()*1.10,
						employees.getProjects()))
				.collect(Collectors.toList());
		System.out.println("after the use of the filter method ");
		System.out.println(filterEmployee);
		
//		5 : The use of the findFirst()
		
		Employee firstEmployee =
				employees.stream()
				.filter(employees-> employees.getSalary()>3000.0)
				.map(employees -> new Employee(
						employees.getFirstName(),
						employees.getLastName(),
						employees.getSalary()*1.10,
						employees.getProjects()))
				.findFirst()
				.orElse(null);
		
		System.out.println("the first Employee Is ");
		System.out.println(firstEmployee);
		
//		6 : The use of flatmap()
		
		String projects = 
				employees.stream()
				.map(employee -> employee.getProjects())
				.flatMap(strings -> strings.stream())
				.collect(Collectors.joining(","));
		System.out.println(projects);
		
		
//		7 : The use of the shortCircuit operations 
		System.out.println("before the short circuit is ");
		System.out.println(employList);
		List<Employee> shortCircuit = 
				employees.stream()
				.skip(3)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println("after the use of the short Circuit is ");
		System.out.println(shortCircuit);
		
//		8 : The use of the finite Data 
		
		Stream.generate(Math:: random)
		.limit(5)
		.forEach(value -> System.out.println(value));
		
//		9 : The use of Sorting 
		
		List<Employee> sortedEmployee = 
				employees.stream()
				.sorted((o1,o2)->o1.getFirstName()
						.compareToIgnoreCase(o2.getFirstName()))
				.collect(Collectors.toList());
		System.out.println("after sorting the data on the basis of the first Name is ");
		System.out.println(sortedEmployee);

// 		10 : The use of Min() and max()
		Employee maxEmployee = employees.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.orElseThrow(NoSuchFieldException::new);
		System.out.println("the maximum employee is ");
		System.out.println(maxEmployee);
		
//	11 : The use of the Reduce()
		
		Double totalsal1 = 
				employees.stream()
				.map(employees -> employees.getSalary())
				.reduce(0.0, Double::sum);
		System.out.println("the total salary is ");
		System.out.println(totalsal1);
	
	}

	

}
