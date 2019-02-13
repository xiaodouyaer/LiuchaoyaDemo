package com.liuchaoya.alihotfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.taobao.sophix.SophixManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //查询并加载补丁包
        SophixManager.getInstance().queryAndLoadNewPatch();

        Toast.makeText(this,"这是热更新过的包",Toast.LENGTH_LONG).show();
    }
}
