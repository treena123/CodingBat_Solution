package Map1;

import java.util.HashMap;
import java.util.Map;

public class MapBullySolution {

	/*
	 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


	mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
	mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("a", "candy");
		map.put("b", "carrot");
		map.put("c", "meh");
		System.out.println(mapBully(map));
	}
	
	public static Map<String, String> mapBully(Map<String, String> map) {
		  Map<String, String> result = new HashMap<>();
		  String bVal = null;
		  for (Map.Entry<String, String> each: map.entrySet()){
		    if(each.getKey().equals("a")){
		      bVal = each.getValue();
		      result.put(each.getKey(), "");
		    } else if (each.getKey().equals("b")){
		      if (bVal == null) {
		        result.put(each.getKey(), each.getValue());
		        }else{
		          result.put(each.getKey(), bVal);
		        } 
		    }else {
				result.put(each.getKey(), each.getValue());
			}
		  }
		  
		  if(!result.containsKey("b") && result.containsKey("a")){
		    result.put("b", bVal);
		  }
		  return result;
		}



}
