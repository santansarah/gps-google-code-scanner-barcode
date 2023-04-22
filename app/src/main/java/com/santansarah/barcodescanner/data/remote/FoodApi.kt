package com.santansarah.barcodescanner.data.remote

import okhttp3.Credentials
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface FoodApi {
    
    companion object {
        val basic: String = Credentials.basic("off", "off")
    }


    @Headers("Accept: application/json")
    @GET("https://us.openfoodfacts.org/api/v2/product/0078742366951?fields=brands%2Cnutriments;nocache=1")
    suspend fun getInfoByBarCodeString(): ResponseBody


    @GET("product/{barCode}")
    suspend fun getInfoByBarCode(
        @Header("Authorization") authorization: String = basic,
        @Path("barCode") barCode: String,
        @Query("fields") fields: String): ItemListing

}