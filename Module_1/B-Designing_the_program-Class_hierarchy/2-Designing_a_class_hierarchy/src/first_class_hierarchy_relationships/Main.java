package first_class_hierarchy_relationships;

	public class Main{
		public static void main(String[] args) {
			Date date1 = new Date(1,1,2005);
			Date date2 = new Date(10, 10, 1995); // dob of teacher
			Date date3 = new Date(1, 4, 2024); // dateOfAppointment
			Teacher teacher = new Teacher("Madhavan", date2, date3, "MTech", "Electronics");
			teacher.setSalary();
			Student student = new Student("Belinda", date1, teacher, "Electronics");
			teacher.getDetails();
			student.getDetails();
		}
	}	

