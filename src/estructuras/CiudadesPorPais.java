package estructuras;

import estructuras.helpers.CitiesProvider;
import estructuras.helpers.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*** HASHMAP
 este ejercicio se basa en iprimir una lista de ciudades encabezadas por su respectivo pais
 en el que el pais debe aparece una sola vez acompañado de todas sus ciudades
 */
public class CiudadesPorPais {

    /***
     * esta funcion agrupa en un hashMap las ciudades por pais
     */
    public static HashMap<String, ArrayList<String>> agrupaPorPais(ArrayList<City> ciudades) {
        HashMap<String, ArrayList<String>> paises = new HashMap<>();
        for (City ciudad : ciudades) {
            if (paises.containsKey(ciudad.getCountry())) {
                paises.get(ciudad.getCountry()).add(ciudad.getName());
            } else {
                ArrayList<String> listaCiudades = new ArrayList<>();
                listaCiudades.add(ciudad.getName());
                paises.put(ciudad.getCountry(), listaCiudades);
            }
        }
        return paises;
    }

    /**
     * Este metodo normaliza la el mapa en una lista unidimensional
     */
    public static ArrayList<String> toList(HashMap<String, ArrayList<String>> mapaPaises) {
        ArrayList<String> lista = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : mapaPaises.entrySet()) {
            lista.add(entry.getKey());
            lista.addAll(entry.getValue());
        }
        return lista;
    }

    // solo imprime la lista
    public static void imprimePaisYCiudad(ArrayList<String> lista) {
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }

    public static void main(String[] args) {
        ArrayList<City> ciudades = CitiesProvider.getCityList(); // Obteniendo ciudades con el Helper
        HashMap<String, ArrayList<String>> paises = agrupaPorPais(ciudades);
        imprimePaisYCiudad(toList(paises));
    }
}



