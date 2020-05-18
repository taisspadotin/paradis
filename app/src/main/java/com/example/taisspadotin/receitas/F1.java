package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class F1 extends Activity {
    static int sg=0;
    static int sg2=0;
    static int sg3=0;
    static int sg4=0;
    static int sg5=0;
    static int sg6=0;
    static int sg7=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f1);

        Button f1, f2, f3, f4, f5, f6, f7;
        f1=(Button) findViewById(R.id.fv1);
        f2=(Button) findViewById(R.id.fv2);
        f3=(Button) findViewById(R.id.fv3);
        f4=(Button) findViewById(R.id.fv4);
        f5=(Button) findViewById(R.id.fv5);
        f6=(Button) findViewById(R.id.fv6);
        f7=(Button) findViewById(R.id.fv7);

        f1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
              sg=1;
        Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sg2=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sg3=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sg4=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sg5=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sg6=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
        f7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sg7=1;
                Toast.makeText(getApplicationContext(), "Adicionado aos favoritos!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
