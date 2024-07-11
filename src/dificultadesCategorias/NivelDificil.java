package dificultadesCategorias;
//Librerías Importadas//
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


//Atributo
public class NivelDificil {
    private HashMap<String, ArrayList<String>> categoriaPalabras;



    //Constructor
    public NivelDificil() {
        categoriaPalabras= new HashMap<>();
    }

    //Método para agregar una categoría con su banco de palabras
    public void agregarCategoria(String categoria, ArrayList<String> pablabrasB) {
        categoriaPalabras.put(categoria, pablabrasB);
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
        NivelDificil game = new NivelDificil();

//Estas son  algunas categorías y palabras
        ArrayList<String> palindromos = new ArrayList<>();
        palindromos.add("acurruca");
        palindromos.add("aérea");
        palindromos.add("Aibofobia");
        palindromos.add("alábala");
        palindromos.add("dañad");
        palindromos.add("elévele");
        palindromos.add("Hannah");
        palindromos.add("kanak");
        palindromos.add("kayak");
        palindromos.add("Malayalam");
        palindromos.add("nadan");
        palindromos.add("narran");
        palindromos.add("Neuquén");
        palindromos.add("oídio");
        palindromos.add("ojo");
        palindromos.add("Orejero");
        palindromos.add("Otto");
        palindromos.add("radar");
        palindromos.add("reconocer");
        palindromos.add("rotor");
        palindromos.add("salábalas");
        palindromos.add("sedes");
        palindromos.add("seres");
        palindromos.add("sometemos");
        palindromos.add("Somos");
        game.agregarCategoria("Palindromo", palindromos);

        ArrayList<String> enfermedades = new ArrayList<>();
        enfermedades.add("Adenomiosis");
        enfermedades.add("Ansiedad");
        enfermedades.add("Apendicitis");
        enfermedades.add("Astigmatismo");
        enfermedades.add("Azoospermia");
        enfermedades.add("Hipercolesterolemia");
        enfermedades.add("Hemocromatosis");
        enfermedades.add("Faringoamigdalitis");
        enfermedades.add("Fenilcetonuria");
        enfermedades.add("Mononucleosis");
        enfermedades.add("Osteosarcoma");
        enfermedades.add("Pielonefritis");
        enfermedades.add("Retinoblastoma");
        enfermedades.add("Sonambulismo");
        enfermedades.add("Siringomielia");
        enfermedades.add("Tricomoniasis");
        enfermedades.add("Toxoplasmosis");
        enfermedades.add("Narcolepsia");
        enfermedades.add("Neumonía");
        enfermedades.add("Neumotórax");
        enfermedades.add("Neutropenia");
        enfermedades.add("Coronavirus");
        enfermedades.add("Chikungunya");
        enfermedades.add("Colecistitis");
        enfermedades.add("Endometriosis");
        game.agregarCategoria("Enfermedades", enfermedades);


        ArrayList<String>  quince = new ArrayList<>();
        quince.add("abarquillaremos");
        quince.add("abochornaríamos");
        quince.add("accidentalmente");
        quince.add("acuclillaríamos");
        quince.add("beborroteábamos");
        quince.add("Bienquisiéramos");
        quince.add("calafatearíamos");
        quince.add("capitanearíamos");
        quince.add("cauterizaríamos");
        quince.add("conflagraciones");
        quince.add("decepcionaríamos");
        quince.add("Factorabilidades");
        quince.add("familiarización");
        quince.add("fanatizaciones");
        quince.add("fatigabilidades");
        quince.add("Impecabilidad");
        quince.add("Favorabilidades");
        quince.add("Meticulosamente");
        quince.add("Malintencionado");
        quince.add("Monumentalidad");
        quince.add("Malinterpretado");
        quince.add("Mineralogistas");
        quince.add("Transatlántico");
        quince.add("Transformaciones");
        quince.add("Tridimensionales");
        game.agregarCategoria("15Letras", quince);


        ArrayList<String> paradojas = new ArrayList<>();
        paradojas.add("Relatividad");
        paradojas.add("Oscuridad");
        paradojas.add("Información");
        paradojas.add("Extraterrestres");
        paradojas.add("Rotación");
        paradojas.add("Entropía");
        paradojas.add("No-localidad");
        paradojas.add("Causalidad");
        paradojas.add("Interferencia");
        paradojas.add("Irreversibilidad");
        paradojas.add("Superposición");
        paradojas.add("Entrelazamiento");
        paradojas.add("Energía");
        paradojas.add("Termodinámica");
        paradojas.add("Desorden");
        paradojas.add("Túnel");
        paradojas.add("Movimiento");
        paradojas.add("Tiempo");
        paradojas.add("Catástrofe");
        paradojas.add("Energía");
        paradojas.add("Constante");
        paradojas.add("Radiación");
        paradojas.add("Incompatibilidad");
        paradojas.add("Invariancia");
        paradojas.add("Curvatura");
        game.agregarCategoria("Paradojas", paradojas);

        ArrayList<String> espacioTiempo = new ArrayList<>();
        espacioTiempo.add("Relatividad");
        espacioTiempo.add("Dimensión");
        espacioTiempo.add("Continuo");
        espacioTiempo.add("Gravedad");
        espacioTiempo.add("Singularidad");
        espacioTiempo.add("Curvatura");
        espacioTiempo.add("Expansión");
        espacioTiempo.add("Horizonte");
        espacioTiempo.add("Materia");
        espacioTiempo.add("Energía");
        espacioTiempo.add("Multiverso");
        espacioTiempo.add("Geometría");
        espacioTiempo.add("Coordenadas");
        espacioTiempo.add("Masa");
        espacioTiempo.add("Velocidad");
        espacioTiempo.add("Dilatación");
        espacioTiempo.add("Contracción");
        espacioTiempo.add("Mecánica");
        espacioTiempo.add("Entrelazamiento");
        espacioTiempo.add("Cosmología");
        espacioTiempo.add("Einstein");
        espacioTiempo.add("Cuántico");
        espacioTiempo.add("Espacio");
        espacioTiempo.add("Tiempo");
        espacioTiempo.add("Universo");
        game.agregarCategoria("EspacioTiempo", espacioTiempo);




        // Iniciar el juego
        game.iniciarJuego();
    }
}

