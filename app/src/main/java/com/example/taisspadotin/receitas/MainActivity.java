package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb1;
        tb1= (Toolbar)findViewById(R.id.tb1);
        setActionBar(tb1);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_menu, menu);
        return true;
    }

    //@Override
    //public void OnCriateContextMenu(ContextMenu menu, View v, Context) //menu d econtexto qnd fica apertando aparece
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.at2)
        {
            Intent it = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(it);
            return true;
        }
        if(item.getItemId()==R.id.at3)
        {
            Intent it = new Intent(MainActivity.this, Favoritos.class);
            startActivity(it);
            return true;
        }
        return true;
        //default: return super.onOptionsItemSelected(item);
    }


}



