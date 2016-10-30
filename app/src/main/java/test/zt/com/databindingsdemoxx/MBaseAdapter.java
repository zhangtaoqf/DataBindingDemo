package test.zt.com.databindingsdemoxx;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/30.
 */

public abstract class MBaseAdapter<T> extends BaseAdapter {
    private List<T> datas;
    private LayoutInflater inflater;

    public MBaseAdapter(Context context) {
        this.datas = new ArrayList<>();
        this.inflater = LayoutInflater.from(context);
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public T getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void addAll(List<T> dd)
    {
        datas.addAll(dd);
        notifyDataSetChanged();
    }
}
