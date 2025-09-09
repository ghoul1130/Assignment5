public class GradeValidator {
    public void checkGrade(int grade){
        if(grade <0 || grade > 100){
            throw new IllegalArgumentException("Invalid Grade "+grade);
        }
        System.out.println("Grade is valid!" + grade);
    }
}
