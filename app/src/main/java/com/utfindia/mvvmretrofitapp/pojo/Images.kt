package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Images {
    @SerializedName("main")
    @Expose
    var main: String? = null
    @SerializedName("hexagon")
    @Expose
    var hexagon: String? = null
    @SerializedName("disabled")
    @Expose
    var disabled: String? = null

}