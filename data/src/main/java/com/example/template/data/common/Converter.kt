package com.example.template.data.common

import com.example.template.domain.common.MResult
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response

object Converter {

    /** use this if server response data not modified (use whole body as data) **/
    fun <T> createFromResponse(response: Response<T>?): MResult<T> {
        return if (response?.isSuccessful == true) {
            val body = response.body()
            when {
                body != null -> {
                    MResult.Success(body)
                }
                response.code() in 200..204 -> {
                    MResult.SuccessEmpty()
                }
                else -> {
                    MResult.Error(body?.toString() ?: "try again later")
                }
            }
        } else {
            return try {
                val reader = JSONObject((response?.errorBody() as ResponseBody).string())
                val errorMessage = reader.getJSONArray("Messages")[0]?.toString()
                MResult.Error(errorMessage ?: "Error")
            } catch (e: JSONException) {
                e.printStackTrace()
                MResult.Error("unknown error")
            }
        }
    }
}

