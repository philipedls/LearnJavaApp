package com.example.philipe.learnjava;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

public class ConceitosBasicosActivity extends AppCompatActivity {

    private GridView gridView;
    private PainelsAdapter adaptador;
    private PanelsApplication application;
    private ImageButton mImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceitos_basicos);

        application = (PanelsApplication) getApplicationContext();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Conceitos Básicos");
        setSupportActionBar(toolbar);

        adaptador = new PainelsAdapter(this, false);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adaptador);
        gridView.setColumnWidth(2);

        mImageButton = (ImageButton) findViewById(R.id.imageButton);
        mImageButton.setOnClickListener(new ClickListener(this,PerguntasQuizActivity.class));

    }

    private class ClickListener implements View.OnClickListener{

        private Context context;
        private Class aClass;

        public ClickListener(Context context, Class aClass) {
            this.context = context;
            this.aClass = aClass;
        }

        public Context getContext(){
            return context;
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getContext(), aClass);
            startActivity(intent);
        }
    }
}
