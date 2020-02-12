package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Service {
    @SerializedName("service_id")
    @Expose
    var serviceId: Int? = null
    @SerializedName("service")
    @Expose
    var service: String? = null
    @SerializedName("rate")
    @Expose
    var rate: String? = null
    @SerializedName("service_label")
    @Expose
    var serviceLabel: String? = null

}