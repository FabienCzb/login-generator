package geco;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Test
    public void generateLoginForNomAndPrenom(){
        // Given
        // Creation d'un loginService et loginGenerator
        LoginService logServ = new LoginService(new String[]
                {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

        LoginGenerator logGen = new LoginGenerator(logServ);

        // When
        // Creation d'une personne et ajout au login
        assertEquals("PDUR",logGen.generateLoginForNomAndPrenom("Durand","Paul"));
    }
}