package com.utfindia.mvvmretrofitapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {
    @SerializedName("country_settings")
    @Expose
    var countrySettings: CountrySettings? = null
    @SerializedName("city_settings")
    @Expose
    var citySettings: CitySettings? = null
    @SerializedName("service_area")
    @Expose
    var serviceArea: ServiceArea? = null
    @SerializedName("category")
    @Expose
    var category: List<Category>? = null
    @SerializedName("default_time_slots")
    @Expose
    var defaultTimeSlots: List<Any>? = null
    @SerializedName("blocked_time_slots")
    @Expose
    var blockedTimeSlots: List<Any>? = null
    @SerializedName("jobs_to_confirm")
    @Expose
    var jobsToConfirm: Any? = null
    @SerializedName("jobs_to_review")
    @Expose
    var jobsToReview: Any? = null
    @SerializedName("packages")
    @Expose
    var packages: List<Package>? = null
    @SerializedName("vendor_classes")
    @Expose
    var vendorClasses: List<Any>? = null
    @SerializedName("favourite_technicians")
    @Expose
    var favouriteTechnicians: Int? = null
    @SerializedName("favourite_address")
    @Expose
    var favouriteAddress: List<FavouriteAddress>? = null
    @SerializedName("customer_name")
    @Expose
    var customerName: String? = null
    @SerializedName("customer_phone_number")
    @Expose
    var customerPhoneNumber: Int? = null
    @SerializedName("customer_email")
    @Expose
    var customerEmail: String? = null
    @SerializedName("customer_rating")
    @Expose
    var customerRating: Int? = null
    @SerializedName("app_language_id")
    @Expose
    var appLanguageId: Int? = null
    @SerializedName("customer_status")
    @Expose
    var customerStatus: String? = null
    @SerializedName("customer_status_id")
    @Expose
    var customerStatusId: Int? = null
    @SerializedName("order_summary_image")
    @Expose
    var orderSummaryImage: String? = null
    @SerializedName("current_address")
    @Expose
    var currentAddress: Any? = null
    @SerializedName("coupons")
    @Expose
    var coupons: List<Any>? = null

}