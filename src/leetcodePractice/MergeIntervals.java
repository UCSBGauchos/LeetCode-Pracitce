package leetcodePractice;

import java.util.ArrayList;
import java.util.HashMap;

public class MergeIntervals {
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals){
		Boolean remove = false;
		for(int i=0; i<intervals.size()-1; i++){
			if(intervals.get(i).end>=intervals.get(i+1).start&&intervals.get(i).end<=intervals.get(i+1).end&&intervals.get(i).start<=intervals.get(i+1).start){
				intervals.get(i).end = intervals.get(i+1).end;
				intervals.remove(i+1);
				remove = true;
				i--;
			}else if(intervals.get(i).start>=intervals.get(i+1).start&&intervals.get(i).end<=intervals.get(i+1).end){
				intervals.get(i).start = intervals.get(i+1).start;
				intervals.get(i).end = intervals.get(i+1).end;
				intervals.remove(i+1);
				remove = true;
				i--;
			}else if(intervals.get(i).start<=intervals.get(i+1).start&&intervals.get(i).end>=intervals.get(i+1).end){
				intervals.remove(i+1);
				remove = true;
				i--;
			}else if(intervals.get(i).start<=intervals.get(i+1).end&&intervals.get(i).start>=intervals.get(i+1).start&&intervals.get(i).end>=intervals.get(i+1).end){
				intervals.get(i).start = intervals.get(i+1).start;
				intervals.remove(i+1);
				remove = true;
				i--;
			}
		}
		if(remove == false){
			return intervals;
		}
		return merge(intervals);
	}
	
	public static void main(String [] args){
		MergeIntervals m = new MergeIntervals();
		Interval i1 = new Interval(2,3);
		Interval i2 = new Interval(4,5);
		Interval i3 = new Interval(6,7);
		Interval i4 = new Interval(8,9);
		Interval i5 = new Interval(1,10);
		
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
     	intervals.add(i4);
     	intervals.add(i5);
		
		ArrayList<Interval> result = m.merge(intervals);
		
		for(Interval i: result){
			System.out.println(i.start+" "+i.end);
		}
	}
}
