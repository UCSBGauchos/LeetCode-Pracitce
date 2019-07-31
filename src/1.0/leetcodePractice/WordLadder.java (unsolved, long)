package leetcodePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


public class WordLadder {
	
	//save the node on path
    public Stack<WordNode> stack = new Stack<WordNode>();  
    //save all path
    public ArrayList<Stack<WordNode>> path = new ArrayList<Stack<WordNode>>(); 
  
    //check whether this node is in the stack
    public boolean isNodeInStack(WordNode node)  
    {  
        Iterator<WordNode> it = stack.iterator();  
        while (it.hasNext()) {  
        	WordNode node1 = it.next();  
            if (node == node1)  
                return true;  
        }  
        return false;  
    }  
  
   
    
    public boolean getPaths(WordNode current, WordNode start, WordNode end){
    	stack.push(current);
    	if(current.word.equals(end.word)){
    		Stack<WordNode> tmpStack = new Stack<WordNode>();
    		Iterator<WordNode> it = stack.iterator();  
            while (it.hasNext()) {  
            	WordNode node1 = it.next();  
                tmpStack.push(node1);
            }  
    		path.add(tmpStack);  
    		return true;
    	}
    	for(WordNode node: current.adjacent){
    		if(isNodeInStack(node)){
    			continue;
    		}
    		if(getPaths(node, start, end)){
    			stack.pop();
    		}
    	}
    	stack.pop();
    	return false;
    }
	
	public void createGraph(WordNode start, ArrayList<WordNode> dict, WordNode end){
		ArrayList<WordNode> list = new ArrayList<WordNode>();
		list.add(start);
		list.addAll(dict);
		list.add(end);
		for(WordNode w: list){
			for(WordNode remain: list){
				if(justOne(w,remain)){
					w.adjacent.add(remain);
				}
			}
		}
	}
	
	public boolean justOne(WordNode word1, WordNode word2){
		int sum=0;
		for(int i=0; i<word1.word.length();i++){
			if(word1.word.charAt(i)!=word2.word.charAt(i)){
				sum++;
			}
		}
		if(sum==1){
			return true;
		}
		return false;
	}

	
	
	
	public static void main(String [] args){
		WordNode start = new WordNode("hit");
		WordNode end = new WordNode("cog");
		ArrayList<WordNode> dict = new ArrayList<WordNode>();
		dict.add(new WordNode("hot"));
		dict.add(new WordNode("dot"));
		dict.add(new WordNode("dog"));
		dict.add(new WordNode("lot"));
		dict.add(new WordNode("log"));
		WordLadder wl = new WordLadder();
		wl.createGraph(start, dict, end);
		wl.getPaths(start, start, end);
		for(Stack<WordNode> list: wl.path){
			Iterator<WordNode> it = list.iterator();  
            while (it.hasNext()) {  
            	WordNode node1 = it.next();  
                System.out.print(node1.word+" ");
            }  
            System.out.println();
		}
		//System.out.println(wl.path.size());
		
	}
}
