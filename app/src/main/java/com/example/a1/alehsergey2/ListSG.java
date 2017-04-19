package com.example.a1.alehsergey2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.a1.alehsergey2.R.id.textForListOne;
import static com.example.a1.alehsergey2.R.layout.itemsg;

public class ListSG extends Fragment{

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bdsm){
        return inflater.inflate(R.layout.listsg,null);



    }

    public static class ContextAdapterList extends RecyclerView.Adapter<ViewHolder> {
        static final int n = 9;

        public ContextAdapterList(){}

        View view;

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemsg,parent,false);
            return ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

}





