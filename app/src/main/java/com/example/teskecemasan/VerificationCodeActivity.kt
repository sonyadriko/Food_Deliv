package com.example.teskecemasan

import android.annotation.TargetApi
import android.content.Context
import android.graphics.Canvas
import android.os.Build
import android.os.Bundle
import android.util.AttributeSet
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class VerificationCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)
    }


}
//
//class PinEntryEditText : AppCompatEditText {
//    constructor(context: Context?) : super(context) {}
//    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
//        init(context, attrs)
//    }
//
//    constructor(
//        context: Context, attrs: AttributeSet,
//        defStyleAttr: Int
//    ) : super(context, attrs, defStyleAttr) {
//        init(context, attrs)
//    }
//
//    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//    constructor(
//        context: Context, attrs: AttributeSet,
//        defStyleAttr: Int, defStyleRes: Int
//    ) : super(context, attrs, defStyleAttr, defStyleRes) {
//        init(context, attrs)
//    }
//
//    private fun init(context: Context, attrs: AttributeSet) {}
//    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)
//    }
//}