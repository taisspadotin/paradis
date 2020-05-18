package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends ArrayAdapter<FavFrases>{

    private ArrayList<FavFrases> pessoasArray;
    private Context contexto;

    public CustomAdapter(Context context, int resource, ArrayList<FavFrases> pessoasArray) {
        super(context, resource, pessoasArray);
        this.contexto=context;
        this.pessoasArray=pessoasArray;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView==null)
        {
            LayoutInflater inflater=((Activity)contexto).getLayoutInflater();
            convertView=inflater.inflate(R.layout.layout_itemlista, parent, false);

            holder=new ViewHolder();
            holder.Frases=(TextView)convertView.findViewById(R.id.textview_frases);
            convertView.setTag(holder);

        }
        else
        {
            holder=(ViewHolder)convertView.getTag();
        }
        FavFrases p=pessoasArray.get(position);

            holder.Frases.setText(p.getFrases());

          //  holder.Frases.setText(p.getFrases1());

        return convertView;

    }

    private static class ViewHolder
    {
        TextView Frases;
    }


}

