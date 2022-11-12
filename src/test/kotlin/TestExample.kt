

import org.testng.annotations.Test
import kotlin.random.Random
import kotlin.test.assertEquals

class TestExample {
    @Test
    fun test_one() {
        assertEquals(4, doubleInteger(2), "Nope!")
    }
    @Test
    fun test_two() {
        assertEquals(8, doubleInteger(4), "Nope!")
    }

    @Test
    fun test_three() {
        assertEquals(-20, doubleInteger(-10), "Nope!")
    }

    @Test
    fun test_four() {
        assertEquals(0, doubleInteger(0), "0*2 is 0!")
    }

    @Test
    fun test_five() {
        assertEquals(200, doubleInteger(100), "Nope!")
    }

    @Test
    fun should_pass_random_tests(){
        for(o in 1..100){
            val p = -500 + Random.nextInt(1000)
            assertEquals(2*p, doubleInteger(p))
        }
    }
}
