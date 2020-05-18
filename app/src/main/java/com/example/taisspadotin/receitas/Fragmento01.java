package com.example.taisspadotin.receitas;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
//@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
public class Fragmento01 extends Fragment {


    public Fragmento01() {
        // Required empty public constructor
    }

    TextView tvo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmento01, container, false);

        tvo = (TextView) v.findViewById(R.id.tvvo);
        final TextView tv1= (TextView) v.findViewById(R.id.tvf1);
        final TextView tv2= (TextView) v.findViewById(R.id.tvvo);

        tvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Aproveite as nossas melhores frases!");
                tv2.setText(" ");

            }
        });
        return v;
    }
}
