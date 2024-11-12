package com.example.app;

import static android.app.ProgressDialog.show;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Myadapter extends BaseAdapter {
    Context con;
    List<Pojo> listpojo;
    @Override
    public int getCount() {
        return listpojo.size();
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
        view= LayoutInflater.from(con).inflate(R.layout.list_item,viewGroup,false);
        ImageView text=view.findViewById(R.id.image2);
        TextView tiltle=view.findViewById(R.id.tiltle);
        TextView des=view.findViewById(R.id.discrip);
        tiltle.setText(listpojo.get(i).getTiltle());
        des.setText(listpojo.get(i).getDec());
        text.setImageResource(listpojo.get(i).getImage());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(con,"pozicio:"+listpojo.get(i).getTiltle(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    public Myadapter(Context con, List<Pojo> listpojo) {
        this.con = con;
        this.listpojo = listpojo;
    }
}
