public class Planeta {

    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    double diametro;
    int distanciaSol;
    boolean observable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, int distanciaSol,
            boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    public void Infoplaneta() {

        System.out.println("El nombre del planeta es: " + this.nombre + " \nLa cantidad de satélites es: " + this.cantidadSatelites + " \nLa masa es: "+ this.masa +
        " \nEl volumen es: "+ this.volumen +" \nEl perimetro es: "+ this.diametro +" \nLa distancia del sol es: "+ this.distanciaSol +" \nEs observable? "+ this.observable);

}

    public void Masaplaneta(){ 
        double calculo_densidad;
        calculo_densidad=this.masa/this.volumen;
        System.out.println("La densidad del planeta " +this.nombre+ " es "  + calculo_densidad);

    }

 }
