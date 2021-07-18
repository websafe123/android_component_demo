package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.mylib.Student;

@Route(path="/login/Main3Activity")
public class Main3Activity extends AppCompatActivity {


    @Autowired
    long key1;  // 第一种方式取值

    @Autowired(name="key2")
    String str;

    @Autowired
    Student key3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ARouter.getInstance().inject(this);  // 将传过来的参数注入到当前的activity
    }
}