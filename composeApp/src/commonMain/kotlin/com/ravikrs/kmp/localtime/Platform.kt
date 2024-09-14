package com.ravikrs.kmp.localtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform