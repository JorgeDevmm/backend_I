package presencial;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jorge Luis Monzón Morales
 * @project C1_grupoDePersonas
 */
public class  GrupoPersona {

    private List<Persona> personas;

    public GrupoPersona() {
        personas = new ArrayList<>();

    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void agregarPersona(Persona persona){
        boolean checkMayoria = persona.esMayorEdad();
        boolean checkLetras = persona.cantidadDeLetras();
        boolean soloLetras = persona.checkAZ();
        boolean checkEdad = persona.checkEdad();

        if(checkMayoria&&checkLetras&&soloLetras&&checkEdad){
            personas.add(persona);
        }else{
            System.out.println("No se pudo agregar a la persona"  + persona.getNombre() +":"+ persona.getEdad());
        }
    }
}
