package day50.tasks.task1.msFiles;

public class WordFile implements MSOffice {
    @Override
    public String open() {
        return "open Word app";
    }

    @Override
    public String read() {
        return "read .docx";
    }

    @Override
    public String save() {
        return "save .docx";
    }

    @Override
    public String close() {
        return "close Word app";
    }
}
