package presencial;

/**
 * @author Jorge Luis Monzón Morales
 * @project C1_grupoDePersonas
 */
public class Persona {
    private String nombre;
    private Integer edad;

    public Persona(Integer edad,String nombre) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean esMayorEdad(){

        return this.edad>=18;
    }

    public boolean checkEdad(){
        boolean respuesta = false;
        if(edad>0 && edad<=120){
            respuesta=true;
        }
        return respuesta;
    }

    public boolean cantidadDeLetras(){
        return nombre.length() >4;
    }

    public boolean checkAZ(){
        boolean respuesta = false;
//       separa la cadena en caracteres
        char[] array =  nombre.toCharArray();

        for (char letra : array) {
//            no es una letra
            if(!Character.isLetter(letra)){
                return respuesta;
            }
        }
        respuesta = true;
        return  respuesta;
    }
}
