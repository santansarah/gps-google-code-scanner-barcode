package com.santansarah.barcodescanner.utils

import kotlin.math.roundToInt

fun Double?.toMgs() = "%.1f".format(this?.times(1000) ?: 0.00f)


fun Double?.valueOrZero() = "%.1f".format(this ?: 0.00f)
