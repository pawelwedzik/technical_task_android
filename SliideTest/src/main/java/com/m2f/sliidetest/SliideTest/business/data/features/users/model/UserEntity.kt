package com.m2f.sliidetest.SliideTest.business.data.features.users.model

import com.google.gson.annotations.SerializedName

data class UserEntity(
        @SerializedName("id") val id: Long,
        @SerializedName("name") val name: String,
        @SerializedName("email") val email: String,
        @SerializedName("gender") val gender: String,
        @SerializedName("status") val status: String,
        @SerializedName("created_at") val created_at: String,
        @SerializedName("updated_at") val updated_at: String
)