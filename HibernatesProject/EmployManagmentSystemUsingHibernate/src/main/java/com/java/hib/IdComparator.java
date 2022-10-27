package com.java.hib;

import java.util.Comparator;

public class IdComparator implements Comparator<EmploySort>{

	@Override
	public int compare(EmploySort o1, EmploySort o2) {
		EmploySort e1 = (EmploySort)o1;
		EmploySort e2 = (EmploySort)o2;
		if(e1.empno==e2.empno) {
			return 0;
		}else if(e1.empno>e2.empno){
			return 1;
		}else {
			return -1;
		}
	}
	
	

}
