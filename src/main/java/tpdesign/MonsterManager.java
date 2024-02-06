package tpdesign;

import java.util.HashMap;
import java.util.Map;

public class MonsterManager {

    private Map<String, MonsterPrototype> prototypes = new HashMap<>();

    public void addMonsterPrototype(String key, MonsterPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public Monster cloneMonster(String key) {
        return prototypes.get(key).cloneMonster();
    }
}
