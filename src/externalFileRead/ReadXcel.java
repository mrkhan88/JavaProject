package externalFileRead;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadXcel {

    public static void main(String[] args) throws Exception {

        File file = new File("../DemoJava/Data/Stinfo.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Stname");
        String fname = sheet.getRow(0).getCell(0).getStringCellValue();
        //System.out.println(fname);

        String lname = sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(fname+" "+lname);

        wb.close();
        fis.close();





    }





}
