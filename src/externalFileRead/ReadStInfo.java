package externalFileRead;


import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;


public class ReadStInfo {

    public static void main(String[] args) throws Exception {

        ReadStInfo.readData();


        /*File filePath = new File("../DemoJava/Data/Stinfo.xlsx");
        FileInputStream fis = new FileInputStream(filePath);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        int totalRows = sheet.getLastRowNum();
        int totalColumns = sheet.getRow(0).getLastCellNum();


        for(int r=0; r<=totalRows; r++){

            XSSFRow row =sheet.getRow(r);


            for(int c=0; c<totalColumns; c++){
                XSSFCell cell = row.getCell(c);
                //System.out.println(cell.getStringCellValue());

                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue()); break;

                    case NUMERIC:    System.out.print(cell.getNumericCellValue());   break;
                    case BOOLEAN:    System.out.print(cell.getBooleanCellValue());    break;
                }
                System.out.print(" | ");


            }
            System.out.println();

        }*/




    }



    public static void readData(){

        XSSFWorkbook wb;
        XSSFSheet sheet=null;


        File filePath = new File("../DemoJava/Data/Stinfo.xlsx");
        try {
            FileInputStream fis = new FileInputStream(filePath);

            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheetAt(0);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        int totalRows = sheet.getLastRowNum();
        int totalColumns = sheet.getRow(0).getLastCellNum();


        for(int r=0; r<=totalRows; r++){

            XSSFRow row =sheet.getRow(r);


            for(int c=0; c<totalColumns; c++){
                XSSFCell cell = row.getCell(c);
                //System.out.println(cell.getStringCellValue());

                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue()); break;

                    case NUMERIC:    System.out.print(cell.getNumericCellValue());   break;
                    case BOOLEAN:    System.out.print(cell.getBooleanCellValue());    break;
                }
                System.out.print(" | ");


            }
            System.out.println();

        }





    }



}
