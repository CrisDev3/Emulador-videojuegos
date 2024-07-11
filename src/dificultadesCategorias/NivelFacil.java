package dificultadesCategorias;

//Librerías Importadas//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


//Atributo 
public class NivelFacil {
    private HashMap<String, ArrayList<String>> categoriaPalabras;


    //Constructor
    public NivelFacil() {
        categoriaPalabras = new HashMap<>();
    }

    //Método para agregar una categoría con su banco de palabras
    public void agregarCategoria(String categoria, ArrayList<String> palabritas) {
        categoriaPalabras.put(categoria, palabritas);
    }


    //Método para seleccionar una categoría y mostrar palabras
    public void iniciarJuego() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        try {
            System.out.println("SELECCIONE LA CATEGORÍA DE SU PREFERENCIA:");
            for (String categoria : categoriaPalabras.keySet()) {
                System.out.println("-> " + categoria);
            }

            String seleccionarCategoria = reader.readLine();
            if (categoriaPalabras.containsKey(seleccionarCategoria)) {
                ArrayList<String> palabras = categoriaPalabras.get(seleccionarCategoria);
                System.out.println("Banco de palabras para la categoría '" + seleccionarCategoria + "':");
                for (String palabra : palabras) {
                    System.out.println("- " + palabra);
                }
            } else {
                System.out.println("Categoría no encontrada.");
            }
        } catch (IOException e) {
            System.out.println("Hubo un error. Intenteló denuevo: " + e.getMessage());
        }
    }


    // Arreglarse porfavor
//Iría en el Main?
    public static void main(String[] args) {
        NivelFacil game = new NivelFacil();

//Estas son  algunas categorías y palabras
        ArrayList<String> frutitas = new ArrayList<>();
        frutitas.add("Sandía");
        frutitas.add("Banana");
        frutitas.add("Cereza");
        frutitas.add("Zaril");
        frutitas.add("Frambuesa");
        frutitas.add("Albaricoque");
        frutitas.add("Mandarina");
        frutitas.add("Pera");
        frutitas.add("Tamarindo");
        frutitas.add("Limon");
        frutitas.add("Naranja");
        frutitas.add("Guanabana");
        frutitas.add("Melocotón");
        frutitas.add("Mango");
        frutitas.add("Arandano");
        frutitas.add("Papaya");
        frutitas.add("Kiwi");
        frutitas.add("Toronja");
        frutitas.add("Guayaba");
        frutitas.add("Manzana");
        frutitas.add("Nance");
        frutitas.add("Melón");
        frutitas.add("Granadilla");
        frutitas.add("FrutaDragon");
        frutitas.add("Higo");
        frutitas.add("Cacao");
        game.agregarCategoria("Frutas", frutitas);

        ArrayList<String> animalitos = new ArrayList<>();
        animalitos.add("Loro");
        animalitos.add("Gallina");
        animalitos.add("Caballo");
        animalitos.add("Perro");
        animalitos.add("Gato");
        animalitos.add("Elefante");
        animalitos.add("Hamster");
        animalitos.add("Ganzo");
        animalitos.add("Pavo");
        animalitos.add("Vaca");
        animalitos.add("Burro");
        animalitos.add("Perico");
        animalitos.add("Cocodrilo");
        animalitos.add("Venado");
        animalitos.add("Mono");
        animalitos.add("Iguana");
        animalitos.add("Jaguar");
        animalitos.add("León");
        animalitos.add("Leopardo");
        animalitos.add("Ardilla");
        animalitos.add("Oveja");
        animalitos.add("Guacamaya");
        animalitos.add("Lobo");
        animalitos.add("Cerdo");
        animalitos.add("Camello");
        animalitos.add("Tortuga");
        game.agregarCategoria("Animales", animalitos);


        ArrayList<String> colores = new ArrayList<>();
        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Blanco");
        colores.add("Turquesa");
        colores.add("Fucsia");
        colores.add("Dorado");
        colores.add("Plateado");
        colores.add("Negro");
        colores.add("Lila");
        colores.add("Crema");
        colores.add("Peach");
        colores.add("Gris");
        colores.add("Naranja");
        colores.add("Morado");
        colores.add("Chocolate");
        colores.add("Rosa");
        colores.add("Celeste");
        colores.add("Marrón");
        colores.add("Gris");
        colores.add("Beich");
        colores.add("Lavanda");
        colores.add("Amaranto");
        colores.add("VerdeOliva");
        colores.add("RojoVino");
        colores.add("Azulcielo");
        game.agregarCategoria("Colores", colores);


        ArrayList<String> deportes = new ArrayList<>();
        deportes.add("Fútbol");
        deportes.add("Baloncesto");
        deportes.add("Tenis");
        deportes.add("Natación");
        deportes.add("Atletismo");
        deportes.add("Ciclismo");
        deportes.add("Béisbol");
        deportes.add("Voleibol");
        deportes.add("Rugby");
        deportes.add("Golf");
        deportes.add("Boxeo");
        deportes.add("Esquí");
        deportes.add("Surf");
        deportes.add("Hockey");
        deportes.add("Gimnasia");
        deportes.add("Judo");
        deportes.add("Karate");
        deportes.add("Taekwondo");
        deportes.add("Snowboard");
        deportes.add("Escalada");
        deportes.add("Patinaje");
        deportes.add("Remo");
        deportes.add("Esgrima");
        deportes.add("Kárate");
        deportes.add("Triatlón");
        game.agregarCategoria("Deportes", deportes);

        ArrayList<String> nombresitos = new ArrayList<>();
        nombresitos.add("Juan");
        nombresitos.add("Omar");
        nombresitos.add("Cristopher");
        nombresitos.add("Madeleine");
        nombresitos.add("Lineth");
        nombresitos.add("Imanol");
        nombresitos.add("Diego");
        nombresitos.add("Steven");
        nombresitos.add("Louis");
        nombresitos.add("Nayim");
        nombresitos.add("Ricardo");
        nombresitos.add("Milagros");
        nombresitos.add("Rodrigo");
        nombresitos.add("Daniel");
        nombresitos.add("Jeremy");
        nombresitos.add("Alex");
        nombresitos.add("Rafael");
        nombresitos.add("Anabellys");
        nombresitos.add("Anel");
        nombresitos.add("Josue");
        nombresitos.add("Marcial");
        nombresitos.add("Eriel");
        nombresitos.add("Valeria");
        nombresitos.add("Edgar");
        nombresitos.add("Edward");
        game.agregarCategoria("Nombres", nombresitos);


        // Iniciar el juego
        game.iniciarJuego();
    }
}

