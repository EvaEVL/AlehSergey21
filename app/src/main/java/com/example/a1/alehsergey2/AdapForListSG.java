package com.example.a1.alehsergey2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapForListSG extends BaseAdapter{

    Context ctx;
    LayoutInflater lf;
    ArrayList<InsideList> obj;

    AdapForListSG(Context con,ArrayList<InsideList> products){
        ctx = con;
        obj = products;
        lf = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return obj.size();
    }

    @Override
    public Object getItem(int i) {
        return obj.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View cview, ViewGroup viewGroup) {
        View view = cview;
        if(view == null){
            view = lf.inflate(R.layout.itemsg,viewGroup,false);
        }

        InsideList inList = getPrduct(i);
        ((TextView) view.findViewById(R.id.firstWord)).setText(inList.wordRu);
        ((TextView) view.findViewById(R.id.secondWord)).setText(inList.wordEngl+ "");

        return view;
    }

    InsideList getPrduct(int position) {
        return ((InsideList) getItem(position));
    }
}