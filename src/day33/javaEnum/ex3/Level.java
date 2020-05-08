package day33.javaEnum.ex3;

public enum Level {
    HIGH(1), // 1
    MEDIUM(2), // 2
    LOW(3); // 3

    public int levelNumber;

    Level(int i) {
        levelNumber = i;
    }
}

enum StudentGrade {
    FAIL("F"),
    PASS("P");

    public String gradeLetter;

    // all enum constructors are private by default
    StudentGrade(String p) {
        if(p.equalsIgnoreCase("F")) {
            System.out.println("Fail is used");
        }

        gradeLetter = p;
    }

    public void prettyPrint() {
        System.out.println("Enum: " + this);
        System.out.println("Value: " + this.gradeLetter);
    }
}