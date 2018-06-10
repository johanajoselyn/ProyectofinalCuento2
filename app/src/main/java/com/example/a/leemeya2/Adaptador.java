package com.example.a.leemeya2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {


    Context contexto;


    //se generará un constructor para la clase, la cual recibirá por los dos parámetros. El adaptador recibirá  la lista de cuentos a generar y el contexto de la aplicación.
    public Adaptador(Context contexto, List<Cuento> listaObjetos) {
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
        return ListaObjetos.get(position); // retorna el objeto de la posición que se esta indicando.
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId(); // utilizar la lista de objetos y con ello retorna la id de la posición que se esta indicando.
     }


     //El método getView  permite referencial el objeto inflate que es el que utilizara para vincular el layout dentro de un ítem del Listview.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;

        LayoutInflater inflater = LayoutInflater.from(contexto);
       vista= inflater.inflate(R.layout.lista_mas_leidos,null);

       // siguiente es definir un objeto imageView para referenciar la imgView (nombre de la id de la imagen),es decir, la referencia a la imagen y asi con los otros
        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView8);
        TextView titulo = (TextView)vista.findViewById(R.id.textTitulo);
        TextView detalle = (TextView)vista.findViewById(R.id.textDetalle);
        TextView autor =(TextView)vista.findViewById(R.id.txtautor1);
        TextView genero = (TextView)vista.findViewById(R.id.txtgenero1);

        //se obtendrá el elemento de la posición actual
        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getDetalle().toString());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());
        autor.setText(ListaObjetos.get(position).getAutor().toString());
        genero.setText(ListaObjetos.get(position).getGenero().toString());




        return vista;
    }
}
