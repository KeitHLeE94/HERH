package com.example.jisung.herh;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button userBtn; //사용자 선택 버튼
    Button hostBtn; //사업자 선택 버튼
    Button checkBtn; // 사용자 인증 버튼
    Button loginBtn; // 로그인 버튼
    EditText email; // 사용자 이메일 주소
    EditText password; //비밀번호
    EditText code; // 사업자 코드번호
    LinearLayout userScreen; // 사용자 화면
    LinearLayout hostScreen; // 사업자 화면
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

    }

    public void onClick(View v){
        if(v.getId() ==R.id.chose_user){
            userScreen.setVisibility(View.VISIBLE);
            hostScreen.setVisibility(View.INVISIBLE);
        }//화면 변경
        else if(v.getId() == R.id.chose_host){
            userScreen.setVisibility(View.INVISIBLE);
            hostScreen.setVisibility(View.VISIBLE);

        }//화면 변경
        else if(v.getId() == R.id.login){
            intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }

    }


    void init(){
        userBtn = (Button)findViewById(R.id.chose_user);
        hostBtn = (Button)findViewById(R.id.chose_host);
        checkBtn = (Button)findViewById(R.id.check);
        loginBtn = (Button)findViewById(R.id.login);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        code = (EditText)findViewById(R.id.code);
        userScreen = (LinearLayout)findViewById(R.id.screen_user);
        hostScreen = (LinearLayout)findViewById(R.id.screen_host);
    }
}
