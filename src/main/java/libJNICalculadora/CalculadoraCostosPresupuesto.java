package libJNICalculadora;

public class CalculadoraCostosPresupuesto {

    // Cargar la biblioteca nativa
    static {
        System.loadLibrary("calculadoracostos"); // Nombre de la biblioteca sin la extensión (.so)
    }

    // Declaración de métodos nativos
    public native double precioVentaAbsor(double matPrima, double mod, double cifVar, double cifFijo, double porcUtil);
    public native double precioVentaDir(double matPrima, double mod, double cifVar, double gastosVar, double porcUtil);

}
