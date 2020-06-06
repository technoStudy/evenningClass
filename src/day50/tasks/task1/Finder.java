package day50.tasks.task1;

import day50.tasks.task1.msFiles.MSOffice;
import day50.tasks.task1.msFiles.PowerPointFile;
import day50.tasks.task1.msFiles.TxtFile;

public class Finder {

    public static void main(String[] args) {
        MSOffice txtFile = new TxtFile();
        PowerPointFile pptFile = (PowerPointFile) txtFile;
    }


    public static void part1() {
        MSOffice officeFile = new PowerPointFile();
//        officeFile.open();
//        officeFile.read();
//        officeFile.save();
//        officeFile.close();

        //down casting
        PowerPointFile pptFile = (PowerPointFile) officeFile;
//        pptFile.open();
//        pptFile.read();
//        pptFile.save();
//        pptFile.close();
        //pptFile.slides();
    }
}
