package com.example.cats.domain.usecases

import com.example.cats.domain.models.CatFactStates
import com.example.cats.domain.repositories.CatFactRepository


class GetCatRandomFactUseCaseImpl(
    private val catFactRepository: CatFactRepository
): GetCatRandomFactUseCase {
    override suspend fun invoke(): CatFactStates = catFactRepository.getCatRandomFact()
}