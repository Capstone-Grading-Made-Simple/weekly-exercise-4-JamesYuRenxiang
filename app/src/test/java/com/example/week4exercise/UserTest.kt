package com.example.week4exercise

import org.junit.Test

import org.junit.Assert.*

class UserTest {

    @Test
    fun `test user class`() {
        val user = User("name", "description", 0, false)
        assertEquals("name", user.Name)
        assertEquals("description", user.Description)
        assertEquals(0, user.ID)
        assertEquals(false, user.Followed)
    }

}