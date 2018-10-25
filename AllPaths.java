import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllPaths {
	public void doPaths(TreeNode root, String str) {
		
	}
	
	public String[] paths(TreeNode t) {
		ArrayList<String> myList = new ArrayList <String> ();
		if (t.left == null && t.right== null) {
			myList.add(t.info + "");
		}
		if (t== null) {
			return myList.toArray(new String [0]);
		}
		for (String s: myList) {
			s= t.info + "->" + s; 
		}
		myList.addAll(Arrays.asList(paths(t.left)));
		myList.addAll(Arrays.asList(paths(t.right)));
		
/*		if (t != null) {
			doPaths(t, "->");
		}*/
		
		Collections.sort(myList);
		return myList.toArray(new String [0]);
	}
}
