package externalFileRead;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeExcel {


    public static void main(String[] args) throws IOException {

        PracticeExcel.readXcel();



    }

    public static void readXcel() throws IOException {

       String path ="../DemoJava/Data/Stinfo.xlsx";
        FileInputStream finput = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(finput);

        XSSFSheet sheet =wb.getSheetAt(0);

        int totalRows = sheet.getLastRowNum();

        int cloumns = sheet.getRow(0).getLastCellNum();

        for(int i=0; i<=totalRows; i++){

           XSSFRow ro = sheet.getRow(i);


            for(int j=0; j<cloumns; j++){

                XSSFCell cell = ro.getCell(j);


                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()); break;
                }
                System.out.print(" | ");

            }
            System.out.println();
        }


        finput.close();
        wb.close();

    }




}
