package day45.tasks.task2.documents;

public class ExcelDocument extends Document {
    private String cell[][];

    public String[][] getCell() {
        return cell;
    }

    public void setCell(String[][] cell) {
        this.cell = cell;
    }
}
