package com.rojas.jefferson.laboratoriocalificado01

// Función que cuenta las vocales en una cadena de texto
fun contarVocales(texto: String): Int {
    // Definimos las vocales que vamos a buscar
    val vocales = "aeiou"
    // Convertimos el texto a minúsculas para comparar correctamente
    return texto.lowercase().count { it in vocales }
}

// Función principal para probar el algoritmo
fun main() {
    // Prueba 1: "Hola mundo" tiene 4 vocales
    println(contarVocales("Hola mundo")) // 4
    // Prueba 2: "Kotlin es genial" tiene 6 vocales
    println(contarVocales("Kotlin es genial")) // 6
}