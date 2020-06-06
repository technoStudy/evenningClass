package day50.tasks.task1;

import day50.tasks.task1.msFiles.*;

public class Explorer {

    public static void main(String[] args) {
        MSOffice file1 = new PowerPointFile();
        workWithFile(file1);

        MSOffice file2 = new TxtFile();
        workWithFile(file2);

        MSOffice file3 = new ExcelFile();
        workWithFile(file3);


    }

    public static void workWithFile(MSOffice officeFile) {
        System.out.println("===========" + officeFile.getClass().getSimpleName() + "==================");
        System.out.println(officeFile.open());
        System.out.println(officeFile.read());
        System.out.println(officeFile.save());
        System.out.println(officeFile.close());


        if(officeFile instanceof PowerPointFile) {
            PowerPointFile pptFile = (PowerPointFile) officeFile;
            System.out.println(pptFile.slides());
        }else if(officeFile instanceof ExcelFile){
            ExcelFile excelFile = (ExcelFile) officeFile;
            System.out.println(excelFile.formula());
        }



    }


    public static void option1() {
//        System.out.println("----WORD-----");
//        workWithFile(file1);
//        System.out.println("----EXCEL-----");
//        workWithFile(file2);
//        System.out.println("----POWER POINT-----");
//        workWithFile(file3);
//        System.out.println("----TXT FILE-----");
//        workWithFile(file4);
    }


    public static void part2(String[] args) {
        WordFile file1 = new WordFile();
        ExcelFile file2 = new ExcelFile();
        PowerPointFile file3 = new PowerPointFile();
        TxtFile file4 = new TxtFile();

        workWithFile(file1);
        workWithFile(file2);
        workWithFile(file3);
        workWithFile(file4);


    }
}
