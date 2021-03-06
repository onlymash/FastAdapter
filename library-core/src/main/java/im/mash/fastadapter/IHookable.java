package im.mash.fastadapter;

import im.mash.fastadapter.listeners.EventHook;

import java.util.List;

/**
 * Created by fabianterhorst on 01.03.17.
 */
public interface IHookable<Item extends IItem> {
    /**
     * @return the event hooks for the item
     */
    List<EventHook<Item>> getEventHooks();
}
