package leetcodePractice;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SubSet {
	
	ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> allSubSet(List<Integer> set){
		int last = set.get(0);
		List<Integer> remain = set.subList(1, set.size());
		if(remain.size()==0){
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
			list1.add(last);
			lists.add(list1);
			lists.add(list2);
			allSubSets.add(list1);
			allSubSets.add(list2);
			return lists;
		}
		ArrayList<ArrayList<Integer>> preLists = allSubSet(remain);
		ArrayList<ArrayList<Integer>> curLists = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> preList: preLists){
			ArrayList<Integer> tmpList = new ArrayList<Integer>();
			tmpList.addAll(preList);
			tmpList.add(last);
			curLists.add(tmpList);
			allSubSets.add(tmpList);
		}
		return curLists;
		
	}
	
	public ArrayList<ArrayList<Integer>> removeDup(ArrayList<ArrayList<Integer>> lists){
		ArrayList<ArrayList<Integer>> newLists = new ArrayList<ArrayList<Integer>>();
		Hashtable<ArrayList<Integer>, Boolean> hash = new Hashtable<ArrayList<Integer>, Boolean>();
		for(ArrayList<Integer> list: lists){
			if(!hash.containsKey(list)){
				hash.put(list, true);
				newLists.add(list);
			}
		}
		return newLists;
	}
	
	public static void main(String [] args){
		
		SubSet ss = new SubSet();
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(2);
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		ss.allSubSet(set);
		
		System.out.println(ss.removeDup(ss.allSubSets));
	}
}
