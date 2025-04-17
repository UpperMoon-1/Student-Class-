package cp213;

import java.time.LocalDate;

/**
 * Student class definition.
 *
 * @author Giuseppe Akbari
 * @version 2024-09-17
 */
public class Student implements Comparable<Student> {

	// Attributes
	private LocalDate birthDate = null;
	private String forename = "";
	private int id = 0;
	private String surname = "";

	/**
	 * Instantiates a Student object.
	 *
	 * @param id        169057752
	 * @param surname   Akbari
	 * @param forename  Giuseppe
	 * @param birthDate birthDate in '2005-12-14' format
	 */
	public Student(int id, String surname, String forename, LocalDate birthDate) {

		// assign attributes here
		this.id = id;
		this.surname = surname;
		this.forename = forename;
		this.birthDate = birthDate;

		return;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString() Creates a formatted string of student data.
	 */
	@Override
	public String toString() {
		String string = "";

		// your code here
		string += String.format("Name:      %s, %s\n", surname, forename);
		string += String.format("ID:        %d\n", id);
		string += String.format("Birthdate: %s\n", birthDate.toString());
		return string;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(final Student target) {
		int result = 0;

		// your code here
		result = this.surname.compareTo(target.surname);
		if (result == 0) {
			result = this.forename.compareTo(target.forename);
		}
		if (result == 0) {
			result = Integer.valueOf(this.id).compareTo(Integer.valueOf(target.id));
		}

		return result;
	}

	// getters and setters defined here
	// getters
	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getForename() {
		return forename;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	// setters
	public void setId(int id) {
		this.id = id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
