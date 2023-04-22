package com.santansarah.barcodescanner.domain.models

import com.santansarah.barcodescanner.domain.models.AppRouteArgs.BARCODE
import com.santansarah.barcodescanner.domain.models.AppRouteArgs.SEARCH_TEXT
import com.santansarah.barcodescanner.domain.models.AppRoutes.HOME_SCREEN
import com.santansarah.barcodescanner.domain.models.AppRoutes.PRODUCT_DETAIL_SCREEN
import com.santansarah.barcodescanner.domain.models.AppRoutes.SEARCH_SCREEN

object AppRoutes {
    const val HOME_SCREEN = "home"
    const val PRODUCT_DETAIL_SCREEN = "product_detail"
    const val SEARCH_SCREEN = "search"
}

object AppRouteArgs {
    const val BARCODE = "barcode"
    const val SEARCH_TEXT = "search_text"
}

object AppDestinations {
    const val HOME = HOME_SCREEN
    const val PRODUCT_DETAIL = "${PRODUCT_DETAIL_SCREEN}/{$BARCODE}"
    const val SEARCH = "$SEARCH_SCREEN/{$SEARCH_TEXT}"
    //const val HELP_ABOUT = AppRoutes.HELP_ABOUT
}