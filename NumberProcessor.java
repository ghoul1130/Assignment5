public class NumberProcessor {
    public void processNumber(String input){
        try{
            int num = Integer.parseInt(input);
            int result = num / 2;
            System.out.println("Result: " + result);
        }catch (NumberFormatException | ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
