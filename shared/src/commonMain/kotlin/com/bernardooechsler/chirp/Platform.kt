package com.bernardooechsler.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform