package com.jetbrains.greeting
import kotlin.random.Random


class Greeting {
     private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}


fun greet(): String {
    val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"

    return "$firstWord Guess what this is! > ${getPlatform().name.reversed()}"
}