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

public class ListaCuentosMoraleja extends AppCompatActivity {
    ListView listaDatos;
    ArrayList<Cuento> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuentos_moraleja);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Cuento>();

        Lista.add(new Cuento(1,"Floripondio y el ladrillo", "Floripondio iba en su nuevo automóvil, a mucha velocidad. ¿La razón? Llegaría tarde al trabajo si no corría, cuando\n" +
                "\n" +
                "súbitamente… ¡Un ladrillo se estrelló en la puerta de atrás!\n" +
                "\n" +
                "Floripondio frenó el auto y dio reversa hasta el lugar de donde el ladrillo había salido.  Se bajó del automóvil y vio a un niño sentado en el piso. Lo agarró, lo sacudió y le gritó muy enojado: ¿Qué demonios andas haciendo? ¡Te va a costar muy caro lo que le hiciste a mi auto! ¿Por qué me tiraste el ladrillo? El niño llorando, le contestó: ‘Lo siento, señor, pero no sabía qué hacer, mi hermano se cayó de su silla de ruedas y está lastimado, y no lo puedo levantar yo solo. Nadie quería detenerse a ayudarme!’ Floripondio sintió un nudo en la garganta, fue a levantar al joven, lo sentó en su silla de ruedas, y lo revisó. Vio que sus raspaduras eran menores, y que no estaba en peligro. Mientras el pequeño de 7 años empujaba a su hermano en la silla de ruedas hacia su casa, José caminó lentamente a su auto, pensando… FLORIPONDIO NUNCA LLEVÓ A REPARAR EL AUTO, DEJÓ LA PUERTA COMO ESTABA, PARA HACERLE RECORDAR QUE NO DEBÍA IR A TRAVÉS DE LA VIDA TAN RÁPIDO COMO PARA QUE ALGUIEN  VENGA QUE TIRARLE UN LADRILLO PARA LLAMAR SU ATENCIÓN..", R.drawable.cuento5, "Moraleja","Autor: anonimo"));

        Lista.add(new Cuento(3,"La mariposa azul", "Había una vez un viudo que vivía con sus dos hijas curiosas e inteligentes.\n" +
                "\n" +
                "\n" +
                "Las niñas siempre hacían muchas preguntas; alguna de ellas, él sabía responder, otras no.\n" +
                "\n" +
                "\n" +
                "El pretendía ofrecerles la mejor educación, por tanto mandó a las niñas de vacaciones con un sabio que vivía en lo alto de una colina.\n" +
                "\n" +
                "\n" +
                "El sabio siempre respondía a todas las preguntas sin ni siquiera dudar.\n" +
                "\n" +
                "\n" +
                "Impacientes las niñas decidieron inventar una pregunta que él no sabría responder.\n" +
                "\n" +
                "\n" +
                "Entonces, una de ellas apareció con una linda mariposa azul que usaría para engañar al sabio.\n" +
                "\n" +
                "\n" +
                "“¿Qué vas a hacer?”-\n" +
                "\n" +
                "\n" +
                "Preguntó la hermana, a lo cual le respondió:\n" +
                "\n" +
                "\n" +
                "“Voy a esconder la mariposa en mis manos y preguntarle al sabio si está viva o muerta”\n" +
                "\n" +
                "\n" +
                "“Si él dijese que está muerta, abriré mis manos y la dejaré volar. Si dice que esta viva la apretaré y la aplastaré.\n" +
                "\n" +
                "\n" +
                "Y así, cualquiera que sea su respuesta, ¡Será una respuesta equivocada!”\n" +
                "\n" +
                "\n" +
                "Las dos niñas fueron entonces al encuentro del sabio, que estaba meditando.\n" +
                "\n" +
                "\n" +
                "-“Tengo aquí una mariposa azul. Dígame, sabio ¿está viva o muerta?”\n" +
                "\n" +
                "\n" +
                "Muy calmadamente el sabio sonrió y respondió:\n" +
                "\n" +
                "\n" +
                "“Depende de ti… Ella está en tus manos.”\n" +
                "\n" +
                "\n" +
                "Así es nuestra vida, nuestro presente y nuestro futuro.\n" +
                "\n" +
                "\n" +
                "No debes de culpar a nadie cuando algo falle: somos nosotros los responsables por aquello que conquistamos (o no conquistamos).\n" +
                "\n" +
                "\n" +
                "Nuestra vida está en nuestras manos. Dios nos la dio, como la mariposa azul… Nos toca a nosotros escoger que hacer con ella.”",R.drawable.cuento6,  "Moraleja","Autor: anonimo"));

        Lista.add(new Cuento(1,"El leñador honrado", "Érase una vez, un leñador humilde y bueno, que después de trabajar todo el día en el campo, regresaba a casa a reunirse con los suyos. Por el camino, se dispuso a cruzar un puente pequeño, cuando de repente, se cayó su hacha en el río.\n" +
                "\n" +
                "“¿Cómo haré ahora para trabajar y poder dar de comer a mis hijos?” exclamaba angustiado y preocupado el leñador. Entonces, ante los ojos del pobre hambre apareció desde el fondo del río una ninfa hermosa y centelleante. “No te lamentes buen hombre. Traeré devuelta tu hacha en este instante” le dijo la criatura mágica al leñador, y se sumergió rápidamente en las aguas del río.\n" +
                "\n" +
                "Poco después, la ninfa reapareció con un hacha de oro para mostrarle al leñador, pero este contestó que esa no era su hacha. Nuevamente, la ninfa se sumergió en el río y trajo un hacha de plata entre sus manos. “No. Esa tampoco es mi hacha” dijo el leñador con voz penosa.\n" +
                "\n" +
                "Al tercer intento de la ninfa, apareció con un hacha de hierro. “¡Esa sí es mi hacha! Muchas gracias” gritó el leñador con profunda alegría. Pero la ninfa quiso premiarlo por no haber dicho mentiras, y le dijo “Te regalaré además las dos hachas de oro y de plata por haber sido tan honrado”.\n" +
                "\n" +
                "Ya ven amiguitos, siempre es bueno decir la verdad, pues en este mundo solo ganan los honestos y humildes de corazón.", R.drawable.cuento7, "Moraleja","Autor: Juan Perez"));
        Lista.add(new Cuento(1,"El carrete mágico", "Había una vez un pequeño príncipe, inquieto y travieso, que no le gustaba estudiar. Cuando sus padres le reprendían, se lamentaba diciendo: “¡Qué ganas de ser grande para hacer todo lo que quiera!”.\n" +
                "\n" +
                "Un buen día, mientras se encontraba en su cuarto, descubrió junto a la ventana una bobina con hilos de oro. Ante la mirada sorprendida del principito, la bobina le habló con voz melodiosa: “Querido príncipe : He escuchado tus deseos de crecer pronto y te daré una oportunidad. A medida que desenrolles mis hilos, podrás avanzar por los días de tu vida. Pero ten cuidado, pues el hilo que se suelta no regresa, y el tiempo pasado no podrá ser recuperado jamás”.\n" +
                "\n" +
                "Sin poder resistir su curiosidad, el pequeño príncipe tiró del hilo y al instante, quedó convertido en un joven gallardo y robusto. Con gran entusiasmo, volvió a tirar del hilo mágico y se descubrió con la corona de su padre. “¡Soy rey!”, “¡Soy rey!”, exclamaba con gran alegría. “Por favor, carrete mágico, quiero saber cómo lucirán mis hijos y mi señora reina”, exclamó impaciente mientras estiraba nuevamente el hilo.\n" +
                "\n" +
                "Entonces, se apareció una mujer hermosa de largos cabellos junto a él, y tres chiquilines hermosos y gordos. La curiosidad del rey se hacía incontenible por saber cómo serían sus hijos de grande, así que tiró un tramo largo de aquel hilo, y otro más, y otro. De repente, notó que sus manos estaban pálidas y débiles, y en el reflejo del espejo descubrió un viejo consumido y seco.\n" +
                "\n" +
                "El príncipe, al ver que había desenrollado todo el hilo, quiso devolverlo nuevamente a su lugar, pero tal como le habían advertido, era completamente imposible. ¡Había consumido toda su vida! La bobina mágica, al verlo tan afligido exclamó: “¿Qué has hecho, criatura infeliz? En vez de vivir los momentos hermosos de tu vida, decidiste pasarlos por alto. Has malgastado el tiempo inútilmente y ya no hay nada que puedas hacer, salvo pagar por tu insolencia”.\n" +
                "\n" +
                "Y así quedó el anciano rey, que sólo pudo disfrutar de una corta vejez hasta que murió de tristeza en su alcoba, por haber desperdiciado toda su vida, sin vivirla como debe ser.", R.drawable.cuento8, "Moraleja","Autor:Anónimo."));





        Adaptador miadap = new Adaptador(getApplicationContext(), Lista);

        listaDatos.setAdapter(miadap);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cuento obj = (Cuento) parent.getItemAtPosition(position);

                Intent paso = new Intent(getApplicationContext(),DetalleCuentosMoraleja.class);
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









