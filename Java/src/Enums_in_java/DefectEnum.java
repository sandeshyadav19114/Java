package Enums_in_java;

public enum DefectEnum {
    MINOR(1), MAJOR(3) ,CRITICAL(5);

    private  final int Days;

    DefectEnum(int days) {
        Days = days;
    }

    public int getDays() {
        return Days;
    }

}
