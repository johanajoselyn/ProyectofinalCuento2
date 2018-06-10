package com.example.a.leemeya2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorMoraleja extends BaseAdapter {
    Context contexto;

    public AdaptadorMoraleja (Context contexto, List<Cuento> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    List<Cuento> ListaObjetos;

    @Override
    public int getCount() {
        return ListaObjetos.size(); // retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;

        LayoutInflater inflater = LayoutInflater.from(contexto);
        vista= inflater.inflate(R.layout.lista_moraleja, null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView8);
        TextView titulo = (TextView)vista.findViewById(R.id.textTitulo);
        TextView detalle = (TextView)vista.findViewById(R.id.textDetalle);
        TextView autor =(TextView)vista.findViewById(R.id.txtautor1);
        TextView genero = (TextView)vista.findViewById(R.id.txtgenero1);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getDetalle().toString());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());
        autor.setText(ListaObjetos.get(position).getAutor().toString());
        genero.setText(ListaObjetos.get(position).getGenero().toString());


        return vista;
    }
}

