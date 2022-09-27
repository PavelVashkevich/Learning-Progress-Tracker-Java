package tracker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LearningPlatformTest {

    @ParameterizedTest
    @DisplayName("add students command positive test")
    @ValueSource(strings = {"Annet Vann Gogan annet123@yahoo.com", "Annet Kuterrpali annet.kut@yahoo.com",
            "Kus Vi Lappen kus@yahoo.com", "Cgian Li Sayet sayet2000@gmail.com", "Ra Min Vam Fur fur.ra@yahoo.com"})
    void registerStudentToPlatformPositiveCase(String arg) {
        LearningPlatform learningPlatform = LearningPlatform.getInstance();
        assertTrue(learningPlatform.registerStudentToPlatform(arg));
    }

    @ParameterizedTest
    @DisplayName("add students command negative test")
    @ValueSource(strings = {"", "Kiki net@yandex.ru", "Ku3i Ale Ma ku@yahoo.com", "NoName",
            "FirstName LastName", "123 245 digits@fal.ua", "Only 2 one.123@domain.com"})
    void registerStudentToPlatformNegativeCase(String arg) {
        LearningPlatform learningPlatform = LearningPlatform.getInstance();
        assertFalse(learningPlatform.registerStudentToPlatform(arg));
    }
}