package com.toralipse.myapp.androidutil.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by toralipse on 2016/12/19.
 */

public abstract class ItemAdapter<T> extends ArrayAdapter<T> {
    private final int mResourceId;
    public ItemAdapter(Context context, int rowResourceId, List<T> objects) {
        super(context, 0, objects);
        mResourceId = rowResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = View.inflate(getContext(),mResourceId , null);
        } else {
            view = convertView;
        }
        bindView(position,view,getItem(position));
        return view;
    }

    public abstract void bindView(int position, View rowView, T item);
}
