package com.neppplus.myjickbangcopy_20220506.models

import java.io.Serializable
import java.text.DecimalFormat

class RoomData(
    val price : Int,
    val address : String,
    val level : Int,
    val description : String,
) : Serializable {
    fun getFormattedPrice() : String {
        val decimal = DecimalFormat("#,###")
        val resultPrice = if (this.price >= 10000) {
            val uk = this.price / 10000
            var remain = this.price % 10000
            if (remain == 0) {
                "${uk}억"
            } else {
                "${uk}억${decimal.format(remain)}"
            }
        } else {
            decimal.format(this.price)
        }
        return resultPrice
    }

    fun getFormattedLevel() : String {
        val resultLevel = if (this.level > 0) {
            "${this.level}층"
        } else if (this.level == 0) {
            "반지층"
        } else {
            "지하 ${this.level * -1}층"
        }
        return resultLevel
    }
}