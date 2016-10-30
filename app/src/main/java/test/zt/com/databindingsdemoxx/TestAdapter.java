package test.zt.com.databindingsdemoxx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import test.zt.com.databindingsdemoxx.databinding.ItemListviewBinding;

/**
 * Created by Administrator on 2016/10/30.
 */

public class TestAdapter extends MBaseAdapter<String> {

    public TestAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view==null)
        {
            view = getInflater().inflate(R.layout.item_listview,viewGroup,false);
            viewHolder = new ViewHolder(ItemListviewBinding.bind(view));
            view.setTag(viewHolder);
        }
        else
        {
            viewHolder = ((ViewHolder) view.getTag());
        }
        viewHolder.itemListviewBinding.setItem(getItem(i));
        return view;
    }

    class ViewHolder{
        private ItemListviewBinding itemListviewBinding;
        public ViewHolder(ItemListviewBinding itemListviewBinding)
        {
            this.itemListviewBinding = itemListviewBinding;
        }
        public void bindData(String item)
        {
            itemListviewBinding.setItem(item);
        }
    }
}
