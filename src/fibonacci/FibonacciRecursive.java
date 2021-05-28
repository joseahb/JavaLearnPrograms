package fibonacci;

public class FibonacciRecursive {
    private Integer prev1, prev2, sum, count;

    public FibonacciRecursive(){
        this.prev1 = 0;
        this.prev2 = 1;
        this.sum = 0;
        this.count = 10;
        getFibonacci();
    }

    private void getFibonacci(){
        System.out.print(prev1+","+prev2);

        for(int i = 0; i < count; i ++) {
            sum = prev1 + prev2;
            System.out.print("," + sum);
        }
    }

    public static void main(String[] args) {
        new Fibonacci();
    }
}
