package com.example.zolamess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText emailtext;
    TextInputEditText passText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailtext = findViewById(R.id.editTextEmail);
        passText = findViewById(R.id.editTextPassword);
        emailtext.addTextChangedListener(emailValidate);
        passText.addTextChangedListener(passVali);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    /*
    validate email input
     */
    TextWatcher emailValidate = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String s = charSequence.toString();
            if(s.length() >8 && s.contains("@gmail.com") == false){
                emailtext.setError("Tên đăng nhập không đúng định dạng");
            }
            else {
                emailtext.setError(null);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    /*
    validate password input
     */
    TextWatcher passVali = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String s = charSequence.toString();
            if(s.length()==0){
                passText.setError("Hãy nhật mật khẩu");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}