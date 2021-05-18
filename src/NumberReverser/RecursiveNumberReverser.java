package NumberReverser;

public class RecursiveNumberReverser {
    private int number;
    private Integer remainder;
    private Integer reverse;

    public RecursiveNumberReverser () {
        this.number = 2201;
        this.remainder = 0;
        this.reverse = 0;
    }

    public void Reverse() {
        remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number /= 10;

        if (number != 0 ) {
            this.Reverse();
        }
    }
    public Integer getReversed() {
        return this.reverse;
    }

    public static void main(String[] args) {
        RecursiveNumberReverser recursiveNumberReverser = new RecursiveNumberReverser();
        recursiveNumberReverser.Reverse();
        Integer reversedInt = recursiveNumberReverser.getReversed();
        System.out.print(reversedInt);
    }
}
