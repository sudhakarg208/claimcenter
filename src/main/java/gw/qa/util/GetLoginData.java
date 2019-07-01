package gw.qa.util;

import java.util.ArrayList;

public class GetLoginData {
	
	public static ArrayList<Object[]> getData() {
	Xls_Reader reader = new Xls_Reader("C:\\Users\\Vignesh\\Downloads\\" + "logindata.XLSX");
	ArrayList<Object[]> list = new ArrayList<Object[]>();
	for(int i =2;i<= reader.getRowCount("Sheet1"); i++) {
		String username = reader.getCellData("Sheet1", "UserName", i);
		String password = reader.getCellData("Sheet1", "Password", i);
		list.add(new Object[] {username,password});
	}
	return list;
	}

}
