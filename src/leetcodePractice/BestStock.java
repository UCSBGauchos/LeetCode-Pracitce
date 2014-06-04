package leetcodePractice;

public class BestStock {
	
	public int maxProfit(int[] prices) {
		int maxprofit = 0;
		for(int i=0; i<prices.length; i++){
			for(int j=i+1; j<prices.length; j++){
				if(prices[j]-prices[i]>=maxprofit){
					maxprofit = prices[j] - prices[i];
				}
			}
		}
		return maxprofit;
    }
	
	public static void main(String [] args){
		BestStock b = new BestStock();
		int [] prices = {2,1,3,5};
		System.out.println(b.maxProfit(prices));
	}
}
