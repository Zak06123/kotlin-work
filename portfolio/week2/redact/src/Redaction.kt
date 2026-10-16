// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

import kotlin.io.path.*

fun redact(document: String, textToRedact: String, Character: Char='X'): String {

    val replace = Character.toString().repeat(textToRedact.length)
    return document.replace(textToRedact, replacement)


}