package com.example.androidpractice

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User(
    val name: String,
    val email: String,
    val password: String
): Parcelable {


}