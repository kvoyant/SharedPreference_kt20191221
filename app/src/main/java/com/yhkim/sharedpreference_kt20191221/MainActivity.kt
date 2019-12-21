package com.yhkim.sharedpreference_kt20191221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yhkim.sharedpreference_kt20191221.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
//        Q1. 아이디 저장 로직 구현
//        로그인버튼이 눌리면
//        idCheckBox가 체크되어있는지 검사 (구글링)
//        되어있다면 idEdt에 적혀있는 값을 userId 라는 val로 저장
        loginBtn.setOnClickListener {
            if(idCheckBox.isChecked) {
                val userId = idEdt.text.toString()

                ContextUtil.setUserId(mContext, userId)
            }
        }

    }

    override fun setValues() {
    }

}
