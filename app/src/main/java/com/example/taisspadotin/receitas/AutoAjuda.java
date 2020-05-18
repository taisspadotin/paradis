package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AutoAjuda extends Activity {
    static int sa=0, sa2=0, sa3=0, sa4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_ajuda);


        Button f1, f2, f3, f4;
        f1=(Button) findViewById(R.id.fva1);
        f2=(Button) findViewById(R.id.fva2);
        f3=(Button) findViewById(R.id.fva3);
        f4=(Button) findViewById(R.id.fva4);


        f1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sa=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sa2=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sa3=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sa4=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
