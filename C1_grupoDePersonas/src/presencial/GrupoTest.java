package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jorge Luis Monzón Morales
 * @project C1_grupoDePersonas
 */
public class GrupoTest {
//    DADO

    @Test
    public void agregar2Persona() {
        Persona persona1 = new Persona(18, "Juan");
        Persona persona2 = new Persona(20, "Pedro");
        Persona persona3 = new Persona(22, "Ana");
        Persona persona4 = new Persona(14, "Luz");
        Persona persona5 = new Persona(32, "Julian");


        GrupoPersona grupoPersona = new GrupoPersona();

        // Probamos agregar personas que cumplen con todas las condiciones
//        CUANTO
        grupoPersona.agregarPersona(persona1);
        grupoPersona.agregarPersona(persona2);
        grupoPersona.agregarPersona(persona3);
        grupoPersona.agregarPersona(persona4);
        grupoPersona.agregarPersona(persona5);

//      ENTONCES
        Assertions.assertTrue(grupoPersona.getPersonas().size()==2);
    }

}
