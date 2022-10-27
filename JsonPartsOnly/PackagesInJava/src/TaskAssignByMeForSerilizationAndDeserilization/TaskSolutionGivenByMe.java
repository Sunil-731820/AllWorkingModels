package TaskAssignByMeForSerilizationAndDeserilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

class Manager implements Serializable{
	private int managerId;
	private String managerFirstName;
	private String managerLastName;
	private String managerAddress;
	private String managerPincode;
	public Manager(int managerId, String managerFirstName, String managerLastName, String managerAddress,
			String managerPincode) {
		super();
		this.managerId = managerId;
		this.managerFirstName = managerFirstName;
		this.managerLastName = managerLastName;
		this.managerAddress = managerAddress;
		this.managerPincode = managerPincode;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerFirstName=" + managerFirstName + ", managerLastName="
				+ managerLastName + ", managerAddress=" + managerAddress + ", managerPincode=" + managerPincode + "]";
	}
	
}

class Student implements Serializable{
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentAddress;
	private String studentPincode;
	public Student(int studentId, String studentFirstName, String studentLastName, String studentAddress,
			String studentPincode) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAddress = studentAddress;
		this.studentPincode = studentPincode;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentAddress=" + studentAddress + ", studentPincode=" + studentPincode + "]";
	}
	
	
}

class Employ implements Serializable{
	private int employId;
	private String employFirstName;
	private String employLastName;
	private String employAddress;
	private String employPincode;
	public Employ(int employId, String employFirstName, String employLastName, String employAddress,
			String employPincode) {
		super();
		this.employId = employId;
		this.employFirstName = employFirstName;
		this.employLastName = employLastName;
		this.employAddress = employAddress;
		this.employPincode = employPincode;
	}
	@Override
	public String toString() {
		return "Employ [employId=" + employId + ", employFirstName=" + employFirstName + ", employLastName="
				+ employLastName + ", employAddress=" + employAddress + ", employPincode=" + employPincode + "]";
	}
	
	
}

class Admin implements Serializable{
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminAddress;
	private String adminPincode;
	public Admin(int adminId, String adminFirstName, String adminLastName, String adminAddress, String adminPincode) {
		super();
		this.adminId = adminId;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminAddress = adminAddress;
		this.adminPincode = adminPincode;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminFirstName=" + adminFirstName + ", adminLastName=" + adminLastName
				+ ", adminAddress=" + adminAddress + ", adminPincode=" + adminPincode + "]";
	}
	
	
}

public class TaskSolutionGivenByMe {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Manager>  managerList = new ArrayList<Manager>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Employ> employList = new ArrayList<Employ>();
		ArrayList<Admin> adminList = new ArrayList<Admin>();

		
		
//		The Manager Data Here 
		managerList.add(new Manager(1, "Muarari", "Singh", "Bangalore", "220090"));
		managerList.add(new Manager(2, "Muarari", "Singh", "Bangalore", "220090"));
		managerList.add(new Manager(3, "Muarari", "Singh", "Bangalore", "220090"));
		managerList.add(new Manager(4, "Muarari", "Singh", "Bangalore", "220090"));
		managerList.add(new Manager(5, "Muarari", "Singh", "Bangalore", "220090"));
		System.out.println("the Manager List is ");
		System.out.println(managerList);
		
//		The Student Data Here
		studentList.add(new Student(1, "Harish", "kUmar", "Lucknow", "228080"));
		studentList.add(new Student(2, "Harish", "kUmar", "Lucknow", "228080"));
		studentList.add(new Student(3, "Harish", "kUmar", "Lucknow", "228080"));
		studentList.add(new Student(4, "Harish", "kUmar", "Lucknow", "228080"));
		studentList.add(new Student(5, "Harish", "kUmar", "Lucknow", "228080"));
		System.out.println("The Student list is ");
		System.out.println(studentList);
		
//		The Employ Data Here
		employList.add(new Employ(1,"Abhisek", "sarangi", "odisa", "229090"));
		employList.add(new Employ(2,"Abhisek", "sarangi", "odisa", "229090"));
		employList.add(new Employ(3,"Abhisek", "sarangi", "odisa", "229090"));
		employList.add(new Employ(4,"Abhisek", "sarangi", "odisa", "229090"));
		employList.add(new Employ(5,"Abhisek", "sarangi", "odisa", "229090"));
		System.out.println("The Employ Data is");
		System.out.println(employList);
		
//		Admin Data Here 
		
		adminList.add(new Admin(1,"Ramana", "kutty", "Bangalore", "200029"));
		adminList.add(new Admin(2,"Ramana", "kutty", "Bangalore", "200029"));
		adminList.add(new Admin(3,"Ramana", "kutty", "Bangalore", "200029"));
		adminList.add(new Admin(4,"Ramana", "kutty", "Bangalore", "200029"));
		adminList.add(new Admin(5,"Ramana", "kutty", "Bangalore", "200029"));
		
		System.out.println("The Admin Data is ");
		System.out.println(adminList);
		
//		File Parts Here
		String managerPath = "C:\\Users\\sunilg\\Desktop\\TaskTryToComplete\\ManagerFileName.txt";
		String studentPath = "C:\\Users\\sunilg\\Desktop\\TaskTryToComplete\\StudentFileName.txt";
		String employPath = "C:\\Users\\sunilg\\Desktop\\TaskTryToComplete\\EmployFileName.txt";
		String adminPath = "C:\\Users\\sunilg\\Desktop\\TaskTryToComplete\\AdminFileName.txt";

		
		
		
//		Path ManagerFileName = Paths.get(managerPath);
//		Path StudentFileName = Paths.get(studentPath);
//		Path EmployFileName = Paths.get(employPath);
//		Path AdminFileName = Paths.get(adminPath);
		
//		Files.write(ManagerFileName, managerList);
//		
//		 FileOutputStream fos = new FileOutputStream("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\SerilizationOfEmploy.txt");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(employees);
//         oos.close();
//         fos.close();
		
//		1 : Serilizing the Manager Data 
		FileOutputStream fos = new FileOutputStream(managerPath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(managerList);
		oos.close();
		fos.close();
		
//		1 : Deserilizing the Manager Data
       
		FileInputStream fis = new FileInputStream(managerPath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		managerList = (ArrayList<Manager>) ois.readObject();
		ois.close();
		fis.close();
 		System.out.println("after Deserilizing the Manager Data ");
 		
 		for(Manager manager : managerList) {
 			System.out.println(manager);
 		}
 		
// 		Student Data
 		System.out.println("Student Data ");
 		FileOutputStream fos11 = new FileOutputStream(studentPath);
 		ObjectOutputStream oos11 = new ObjectOutputStream(fos11);
 		oos11.writeObject(studentList);
 		oos11.close();
 		fos11.close();
 		
 		FileInputStream fis11 = new FileInputStream(studentPath);
 		ObjectInputStream ois11 = new ObjectInputStream(fis11);
 		
 		studentList = (ArrayList<Student>) ois11.readObject();
 		ois11.close();
 		fis11.close();
 		for(Student student:studentList) {
 			System.out.println(student);
 		}
 		
 		System.out.println("Employ Data ");
 		
 		FileOutputStream fos22 = new FileOutputStream(employPath);
 		ObjectOutputStream oos22 = new ObjectOutputStream(fos22);
 		oos22.writeObject(employList);
 		
 		FileInputStream fis22 = new FileInputStream(employPath);
 		ObjectInputStream ois22 = new ObjectInputStream(fis22);
 		employList = (ArrayList<Employ>) ois22.readObject();
 		ois22.close();
 		fis22.close();
 		
 		for(Employ employ: employList) {
 			System.out.println(employ);
 		}
 		
 		System.out.println("Admin Data ");
 		
 		FileOutputStream fos33 = new FileOutputStream(adminPath);
 		ObjectOutputStream oos33 = new ObjectOutputStream(fos33);
 		oos33.writeObject(adminList);
 		
 		FileInputStream fis33 = new FileInputStream(adminPath);
 		ObjectInputStream ois33 = new ObjectInputStream(fis33);
 		adminList = (ArrayList<Admin>) ois33.readObject();
 		ois33.close();
 		fis33.close();
 		
 		for(Admin admin: adminList) {
 			System.out.println(admin);
 		}

		FileInputStream fis44 = new FileInputStream(managerPath);
		FileInputStream fis45 = new FileInputStream(studentPath);
		FileInputStream fis46 = new FileInputStream(employPath);
		FileInputStream fis47 = new FileInputStream(adminPath);

		// Now i am writeing all data to the file
		Vector vec = new Vector<>();
		vec.add(fis44);
		vec.add(fis45);
		vec.add(fis46);
		vec.add(fis47);

		Enumeration e = vec.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		int i = 0;
		while ((i = sis.read()) != -1) {
			System.out.println((char) i);
		}
		FileInputStream fis66 = new FileInputStream(managerPath);
		ObjectInputStream ois66 = new ObjectInputStream(fis66);
		managerList = (ArrayList<Manager>) ois66.readObject();
		ois66.close();
		fis66.close();
		System.out.println("after Deserilizing the Manager Data ");

		for (Manager manager : managerList) {
			System.out.println(manager);
		}


		
	}

}
