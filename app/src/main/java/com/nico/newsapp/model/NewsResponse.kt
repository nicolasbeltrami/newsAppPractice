package com.nico.newsapp.model

import com.nico.newsapp.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)