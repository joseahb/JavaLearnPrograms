package fibonacci;

public class FibonacciRecursive {
    private Integer prev1, prev2, sum, count;

    public FibonacciRecursive(){
        this.prev1 = 0;
        this.prev2 = 1;
        this.sum = 0;
        this.count = 10;
        getFibonacci(prev1,prev2);
    }

    private void getFibonacci(Integer n1, Integer n2){
        System.out.print(n1+","+n2);
        while(count < 10) {
            sum = n1 + n2;
            getFibonacci(n2, sum);
        }
    }

    public static void main(String[] args) {
        new Fibonacci();
    }
}
