package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GeoPoint {
    @SerializedName("lat")
    @Expose
    var lat: Double? = null
    @SerializedName("lng")
    @Expose
    var lng: Double? = null

}