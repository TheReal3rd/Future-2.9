package net.futureclient.client.deof.event;

public interface IEventManager {
    public void clear();

    public void invoke(Event var1);

    public void unsubscribe(Listener<?> var1);

    public void subscribe(Listener<?> var1);
}
/*
public interface W {
    public void f$E();

    public void f$E(RF var1);

    public void f$a(Ha var1);

    public void f$E(Ha var1);
}

 */
