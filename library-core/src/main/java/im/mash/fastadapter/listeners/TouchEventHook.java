package im.mash.fastadapter.listeners;

import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

import im.mash.fastadapter.FastAdapter;
import im.mash.fastadapter.IItem;

import java.util.List;

import javax.annotation.Nullable;

public abstract class TouchEventHook<Item extends IItem> implements EventHook<Item> {
    public abstract boolean onTouch(View v, MotionEvent event, int position, FastAdapter<Item> fastAdapter, Item item);

    @Nullable
    @Override
    public View onBind(RecyclerView.ViewHolder viewHolder) {
        return null;
    }

    @Nullable
    @Override
    public List<View> onBindMany(RecyclerView.ViewHolder viewHolder) {
        return null;
    }
}
