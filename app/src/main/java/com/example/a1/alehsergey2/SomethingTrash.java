package com.example.a1.alehsergey2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.a1.alehsergey2.R;

public class SomethingTrash extends Fragment{

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceS){
        return inflater.inflate(R.layout.trash,null);
    }

}
