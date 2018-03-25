package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCa(View view) {
        ((TextView)findViewById(R.id.ada)).setText("阿达·洛芙莱斯");
        ((TextView)findViewById(R.id.ada_t)).setText(R.string.ada_c);

    }

    public void btnCs(View view) {
         ((TextView)findViewById(R.id.james)).setText("詹姆斯·高斯林 ");
         ((TextView)findViewById(R.id.james_t)).setText(R.string.james_c);
    }


    public void btnEa(View view) {
        ((TextView) findViewById(R.id.ada)).setText("Ada Lovelace");
        ((TextView) findViewById(R.id.ada_t)).setText(R.string.ada_s);
    }

    public void btnEs(View view) {

        ((TextView)findViewById(R.id.james)).setText("James Gosling");

        ((TextView)findViewById(R.id.james_t)).setText(R.string.james_s);
    }
}
