package day50.tasks.task1.msFiles;

public class ExcelFile implements MSOffice {
    @Override
    public String open() {
        return "open Excel app";
    }

    @Override
    public String read() {
        return "read .xlsx";
    }

    @Override
    public String save() {
        return "save .xlsx";
    }

    @Override
    public String close() {
        return "close Excel app";
    }
}
