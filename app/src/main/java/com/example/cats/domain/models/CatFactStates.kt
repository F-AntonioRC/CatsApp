package com.example.cats.domain.models

sealed class CatFactStates {
    object Loading: CatFactStates()
    class CatFactData(val fact: Fact): CatFactStates()
    class Error(val error: Throwable): CatFactStates()
}
