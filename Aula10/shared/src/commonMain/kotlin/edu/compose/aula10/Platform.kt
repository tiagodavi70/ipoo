package edu.compose.aula10

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform