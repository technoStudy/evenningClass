package day50.tasks.task1.msFiles;

public class PowerPointFile implements MSOffice {
    @Override
    public String open() {
        return "open PowerPoint app";
    }

    @Override
    public String read() {
        return "read .pptx";
    }

    @Override
    public String save() {
        return "save .pptx";
    }

    @Override
    public String close() {
        return "close PowerPoint app";
    }


    public String slides(){
        return "showing slides";
    }
}
