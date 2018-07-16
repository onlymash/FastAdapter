package im.mash.fastadapter.listeners;

import android.view.MotionEvent;
import android.view.View;

import im.mash.fastadapter.IAdapter;
import im.mash.fastadapter.IItem;

//listeners
public interface OnTouchListener<Item extends IItem> {
    /**
     * the onTouch event of a specific item inside the RecyclerView
     *
     * @param v        the view we clicked
     * @param event    the touch event
     * @param adapter  the adapter which is responsible for the given item
     * @param item     the IItem which was clicked
     * @param position the global position
     * @return return true if the event was consumed, otherwise false
     */
    boolean onTouch(View v, MotionEvent event, IAdapter<Item> adapter, Item item, int position);
}
