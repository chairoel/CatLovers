package com.amrul.test.testapp.model

import android.os.Parcel
import android.os.Parcelable


data class Cat(
    var nameCat: String? = "",
    var detailCat: String? = "",
    var priceCat: String? = "",
    var photoCat: Int = 0
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nameCat)
        parcel.writeString(detailCat)
        parcel.writeString(priceCat)
        parcel.writeInt(photoCat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cat> {
        override fun createFromParcel(parcel: Parcel): Cat {
            return Cat(parcel)
        }

        override fun newArray(size: Int): Array<Cat?> {
            return arrayOfNulls(size)
        }
    }
}


