package dificultadesCategorias;
//Librerías Importadas//
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


    //Atributo
    public class NivelMedio {
        private HashMap<String, ArrayList<String>> categoriaPalabras;



        //Constructor
        public NivelMedio() {
            categoriaPalabras= new HashMap<>();
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

        public static void main(String[] args) {
            NivelMedio game = new NivelMedio();

            //Categorias y palabras
            ArrayList<String> instrumentos = new ArrayList<>();
            instrumentos.add("Guitarra");
            instrumentos.add("Piano");
            instrumentos.add("Violin");
            instrumentos.add("Flauta");
            instrumentos.add("Trompeta");
            instrumentos.add("Clarinete");
            instrumentos.add("Saxofon");
            instrumentos.add("Bateria");
            instrumentos.add("Arpa");
            instrumentos.add("Xilofono");
            instrumentos.add("Banjo");
            instrumentos.add("Acordeon");
            instrumentos.add("Lira");
            instrumentos.add("Tambor");
            instrumentos.add("Pandereta");
            instrumentos.add("Armonica");
            instrumentos.add("Corneta");
            instrumentos.add("Maracas");
            instrumentos.add("Bongos");
            instrumentos.add("Ocarina");
            instrumentos.add("Ukelele");
            instrumentos.add("Gaita");
            instrumentos.add("Laud");
            instrumentos.add("Tuba");
            instrumentos.add("Gong");
            game.agregarCategoria("Instrumentos", instrumentos);

            ArrayList<String> herramientas = new ArrayList<>();
            herramientas.add("Martillo");
            herramientas.add("Destornillador");
            herramientas.add("Llave");
            herramientas.add("Sierra");
            herramientas.add("Tornillo");
            herramientas.add("Clavo");
            herramientas.add("Brocha");
            herramientas.add("Taladro");
            herramientas.add("Serrucho");
            herramientas.add("Pinzas");
            herramientas.add("Maza");
            herramientas.add("Pala");
            herramientas.add("Hacha");
            herramientas.add("Soplete");
            herramientas.add("Machete");
            herramientas.add("Piqueta");
            herramientas.add("Alicates");
            herramientas.add("Cutter");
            herramientas.add("Escuadra");
            herramientas.add("Tijeras");
            herramientas.add("Rastrillo");
            herramientas.add("Tenazas");
            herramientas.add("Azada");
            herramientas.add("Soldador");
            herramientas.add("Brokas");
            game.agregarCategoria("Herramientas", herramientas);

            ArrayList<String> electrodomesticos = new ArrayList<>();
            electrodomesticos.add("Refrigerador");
            electrodomesticos.add("Lavadora");
            electrodomesticos.add("Secadora");
            electrodomesticos.add("Estufa");
            electrodomesticos.add("Microondas");
            electrodomesticos.add("Cafetera");
            electrodomesticos.add("Tostadora");
            electrodomesticos.add("Batidora");
            electrodomesticos.add("Licuadora");
            electrodomesticos.add("Freidora");
            electrodomesticos.add("Plancha");
            electrodomesticos.add("Aspiradora");
            electrodomesticos.add("Horno");
            electrodomesticos.add("Ventilador");
            electrodomesticos.add("Parrilla");
            electrodomesticos.add("Triturador");
            electrodomesticos.add("Congelador");
            electrodomesticos.add("Extractor");
            electrodomesticos.add("Calefactor");
            electrodomesticos.add("Climatizador");
            electrodomesticos.add("Televisor");
            electrodomesticos.add("Radio");
            electrodomesticos.add("Lavaplatos");
            electrodomesticos.add("Lampara");
            electrodomesticos.add("Telefono");
            game.agregarCategoria("Electrodomesticos", electrodomesticos);

            ArrayList<String> partesDelCuerpo = new ArrayList<>();
            partesDelCuerpo.add("Cabeza");
            partesDelCuerpo.add("Brazo");
            partesDelCuerpo.add("Pecho");
            partesDelCuerpo.add("Mano");
            partesDelCuerpo.add("Pierna");
            partesDelCuerpo.add("Tobillo");
            partesDelCuerpo.add("Cuello");
            partesDelCuerpo.add("Hombro");
            partesDelCuerpo.add("Nariz");
            partesDelCuerpo.add("Boca");
            partesDelCuerpo.add("Dedos");
            partesDelCuerpo.add("Pies");
            partesDelCuerpo.add("Rodilla");
            partesDelCuerpo.add("Ombligo");
            partesDelCuerpo.add("Muñeca");
            partesDelCuerpo.add("Barbilla");
            partesDelCuerpo.add("Cejas");
            partesDelCuerpo.add("Muslo");
            partesDelCuerpo.add("Espalda");
            partesDelCuerpo.add("Pelvis");
            partesDelCuerpo.add("Frente");
            partesDelCuerpo.add("Pomulo");
            partesDelCuerpo.add("Muela");
            partesDelCuerpo.add("Riñón");
            partesDelCuerpo.add("Lengua");
            game.agregarCategoria("Partes del cuerpo", partesDelCuerpo);

            ArrayList<String> bebidas = new ArrayList<>();
            bebidas.add("Refresco");
            bebidas.add("Cerveza");
            bebidas.add("Whisky");
            bebidas.add("Chocolatada");
            bebidas.add("Margarita");
            bebidas.add("Capuchino");
            bebidas.add("Colada");
            bebidas.add("Tequila");
            bebidas.add("Mojito");
            bebidas.add("Martini");
            bebidas.add("Gaseosa");
            bebidas.add("Coctel");
            bebidas.add("Ginebra");
            bebidas.add("Espresso");
            bebidas.add("Champaña");
            bebidas.add("Leche");
            bebidas.add("Limonada");
            bebidas.add("Licor");
            bebidas.add("Jarabe");
            bebidas.add("Batido");
            bebidas.add("Sidra");
            bebidas.add("Malta");
            bebidas.add("Malteada");
            bebidas.add("Ponche");
            bebidas.add("Aguardiente");
            game.agregarCategoria("Bebidas", bebidas);
        }
    }


