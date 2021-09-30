package tester;

import java.util.ArrayList;

import com.app.core.Emp;
import com.app.core.Manager;

public class Test1 {

	public static void main(String[] args) {
		// For creating a populated AL of type E
		// ArrayList(Collection<? extends E> coll)
		// ? : un bounded wild card
		// extends : upper bound
		// ? extends E : E or it's sub type
		ArrayList<Manager> mgrs = new ArrayList<>();
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		// mgrs : AL<Manager> : populated list of mgrs
		ArrayList<Emp> emps = new ArrayList<>(mgrs);// javac chks mgrs : is it a Collection ?
		// is AL a Collection ? YESS, chks for generic type : allowed types are ?
		// extends Emp => Emp or it's sub type
		// Above constr implies that you can create a populated ArrayList of Emp from
		// ANY Collection(AL/LL/Vector/HS/LHS/TS) of the geenric type Emp or its sub
		// type(Mgr,W,HRM,TempW....)

	}

}
