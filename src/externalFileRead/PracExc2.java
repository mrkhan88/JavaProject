package externalFileRead;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracExc2 {
    public static void main(String[] args) throws IOException {
        String path ="../DemoJava/Data/Stinfo.xlsx";
        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

       XSSFSheet sheet = wb.getSheetAt(0);

       int totalrows = sheet.getLastRowNum();

       short columns = sheet.getRow(0).getLastCellNum();


        //outer loop return row
        for(int i=0; i<=totalrows; i++){
            XSSFRow row=sheet.getRow(i);

            //inner loop returns columns
            for(int j=0; j<columns; j++){
               XSSFCell cell = row.getCell(j);


               //using if else
               if(cell.getCellType() == CellType.STRING){
                   System.out.print(cell.getStringCellValue());
               }else if(cell.getCellType() == CellType.NUMERIC){
                   System.out.print(cell.getNumericCellValue());
               }



                //using Switch

//               switch (cell.getCellType()){
//                   case STRING:
//                       System.out.print(cell.getStringCellValue()); break;
//
//                   case NUMERIC:
//                       System.out.print(cell.getNumericCellValue()); break;
//               }


                System.out.print(" | ");



            }
            System.out.println();

        }








    }



}
