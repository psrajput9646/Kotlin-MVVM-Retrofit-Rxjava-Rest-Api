package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Category {
    @SerializedName("category_id")
    @Expose
    var categoryId: Int? = null
    @SerializedName("category")
    @Expose
    var category: String? = null
    @SerializedName("images")
    @Expose
    var images: Images? = null
    @SerializedName("status_id")
    @Expose
    var statusId: Int? = null
    @SerializedName("services")
    @Expose
    var services: List<Any>? = null
    @SerializedName("onGoing")
    @Expose
    var onGoing: Boolean? = null
    @SerializedName("category_label")
    @Expose
    var categoryLabel: String? = null

}