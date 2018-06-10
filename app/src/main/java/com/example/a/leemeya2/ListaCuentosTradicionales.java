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

public class ListaCuentosTradicionales extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Cuento> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuentos_tradicionales);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Cuento>();

        Lista.add(new Cuento(1,"Los cuatro músicos", "Érase una vez un asno que, por desgracia, se quedó sin trabajo. Era muy viejo y por lo tanto ya no podía transportar sacos de cereales al molino. Pero aunque era viejo, el asno no era tonto.\n" +
                "\n" +
                "Decidió irse a la ciudad de Bremen, donde pensó que podrían contratarlo como músico municipal. ¡Y dicho y hecho! El asno abandonó la granja donde había trabajado durante años y emprendió un viaje hacia Bremen.\n" +
                "\n" +
                "El asno había caminado ya un buen rato cuando se encontró a un perro cansado por el camino. Y le dijo:\n" +
                "\n" +
                "- Debes estar muy cansado, amigo\n" +
                "\n" +
                "Y le contestó el perro:\n" +
                "\n" +
                "- ¡Ni que lo digas! Como ya soy viejo, mi amo quiso matarme, pues dice que ya no sirvo para la casa. Así que decidí alejarme rápidamente. Lo que no sé es qué podré hacer ahora para no morirme de hambre.\n" +
                "\n" +
                "- Mira - le dijo el asno. A mí me pasó lo mismo. Decidí irme a Bremen a ver si me contratan como músico de la ciudad. Si vienes conmigo podrías intentar que te contratasen a ti también. Yo tocaré el laúd. Tú puedes tocar los timbales.\n" +
                "\n" +
                "La idea le gustó al perro y decidió acompañar al asno. Caminaron un buen trecho cuando se encontraron a un gato con cara de hambriento, y le dijo el asno:\n" +
                "\n" +
                "- No tienes buena cara, amigo.\n" +
                "\n" +
                "A lo que le contestó el gato:\n" +
                "\n" +
                "- Pues ¿cómo voy a tener buena cara si mi ama intentó ahogarme porque dice que ya soy demasiado viejo y no cazo ratones como antes? Conseguí escapar, pero ¿qué voy hacer ahora?\n" +
                "\n" +
                "- A nosotros, -le dijo el asno, nos ha pasado lo mismo, y nos decidimos ir a Bremen. Si nos acompañas, podrías entrar en la banda que vamos a formar, pues podrías colaborar con tus maullidos.\n" +
                "\n" +
                "El gato, como no tenía otra alternativa, aceptó la invitación y se fue con el asno y el perro. Después de mucho caminar, y al pasar cerca de una granja, los tres animales vieron a un gallo que cantaba con mucha tristeza en lo alto de un portal. Y le dijo el asno:\n" +
                "\n" +
                "- Debes estar muy triste, amigo. Al que le contestó el gallo:\n" +
                "\n" +
                "- Pues, en realidad estoy más que triste. ¡Estoy desesperado! Va a ver una fiesta mañana y mi ama ha ordenado a la cocinera que esta me corte el cuello para hacer conmigo un buen guiso. Y le dijo el asno:\n" +
                "\n" +
                "- No te desesperes. Vente con nosotros a Bremen, donde formaremos una banda musical. Tú, con la buena voz que tienes, nos será muy útil allí.\n" +
                "\n" +
                "El gallo levantó su cabeza y aceptó la invitación, siguiendo a los otros tres animales por el camino. Llegó la noche y los cuatro decidieron descansar un poco en el bosque. Se habían acomodado bajo un árbol cuando el gallo, que se había subido a la rama más alta, avisó a sus compañeros de que veía una luz a los lejos.\n" +
                "\n" +
                "El asno le dijo que podría ser una casa y deberían irse a la casa para que pudiesen estar más cómodos. Y así lo hicieron. Al acercarse a la casa averiguaron que la casa se trataba de una guarida de ladrones. El asno, como era el más alto, miró por la ventana para ver lo que pasaba en su interior.\n" +
                "\n" +
                "- ¿Qué ves?, le preguntaron todos.\n" +
                "\n" +
                "- Veo una mesa con mucha comida y bebida, y junto a ella hay unos ladrones que están cenando, les contentó el asno.\n" +
                "\n" +
                "- ¡Ojalá pudiéramos hacer lo mismo nosotros! - exclamó el gallo.\n" +
                "\n" +
                "- Pues sí - concordó el asno.\n" +
                "\n" +
                "Los cuatro animales se pusieron a montar un plan para ahuyentar a los bandidos para que les dejaran la comida. El asno se puso de manos al lado de la ventana; el perro se encaramó a las espaldas del asno; el gato se montó encima del perro, y el gallo voló y se posó en la cabeza del perro.\n" +
                "\n" +
                "Enseguida, empezaron a gritar, y de un golpe, rompieron los cristales de una ventana. Armaron tal confusión que los bandidos, aterrorizados, salieron rápidamente de la casa.\n" +
                "\n" +
                "Los cuatro amigos, después de que lograron su propósito, hicieron un verdadero banquete. Acabada la comida, los cuatros apagaron la luz y cada uno se buscó un rincón para descansar.\n" +
                "\n" +
                "Pero en el medio de la noche, los ladrones, viendo que todo parecía tranquilo en la casa, mandaron a uno de ellos que inspeccionara la casa. El enviado entró en la casa a oscuras y, cuando se dirigía a encender la luz, vio que algo brillaba en el fogón. Eran los ojos del gato que se había despertado.\n" +
                "\n" +
                "Y sin pensar dos veces, se saltó a la cara del ladrón y empezó a arañarle. El bandido, con miedo, echó a correr. Pero no sin antes llevarse una coz del asno, ser atacado por el perro, y llevarse un buen susto con los gritos del gallo.\n" +
                "\n" +
                "Al reunirse con sus compañeros, el bandido les dijo que en la casa había una bruja que le atacó por todos lados. Le arañó, le acuchilló, le golpeó, y le gritó ferozmente. Y que todos deberían huir rápidamente. Y así lo hicieron todos.\n" +
                "\n" +
                "Y fue así, gracias a buen plan que habían montado los animales, que los cuatros músicos de Bremen pudieron vivir su vejez, tranquila y cómodamente, en aquella casa.”",R.drawable.cuento13,  "Cuento Tradicional","Autor: anonimo"));


        Lista.add(new Cuento(1,"La gallina roja", "Había una vez una granja donde todos los animales vivían felices. Los dueños cuidaban de ellos con mimo y no les faltaba de nada. En cuanto el gallo anunciaba la salida del sol, todos se ponían en marcha y realizaban sus funciones con agrado. Siempre tenían a su disposición alimentos para comer y un lecho caliente sobre el que descansar.\n" +
                "\n" +
                "El terreno que rodeaba la casa principal era muy amplio y con suficiente espacio para que los caballos pudieran trotar, los cerdos revolcarse en el barro y, las vacas, pastar a gusto mientras hacían sonar sus cencerros de latón. Entre las patas de los grandes animales siempre correteaba algún pollito que se esmeraba en aprender a volar bajo la mirada atenta de las gallinas.\n" +
                "\n" +
                "Una de esas gallinitas era roja y se llamaba Marcelina. Un día que estaba muy atareada  escarbando entre unas piedras, encontró un grano de trigo. Lo cogió con el pico y se quedó pensando en qué hacer con él. Como era una gallina muy lista y hacendosa, tuvo una idea fabulosa.\n" +
                "\n" +
                "– ¡Ya lo tengo! Sembraré este grano e invitaré a todos mis amigos a comer pan.\n" +
                "\n" +
                "Contentísima, fue en busca de aquellos a los que más quería.\n" +
                "\n" +
                "– ¡Eh, amigos! ¡Mirad lo que acabo de encontrar! Es un hermoso grano de trigo dorado ¿Me ayudáis a plantarlo?\n" +
                "\n" +
                "– Yo no – dijo el pato.\n" +
                "\n" +
                "– Yo no – dijo el gato.\n" +
                "\n" +
                "– Yo no – dijo el perro.\n" +
                "\n" +
                "– Está bien – suspiró la gallinita roja – Yo lo haré.\n" +
                "\n" +
                "Marcelina se alejó un poco apesadumbrada y buscó el lugar idóneo para plantarlo. Durante días y días regó el terreno y vigiló que ningún pájaro merodeara por allí. El trabajo bien hecho dio un gran resultado. Feliz, comprobó cómo nacieron unas plantitas que se convirtieron en espigas repletas de semillas.\n" +
                "\n" +
                " ¡La gallina estaba tan contenta!…  Buscó a sus amigos e hizo una reunión de urgencia.\n" +
                "\n" +
                "– Queridos amigos… Mi semilla es ahora una preciosa planta. Debo segarla para recoger el fruto ¿Me ayudáis?\n" +
                "\n" +
                "– Yo no – dijo el pato.\n" +
                "\n" +
                "– Yo no – dijo el gato.\n" +
                "\n" +
                "– Yo no – dijo el perro.\n" +
                "\n" +
                "– En fin… Si no queréis echarme una mano, tendré que hacerlo yo solita.\n" +
                "\n" +
                "La pobre Marcelina se armó de paciencia y se puso manos a la obra. La tarea de segar era muy dura para una gallina tan pequeña como ella, pero con tesón consiguió su objetivo y cortó una a una todas las espigas.\n" +
                "\n" +
                "Agotada y sudorosa recorrió la granja para reunir de nuevo a sus amigos.\n" +
                "\n" +
                "– Chicos… Ya he segado y ahora tengo que separar el grano de la paja.  Es un trabajo complicado y me gustaría contar con vosotros para terminarlo cuanto antes ¿Quién de vosotros me ayudará?\n" +
                "\n" +
                "– Yo no – dijo el pato.\n" +
                "\n" +
                "– Yo no – dijo el gato.\n" +
                "\n" +
                "– Yo no – dijo el perro.\n" +
                "\n" +
                "– ¡Vale, vale! Yo me encargo de todo.\n" +
                "\n" +
                "¡La gallina no se lo podía creer! ¡Nadie quería echarle una mano! Se sentó y con su piquito, separó con mucho esmero los granos de trigo de la planta. Cuando terminó era tan tarde que sólo pudo dormir unos minutos antes del canto del gallo.\n" +
                "\n" +
                "Durante el desayuno los ojillos se le cerraban y casi no tenía fuerzas para hablar. Era tanto su agotamiento que apenas sentía hambre.  Además, estaba enfadada por la actitud de sus amigos, pero aun así decidió intentarlo una vez más.\n" +
                "\n" +
                "– Ya he sembrado, segado y trillado. Ahora necesito que me ayudéis a llevar los granos de trigo al molino para hacer harina ¿Quién se viene conmigo?\n" +
                "\n" +
                "– Yo no – dijo el pato.\n" +
                "\n" +
                "– Yo no – dijo el gato.\n" +
                "\n" +
                "– Yo no – dijo el perro.\n" +
                "\n" +
                "– ¡Muy bien! Yo llevaré los sacos de trigo al molino y me encargaré de todo.\n" +
                "\n" +
                "¡La gallina estaba harta! Nunca les pedía favores y, para un día que necesitaba su colaboración, escurrían el bulto. Se sentía traicionada. Suspiró hondo y dedicó el día entero a transportar y moler el trigo, con el que elaboró una finísima harina blanca.\n" +
                "\n" +
                "Al día siguiente se levantó más animada. El trabajo duro ya había pasado y ahora tocaba la parte más divertida y apetecible. Con harina, agua y sal hizo una masa y elaboró deliciosas barras de pan. El maravilloso olor a hogazas calientes se extendió por toda la granja. Cómo no, los primeros en seguir el rastro fueron sus supuestos tres mejores amigos, que corrieron  en su busca con la esperanza de zamparse un buen trozo.\n" +
                "\n" +
                "En cuanto les vio aparecer, la gallinita roja les miró fijamente y con voz suave les preguntó:\n" +
                "\n" +
                "– ¿Quién quiere probar este apetitoso pan?\n" +
                "\n" +
                "– ¡Yo sí! – dijo el pato.\n" +
                "\n" +
                "– ¡Yo sí! – dijo el gato.\n" +
                "\n" +
                "– ¡Yo sí! – dijo el perro.\n" +
                "\n" +
                "La gallina miró a sus amigos y les gritó.\n" +
                "\n" +
                "– ¡Pues os quedáis con las ganas! No pienso compartir ni un pedazo con vosotros. Los buenos amigos están para lo bueno y para lo malo. Si no supisteis estar a mi lado cuando os necesité, ahora tenéis que asumir las consecuencias. Ya podéis largaros porque este pan será sólo para mí.\n" +
                "\n" +
                "El pato, el gato y el perro se alejaron cabizbajos mientras la gallina daba buena cuenta del riquísimo pan recién horneado.\n" +
                "\n" +
                "Y colorín colorado, este cuento se ha acabado.",R.drawable.cuento14,  "Cuento Tradicional","Autor: anonimo"));

        Lista.add(new Cuento(1,"El gigante egoista", "Hace muchos años, en un pequeño pueblo, existían cinco niños muy amigos que cada tarde salían a jugar al bosque. Los pequeños correteaban por la yerba, saltaban a los árboles y se bañaban en los ríos con gran felicidad. En realidad, eran muy unidos y les gustaba sentirse en compañía de los animales y el calor que les brindaba el Sol. Sin embargo, cierta tarde, los niños se alejaron del bosque y fueron a dar con un inmenso castillo resguardado por unos altos muros.\n" +
                "\n" +
                "Sin poder contener la curiosidad, treparon los muros y se adentraron en el jardín del castillo, y después de varias horas de juego, sintieron una voz terrible que provenía de adentro. “¿Qué hacen en mi castillo? ¡Fuera de aquí!”.\n" +
                "\n" +
                "Asaltados por el miedo, los cinco niños se quedaron inmóviles mirando hacia todas partes, pero en seguida se asomó ante sus ojos un gigante egoísta horroroso con los ojos amarillos. “Este es mi castillo, rufianes. No quiero que nadie ande merodeando. Largo de aquí y no se atrevan a regresar. ¡Fuera!”. Sin pensarlo dos veces, los niños salieron disparados a toda velocidad de aquel lugar hasta perderse en la lejanía.\n" +
                "\n" +
                "Para asegurarse de que ningún otro intruso penetraría en el castillo, el gigante reforzó los muros con plantas repletas de espinas y gruesas cadenas que apenas dejaban mirar hacia el interior. Además, en la puerta principal, el gigante egoísta y malhumorado colocó un cartel enorme donde se leía: “¡No entrar!”.\n" +
                "\n" +
                "A pesar de todas estas medidas, los niños no se dieron por vencidos, y cada mañana se acercaban sigilosos a los alrededores del castillo para contemplar al gigante. Allí se quedaban por un largo rato hasta que luego regresaban con tristeza a casa. Tiempo después, tras la primavera, arribó el verano, luego el otoño, y finalmente el invierno. En pocos días, la nieve cubrió el castillo del gigante y le aportó un aspecto sombrío y feo. Los fuertes vientos arreciaban en las ventanas y las puertas, y el gigante permanecía sentado en su sillón deseando que regresara nuevamente la primavera.\n" +
                "\n" +
                "Al cabo de los meses, el frío por fin se despidió y dio paso a la primavera. El bosque gozó nuevamente de un verde brillante muy hermoso, el Sol penetró en la tierra y los animales abandonaron sus guaridas para poblar y llenar de vida la región. Sin embargo, eso no sucedió en el castillo del gigante egoísta. Allí la nieve aún permanecía reinando, y los árboles apenas habían asomado sus ramas verdosas.\n" +
                "\n" +
                "“¡Qué desdicha!” – se lamentaba el gigante – “Todos pueden disfrutar de la primavera menos yo, y ahora mi jardín es un espacio vacío y triste”.\n" +
                "\n" +
                "Afligido por su suerte, este se tumbó en su lecho y allí hubiese quedado para siempre sino fuese porque un buen día oyó con gran sorpresa el cantar de un sinsonte en la ventana. Asombrado y sin poder creerlo aún, el gigante se asomó y esbozó una sonrisa en sus labios. Su jardín había recuperado la alegría, y ahora, no sólo los árboles ofrecían unas ramas verdes y hermosas, sino que las flores también habían decidido crecer, y para su sorpresa, los niños también se encontraban en aquel lugar jugando y correteando de un lado hacia el otro.\n" +
                "\n" +
                "“¿Cómo pude ser tan egoísta? Los niños me han traído la primavera y ahora me siento más feliz” – así gritaba el gigante mientras descendía las escaleras para salir al jardín. Al llegar al lugar, descubrió que los pequeñines trepaban a los árboles y se divertían alegremente. Todos menos uno, que por ser el más chico no podía trepar a ningún árbol.\n" +
                "\n" +
                "Compadecido con aquel niño, el gigante egoísta decidió ayudarlo y tendió su mano para que este pudiera subir al árbol. Entonces, la enorme criatura eliminó las plantas con espinas que había colocado en su muro y también las cadenas que impedían el paso hacia su castillo.\n" +
                "\n" +
                "Sin embargo, cuando los niños le vieron sintieron miedo de que el gigante egoísta les expulsará del lugar, y sin perder tiempo se apresuraron a marcharse del castillo, pero el niño más pequeño quedó entonces atrapado en el árbol sin poder descender. Para su sorpresa, las flores se marchitaron, la yerba se tornó gris y los árboles comenzaron a llenarse de nieve.\n" +
                "\n" +
                "Con gran tristeza, el gigante le pidió al chico que no llorara, y en cambio le dijo que podía quedarse y jugar en su jardín todo el tiempo que quisiera. Entonces, los demás niños que permanecían escondidos desde fuera del muro, comprendieron que este no era malo, y que por fin podían estar en el jardín sin temor a ser expulsados.\n" +
                "\n" +
                "Desde ese entonces, cada año cuando la primavera arriba al bosque, los niños se apresuran hacia el castillo del gigante para llenar de vida su jardín y sus flores.",R.drawable.cuento15,  "Cuento Tradicional","Autor: Rosa Espejo"));


        Lista.add(new Cuento(1,"El soldadito de plomo", "Jorgito obtuvo buenas calificaciones escolares y recibió como premio una caja de juguetes con trenes, un arlequín, una danzarina y soldaditos de plomo.\n" +
                "\n" +
                "Con tristeza, Jorgito se dio cuenta que a uno de sus soldados le faltaba una pierna, pero lo quiso más porque ello indicaba que la había perdido heroicamente en una batalla. Ya muy noche y cuando todos dormían, sonó el clarín de los juguetes y uno por uno empezaron a cobrar vida. El soldadito de plomo quiso estar más cerca de la muñeca danzarina que no paraba de sonreírle, pero el malvado arlequín negro se interpuso entre ellos tratando de evitar su cercanía. Y fue tanto su rencor que al abrir la ventana logró que un fuerte viento lanzara por los aires al soldadito que apenas si podía mantenerse con una sola pierna.\n" +
                "La danzarina sollozó y el arlequín se burló al ver que el soldadito caía en una charca y que un vagabundo lo alejaba en un endeble barco de papel. Pero, lejos de sentirse vencido, el valiente soldadito de plomo al percibir el llanto de su amada danzarina se armó de valor y blandiendo su espada, decidió enfrentar al malvado arlequín y a los que no querían verlos juntos.\n" +
                "El barquito de papel tomó el curso de una alcantarilla y en medio de la oscuridad, el soldadito pudo presentir la presencia del enemigo. Esta vez era una inmensa y voraz rata que trató de atacarlo, pero gracias a la hábil maniobra de nuestro héroe pudo alejarse de la orilla, al tiempo que el hambriento roedor le gritaba:\n" +
                "“¡Maldito soldado de plomo!, pero si yo no he podido acabar contigo, más allá te llevarás una amarga sorpresa. ¡De esta no sales vivo, soldadito mutilado, ja, ja, ja, ja...!”... No le hizo caso y siguió navegando en busca de su amada muñeca danzarina.\n" +
                "Pero la amenaza del roedor se hizo realidad: el barquito se dejó llevar por la corriente que anunciaba la presencia de un río. El barco naufragó, el soldadito se hundió muy profundo y allí un salmón se lo trago apuradamente. Ya dentro, una especie de sismo lo lanzó contra el espinazo del pez y quedó desmayado. Al despertar no podía creerlo: estaba en casa de Jorgito, adonde llegó pues el salmón había sido pescado para cenarlo. El soldadito corrió en busca de su amada danzarina. Se abrazaron felices e iban a casarse, pero el malvado arlequín atropelló al soldadito, enviándolo a las brasas de la chimenea. Sin pensarlo dos veces, la bella danzarina fue tras él y algo maravilloso ocurrió. El cielo los llamó y juntos se elevaron para ser felices durante toda su vida.", R.drawable.cuento16, "Cuento Tradicional","Autor: Hans Christian Andersen."));
        Adaptador miadap = new Adaptador(getApplicationContext(), Lista);

        listaDatos.setAdapter(miadap);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cuento obj = (Cuento) parent.getItemAtPosition(position);

                Intent paso = new Intent(getApplicationContext(),DetalleCuentosTradicionales.class);
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









