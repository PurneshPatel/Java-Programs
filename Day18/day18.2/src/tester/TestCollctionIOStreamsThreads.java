package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DobSorterTask;
import runnable_tasks.GPASorterTask;

public class TestCollctionIOStreamsThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//accept filenames
			System.out.println("Enter file name for storing DoB based results");
			String fileName1=sc.nextLine();
			System.out.println("Enter file name for storing GPA based results");
			String fileName2=sc.nextLine();
			//get sample data
			Map<String , Student> map=populateMap(populateList());
			//Thread(Runnable instance , String thrdName)
			Thread t1=new Thread(new DobSorterTask(map, fileName1), "dob_sorter");
			Thread t2=new Thread(new GPASorterTask(map, fileName2), "gpa_sorter");
			//t1 , t2 : NEW
			t1.start();
			t2.start();
			//runnable : main , dob_sorter , gpa_sorter
			System.out.println("waiting for child thrds to complete exec....");
			t1.join();
			//t1 : dead
			t2.join();
			//t2 :dead
			System.out.println("child thrds over....");
			System.out.println("main thread getting over...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
