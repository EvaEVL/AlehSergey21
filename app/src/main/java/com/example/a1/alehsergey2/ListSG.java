package com.example.a1.alehsergey2;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;

public class ListSG extends Fragment{

    static String what_i_get ;
    ArrayList<InsideList> ap = new ArrayList<InsideList>();
    AdapForListSG boxAdapter;

    final Context context = getActivity();

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle bdsm){
        View view1 = inflater.inflate(R.layout.listsg,null);

        boxAdapter = new AdapForListSG(context,ap);

        ListView lvMain = (ListView) view1.findViewById(R.id.lvMein);
        lvMain.setAdapter(boxAdapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_get_names);

                dialog.show();

                final EditText ed1 = (EditText) dialog.findViewById(R.id.ed1);
                final EditText ed2 = (EditText) dialog.findViewById(R.id.edi2);
                Button cancel =(Button)dialog.findViewById(R.id.cancel);
                Button ok =(Button)dialog.findViewById(R.id.ok);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ap.set(i,new InsideList(ed1.getText().toString(),ed2.getText().toString()));
                        boxAdapter.notifyDataSetChanged();
                        dialog.dismiss();
                    }
                });

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });

        lvMain.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(context,Main2Activity.class);
                InsideList product = ap.get(i);
                what_i_get = product.wordRu;
                startActivity(intent);
                return false;
            }
        });
        return inflater.inflate(R.layout.listsg,null);
    }



    public void addToList(View view ){
        ap.add(new InsideList("something","something"));
        Toast.makeText(context,String.valueOf(ap.size()),Toast.LENGTH_SHORT).show();
        boxAdapter.notifyDataSetChanged();
    }

}
