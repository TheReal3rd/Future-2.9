package net.futureclient.client.deof.event;

import net.futureclient.client.deof.event.events.WorldClientEvent;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventManager implements IEventManager {
    private final Minecraft mc =Minecraft.getMinecraft();// OG f$d
    private final Map<Class<?>, List<Listener<Event>>> listenerMap = new ConcurrentHashMap();// OG f$g

    @Override
    public void invoke(Event rF) {
        List<Listener<Event>> list = this.listenerMap.get(rF.getClass());
        if (list != null) {
            for (Listener ha : list) {
                if (ha.getEventClass() != rF.getClass() || !(rF instanceof Event) && !(rF instanceof WorldClientEvent) && (this.mc.player == null || this.mc.world == null)) continue;
                ha.invoke(rF);
            }
        }
    }

    @Override
    public void unsubscribe(Listener<?> ha) {
        Class<?> clazz = ha.getEventClass();
        List<Listener<Event>> list = this.listenerMap.get(clazz);
        if (list != null) {
            list.removeIf(ha2 -> ha2.equals(ha));
            if (list.isEmpty()) {
                this.listenerMap.remove(clazz);
            }
        }
    }

    @Override
    public void subscribe(Listener<?> ha) {
        if (ha != null) {
            Class<?> clazz = ha.getEventClass();
            List<Listener<Event>> list = this.listenerMap.get(clazz);
            if (list == null) {
                list = new CopyOnWriteArrayList<Listener<Event>>();
                this.listenerMap.put(clazz, list);
            }
            if (!list.contains(ha)) {
                list.add((Listener<Event>) ha);
            }
        }
    }

    @Override
    public void clear() {
        this.listenerMap.clear();
    }
}
/*
public final class IH  implements W {
    private final Minecraft f$d;
    private final Map<Class<?>, List<Ha<RF>>> f$g;

    @Override
    public void f$E(RF rF) {
        IH iH;
        List<Ha<RF>> list = iH.f$g.get(rF.getClass());
        if (list != null) {
            for (Ha ha : list) {
                if (ha.f$E() != rF.getClass() || !(rF instanceof OF) && !(rF instanceof Vd) && !(rF instanceof De) && (iH.f$d.player == null || iH.f$d.world == null)) continue;
                ha.f$E(rF);
            }
        }
    }

    @Override
    public void f$E(Ha ha) {
        Class clazz = ha.f$E();
        List<Ha<RF>> list = 0.f$g.get(clazz);
        if (list != null) {
            list.removeIf(ha2 -> ha2.equals(ha));
            if (list.isEmpty()) {
                0.f$g.remove(clazz);
            }
        }
    }

    @Override
    public void f$a(Ha ha) {
        if (ha != null) {
            Class clazz = ha.f$E();
            List<Ha<RF>> list = 0.f$g.get(clazz);
            if (list == null) {
                list = new CopyOnWriteArrayList<Ha<RF>>();
                0.f$g.put(clazz, list);
            }
            if (!list.contains(ha)) {
                list.add(ha);
            }
        }
    }

    public IH() {
        IH iH;
        IH iH2 = iH;
        iH.f$g = new ConcurrentHashMap();
        iH2.f$d = Minecraft.getMinecraft();
    }

    @Override
    public void f$E() {
        IH iH;
        iH.f$g.clear();
    }
}
 */
