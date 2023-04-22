package com.santansarah.barcodescanner.domain

enum class ErrorCode(val message: String) {
    API_ERROR("Couldn't get item data."),
    API_SEARCH_TIMEOUT("It's taking longer than expected to get your results. Try again, or use " +
            "more specific key words.")
}
