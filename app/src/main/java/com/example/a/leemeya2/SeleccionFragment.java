package com.example.a.leemeya2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SeleccionFragment extends Fragment {
    @Nullable

    View vista;
    Button button, button1, button2, button3;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        vista=inflater.inflate(R.layout.fragment_seleccion,container,false);

        button=(Button)vista.findViewById(R.id.button);
        button1=(Button)vista.findViewById(R.id.button4);
        button2=(Button)vista.findViewById(R.id.button5);
        button3=(Button)vista.findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(SeleccionFragment.this.getActivity(), ListaMasLeidos.class);
                startActivity(siguiente);
            }

    });


        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(SeleccionFragment.this.getActivity(), ListaCuentosMoraleja.class);
                startActivity(siguiente);
            }

        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(SeleccionFragment.this.getActivity(), ListaCuentosClasicos.class);
                startActivity(siguiente);
            }

        });

        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(SeleccionFragment.this.getActivity(), ListaCuentosTradicionales.class);
                startActivity(siguiente);
            }

        });


        return vista;
    }
}


