package com.superking.parch.ioioioioiio


sealed class DataFromApiResourcegtgtgt<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : DataFromApiResourcegtgtgt<T>(data)
    class Loading<T>(data: T? = null) : DataFromApiResourcegtgtgt<T>(data)
    class Error<T>(message: String, data: T? = null) : DataFromApiResourcegtgtgt<T>(data, message)
}