package com.rojas.jefferson.laboratoriocalificado01

// Función que verifica si dos palabras son anagramas
fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
    // Convertimos ambas palabras a minúsculas para evitar errores por mayúsculas/minúsculas
    val p1 = palabra1.lowercase()
    val p2 = palabra2.lowercase()
    // Si las longitudes son diferentes, no pueden ser anagramas
    if (p1.length != p2.length) return false
    // Ordenamos los caracteres de ambas palabras y comparamos
    return p1.toCharArray().sorted() == p2.toCharArray().sorted()
}

// Función principal para probar el algoritmo
fun main() {
    // Prueba 1: "listen" y "silent" son anagramas
    println(sonAnagramas("listen", "silent")) // true
    // Prueba 2: "hello" y "world" no son anagramas
    println(sonAnagramas("hello", "world"))   // false
}