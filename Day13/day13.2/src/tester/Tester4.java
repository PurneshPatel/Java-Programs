package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import com.app.core.Emp;
import com.app.core.TempWorker;

public class Tester4 {

	public static void main(String[] args) {
		/*
		 * public static <T> void copy​(List<? super T> dest, List<? extends T> src)
		 * Copies all of the elements from one list into another.
		 */
		//Using above method , can you copy list(AL/LL/Vector) of temp workers(src) into list of emps(dest)?
		LinkedList<TempWorker> workers=new LinkedList<>();
		workers.add(new TempWorker());
		workers.add(new TempWorker());
		workers.add(new TempWorker());//list of temp workers
		ArrayList<Emp> emps=new ArrayList<>();
		emps.add(new Emp());
		emps.add(new Emp());
		emps.add(new Emp());
		emps.add(new Emp());
		Collections.copy(emps,workers);//what does javac chk ? emps n workers : lists ? YES
		//T : Emp
		//src : TempWorker (? extends Emp) => correct
		//dest : Emp (? super Emp) => Emp or it's super type => correct
		System.out.println(emps);
		

	}

}
