package com.example.cats.domain.usecases

import com.example.cats.domain.models.CatFactStates

interface GetCatRandomFactUseCase {
    suspend operator fun invoke(): CatFactStates
}