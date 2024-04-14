package com.example.cats.domain.repositories
import com.example.cats.domain.models.CatFactStates

interface CatFactRepository {
    suspend fun getCatRandomFact(): CatFactStates
}