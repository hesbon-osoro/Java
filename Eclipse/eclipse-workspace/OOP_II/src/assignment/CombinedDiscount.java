package assignment;

public class CombinedDiscount extends DiscountPolicy {
	   private DiscountPolicy x;
	   private DiscountPolicy y;
	    CombinedDiscount(DiscountPolicy x,DiscountPolicy y){
	        this.x=x;
	        this.y=y;
	    }

	    @Override
	    public double computeDiscount(int count, double itemCost) {
	        double maximumDiscount ;

	        double discountX = x.computeDiscount( count, itemCost) ;
	        double discountY = y.computeDiscount(count, itemCost);

	        maximumDiscount = (discountX > discountY) ? discountX : discountY;
	        return maximumDiscount;


	    }
	}
