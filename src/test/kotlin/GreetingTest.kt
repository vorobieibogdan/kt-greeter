import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreetingTest {


    @Test
    fun greet_ValidName_ReturnsCorrectGreeting() {
        // given
        val name = "John"

        // when
        val result = greet(name)

        // then
        assertEquals("Hi, John!", result)
    }

    @Test
    fun greet_EmptyName_ReturnsGreetingWithEmptyName() {
        // given
        val name = ""

        // when
        val result = greet(name)

        // then
        assertEquals("Hi, !", result)
    }

    @Test
    fun greet_SpecialCharactersInName_ReturnsCorrectGreeting() {
        // given
        val name = "John_Doe@123"

        // when
        val result = greet(name)

        // then
        assertEquals("Hi, John_Doe@123!", result)
    }
}
