package leetcodePractice;

public class BuyStock {
	public int getMax(int [] stock){
		int maxProfit = 0;
		for(int i=0;i<stock.length;i++){
			for(int j=0;j<stock.length;j++){
				if((stock[j]-stock[i])>maxProfit){
					maxProfit = stock[j]-stock[i];
				}
			}
		}
		return maxProfit;
	}
	
	public static void main(String [] args){
		//day 1:19
		//day 2:21
		//day 3:25
		//day 4:30
		//day 5:20
		int [] stock = {19,21,25,30,20};
		BuyStock bs = new BuyStock();
		System.out.println(bs.getMax(stock));
	}
}
