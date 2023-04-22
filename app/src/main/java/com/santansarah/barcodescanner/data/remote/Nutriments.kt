package com.santansarah.barcodescanner.data.remote

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Nutriments(
    @SerialName("carbohydrates_serving") val carbohydrates: Double = 0.00,
    @SerialName("energy-kcal_serving") val calories: Double = 0.00,
    @SerialName("cholesterol_serving") val cholesterol: Double = 0.00,
    @SerialName("fat_serving") val fat: Double = 0.00,
    @SerialName("saturated-fat_serving") val saturatedFat: Double = 0.00,
    @SerialName("monounsaturated-fat_serving") val monounsaturatedFat: Double = 0.00,
    @SerialName("polyunsaturated-fat_serving") val polyunsaturatedFat: Double = 0.00,
    @SerialName("proteins_serving") val protein: Double = 0.00,
    @SerialName("fiber_serving") val fiber: Double = 0.00,
    @SerialName("sodium_serving") val sodium: Double = 0.00,
    @SerialName("sugars_serving") val sugar: Double = 0.00,
    @SerialName("potassium_serving") val potassium: Double = 0.00
)