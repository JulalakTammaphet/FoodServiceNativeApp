package com.kea.fs1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void wanlaClick(View view){
        Button gowanla = (Button)findViewById(R.id.buttonWan);
        gowanla.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent wanla = new Intent(homepage.this,RestDetail.class);
                startActivity(wanla);
            }
        });
    }


}
