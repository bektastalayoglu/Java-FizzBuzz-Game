public class FizzBuzz {
    private int firstNumber;
    private int lastNumber;
    public FizzBuzz(int firstNumber, int lastNumber){
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
    }

    public String getFizzBuzz(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3== 0) {
            return "Fizz";
        } else if (number % 5 == 0){
            return "Buzz";
        } else{
            return String.valueOf(number); // Covert integer to string
        }
    }
    public void fizzBuzz(){
        if (this.firstNumber == this.lastNumber){
            fizzBuzzOne(this.firstNumber);
        }else {
            for (int i = this.firstNumber; i <= this.lastNumber; i++) {
                System.out.println(getFizzBuzz(i));
            }
        }
    }

    public void fizzBuzzOne(int number){
       System.out.println(getFizzBuzz(number));
    }

    public static void main(String[] args){
        FizzBuzz fizzbuzz = new FizzBuzz(30,30);
        fizzbuzz.fizzBuzz();
    }
}
