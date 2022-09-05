package assignment;

public class BuyNItemsGetOneFree extends DiscountPolicy {
    private int n;
    BuyNItemsGetOneFree(int n){
        this.n=n;

    }
    @Override
    public double computeDiscount( int count, double itemCost ){
        double discount;
        int groupsofn=count/n;
        discount=groupsofn*itemCost;
        return discount;
    }

}
