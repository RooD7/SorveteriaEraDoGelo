package com.sorveteria.eradogelo.sorveteriaeradogelo;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rood on 15/02/17.
 */

public class SimplesAdapter extends BaseAdapter {
    private String[] produtos = new String[]{"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter",
            "Saturno", "Urano", "Netuno", "Plutão"};
    private Context context;

    public SimplesAdapter(Context context) {
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return produtos.length;
    }

    @Override
    public Object getItem(int position) {
        return produtos[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String produto = produtos[position];
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_simples, parent, false);
        TextView t = (TextView) view.findViewById(R.id.textViewInfla);
        t.setText(produto);
        return view;
    }
}
