package day50.tasks.task1.msFiles;

public class TxtFile implements MSOffice {
    @Override
    public String open() {
        return "open Notepad app";
    }

    @Override
    public String read() {
        return "read .txt";
    }

    @Override
    public String save() {
        return "save .txt";
    }

    @Override
    public String close() {
        return "close Notepad app";
    }
}
