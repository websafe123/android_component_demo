package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.mylib.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().build("/login/Main3Activity").navigation();
    }

    public void onclickview(){
//        ARouter.getInstance().build("/login/Main3Activity").navigation();  没有传参
        ARouter.getInstance().build("/login/Main3Activity")
                .withLong("key1",666L).withString("key2","fhsf")
                .withSerializable("key3",new Student("hfh")).navigation();
    }
}