package arraysDemo;

public class Main {

	public static void main(String[] args) {

		// String stud1 = "Furkan";
		// String stud2 = "Emre";
		// String stud3 = "Engin";

		String[] students = { "Furkan", "Emre", "Engin" };

		int i = students.length - 1;
		for (int k = 0; k <= i; k++) {
			System.out.println(students[k]);
		}

		String[] studentss = new String[3];
		studentss[0] = "Ali";
		studentss[1] = "Veli";
		studentss[2] = "Zeynep";

		for (int k = 0; k < studentss.length; k++) {
			System.out.println(studentss[k]);
		}

		for (String ogrenci : studentss) {
			System.out.println(ogrenci);
		}
	}

}
