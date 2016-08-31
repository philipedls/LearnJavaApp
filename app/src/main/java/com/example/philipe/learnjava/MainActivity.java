package com.example.philipe.learnjava;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View mBotao_1;
    private View mBotao_2;
    private View mBotao_3;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotao_1 = findViewById(R.id.ico01);
        mBotao_2 = findViewById(R.id.ico02);
        mBotao_3 = findViewById(R.id.ico03);
        mBotao_1.setOnClickListener(new CLickListener(this, ConceitosBasicosActivity.class));
        mBotao_3.setOnClickListener(new CLickListener(this, ColecoesActivity.class));
        mBotao_2.setOnClickListener(new CLickListener(this, LacosActivity.class));


    }


    private class CLickListener implements View.OnClickListener {

        private Context context;
        private Class aClass;

        public CLickListener(Context context, Class aClass) {
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
