package im.mash.fastadapter_extensions.adapters;

import im.mash.fastadapter.IItem;
import im.mash.fastadapter.commons.adapters.AbstractWrapAdapter;

import java.util.List;

/**
 * Created by mikepenz on 03.03.16.
 */
public class WrapAdapter<Item extends IItem> extends AbstractWrapAdapter<Item> {
    public WrapAdapter(List<Item> items) {
        super(items);
    }

    @Override
    public void setItems(List<Item> items) {
        super.setItems(items);
        notifyDataSetChanged();
    }

    @Override
    public boolean shouldInsertItemAtPosition(int position) {
        if (getAdapter().getItemCount() > 0 && getItems().size() > 0) {
            int itemsInBetween = (getAdapter().getItemCount() + getItems().size()) / (getItems().size() + 1) + 1;
            return (position + 1) % itemsInBetween == 0;
        }
        return false;
    }

    @Override
    public int itemInsertedBeforeCount(int position) {
        if (getAdapter().getItemCount() > 0 && getItems().size() > 0) {
            int itemsInBetween = (getAdapter().getItemCount() + getItems().size()) / (getItems().size() + 1) + 1;
            return position / itemsInBetween;
        }
        return 0;
    }
}
