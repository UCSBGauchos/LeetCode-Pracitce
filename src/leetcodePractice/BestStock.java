package leetcodePractice;

public class BestStock {
	
	public int help(int index, int has, int money, int [] prices){
		if(index == prices.length){
			return money;
		}
		int newHas = 0;
		int newMoney = 0;
		int newIndex = 0;
		int onlySell = 0;
		int sellAndBuy = 0;
		int onlyBuy = 0;
		//sell one
		if(has>=1){
			newHas = has-1;
			newMoney = money+prices[index];
			newIndex = index+1;
			onlySell = help(newIndex, newHas, newMoney, prices);
			sellAndBuy = help(newIndex, has, money, prices);
		}
		newHas = has+1;
		newMoney = money-prices[index];
		newIndex = index+1;
		onlyBuy = help(newIndex, newHas, newMoney, prices);
		return Math.max(sellAndBuy, Math.max(onlySell, onlyBuy));
	}
	
	public int maxProfit(int[] prices) {
		int has = 0;
		int index = 0;
		int money = 0;
		int result = help(index, has, money,  prices);
		return result;
		
    }
	
	public static void main(String [] args){
		BestStock b = new BestStock();
		int [] prices = {2,1,3,5};
		System.out.println(b.maxProfit(prices));
	}
}
