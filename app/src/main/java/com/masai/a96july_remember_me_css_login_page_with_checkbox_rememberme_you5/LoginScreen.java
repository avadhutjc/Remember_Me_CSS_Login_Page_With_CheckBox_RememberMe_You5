package com.masai.a96july_remember_me_css_login_page_with_checkbox_rememberme_you5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    TextView mtvUsername;
    private static final String SHARED_PREFERENCE_KEY = "AVADHUT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        mtvUsername = findViewById(R.id.tvUsername);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_KEY, MODE_PRIVATE);
        String username = sharedPreferences.getString("name", " ");
        mtvUsername.setText(username);
    }
}