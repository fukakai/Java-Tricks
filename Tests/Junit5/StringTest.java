import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringTest {

    String str = "";

    @BeforeAll
    static void beforAll() {
        System.out.println("Initializing DB connetion");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Closing DB connetion");
    }

    @BeforeEach
        //Befor in JUnit 4
    void beforEach(TestInfo info) {
        System.out.println("Initializing test data for : " + info.getDisplayName());
    }

    @AfterEach
        //After in JUnit4
    void AfterEach(TestInfo info) {
        System.out.println("Cleaning test data for : " + info.getDisplayName());
    }

    @Test
    //@Disabled
        //@Ignore JUnit4
    void lengthBasic() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;

        assertEquals(expectedLength, actualLength);

        //fail("Not yet implemented");
    }

    @Test
    void toUpperCaseBasic() {
        String str = "abcd";
        String result = str.toUpperCase();
        assertEquals("ABCD", result);
        assertNotNull(result);
        //assertNull(result);
    }

    //@Test
    @RepeatedTest(10)
    void assertBooleans() {
        assertFalse("abcdefgh".contains("amir"));
    }

    @Test
    void arrayEquals() {
        String str = "montreal quebec ottawa";
        String[] actualResult = str.split(" ");
        String[] expectedResult = {"montreal", "quebec", "ottawa"};

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("When length is null, throw an exception")
    void lengthException() {
        String str = null;

        assertThrows(NullPointerException.class, () -> {
            str.length();
        });
    }

    @Test
    void lengthGreaterThanZero() {
        assertTrue("ABC".length() > 0);
        assertTrue("AB".length() > 0);
        assertTrue("A".length() > 0);
        assertTrue("ABCD".length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABC", "AB", "A", "ABCDE"})
    void lengthGreaterThanZeroParameterized(String src) {
        assertTrue(src.length() > 0);
    }

    @ParameterizedTest(name = " {0} when upperCased is {1}")
    @CsvSource(value = {"abc, ABC", "ab, AB", "a, A", "'',''", "abcde, ABCDE"})
    void csvParameterizeEqualsdCase(String word, String capitalizedWord) {
        assertEquals(capitalizedWord, word.toUpperCase());
    }

    @ParameterizedTest(name = "{0} length is {1}")
    @CsvSource(value = {"abc, 3", "ab, 2", "a, 1", "'',0", "abcde, 5"})
    void csvParameterizedLengthCase(String word, int expectedLength) {
        assertEquals(expectedLength, word.length());
    }

    @Test
    void performance() {
        assertTimeout(Duration.ofSeconds(5), () -> {
            IntStream.range(0, 100).forEach(System.out::println);
        });
    }

    @Nested
    @DisplayName("For an empty String")
    class EmptyStringTest {

        @BeforeEach
        void setToEmpty() {
            str = "";
        }

        @Test
        @DisplayName("length should be zero")
        void lengthIsZero() {
            assertEquals(0, str.length());
        }

        @Test
        @DisplayName("upper case is empty")
        void upperCaseIsEmpty() {
            assertEquals("", str.toUpperCase());
        }
    }
}