package assignment;

public class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double percent;

    BulkDiscount(int minimum,double percent){
        this.minimum = minimum;
        this.percent = percent;
    }

    public  double computeDiscount( int count, double itemCost ){
        double discount=0;
        if (count>minimum){
            discount=percent*itemCost*count;  // considering that item cost is the cost of a single item
        }
        return discount;
    }

}

