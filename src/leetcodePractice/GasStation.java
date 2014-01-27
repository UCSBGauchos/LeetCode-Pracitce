package leetcodePractice;

public class GasStation {
	
	public boolean help(int curIndex, int oil, int finish, int [] gas, int [] cost){
		System.out.println("Has finish "+finish);
		System.out.println("Now at "+curIndex);
		int realIndex = curIndex%gas.length;
		System.out.println("Need "+cost[realIndex]+" to go next");
		finish = finish+1;
		if(finish == gas.length){
			return true;
		}
		oil = oil+gas[realIndex];
		System.out.println("Now has "+oil+" oil");
		if(oil>=cost[realIndex]){
			help(curIndex+1, oil-cost[realIndex], finish, gas, cost);
		}else{
			return false;
		}
		return true;
	}
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
		for(int startIndex = 0; startIndex<gas.length; startIndex++){
			int finish = 0;
			int oil = 0;
			int curIndex = 0;
			if(help(curIndex, oil, finish, gas, cost)){
				return startIndex;
			}
		}
		return -1;
    }
	
	public static void main(String [] args){
		GasStation g = new GasStation();
		int [] gas = {1,2,3,4,5};
		int [] cost = {1,2,3,4,5};
		System.out.println(g.canCompleteCircuit(gas, cost));		
	}
}
