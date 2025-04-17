package cp213;

import java.time.LocalDate;

/**
 * Tests the Student class.
 *
 * @author Giuseppe Akbari
 * @version 2024-09-23
 */
public class Main {

	public static void main(String[] args) {
		final String line = "-".repeat(40);
		int id = 123456;
		String surname = "Brown";
		String forename = "David";
		LocalDate birthDate = LocalDate.parse("1962-10-25");
		Student student = new Student(id, surname, forename, birthDate);
		System.out.println("New Student:");
		System.out.println(student);
		System.out.println(line);
		System.out.println("Test Getters");

		// call getters here

		System.out.println("ID:        " + student.getId());
		System.out.println("Surname:   " + student.getSurname());
		System.out.println("Forename:  " + student.getForename());
		System.out.println("Birthdate: " + student.getBirthDate());

		System.out.println(line);
		System.out.println("Test Setters");

		// call setters here

		student.setId(45);
		student.setSurname("hi");
		student.setForename("akba");
		student.setBirthDate(LocalDate.parse("2005-12-14"));

		System.out.println("Updated Student:");
		System.out.println(student);
		System.out.println(line);
		System.out.println("Test compareTo");

		// create new Students - call comparisons here
		Student student1 = new Student(55, "gius", "help", LocalDate.parse("2005-12-19"));
		Student student2 = new Student(76, "yelp", "mope", LocalDate.parse("2005-11-19"));

		System.out.println(student.compareTo(student));
		System.out.println(student.compareTo(student1));
		System.out.println(student.compareTo(student1));
		System.out.println(student1.compareTo(student2));
	}

}
