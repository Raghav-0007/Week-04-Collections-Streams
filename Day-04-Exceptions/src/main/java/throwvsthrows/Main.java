package throwvsthrows;

public class Main {

    // method to calculate interest
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{

        // throw an error if rate and amount is negative
        if(amount<0 || rate<0) throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");

        // calculate the interest
        double interest=amount*rate*years*12/100;
        System.out.println("interest: " + interest);
    }

    // main method to run the program
    public static void main(String[] args) {
        try{
            // try to calculate the interest of given amount
            calculateInterest(10_000, 3, 1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
