package Cirkle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirkleTest {

    @Test
    void throwsErrorWhenNegative() {
        assertThrows(Exception.class, () -> {
                    Cirkle c1 = new Cirkle(-2);
                }
        );
    }

    @Test
    void getArea(){
        try {
            Cirkle c1 = new Cirkle(1);
            Cirkle c3 = new Cirkle(3);
            Cirkle c5 = new Cirkle(5);
            assertEquals(Math.PI, c1.getArea());
            assertEquals(Math.PI * 9, c3.getArea());
            assertEquals(Math.PI * 25, c5.getArea());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}