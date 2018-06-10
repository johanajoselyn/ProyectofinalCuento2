package com.example.a.leemeya2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Comentarios extends AppCompatActivity {


    ArrayList<String> itemList;
    ArrayAdapter<String> adapter;
    EditText itemText, itemText1;
    Button addButton;
    ListView listaComentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listaComentarios = (ListView) findViewById(R.id.ListViewC);
        itemText = (EditText) findViewById(R.id.nombre);
        itemText1 = (EditText) findViewById(R.id.comentario);
        addButton = (Button) findViewById(R.id.Boton);


        itemList = new ArrayList<>();

        adapter = new ArrayAdapter<String>(Comentarios.this, android.R.layout.simple_gallery_item, itemList);

        View.OnClickListener addListner = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String dato1 = itemText.getText().toString();
                String dato2 = itemText1.getText().toString();

                VerificarTexto(dato1, dato2);

            }
        };


        addButton.setOnClickListener(addListner);
        listaComentarios.setAdapter(adapter);

    }

    public void VerificarTexto(String texto1, String texto2) {

        if (texto1.equals("") || texto2.equals("")) {
            Toast.makeText(getApplicationContext(), "Llene todos los campos.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "OK.", Toast.LENGTH_SHORT).show();
            itemList.add(itemText.getText().toString());
            itemList.add(itemText1.getText().toString());
            itemText.setText("");
            itemText1.setText("");
            adapter.notifyDataSetChanged();
        }
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


