package externalFileRead;

import org.apache.poi.xssf.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GetData {

    public static void main (String [] args) throws Exception {

        File source = new File("../DemoJava/Data/Stinfo.xlsx");

        FileInputStream fis = new FileInputStream(source);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheetAt(0);

        // to get the number of rows
        int rows = sheet.getLastRowNum();
        //System.out.println(rows);

        //get total columns : using getRow() we'll count row from first row, getlastCellNum() returns total numberOF columns
        int columns = sheet.getRow(0).getLastCellNum();

        //Parent loop check for Rows
        for(int i=0; i<=rows; i++){
            XSSFRow ro = sheet.getRow(i);

            //inner loop check for Columns
            for(int j=0; j<columns; j++){
                XSSFCell cell = ro.getCell(j);

                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
//                    case BOOLEAN:
//                        System.out.print(cell.getBooleanCellValue()); break;
                }
                System.out.print(" || ");
            }
            System.out.println();
        }




        wb.close();
        fis.close();

    }
}
