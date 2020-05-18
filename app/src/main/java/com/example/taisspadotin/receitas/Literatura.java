package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Literatura extends Activity {
static int sl=0, sl2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literatura);

        Button f1, f2;
        f1=(Button) findViewById(R.id.fvl1);
        f2=(Button) findViewById(R.id.fvl2);


        f1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sl=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sl2=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
