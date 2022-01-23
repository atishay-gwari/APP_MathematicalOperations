package com.example.ag_m1_27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText first,second;
        TextView txt;
        Button btn;
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        txt=findViewById(R.id.Result);
        btn=findViewById(R.id.btncal);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
              int f=Integer.parseInt(first.getText().toString());
              int s=Integer.parseInt(second.getText().toString());
              double add= s+f;
              double sub=f-s;
              double mul=s*f;
              double div=f/s;
              txt.setText("Operations:"+add+"\n"+sub+"\n"+mul+"\n"+div);

            }
        });
    }
}