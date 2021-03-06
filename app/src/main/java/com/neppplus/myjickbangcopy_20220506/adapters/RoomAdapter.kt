package com.neppplus.myjickbangcopy_20220506.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.myjickbangcopy_20220506.R
import com.neppplus.myjickbangcopy_20220506.models.RoomData
import java.text.DecimalFormat

// 1. 어댑터 생성후 ArrayAdapter "상속" 받은 후, ArrayAdapter가 필요한 인수를 넘겨준다
class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<RoomData>,
) : ArrayAdapter<RoomData>(mContext, resId, mList) {
//    2. Adapter 내부에서 getView라는 함수 override (커스텀)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//    3. List에서 한줄을 보여줄 converView를 임시 변수에 대입
        var tempRow = convertView
//    4. if 조건문을 통해서 한줄을 보여줄 View가 절대로 Null이 되지 않도록 작업
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }
//    5. 작업이 완료된(Not-Null) 한줄을 실제로 보내줄 row라는 변수에 대입
        val row = tempRow!!

//    6. 실제 row에 roomData를 가공하여 return으로 출력
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        val data = mList[position]

        priceTxt.text = data.getFormattedPrice()
        addressTxt.text = "${data.address}, ${data.getFormattedLevel()}"
        descriptionTxt.text = data.description

        return row
    }
}