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

public class ListaCuentosClasicos extends AppCompatActivity { ListView listaDatos;
    ArrayList<Cuento> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuentos_clasicos);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Cuento>();

        Lista.add(new Cuento(1,"Pedro sin miedo", "Érase una vez un matrimonio de leñadores que tenía dos hijos. Pedro, el mayor, era un chico muy miedoso. Cualquier ruido le sobresaltaba y las noches eran para él terroríficas. Pedro , el pequeño, era todo lo contrario. No tenía miedo de nada. Por esa razón, la gente lo llamaba Pedro sin miedo. Un día, Pedro decidió salir de su casa en busca de aventuras. De nada sirvió que sus padres intentaron convencerlo de que no lo hiciera. El quería conocer el miedo. Saber que se sentía.\n" +
                "\n" +
                "Estuvo andando sin parar varios días sin que nada especial le sucediese. Llegó un bosque y decidió cruzarlo. Bastante aburrido, se sentó a descansar un rato. De repente, una bruja de terrible aspecto, rodeada de humo maloliente y haciendo grandes aspavientos, apareció junto a él.\n" +
                "\n" +
                "\n" +
                "¿Que ahí abuela? -saludo Pedro con toda tranquilidad.\n" +
                "\n" +
                "\n" +
                "¡Desvergonzado! ¡Soy una bruja!\n" +
                "\n" +
                "\n" +
                "Pero Pedro nos impresionó. La bruja intentó todo lo que sabía para asustar a aquel muchacho. Nada dio resultado. Así que se dio media vuelta y se fue de allí cabizbaja, pensando que era su primer fracaso como bruja.\n" +
                "\n" +
                "\n" +
                "Tras su descanso, Juan echó a andar de nuevo. En un claro del bosque encontró una casa. Llamo a la puerta y le abrió un espantoso ogro que, al ver al muchacho, comenzó a lanzar unas terribles carcajadas.\n" +
                "\n" +
                "\n" +
                "Pedro no soportó que se riera de él. Se quitó el cinturón y empezó a darle unos terribles golpes hasta que el ogro le rogó que parase.\n" +
                "\n" +
                "\n" +
                "El muchacho pasó la noche en la casa del ogro. Por la mañana siguió su camino y llegó a una ciudad. En la plaza un pregonero leía un mensaje del rey.\n" +
                "\n" +
                "\n" +
                "Y a quien se atreva a pasar tres noches seguidas en este castillo, el rey le concederá a la mano de la princesa.\n" +
                "\n" +
                "\n" +
                "Pedro sin miedo se dirigió al palacio real, donde fue recibido por el soberano.\n" +
                "\n" +
                "\n" +
                "Majestad, estoy dispuesto a ir a ese castillo dijo el muchacho.\n" +
                "\n" +
                "\n" +
                "Sin duda has de ser muy valiente contestó el monarca. Pero creo que deberías pensar lo mejor.\n" +
                "\n" +
                "\n" +
                "Está decidido respondió Juan con gran seguridad.\n" +
                "\n" +
                "\n" +
                "Pedro llegó al castillo. Llevaba años deshabitado. Había polvo y telarañas por todas partes. Como tenía frío, encendió una hoguera. Con el calor se quedó dormido.\n" +
                "\n" +
                "\n" +
                "Al rato, unos ruidos de cadenas lo despertaron. Al abrir los ojos, el muchacho vio ante él un fantasma.\n" +
                "\n" +
                "\n" +
                "Pedro , muy enfadado por qué lo hubieran despertado, cogió un palo ardiendo y se lo tiró al fantasma.\n" +
                "\n" +
                "\n" +
                "Este, con su sábana en llamas, huyó de allí y el muchacho siguió durmiendo tan tranquilo.\n" +
                "\n" +
                "\n" +
                "Por la mañana, siguió recorriendo el castillo. Encontró una habitación con una cama y decidió pasar allí su segunda noche. Al poco rato de haberse acostado, o yo lo que parecían maullidos de gatos. Y ante él aparecieron tres grandes tigres que lo miraban con ojos amenazadores.\n" +
                "\n" +
                "\n" +
                "Pedro cogió la barra de hierro y empezó a repartir golpes. Con cada golpe, los tigres se iban haciendo más pequeños. Tanto redujeron su tamaño que, al final, quedaron convertidos en unos juguetones que a gatitos a los que Pedro estuvo acariciando.\n" +
                "\n" +
                "\n" +
                "Llegó la tercera noche y Pedro se echó a dormir. Al cabo de unos minutos escuchó unos impresionantes rugidos. Un enorme león estaba a punto de atacarlo. El muchacho cogió la barra de hierro y empezó a golpear al pobre animal, quien empezó a decir con voz suplicante: ¡Basta! ¡basta! ¡no me es más! ¡eres un bruto! ¿no te das cuenta de que me vas a matar?\n" +
                "\n" +
                "\n" +
                "A la mañana siguiente, Pedro sin miedo apareció el palacio real. El rey, que no daba crédito a sus ojos, le concedió la mano de su hija y, a los pocos días se celebraron las bodas.\n" +
                "\n" +
                "\n" +
                "Pedro estaba encantado con su esposa y se sentía muy feliz.\n" +
                "\n" +
                "\n" +
                "La princesa también lo estaba. Pero decidió que haría conocer el miedo a su marido.\n" +
                "\n" +
                "\n" +
                "Una noche, mientras Pedro dormía, ella cogió una jarra de agua fría y se la derramó encima.\n" +
                "\n" +
                "\n" +
                "El pobre Pedro creyó morir del susto. Temblaba de terror. Sus pelos estaban rizados y ¡conoció el miedo, por fin!\n" +
                "\n" +
                "\n" +
                "Pedro una vez recuperado, agradeció su esposa haberle hecho sentir miedo, algo que todo el mundo conoce.Érase una vez un matrimonio de leñadores que tenía dos hijos. Pedro, el mayor, era un chico muy miedoso. Cualquier ruido le sobresaltaba y las noches eran para él terroríficas. Pedro , el pequeño, era todo lo contrario. No tenía miedo de nada. Por esa razón, la gente lo llamaba Pedro sin miedo. Un día, Pedro decidió salir de su casa en busca de aventuras. De nada sirvió que sus padres intentaron convencerlo de que no lo hiciera. El quería conocer el miedo. Saber que se sentía.\n" +
                "\n" +
                "\n" +
                "foto\n" +
                "\n" +
                "\n" +
                "Estuvo andando sin parar varios días sin que nada especial le sucediese. Llegó un bosque y decidió cruzarlo. Bastante aburrido, se sentó a descansar un rato. De repente, una bruja de terrible aspecto, rodeada de humo maloliente y haciendo grandes aspavientos, apareció junto a él.\n" +
                "\n" +
                "\n" +
                "¿Que ahí abuela? -saludo Pedro con toda tranquilidad.\n" +
                "\n" +
                "\n" +
                "¡Desvergonzado! ¡Soy una bruja!\n" +
                "\n" +
                "\n" +
                "Pero Pedro nos impresionó. La bruja intentó todo lo que sabía para asustar a aquel muchacho. Nada dio resultado. Así que se dio media vuelta y se fue de allí cabizbaja, pensando que era su primer fracaso como bruja.\n" +
                "\n" +
                "\n" +
                "Tras su descanso, Pedro echó a andar de nuevo. En un claro del bosque encontró una casa. Llamo a la puerta y le abrió un espantoso ogro que, al ver al muchacho, comenzó a lanzar unas terribles carcajadas.\n" +
                "\n" +
                "\n" +
                "Pedro no soportó que se riera de él. Se quitó el cinturón y empezó a darle unos terribles golpes hasta que el ogro le rogó que parase.\n" +
                "\n" +
                "\n" +
                "El muchacho pasó la noche en la casa del ogro. Por la mañana siguió su camino y llegó a una ciudad. En la plaza un pregonero leía un mensaje del rey.\n" +
                "\n" +
                "\n" +
                "Y a quien se atreva a pasar tres noches seguidas en este castillo, el rey le concederá a la mano de la princesa.\n" +
                "\n" +
                "\n" +
                "Pedro sin miedo se dirigió al palacio real, donde fue recibido por el soberano.\n" +
                "\n" +
                "\n" +
                "Majestad, estoy dispuesto a ir a ese castillo dijo el muchacho.\n" +
                "\n" +
                "\n" +
                "Sin duda has de ser muy valiente contestó el monarca. Pero creo que deberías pensar lo mejor.\n" +
                "\n" +
                "\n" +
                "Está decidido respondió Pedro con gran seguridad.\n" +
                "\n" +
                "\n" +
                "Pedro llegó al castillo. Llevaba años deshabitado. Había polvo y telarañas por todas partes. Como tenía frío, encendió una hoguera. Con el calor se quedó dormido.\n" +
                "\n" +
                "\n" +
                "Al rato, unos ruidos de cadenas lo despertaron. Al abrir los ojos, el muchacho vio ante él un fantasma.\n" +
                "\n" +
                "\n" +
                "Pedro , muy enfadado por qué lo hubieran despertado, cogió un palo ardiendo y se lo tiró al fantasma.\n" +
                "\n" +
                "\n" +
                "Este, con su sábana en llamas, huyó de allí y el muchacho siguió durmiendo tan tranquilo.\n" +
                "\n" +
                "\n" +
                "Por la mañana, siguió recorriendo el castillo. Encontró una habitación con una cama y decidió pasar allí su segunda noche. Al poco rato de haberse acostado, o yo lo que parecían maullidos de gatos. Y ante él aparecieron tres grandes tigres que lo miraban con ojos amenazadores.\n" +
                "\n" +
                "\n" +
                "Pedro cogió la barra de hierro y empezó a repartir golpes. Con cada golpe, los tigres se iban haciendo más pequeños. Tanto redujeron su tamaño que, al final, quedaron convertidos en unos juguetones que a gatitos a los que Pedro estuvo acariciando.\n" +
                "\n" +
                "\n" +
                "Llegó la tercera noche y Pedro se echó a dormir. Al cabo de unos minutos escuchó unos impresionantes rugidos. Un enorme león estaba a punto de atacarlo. El muchacho cogió la barra de hierro y empezó a golpear al pobre animal, quien empezó a decir con voz suplicante: ¡Basta! ¡basta! ¡no me es más! ¡eres un bruto! ¿no te das cuenta de que me vas a matar?\n" +
                "\n" +
                "\n" +
                "A la mañana siguiente, Pedro sin miedo apareció el palacio real. El rey, que no daba crédito a sus ojos, le concedió la mano de su hija y, a los pocos días se celebraron las bodas.\n" +
                "\n" +
                "\n" +
                "Pedro estaba encantado con su esposa y se sentía muy feliz.\n" +
                "\n" +
                "\n" +
                "La princesa también lo estaba. Pero decidió que haría conocer el miedo a su marido.\n" +
                "\n" +
                "\n" +
                "Una noche, mientras Pedro dormía, ella cogió una jarra de agua fría y se la derramó encima.\n" +
                "\n" +
                "\n" +
                "El pobre Pedro creyó morir del susto. Temblaba de terror. Sus pelos estaban rizados y ¡conoció el miedo, por fin!\n" +
                "\n" +
                "\n" +
                "Pedro una vez recuperado, agradeció su esposa haberle hecho sentir miedo, algo que todo el mundo conoce."+
                "Nos toca a nosotros escoger que hacer con ella.”",R.drawable.cuento9,  "Cuento Clásico","Autor: anonimo"));


        Lista.add(new Cuento(1,"El enano saltarín", "Hace mucho tiempo, existió un rey que gustaba de dar largos paseos por el bosque. Un buen día, y cansado de tanto cabalgar, el monarca llegó a una humilde casita entre los árboles. En aquel lugar, vivía un agricultor con su hija joven, la cual rápidamente se ganó la admiración del rey por su belleza.\n" +
                "\n" +
                "“Mi hija no solo es bella, sino que también tiene un don especial” – alardeaba el campesino. Cuando el rey le preguntó de qué se trataba, el anciano respondió que la muchacha era capaz de convertir en oro la paja seca con el uso de una rueca. “Genial, la llevaré conmigo al palacio” – gritó entonces el rey.\n" +
                "\n" +
                "Al llegar al enorme castillo, el monarca condujo a la joven doncella hacia una habitación donde se encontraba una rueca rodeada de paja. “A la mañana siguiente vendré a ver si es verdad que puedes convertir todo esto en oro. Si me engañas, tú y tu padre sufrirán las consecuencias por haberme mentido”.\n" +
                "\n" +
                "Al no saber qué hacer, la pobre muchacha se desplomó en el suelo y se puso a llorar hasta la llegada de la noche. Entonces, cuando dieron exactamente las doce en el reloj, apareció por una de las ventanas, un enano narizón que prometió ayudarla.\n" +
                "\n" +
                "“Si me regalas tu collar, convertiré toda esta paja en oro” – dijo el enano con una voz suave, y sin pensarlo dos veces, la hermosa joven le entregó su collar a la criatura, y esta se dispuso a hilar la rueca con toda la paja de la habitación. A la mañana siguiente, el rey abrió la puerta y quedó boquiabierto de ver que, efectivamente, toda la paja había sido convertida en oro.\n" +
                "\n" +
                "Cegado por su ambición, el rey tomó a la muchacha por las manos y la llevó hacia otra habitación mucho más grande que la anterior. Enormes bultos de paja se extendían hasta el techo. “Ahora debes hacer lo mismo en esta habitación. Si no lo haces, verás las consecuencias de tu engaño”, le dijo el monarca antes de cerrar la puerta.\n" +
                "\n" +
                "La suerte de la muchacha no había cambiado, y tan nerviosa se puso que se tumbó en el suelo a llorar desconsoladamente. A las doce en punto de la noche, apareció nuevamente el enano narizón que la había ayudado. “Si me das esa sortija que brilla en tus dedos, te ayudaré a convertir toda esta paja en oro”, le dijo la criatura a la muchacha, y esta no dudo un segundo en cumplir su parte del trato.\n" +
                "\n" +
                "Para sorpresa del rey, cuando regresó a la mañana siguiente, la habitación se encontraba repleta de hilos de oro, y fue tanta su avaricia, que decidió casarse entonces con la pobre muchacha, pero a cambio debía repetir el acto mágico una vez más.\n" +
                "\n" +
                "Tan triste se puso aquella joven, que no tuvo más remedio que echarse a llorar durante toda la noche. Como era costumbre, el enano narizón apareció entonces a las doce de la noche y acercándose lentamente a la muchacha le dijo: “No llores más, hermosa. Te ayudaré con el rey, pero deberás entregarme algo a cambio”.\n" +
                "\n" +
                "“No tengo más joyas que darte”, exclamó la muchacha con pesadumbre, pero el enano le pidió entonces una cosa mucho más importante: “Cuando nazca tu primer hijo, deberás entregármelo sin dudar. ¿Aceptas?”. La princesa no tuvo que pensarlo mucho, y tal como había prometido el enano, convirtió toda la paja de la habitación en oro usando la rueca.\n" +
                "\n" +
                "En las primeras horas de la mañana siguiente, el rey apareció como de costumbre, y al ver que era más rico aún gracias a la muchacha, ordenó a sus súbditos que preparan un banquete de bodas gigante para casarse de inmediato.\n" +
                "\n" +
                "Al cabo de un año, el rey y la nueva reina tuvieron su primer hijo, y aunque la muchacha había olvidado por completo la promesa del enano narizón, este apareció una buena noche en la ventana de su alcoba. “He venido a llevarme lo prometido. Entrégame a tu hijo como acordamos”, susurró el enano entre risas. “Por favor, criatura. No te lleves lo que más amo en este mundo”, suplicó la reina arrodillada, “te daré todo lo que desees, montañas de oro, mares de plata, todo porque dejes a mi hijo en paz”.\n" +
                "\n" +
                "Pero el enano no se dejó convencer, y tanta fue la insistencia de la muchacha que finalmente, la criatura le dijo: “Sólo hay un modo de que puedas romper la promesa, y es el siguiente: dentro de tres noches vendré nuevamente a buscarte, si para ese entonces adivinas mi nombre, te dejaré en paz”. Y dicho aquello se desapareció al instante.\n" +
                "\n" +
                "La reina, decidió entonces averiguar por todos los medios el nombre de aquella criatura, por lo que mandó a sus guardias a todos los rincones del mundo y les ordenó que no volvieran si no traían una respuesta. Tras dos días y dos noches, apareció uno de los guardias, contando la historia de un enano que había visto caminando por el bosque, mientras cantaba lo siguiente:\n" +
                "\n" +
                "“Soy un duende maldito,\n" +
                "\n" +
                "Inteligente como yo, nunca encontrarán\n" +
                "\n" +
                "Mañana me llevaré al niño\n" +
                "\n" +
                "Y el nombre de Rumpelstiltskin, jamás adivinarán”\n" +
                "\n" +
                "Así pudo saber la reina el nombre del enano narizón, y cuando se apareció en la noche le dijo: “Tu nombre es Rumpelstiltskin”. Entre gritos y lamentos, el enano comenzó a dar saltos enfurecidos por toda la habitación, y tanto fue su enfado, que saltando y saltando llegó al borde del balcón y se cayó en el foso del castillo, quedando atrapado allí para siempre.”",R.drawable.cuento10,  "Cuento Clásico","Autor: anonimo"));


        Lista.add(new Cuento(1,"El hueso cantarín", "Hace mucho tiempo, en un país lejano, hubo una gran lamentación por un jabalí que arrasaba los campos de los agricultores, mataba el ganado y atacaba a las personas.El Rey prometió una gran recompensa a quien lograra liberar su tierra del temido jabalí, pero la bestia era tan grande y fuerte que nadie se atrevía a acercarse al bosque donde se escondía.Finalmente, el rey anunció que aquel que capturara al jabalítomaría como esposa a su única hija.\n" +
                "\n" +
                "\n" +
                "Dos hermanos,hijos de un pobre hombre, deseosos de huir de su destino, decidieron aceptar el reto. El mayor era astuto, sagaz y orgulloso, mientras que el más joven era sencillo e ingenuo, de gran corazón. \n" +
                "\n" +
                "\n" +
                "El rey les dijo: \n" +
                "\n" +
                "\n" +
                "-Para que encontréis más fácilmente a la bestia, entraréis en el bosque por lados opuestos.\n" +
                "\n" +
                "\n" +
                "A los hermanos les pareció bien, así que el mayor entró por el lado oeste y el más joven por el este.\n" +
                "\n" +
                "\n" +
                "En cuanto el más joven había avanzado un poco, un pequeño hombre con una lanza negra en la mano se le acercó y le dijo:?\n" +
                "\n" +
                "\n" +
                "-Te doy esta lanza, porque tu corazón es puro y bueno; con esto podrás atacar con valentía al jabalí y no te hará ningún daño.\n" +
                "\n" +
                "\n" +
                "El muchacho dio las gracias al hombre, cargó con la lanza y continuó el camino sin miedo.\n" +
                "\n" +
                "\n" +
                "Al poco tiempo vio a la bestia, que se abalanzó sobre él. Pero el joven, seguro de que podía acabar con él, se quedó quieto con la lanza hacia delante, de modo que el terrible monstruo quedó clavado en ella. Luego el joven cargó al jabalí sobre su espalda e inició el camino de vuelta hacia el castillo.\n" +
                "\n" +
                "\n" +
                "Al salir al otro lado del bosque, el muchacho encontró una casa donde la gente estaba haciendo fiesta con vino y baile. Allí estaba su hermano mayor, que se había quedado pensando que, después de todo, el jabalí no se alejaría. Pero cuando vio a su hermano menor que salía del bosque con su carga, le gritó: \n" +
                "\n" +
                "\n" +
                "-¡Ven, querido hermano, descansa y refréscate con una copa de vino!\n" +
                "\n" +
                "\n" +
                "El joven, que no sospechaba nada malo, fue y le contó lo que había ocurrido. El hermano mayor lo mantuvo allí hasta la noche y después se marcharon juntos. Cuando en la oscuridad llegaron a un puente sobre un arroyo, el hermano mayor dejó que el otro fuera primero y cuando estaban a mitad del puente le dio un fuerte golpe por detrás y lo mató. Luego lo enterró bajo el puente, cogió al jabalí y se lo llevó al rey, fingiendo que él lo había matado. El rey, agradecido, le ofreció a su hija en matrimonio. Para justificar la ausencia de su hermano menor, el muchacho dijo al rey que seguramente el jabalí lo habría matado. \n" +
                "\n" +
                "\n" +
                "El hueso cantorAños después, un pastor que conducía su rebaño a través del puente, vio sobre la arena un pequeño hueso blanco como la nieve. Pensó que con él haría una buena boquilla para su cuerno, así que bajó y lo recogió, e hizo la boquilla. Pero sucedió que cuando sopló a través de él por primera vez, para gran sorpresa suya, el hueso empezó a cantar:\n" +
                "\n" +
                "\n" +
                "¡Ah, amigo, tú soplaste sobre mi?hueso! \n" +
                "\n" +
                "Por largo tiempo he permanecido junto al agua.\n" +
                "\n" +
                "Mi hermano me mató por el jabalí\n" +
                "\n" +
                "y tomó por esposa a la joven hija del rey.\n" +
                "\n" +
                "\n" +
                "-¡Qué?cuerno?tan maravilloso que canta por sí mismo!. Tengo que llevárselo al rey -dijo el?pastor.\n" +
                "\n" +
                "\n" +
                "Y cuando llegó con él al rey, el cuerno de nuevo comenzó a cantar su canción. El rey lo entendió todo y mandó a mover la tierra bajo el puente y descubrió el cuerpo del hermano de su yerno. El?perverso hermano no pudo negar lo que había hecho y fue castigado. Así, el perverso hermano lo perdió todo y pasó sus días solo y pobre."+
                "Nos toca a nosotros escoger que hacer con ella.”",R.drawable.cuento11,  "Cuento Clásico","Autor: anonimo"));

        Lista.add(new Cuento(3,"Hansel y Gretel", "Hansel y Gretel son dos hermanos que son abandonados en el bosque. Perdidos, encuentran una casita de chocolate y dulces en la que vive una ancianita que les invita a pasar. Los niños se quedan, pero la ancianita resulta ser una bruja que encierra al niño en una jaula y lo engorda para comérselo, mientras la niña tiene que hacer tareas. Consiguen aplazar que la bruja se lo coma haciéndola creer que no engorda, mostrándole un hueso de pollo como si fuera el dedo del niño, pero la bruja se harta y decide comérselo igual. Le pide a la niña que prepare el horno, pero esta hace como que no sabe, y cuando la bruja se asoma para enseñarle, la empuja dentro y se quema. Los niños consiguen huir y encontrar el camino a casa con su padre.",R.drawable.cuento12,  "Cuento Clásico","Autor: anonimo"));



        Adaptador miadap = new Adaptador(getApplicationContext(), Lista);

        listaDatos.setAdapter(miadap);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cuento obj = (Cuento) parent.getItemAtPosition(position);

                Intent paso = new Intent(getApplicationContext(),DetalleCuentosClasicos.class);
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









