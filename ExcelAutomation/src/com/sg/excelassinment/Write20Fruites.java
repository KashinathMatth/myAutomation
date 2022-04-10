package com.sg.excelassinment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write20Fruites {

	public static void main(String[] args) {
		writeFruitsDiagnally();

	}

	private static void writeFruitsDiagnally()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Credentials");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				cell.setCellValue("Fruits"+i);
				fout=new FileOutputStream("F:\\Excel2\\Diagonallyfriuts.xlsx");
				wb.write(fout);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

