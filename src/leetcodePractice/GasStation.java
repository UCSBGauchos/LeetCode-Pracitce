package leetcodePractice;

public class GasStation {
	
	public int help(int tank, int start, int current, int index, int length, int [] gas, int [] cost){
		if(index == length-1){
			return start;
		}
		//if can travel
		tank = tank+gas[current];
		if(tank>=cost[current]){
			int newTank = tank-cost[current];
			int newCur = current+1;
			int newIndex = index+1;
			int result = help(newTank, start, newCur, newIndex, length, gas, cost);
			if(result!=-1){
				return start;
			}else{
				return -1;
			}
		}else{
			return -1;
		}
	}
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
		for(int i=0; i<gas.length; i++){
			int index = 0;
			int start = i;
			int length = gas.length;
			int current = start;
			int tank = 0;
			int result = help(tank, start, current, index, length, gas, cost);
			if(result != -1){
				return result;
			}
		}
		return -1;
	} 
	
	public static void main(String [] args){
		GasStation g = new GasStation();
		int [] gas = {1,2,3};
		int [] cost = {1,2,3};
		System.out.println(g.canCompleteCircuit(gas, cost));		
	}
}
