package com.bttprogramingtraining.bttmanagement.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bttprogramingtraining.bttmanagement.R;

/**
 * Created by paikhantko on 12/28/18.
 */

public class StudentListAdapter extends BaseAdapter {



    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_student,viewGroup,false);
        return v;
    }
}
