package geco;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginServiceTest {

    @org.junit.Test
    public void loginExists() {
        // Given
        // Creation d'un nouveau loginService
        LoginService logServ = new LoginService(new String[]{"Fabien", "Salim"});

        // when

        // then
        // Test d'un login existant
        assertTrue(logServ.loginExists("Fabien"));

        // Test d'un login inexistant
        assertFalse(logServ.loginExists("Bidon"));

    }

    @org.junit.Test
    public void addLogin() {
        // Given
        // Creation d'un nouveau loginService
        LoginService logServ = new LoginService(new String[]{"Fabien", "Salim"});

        // when
        // Ajout d'un nouveau login
        logServ.addLogin("Nouveau log");

        // then
        // Test de l'existance de ce nouveau login
        assertTrue(logServ.loginExists("Nouveau log"));

    }

    @org.junit.Test
    public void findAllLoginsStartingWith() {
        // Given
        // Creation d'un nouveau loginService
        LoginService logServ = new LoginService(new String[]{"Fabien", "Salim","Fabrice","Fredo"});

        // When
        // Prefixes
        String pre1 = new String("Fab");
        String pre2 = new String ("S");
        String pre3 = new String ("inconnnu");

        // When
        // ArrayList correspondant aux resultats
        ArrayList<String> loginsRes1 = new ArrayList<String>(Arrays.asList("Fabien","Fabrice"));
        ArrayList<String> loginsRes2 = new ArrayList<String>(Arrays.asList("Salim"));
        ArrayList<String> loginsRes3 = new ArrayList<String>();

        // Then
        // Test avec plusieurs noms reconnus
        assertEquals(loginsRes1,logServ.findAllLoginsStartingWith(pre1));

        // Then
        // Test avec un seul nom correspondant
        assertEquals(loginsRes2,logServ.findAllLoginsStartingWith(pre2));

        // Then
        // Test avec aucun nom correspondant
        assertEquals(loginsRes3,logServ.findAllLoginsStartingWith(pre3));
    }

    @org.junit.Test
    public void findAllLogins() {
        // Given
        // Creation d'un nouveau loginService
        LoginService logServ = new LoginService(new String[]{"Fabien", "Salim"});

        // when
        // Creation d'une liste de login
        ArrayList<String> logExist = new ArrayList<String>(Arrays.asList("Fabien","Salim"));

        // then
        // Test de l'égalité des listes
        assertEquals(logExist,logServ.findAllLogins());

    }
}