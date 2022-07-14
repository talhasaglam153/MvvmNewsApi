package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase

) {

    suspend fun getBreakingNews(countrycode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countrycode, pageNumber)


    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}