package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button fil, lit, aj;
        fil=(Button) findViewById(R.id.btnfilosofos);
        lit=(Button) findViewById(R.id.btnliteratura);
        aj=(Button) findViewById(R.id.btnajuda);

        fil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main2Activity.this, F1.class);
                startActivity(it);

            }
        });
        lit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main2Activity.this, Literatura.class);
                startActivity(it);

            }
        });
        aj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main2Activity.this, AutoAjuda.class);
                startActivity(it);

            }
        });
     /*   fil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main2Activity.this, pagina02.class);
                startActivity(it);

            }
        });
        fil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main2Activity.this, pagina02.class);
                startActivity(it);

            }
        });*/



    }
}
