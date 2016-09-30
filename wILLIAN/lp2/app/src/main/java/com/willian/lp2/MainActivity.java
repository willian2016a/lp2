package com.willian.lp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chamartela1(View v){
        Intent t1 = new Intent(this,Tela1Activity.class);
        startActivity(t1);
    }
    public void chamartela2(View v){
        Intent t2 = new Intent(this,Tela2Activity.class);
        startActivity(t2);
    }
}
