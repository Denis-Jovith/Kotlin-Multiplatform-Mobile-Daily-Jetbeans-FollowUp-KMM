package com.jetbrains.greeting
import java.util.Random


class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}


fun greet(): String {
    val firstWord = if (Random().nextBoolean()) "Hi!" else "Hello!"

    return firstWord
}