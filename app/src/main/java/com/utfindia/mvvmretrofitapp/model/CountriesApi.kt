package com.utfindia.mvvmretrofitapp.model

import com.utfindia.mvvmretrofitapp.pojo.ModelClass
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {
    @get:GET("DevTides/countries/master/countriesV2.json")
    val countries: Single<List<CountryModel?>?>?
    @get:GET("/Customers/homeData?access_token=6w9gKvM9bos9AEbiEvHOhmfWhtP8Yi0XWF2JJ9taXSFdaHFgoDJgRpWYXMjOYoey")
    val getModelData: Single<ModelClass?>

}