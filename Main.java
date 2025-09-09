import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //---Custom Exception---
        AgeValidator validator = new AgeValidator();
        try {
            validator.validateAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: "+e.getMessage());
        }
        System.out.println();

        //---try-catch-finally blocks---
        SimpleFileReader sf = new SimpleFileReader();
        sf.readFile("src/Example.txt");
        sf.readFile("src/Example1.txt");
        System.out.println();


        //---multi-catch---
        NumberProcessor np = new NumberProcessor();
        np.processNumber("123");
        np.processNumber("abc");
        System.out.println();

        //---checked vs runtime exception---
        BankAccount ba = new BankAccount();
        try {
            ba.withdraw(5);
        }catch (InsufficientFundsException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
        System.out.println();

        //---throw keyword---
        GradeValidator gv = new GradeValidator();
        gv.checkGrade(100);
        System.out.println();

        //---Exception propagation
        DataProcessor dp = new DataProcessor();
        dp.processDataHandle();

        try {
            dp.processDataPropagate();
        } catch (IOException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
        System.out.println();

        //---student management ---
        StudentManagement sm = new StudentManagement();
        try {
            System.out.println("Found: " + sm.findStudent(1).name);
            System.out.println("Found: " + sm.findStudent(10).name);
        } catch (StudentNotFoundException | NullPointerException e) {
            System.out.println("Handled: " + e.getMessage());
        } finally {
            System.out.println("Search operation finished.");
        }
        System.out.println();


    }
}

---OUTPUT---
Caught Exception: Invald Age:200

HELLLOOOOO!
File read successfully.
File not found: src/Example1.txt

Result: 61
Error: For input string: "abc"

Remaining Balance: 995.0

Grade is valid!100

Handled inside DataProcessor: Data not found
Handled in main: Data not found

Found: Alice
Handled: Student not found with ID: 10
Search operation finished.
