package miw.upm.es.singleton;

import java.util.HashMap;
import java.util.Map;

import miw.upm.es.Professional;



public class Factory {

	private final Map<Long, Professional> map = new HashMap<>();

	/*public Map<Long, Professional> getMap(Long phone) {
		return map;
	}*/
	
	public Professional get(Long phone) {
        return map.computeIfAbsent(phone, k -> new Professional(k));
    }

}
