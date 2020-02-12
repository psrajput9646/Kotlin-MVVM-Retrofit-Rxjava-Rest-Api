package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FavouriteAddress {
    @SerializedName("label")
    @Expose
    var label: String? = null
    @SerializedName("address")
    @Expose
    var address: String? = null
    @SerializedName("landmark")
    @Expose
    var landmark: String? = null
    @SerializedName("geo_point")
    @Expose
    var geoPoint: GeoPoint? = null
    @SerializedName("address_id")
    @Expose
    var addressId: Int? = null

}