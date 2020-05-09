package day33.javaEnum;

enum Level {
    HIGH,
    MEDIUM,
    LOW
}

class Ex1{

    public static void main(String[] args) {
        Level level = Level.HIGH;

        System.out.println(level);
    }
}