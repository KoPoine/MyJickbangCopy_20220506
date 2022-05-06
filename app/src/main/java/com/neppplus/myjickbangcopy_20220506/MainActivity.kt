package com.neppplus.myjickbangcopy_20220506

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.myjickbangcopy_20220506.models.RoomData

class MainActivity : AppCompatActivity() {
//    1. 리스트뷰에 표시할 ArrayList 만들기
    val mRoomList = ArrayList<RoomData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        2. ArrayList 데이터를 넣어주기
        mRoomList.add(RoomData(8000, "마포구 합정동", 1, "1층 신축 풀옵션 원룸"))
        mRoomList.add(RoomData(7500, "마포구 합정동", 2, "신축 풀옵션 원룸"))
        mRoomList.add(RoomData(5500, "마포구 서교동", 0, "깔끔한 반 지층 원룸"))
        mRoomList.add(RoomData(12000, "마포구 서교동", 2, "2층 투룸 전세"))
        mRoomList.add(RoomData(15000, "마포구 서교동", 3, "신축 풀옵션 원룸, 즉시 입주"))
        mRoomList.add(RoomData(25000, "마포구 망원동", 5, "풀옵션 테라스 완비 투룸"))
        mRoomList.add(RoomData(9000, "마포구 망원동", 1, "1층 풀옵션 원룸"))
        mRoomList.add(RoomData(9500, "마포구 연남동", 0, "반지층 깔끔하고 안전한 원룸"))
        mRoomList.add(RoomData(35000, "마포구 연남동", -1, "지하 1층 상가 임대"))
        mRoomList.add(RoomData(8500, "마포구 연남동", 4, "풀옵션 넓은 원룸"))
        mRoomList.add(RoomData(10000, "마포구 연남동", 3, "3층 빌라 임대"))
    }
}