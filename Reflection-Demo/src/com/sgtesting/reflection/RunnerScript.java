package com.sgtesting.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RunnerScript {

	public static void main(String[] args) {
		executeAllScenarios();

	}

	private static void executeAllScenarios()
	{
		FileInputStream fin=null;
		String filePath=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			filePath=System.getProperty("user.dir");
			String filename=filePath+"\\DataFiles\\data_Runner.xlsx";
			fin=new FileInputStream(filename);
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();

				System.out.println(pkgclassname+"  --> "+methodname);

				Class clsObject=Class.forName(pkgclassname);
				Object obj=clsObject.getDeclaredConstructor().newInstance();

				Method method=obj.getClass().getMethod(methodname);

				method.invoke(obj);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
