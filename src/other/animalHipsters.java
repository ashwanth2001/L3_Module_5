package other;

import java.util.*;

public class animalHipsters {

	public ArrayList<String> findHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> animals){
		ArrayList<String> ret = new ArrayList<String>();
		Set<String> set = network.keySet();
		String[] names = new String[network.size()];
		set.toArray(names);
		for(int i = 0; i<names.length; i++) {
			boolean check = true;
			ArrayList<String> save = network.get(names[i]);
			String anim = animals.get(names[i]);
			System.out.print(anim + ": ");
			for(int j = 0; j<save.size(); j++) {
				String a1 = animals.get(save.get(j));
				System.out.print(a1 + ", ");
				if(a1.equalsIgnoreCase(anim)) {
					check = false;
					break;
				}
			}
			if(check == true) {
				ret.add(names[i]);
			}
			System.out.println("");
		}
		System.out.println(ret.size() + "\n");
		return ret;
	}
}
