package Enums_in_java;

public class ReportDefect {
    public static void main(String[] args) {

DefectEnum s= DefectEnum.MINOR;
       int days= s.getDays();
       
        System.out.println("Number Of Days to fix :" + days);
    }
}