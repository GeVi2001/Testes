package com.example.wefitteste.di

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class ProductRepository() {
suspend fun findProduct(product: String) : ProductResponse {

    val httpClient = HttpClient(Android) {
        install(Logging) {
            level = LogLevel.ALL
                             }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                    })
                }

             }

    return httpClient.get("https://wefit-movies.vercel.app/api/movies/$product").body()
        }
}