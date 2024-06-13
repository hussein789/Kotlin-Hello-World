package com.example.helloworld

import junit.framework.Assert.assertEquals
import org.junit.Test

class UtilsTest {

    @Test
    fun computeVersionName_returnFirstVersion() {
        val result = computeVersionName()
        assertEquals(result, "2.0.0")
    }
}