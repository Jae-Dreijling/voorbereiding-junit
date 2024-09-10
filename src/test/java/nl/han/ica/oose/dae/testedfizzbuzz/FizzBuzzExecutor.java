package nl.han.ica.oose.dae.testedfizzbuzz;


public class FizzBuzzExecutor {

    public String execute(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }

}
