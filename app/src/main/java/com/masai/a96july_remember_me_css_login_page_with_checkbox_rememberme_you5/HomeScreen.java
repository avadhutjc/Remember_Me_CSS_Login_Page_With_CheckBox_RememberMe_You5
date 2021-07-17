package com.masai.a96july_remember_me_css_login_page_with_checkbox_rememberme_you5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    EditText mEtUserName, mEtPassword;
    Button mBtnLogin;
    CheckBox mCheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        mBtnLogin = findViewById(R.id.BtnLogin);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCheckBox.isChecked()) {
                    String username = mEtUserName.getText().toString();
                } else {
                    Toast.makeText(HomeScreen.this, "Please Check The Mark In CheckBox", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(HomeScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        mEtUserName = findViewById(R.id.EtUsername);
        mEtPassword = findViewById(R.id.EtPassword);
        mCheckBox = findViewById(R.id.checkbox);
    }
}