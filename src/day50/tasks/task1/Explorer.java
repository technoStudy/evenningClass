package day50.tasks.task1;

import day50.tasks.task1.msFiles.*;

public class Explorer {

    public static void main(String[] args) {
        PowerPointFile file3 = new PowerPointFile();
        workWithFile(file3);


    }

    public static void workWithFile(MSOffice file) {
        System.out.println("===========" + file.getClass().getSimpleName()+"==================");
        System.out.println(file.open());
        System.out.println(file.read());
        System.out.println(file.save());
        System.out.println(file.close());

        PowerPointFile pptFile = (PowerPointFile) file;
        System.out.println(pptFile.slides());


    }



    public static void option1(){
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
