package com.utfindia.mvvmretrofitapp.model

import com.google.gson.annotations.SerializedName

class CountryModel(@field:SerializedName("name") var countryName: String, @field:SerializedName("capital") var capital: String, @field:SerializedName("flagPNG") var flag: String)