package com.example.a.leemeya2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetalleCuentosMoraleja extends AppCompatActivity {
    ImageView foto;
    TextView titulo;
    TextView detalle;
    TextView autor;
    TextView genero;


    RatingBar rb;
    TextView calificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cuentos_moraleja);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        foto = (ImageView) findViewById(R.id.imageView8);
        titulo=(TextView) findViewById(R.id.textTitulo);
        detalle=(TextView)findViewById(R.id.textDetalle);
        autor=(TextView) findViewById(R.id.txtautor1);
        genero=(TextView)findViewById(R.id.txtgenero1);

        Cuento obj= (Cuento) getIntent().getExtras().getSerializable("objeto");

        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource((obj.getImagen()));
        autor.setText((obj.getAutor()));
        genero.setText((obj.getGenero()));

        rb = (RatingBar) findViewById(R.id.ratingBar);
        calificacion = (TextView) findViewById(R.id.textRating);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                calificacion.setText("Valor calificado " + rating);
            }
        });
    }



    public void onClickt (View view){
        Intent miIntent=null;

        switch (view.getId()) {
            case R.id.txtlectura:
                miIntent = new Intent(DetalleCuentosMoraleja.this, ListaMasLeidos.class);
                break;
            case R.id.button8:
                miIntent=new Intent(DetalleCuentosMoraleja.this,Comentarios.class);
                break;}
        startActivity(miIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.main, m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int iditem = item.getItemId();
        Intent intent = new Intent(this, menu_principal.class);

        //noinspection SimplifiableIfStatement
        switch (iditem) {
            case R.id.item1:
                startActivity(intent);
                return true;

            case R.id.item2:
                startActivity(intent);
                return true;

        }
        return true;
    }
}



