package com.sg.excelassinment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write20Vegitables {

	public static void main(String[] args) {
		vegetablesNameincolumn();

	}

	private static void vegetablesNameincolumn()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Vegitables");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(9);
				cell.setCellValue("Vegitables"+i);
				fout=new FileOutputStream("F:\\Excel2\\vegetableNmaesincolumn10.xlsx");
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

