package com.example.a1.alehsergey2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.a1.alehsergey2.R.id.textForListOne;
import static com.example.a1.alehsergey2.R.layout.itemsg;

public class ListSG extends Fragment{

    ContentAdapterList conentAdapter;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bdsm){
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.recyclerview,container,false);
        conentAdapter = new ContentAdapterList();
        recyclerView.setAdapter(conentAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return recyclerView;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv1,tv2;



        public ViewHolder(View itemView) {
            super(itemView);
            final Context context = itemView.getContext();
            tv1 = (TextView) itemView.findViewById(R.id.textForListOne);
            tv2 = (TextView) itemView.findViewById(R.id.textForListTwo);

        }

    }


    public static class ContentAdapterList extends RecyclerView.Adapter<ViewHolder> {
        static final int n = 9;

        public static ArrayList<String> xuy = new ArrayList(5);


        public ContentAdapterList(){}

        View view;

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemsg,parent,false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.tv1.setText("xuy");
            holder.tv2.setText("pizza");


        }

        @Override
        public int getItemCount() {
            return xuy.size();
        }
    }

}





