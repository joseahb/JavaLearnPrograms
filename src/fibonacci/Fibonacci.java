package fibonacci;

public class Fibonacci {
    private Integer prev1;
    private Integer prev2;
    private Integer count;
    private Integer sum;

    public Fibonacci() {
        this.prev1 = 0;
        this.prev2 = 1;
        this.count = 10;

        getFibonacci();
    }

    public String getFibonacci(){
        System.out.print(prev1 + "," + prev2);

        for(int i = 0; i < count; i ++){
            sum = prev1 + prev2;
            System.out.print("," + sum);
            prev1 = prev2;
            prev2 = sum;
        }
        return null;
    }

    public static void main(String[] args) {
        new Fibonacci();
    }

 }

