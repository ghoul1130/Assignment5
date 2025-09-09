class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Invald Age:" + age);
        }
        System.out.println("Valid Age: " + age);
    }
}
