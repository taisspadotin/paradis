package com.example.taisspadotin.receitas;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Favoritos extends Activity {
   private ListView lv=null;
   private CustomAdapter adapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        lv=(ListView) findViewById(R.id.lv);
        final ArrayList<FavFrases> pessoasArray = new ArrayList<FavFrases>();
        adapter = new CustomAdapter(this, R.layout.layout_itemlista, pessoasArray);
        lv.setAdapter(adapter);


        adapter.notifyDataSetChanged();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                        pessoasArray.remove(pessoasArray.get(position));
                        adapter.notifyDataSetChanged();



            }
        });

        F1 fi=new F1();
        int valor=(fi.sg);
        int valor2=(fi.sg2);
        int valor3=(fi.sg3);
        int valor4=(fi.sg4);
        int valor5=(fi.sg5);
        int valor6=(fi.sg6);
        int valor7=(fi.sg7);
        Literatura lt= new Literatura();
        int valli=(lt.sl);
        int valli2=(lt.sl2);
        AutoAjuda aj= new AutoAjuda();
        int vala=(aj.sa);
        int vala2=(aj.sa2);
        int vala3=(aj.sa3);
        int vala4=(aj.sa4);


        if(valor==1){
            FavFrases p= new FavFrases();
            p.setFrases("' Sofro calado por coisas que eu nem sei se um dia irão acontecer'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();
        }
        if(valor2==1){
            FavFrases p= new FavFrases();
            p.setFrases("'O período de maior ganho em conhecimento e experiência é o período mais difícil da vida de alguém.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();
        }

       if(valor3==1){
            FavFrases p= new FavFrases();
            p.setFrases("' Isto é um sonho, bem sei, mas quero continuar a sonhar.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();
        }

        if(valor4==1){
            FavFrases p= new FavFrases();
            p.setFrases("' A alegria está na luta, na tentativa, no sofrimento envolvido e não na vitória propriamente dita.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();
        }

        if(valor5==1){
            FavFrases p= new FavFrases();
            p.setFrases("'Daria tudo que sei pela metade do que ignoro.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();
        }

        if(valor6==1){
            FavFrases p= new FavFrases();
            p.setFrases("'Não espere por uma crise para descobrir o que é importante em sua vida.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();
        }

        if(valor7==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'Eu não sei o que quero ser, mas sei muito bem o que não quero me tornar");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        if(valli==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'Quando acordei hoje de manhã, eu sabia quem eu era, mas acho que já mudei muitas vezes desde então'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        if(valli2==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'Que tempos penosos foram aqueles anos – ter o desejo e necessidade de viver, mas não a habilidade.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        if(vala==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        if(vala2==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'Acredite que você pode, assim você já está no meio do caminho.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        if(vala3==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'O importante não é vencer todos os dias, mas lutar sempre.'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        if(vala4==1) {
            FavFrases p= new FavFrases();
            p.setFrases("'Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!'");
            pessoasArray.add(p);
            adapter.notifyDataSetChanged();

        }
        //pessoasArray.add(p);

        //adapter.notifyDataSetChanged();

   }
}
