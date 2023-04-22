package com.santansarah.barcodescanner.utils

import com.santansarah.barcodescanner.domain.ErrorCode

sealed class ServiceResult<out R> {
    object Loading : ServiceResult<Nothing>()
    data class Success<out T>(val data: T) : ServiceResult<T>()
    data class Error(val error: ErrorCode) : ServiceResult<Nothing>()
}

/**
 * `true` if [Result] is of type [Success] & holds non-null [Success.data].
 */
val ServiceResult<*>.succeeded
    get() = this is ServiceResult.Success && data != null
