
import java.util.ArrayList;

public class WordReference {
     private int cnt;
     private ArrayList<String> lineStore;
     public WordReference(){ 
    	 lineStore = new  ArrayList<String>();
    	 cnt=1;
    	 }
     public int getCnt() { 
    	 return cnt;
    	 }
     
     /* adds a new word occurrence into the internal list */
     public void add(int l) {
    	 cnt=cnt+1;
    	 lineStore.add(""+l);
    	 }
     public void Print(){
    	 for (int i=0;i<lineStore.size();i++){
    		 System.out.print(lineStore.get(i)+" ");
    	 }
     }
	public ArrayList<String> getLineStore() {
		return lineStore;
	}
	
     
}