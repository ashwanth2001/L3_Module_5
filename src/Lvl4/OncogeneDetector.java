package Lvl4;

import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String string) {

		int healthy = 0;
		int cancer = 0;
		int l = string.length();
		int num = 0;

		for (int i = 0; i < healthySequences.size(); i++) {
			String hs = healthySequences.get(i);
			num = hs.length() - l + 1;

			for (int j = 0; j < num; j++) {
				String sub = hs.substring(j, j + l);
				if (sub.equals(string)) {
					healthy++;
					break;
				}
			}
		}

		for (int k = 0; k < cancerSequences.size(); k++) {
			String cs = cancerSequences.get(k);
			num = cs.length() - l + 1;

			for (int x = 0; x < num; x++) {
				String sub = cs.substring(x, x + l);
				if (sub.equals(string)) {
					cancer++;
					break;
				}
			}
		}

		double HFrac = healthy * cancerSequences.size();
		double CFrac = cancer * healthySequences.size();

		if (CFrac > HFrac)
			return true;
		return false;
	}

}
