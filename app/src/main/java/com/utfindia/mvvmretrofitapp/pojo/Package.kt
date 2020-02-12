package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Package {
    @SerializedName("package_id")
    @Expose
    var packageId: Int? = null
    @SerializedName("package_name")
    @Expose
    var packageName: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("package_type")
    @Expose
    var packageType: String? = null
    @SerializedName("package_type_id")
    @Expose
    var packageTypeId: Int? = null
    @SerializedName("services")
    @Expose
    var services: List<Service>? = null
    @SerializedName("file_name")
    @Expose
    var fileName: String? = null
    @SerializedName("package_label")
    @Expose
    var packageLabel: String? = null
    @SerializedName("onGoing")
    @Expose
    var onGoing: Boolean? = null

}