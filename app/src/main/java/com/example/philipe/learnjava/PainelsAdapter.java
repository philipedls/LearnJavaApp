package com.example.philipe.learnjava;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by philipe on 4/17/16.
 */
public class PainelsAdapter extends BaseAdapter {
    private Context context;
    private List<Panel> paineis;
    private boolean isGrid;
    private PanelsApplication application;

    public PainelsAdapter(Context context, boolean isGrid){
        this.context = context;
        this.application = (PanelsApplication) context.getApplicationContext();
        this.paineis = application.getPaineis();
        this.isGrid = isGrid;
    }

    @Override
    public int getCount() {
        return paineis.size();
    }

    @Override

    public Object getItem(int i) {
        return paineis.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public boolean isGrid() {
        return isGrid;
    }

    public void setGrid(boolean grid) {
        isGrid = grid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if(isGrid){
            view = LayoutInflater.from(context).inflate(R.layout.layout_grid_item, parent, false);
        }

        Panel painel = paineis.get(position);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageButton);
        TextView textView_1 = (TextView) view.findViewById(R.id.textview_1);
        TextView textView_2 = (TextView) view.findViewById(R.id.textview_2);

        imageView.setImageResource(painel.getIdImagem());
        textView_1.setText(painel.getNomePanel());
        textView_2.setText("Iniciar");

        return view;
    }
}
