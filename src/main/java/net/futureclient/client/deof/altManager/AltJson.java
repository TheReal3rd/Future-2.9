package net.futureclient.client.deof.altManager;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AltJson implements JsonDeserializer<Map<String, String>> {

    public Map<String, String> deserialize(JsonElement jsonElement, Type object, JsonDeserializationContext object2) {
        HashMap<String, String> map = new HashMap<String, String>();
        Iterator<JsonElement> jsonElement1 = jsonElement.getAsJsonArray().iterator();
        while (jsonElement1.hasNext()) {
            Iterator iterator = ((JsonElement)jsonElement1.next()).getAsJsonObject().entrySet().iterator();
            if (!iterator.hasNext()) continue;
            Map.Entry entry = (Map.Entry)iterator.next();
            map.put((String) entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
        }
        return map;
    }
}
/*
package net.futureclient.client;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.futureclient.client.lH;

public class Aj implements JsonDeserializer<Map<String, String>> {

    public Map<String, String> f$E(JsonElement jsonElement, Type object, JsonDeserializationContext object2) {
        object = new HashMap();
        object2 = jsonElement.getAsJsonArray().iterator();
        while (object2.hasNext()) {
            Iterator iterator = ((JsonElement)object2.next()).getAsJsonObject().entrySet().iterator();
            if (!iterator.hasNext()) continue;
            iterator = (Map.Entry)iterator.next();
            object.put(iterator.getKey(), ((JsonElement)iterator.getValue()).getAsString());
        }
        return object;
    }

    public Aj(lH lH2) {
        0();
    }

    private Aj() {
        Aj aj;
    }
}
 */