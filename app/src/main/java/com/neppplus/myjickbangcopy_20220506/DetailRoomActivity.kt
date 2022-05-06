package com.neppplus.myjickbangcopy_20220506

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neppplus.myjickbangcopy_20220506.models.RoomData
import kotlinx.android.synthetic.main.activity_detail_room.*

class DetailRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_room)
        val roomData = intent.getSerializableExtra("roomData") as RoomData

        priceTxt.text = roomData.getFormattedPrice()
        addressTxt.text = "${roomData.address}, ${roomData.getFormattedLevel()}"
        descriptionTxt.text = roomData.description
    }
}