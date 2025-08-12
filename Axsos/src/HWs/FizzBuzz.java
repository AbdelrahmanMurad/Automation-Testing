package HWs;


public class FizzBuzz {

    public String fizzBuzz(int number) {
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself.
        // Hint: You can use a String method to cast the int to a String.
        int input = number;
        if (input >= 0) {
            if (input % 3 == 0 && input % 5 == 0) {
                return "FizzBuzz";
            } else if (input % 3 == 0) {
                return "Fizz";
            } else if (input % 5 == 0) {
                return "Buzz";
            } else {
                return input + "";
            }
        } else {
            return "Please! Enter Positive Integer Number..";
        }
    }

// NINJA BONUS:
// Create an overloaded method for fizzBuzz
    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {

        // Implement the same logic, but replace "Fizz", "Buzz" and
        // "Fizzbuzz" with the given words
        int input = number;
        if (input >= 0) {
            if (input % 3 == 0 && input % 5 == 0) {
                return multOf15Word;
            } else if (input % 3 == 0) {
                return multOf3Word;
            } else if (input % 5 == 0) {
                return multOf5Word;
            } else {
                return input + "";
            }
        } else {
            return "Please! Enter Positive Integer Number..";
        }
    }

    public static void main(String[] args) {
        FizzBuzz f = new FizzBuzz();
        System.out.println(f.fizzBuzz(3)); // Fizz
        System.out.println(f.fizzBuzz(5)); // Buzz
        System.out.println(f.fizzBuzz(15)); // FizzBuzz
        System.out.println(f.fizzBuzz(11)); // 11
        System.out.println(f.fizzBuzz(-2)); // Please! Enter Positive Integer Number..
        System.out.println(f.fizzBuzz(0)); // FizzBuzz
        System.out.println();
        System.out.println(f.fizzBuzz(3, "Devided by 3", "Devided by 5", "Devided by 3 & 5")); // Devided by 3
        System.out.println(f.fizzBuzz(5, "Devided by 3", "Devided by 5", "Devided by 3 & 5")); // Devided by 5
        System.out.println(f.fizzBuzz(15, "Devided by 3", "Devided by 5", "Devided by 3 & 5")); // Devided by 3 & 5
        System.out.println(f.fizzBuzz(0, "Devided by 3", "Devided by 5", "Devided by 3 & 5")); // Devided by 3 & 5
        System.out.println(f.fizzBuzz(-15, "Devided by 3", "Devided by 5", "Devided by 3 & 5")); // Please! Enter Positive Integer Number..
    }

}
