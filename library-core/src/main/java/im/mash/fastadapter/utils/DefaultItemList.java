package im.mash.fastadapter.utils;

import im.mash.fastadapter.FastAdapter;
import im.mash.fastadapter.IItem;
import im.mash.fastadapter.IItemList;

/**
 * The default item list
 */

public abstract class DefaultItemList<Item extends IItem> implements IItemList<Item> {

    private FastAdapter<Item> fastAdapter;

    public void setFastAdapter(FastAdapter<Item> fastAdapter) {
        this.fastAdapter = fastAdapter;
    }

    public FastAdapter<Item> getFastAdapter() {
        return fastAdapter;
    }
}
