package day45.tasks.task2;

import day45.tasks.task2.documents.FileFormat;
import day45.tasks.task2.documents.Page;
import day45.tasks.task2.documents.WordDocument;

import java.util.ArrayList;
import java.util.List;

public class OfficeSuiteApp {

    public static void main(String[] args) {
        WordDocument manualIntelIJ = new WordDocument();
        manualIntelIJ.setFileName("manual");
        manualIntelIJ.setFileFormat(FileFormat.DOCX);

        Page firstPage = new Page();
        firstPage.setHeader("Intel IJ Manual");
        firstPage.setBody("Click green arrow to run JAVA");
        firstPage.setFooter("2020");

        List<Page> pages = new ArrayList<>();
        pages.add(firstPage);

        manualIntelIJ.setPages(pages);



    }
}
