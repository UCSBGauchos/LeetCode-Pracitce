package leetcodePractice;

import java.util.ArrayList;

public class InsertInterval {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int newStart = newInterval.start;
        int newEnd = newInterval.end;
        boolean coverFront = false;
        boolean coverEnd = false;
        int startIndex = 0;
        int endIndex = 0;
        for(Interval i: intervals){
        	if(newStart>=i.start&&newStart<=i.end){
        		newStart = i.start;
        		coverFront = true;
        		startIndex = intervals.indexOf(i);
        	}
        	if(newEnd>=i.start&&newEnd<=i.end){
        		newEnd = i.end;
        		coverEnd = true;
        		endIndex = intervals.indexOf(i);
        	}
        }
        System.out.println(coverFront+" "+coverEnd);
        ArrayList<Interval> tmp = new ArrayList<Interval>();
        tmp.addAll(intervals);
        if(coverFront == true && coverEnd == true){
        	for(Interval i: tmp){
        		if(i.end>=newInterval.start&&i.start<=newInterval.end){
        			intervals.remove(i);
        		}
        	}
        	intervals.add(startIndex, new Interval(newStart, newEnd));
        }else if(coverFront == true && coverEnd == false){
        	intervals.remove(startIndex);
        	intervals.add(startIndex, new Interval(newStart, newInterval.end));
        }else if(coverFront == false && coverEnd == false){
        	int insertIndex = 0;
        	for(Interval i: tmp){
        		if(i.start>newInterval.end){
        			break;
        		}
        		insertIndex++;
        	}
        	intervals.add(insertIndex, newInterval);
        }else if(coverFront == false && coverEnd == true){
        	intervals.remove(endIndex);
        	intervals.add(startIndex, new Interval(newInterval.start, newEnd));
        }
        ArrayList<Interval> reResult = new ArrayList<Interval>();
        reResult.addAll(intervals);
        for(Interval i: intervals){
        	if(i.start>newInterval.start&&i.end<newInterval.end){
        		//System.out.println("Remove "+i.start+" "+i.end);
        		reResult.remove(i);
        	}
        }
        return reResult;
    }
	
	public static void main(String [] args){
		InsertInterval i = new InsertInterval();
		Interval i1 = new Interval(2,7);
		Interval i2 = new Interval(8,8);
		Interval i3 = new Interval(10,10);
		Interval i4 = new Interval(12,13);
		Interval i5 = new Interval(16,19);
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		intervals.add(i5);
		Interval newInterval = new Interval(9,17);
		ArrayList<Interval> result = i.insert(intervals, newInterval);
		for(Interval item: result){
			System.out.println(item.start+" "+item.end);
		}
		
	}
}
