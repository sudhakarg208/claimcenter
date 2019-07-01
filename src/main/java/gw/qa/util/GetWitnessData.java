package gw.qa.util;

import java.util.ArrayList;

public class GetWitnessData {
	
	
	public static ArrayList<Object[]> getData() {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Vignesh\\Downloads\\" + "witnessdata.XLSX");
		ArrayList<Object[]> list = new ArrayList<Object[]>();
		for(int i =2;i<= reader.getRowCount("Sheet1"); i++) {
			String lastName = reader.getCellData("Sheet1", "LastName", i);
			String perspective = reader.getCellData("Sheet1", "Perspective", i);
			list.add(new Object[] {lastName,perspective});
		}
		return list;
		}


}
