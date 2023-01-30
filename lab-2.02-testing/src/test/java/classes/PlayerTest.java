package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void checkHpAndLives_PlayerObject_Works() {
    // creo un atacante
        Warrior kratos = new Warrior(10,10,10,10,10,10);
    // creo un atacado
        Warrior dante = new Warrior(10,10,10,10,10,10);
    //ataco
        kratos.attack(dante);
    // miro si ha bajado la hp y se le he quitado 1 vida
        assertEquals(10,dante.getHealth());
        assertEquals(9,dante.getLives());
    }

}