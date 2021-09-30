package utils;

import static com.app.core.Department.FINANCE;
import static com.app.core.Department.HR;
import static com.app.core.Department.RND;
import static com.app.core.Emp.sdf;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.core.Emp;


public class CollectionUtils {
	//add static method to return populated list of emps
	//(int id, String name, double salary, Department dept, Date joinDate) {

	public static ArrayList<Emp> populateEmpData() throws ParseException
	{
		ArrayList<Emp> list=new ArrayList<>();
		list.add(new Emp(15, "Rama",16000, FINANCE,sdf.parse("1-1-2020")));
		list.add(new Emp(5, "Kiran",45000,RND ,sdf.parse("10-2-2021")));
		list.add(new Emp(25, "Mihir",38000, RND,sdf.parse("1-1-2020")));
		list.add(new Emp(50, "Meera",15000, RND,sdf.parse("15-3-2019")));
		list.add(new Emp(30, "Riya",12000, HR,sdf.parse("1-1-2020")));
		return list;//rets a populated ArrayList to the caller.
				
	}

}
