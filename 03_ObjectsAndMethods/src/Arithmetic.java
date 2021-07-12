public class Arithmetic {
    private int totalProfit = 5;
    private int totalCosts = 6;

    int addition = 1;
    int multiplication = -1;
    int min = -1;
    int max = -1;

    public Arithmetic(int i, int i1) {
    }


    public static void main(String[] args) {
        System.out.println("(2+3) * (7-4)= " + new Arithmetic(new Arithmetic(2, 3).addition(), new Arithmetic(7, 4).addition()).multiplication());
    }


    public void Arithmetic(int totalProfit, int totalCosts) {
        this.totalProfit = totalProfit;
        this.totalCosts = totalCosts;
    }

    public int addition() {
        return totalProfit + totalCosts;
    }

    public int multiplication() {
        return totalProfit * totalCosts;
    }

    public int min() {
        if (totalCosts <= totalProfit || totalProfit <= totalCosts) ;
        return min;
    }

    public int max() {
        if (totalCosts >= totalProfit || totalProfit >= totalCosts) ;
        return max;

    }


}
