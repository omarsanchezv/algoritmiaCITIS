package ejercicios;

// El ejercicio trata de invertir solamente las vocales ejemplo:
// Si el valor de entrada es Rosa el valor de salida debe ser Raso
public class GirarVocales {

    // pista crear una estructura para comparar las vocales
    public GirarVocales() {
    }

    public String invierteVocales(String texto) {
        return "";
    }


    public static void main(String[] arg) {
        GirarVocales obj = new GirarVocales();
        String textoInvertido = obj.invierteVocales("omar");
        System.out.println(textoInvertido + " = amor");
        String textoInvertido2 = obj.invierteVocales("YA vi comO que sI JalA Uwu");
        System.out.println(textoInvertido2 + " = Yu vU cAma quI se JOlo iwA");
    }
}
