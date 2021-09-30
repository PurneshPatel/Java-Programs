package runnable_tasks;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;

import com.app.core.Student;
import static utils.IOUtils.writeData;


public class GPASorterTask implements Runnable {
	private Map<String, Student> students;
	private String fileName;

	public GPASorterTask(Map<String, Student> students, String fileName) {
		super();
		this.students = students;
		this.fileName = fileName;
		System.out.println("invoked by : " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			//map ---> collection ---> stream --> sorted (Comparator)
			Stream<Student> sortedStudent = students.values(). //Collection<Student>
			stream(). //Stream<Student> : un sorted 
			sorted(Comparator.comparing(Student::getGpa)); //Stream<Student> : sorted as per GPA
			//pass this sorted strm of students to IOUtils n save these details
			writeData(sortedStudent, fileName);
			System.out.println("data write complete.....");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
