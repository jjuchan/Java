package cond.ex;

public class GradeEx {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월");
                break;
            case "B":
                System.out.println("좋은");
                break;
            case "C":
                System.out.println("준수");
                break;
            case "D":
                System.out.println("향상");
                break;
            case "F":
                System.out.println("불합");
                break;
            default:
                System.out.println("잘못된 학점");
        }
    }
}
