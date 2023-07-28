package Test_8_2;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
	String name;
	String kind;
	double kg;
	Map<String ,Double> kinds = new HashMap<String,Double>();
	int count;

	public Recipe(String name, String kind, double kg, int count) {
		this.name = name;
		this.kind = kind;
		this.kg = kg;
		this.count = count;
	}
	public Recipe(String name, Map<String,Double> kinds, int count) {
		this.name = name;
		this.kinds = kinds;
		this.count = count;
	}

}
