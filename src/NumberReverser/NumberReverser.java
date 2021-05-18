package NumberReverser;

public class NumberReverser {
    private Integer number;
    private Integer reverse;
    private Integer remainder;

    public NumberReverser() {
        this.number = 2048;
        this.remainder = 0;
        this.reverse = 0;
    }

    public Integer Reverse() {
        while(number != 0) {
            remainder = number % 10;
            reverse =  reverse * 10 + remainder;
            number = number/10;

            System.out.print(
                "rem: " + remainder + "\n" +
                "Reverse"  + reverse + "\n" +
                "num:" + number + "\n\n"
            );
        }
        return reverse;
    }

    public static void main(String[] args) {
        NumberReverser numberReverser = new NumberReverser();
        Integer reversedInt = numberReverser.Reverse();
        System.out.print(reversedInt);
    }

}
