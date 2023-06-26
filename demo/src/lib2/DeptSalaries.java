package lib2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DeptSalaries {

	public static void main(String[] args) throws Exception {
		var p = Path.of("d:\\classroom\\may12\\salaries.txt");

		var depts = new LinkedHashMap<String, Integer>();

		for (var line : Files.readAllLines(p)) {
			var parts = line.split(",");
			var dept = parts[0]; // dept name 
			var salary = Integer.parseInt(parts[1]);  // salary 

			if (depts.containsKey(dept))  // Dept already found so add salary to total
				depts.put(dept, depts.get(dept) + salary);
			else
				depts.put(dept, salary); // New dept, so put an entry 
		}
		
		for(var key : depts.keySet())
		{
			System.out.printf("%-10s   %6d\n",  key, depts.get(key));
		}
		
		

	}

}
