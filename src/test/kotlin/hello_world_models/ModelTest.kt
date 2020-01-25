package hello_world_models

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ModelTest {
    @Test
    fun testPersonDefault() {
        val firstName = "John"
        val lastName = "Doe"
        val age = 21

        val defaultPerson = Person()

        assertEquals(defaultPerson.firstName, firstName, "First Name should be $firstName")
        assertEquals(defaultPerson.lastName, lastName, "First Name should be $lastName")
        assertEquals(defaultPerson.age, age, "First Name should be $age")
    }

    @Test
    fun testPersonCustom() {
        val firstName = "Peter"
        val lastName = "Cottontail"
        val age = 45

        val customPerson = Person(firstName, lastName, age)

        assertEquals(customPerson.firstName, firstName, "First Name should be $firstName")
        assertEquals(customPerson.lastName, lastName, "First Name should be $lastName")
        assertEquals(customPerson.age, age, "First Name should be $age")
    }
}
