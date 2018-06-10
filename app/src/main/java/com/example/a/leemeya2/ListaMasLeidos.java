package com.example.a.leemeya2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaMasLeidos extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Cuento> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mas_leidos);
        //se instancia la lista
        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Cuento>();

        Lista.add(new Cuento(1,"Rocio y los cuatro Machucas", "Una reina muy linda siente envidia de su hijastra Rocío cuando su espejo mágico le dice que al crecer Rocío ha pasado a ser la más linda del reino, y ordena a una ardilla que la mate. La ardilla se apiada y la deja libre en el bosque de Vicuña, donde encuentra cobijo en una pequeña choza habitada por siete machucas. Ella se queda a vivir con ellos, a cambio de ayudarles limpiando y fabricando sus \"productos\". Pero la madrastra se entera por el espejo última definición de que sigue viva, y prepara un choclo envenenado, que le da a probar haciéndose pasar por una anciana. Entonces Rocío cae muerta, y los machucas la encierran en un ataúd embalsamado de miel. Un príncipe llamado Velozo que pasaba por ahí, con su sedosa cabellera, se enamora al verla tan estrafalaria , y les pide que se la den. En una sacudida del ataúd, Rocío expulsa el trozo de choclo de su garganta y revive, enamorándose de Velozo con quien se casa.", R.drawable.cuento1, "Más leidos","Autor: anonimo"));
        Lista.add(new Cuento(2,"El zorro y la GALLINA", "Estaba una gallina posada en un árbol y tenía en el pico un queso. Atraído por el aroma, un zorro que pasaba por ahí le dijo:\n" +
                "\n" +
                "-¡Buenos días, señora gallina ! ¡Qué bello pumaje tienes! Si el canto corresponde a la pluma, tu tienes que ser el Ave Fénix.\n" +
                "\n" +
                "Al oír esto la gallina, se sintió muy alagada y llena de gozo, y para hacer alarde de su magnífica voz, abrió el pico para cantar, y así dejo caer el queso. El zorro rápidamente lo tomó en el aire y le dijo:\n" +
                "\n" +
                "- Aprenda, señora gallina, que el adulador vive siempre a costa del que lo escucha y presta atención a sus dichos; la lección es provechosa, bien vale un queso.",R.drawable.cuento2, "Más leidos","Autor: anonimo"));
        Lista.add(new Cuento(3,"El león que se creia oveja", "Un leoncito abandonado por su madre fue acogido por un rebaño de ovejas y se crió entre ellas. Creciendo allí llegó a creer que él también era una oveja. Un día se acercó otro león adulto y hambriento hasta allí y se asombró mucho de observar que ese león, mucho más grande y fuerte que él, huyera como hacían las ovejas, brincando y balando con el resto de los miembros del rebaño. Le obligó a mirar su reflejo en la superficie del agua. Cuando el león observó su rostro, su cuerpo y melena, reflejados nítidamente en la superficie del agua  se elevó la más intensa emoción interna y brotó el más fuerte y poderoso rugido que se había escuchado jamás haciendo eco a través de todas las montañas y valles del mundo. A partir de entonces el león juró defender a aquellas ovejas con su poder y fuerza. Y así lo hizo hasta el fin de sus días",R.drawable.cuento3,  "Más leidos","Autor: anonimo"));

        Lista.add(new Cuento(4,"El patito feo", "El patito feo comienza en la estación de verano. La Señora Pata esperaba con ansias la llegada de sus siete patitos. Junto con sus amigas, observaban con mucha atención cada huevo. Un día comenzaron a romperse los cascarones y salieron seis hermosos patitos. Se percataron que todavía faltaba un patito por salir; esperaron hasta que de pronto salió un patito feo y muy diferente a los demás. La Señora Pata se avergonzó porque tenía un patito feo y siempre trataba de esconderlo. Pasaban los días y el patito feo no mejoraba, se ponía más feo. Crecía demasiado rápido; era mucho más grande que los demás.\n"+
                "El patito feo se percató de que en ese lugar no lo querían y decidió escaparse. Al huir, llegó a una granja, en donde una vieja lo recibió; éste pensó que había encontrado un hogar. Ocurrió todo lo contrario, la vieja era mala y lo que quería era comérselo. El patito feo huyó de ese lugar.\n" +
                "Llegó el invierno y tuvo que pasarlo solo. Pasó momentos de hambre, frío y de miedo; ya que tenía que huir de los cazadores. Llegó la primavera y el patito feo fue a un estanque, en donde se encontró con unos cisnes. Al verlos se sintió triste porque estos eran bellos y el no. Decidió hablarles y les dijo que si podía estar en el estanque junto a ellos. Le dijeron que sí; que todos eran como hermanos. El patito feo le dijo que no se burlarán de él y los cisnes le dijeron que porque se burlarían de él si eran iguales. El patito feo se ve en el reflejo del agua y nota que era un hermoso cisne. Al darse cuenta fue feliz y vivió con ellos para siempre.",R.drawable.cuento4,  "Más leídos","Autor: anonimo"));


        //se creara el adaptador en este caso recibirá el contexto y la lista de cuentos.
        Adaptador miadap = new Adaptador(getApplicationContext(), Lista);

        listaDatos.setAdapter(miadap);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //retorna el objeto de la posicion indicada , el "obj" tendra el objeto seleccionado con toda la información
                Cuento obj = (Cuento) parent.getItemAtPosition(position);

                //se indica a la actividad, la que se mostrara la información
                Intent paso = new Intent(getApplicationContext(),DetalleCuentosMasLeidos.class);
                //cargando serializando el objeto
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





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





