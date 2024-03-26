package com.example.androidstudy

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomDrawView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLACK // 직사각형의 색상을 설정합니다.
        style = Paint.Style.FILL // 채우기 스타일을 설정합니다.
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        // 화면에 직사각형을 그립니다. 여기서는 예시로 화면의 가운데에 위치한 직사각형을 그립니다.
        canvas?.drawRect(width / 4f, height / 4f, width * 3 / 4f, height * 3 / 4f, paint)
    }
}

