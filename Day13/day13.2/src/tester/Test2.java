package tester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

import com.app.core.Emp;
import com.app.core.HRManager;
import com.app.core.Manager;
import com.app.core.TempWorker;

public class Test2 {

	public static void main(String[] args) {
		// AL<Emp> (Collection<? extends Emp> c)
		HashSet<Manager> mgrs = new HashSet<>();
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		ArrayList<Emp> emps = new ArrayList<>(mgrs);

		TreeSet<TempWorker> tempWorkers = new TreeSet<>();
		tempWorkers.add(new TempWorker());
		tempWorkers.add(new TempWorker());
		tempWorkers.add(new TempWorker());
		tempWorkers.add(new TempWorker());
		ArrayList<Emp> emps2 = new ArrayList<>(tempWorkers);
		// Vector<HRM> (Collection<? extends HRM> c)
		// Vector<HRManager> hrMgrs=new Vector<HRManager>(mgrs);// javac err : since Mgr
		// IS NOT a HRMgr
//		Vector<HRManager> hrMgrs = new Vector<HRManager>(tempWorkers);// javac err : since TempWorker IS NOT a Mgr

	}

}
