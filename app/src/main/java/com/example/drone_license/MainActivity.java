package com.example.drone_license;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button intent_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent_btn = findViewById(R.id.drone_license_Registration);

        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,drone_license_registration.class);
                startActivity(intent);
            }
    });

    }

    public void droni_license_information(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.kotsa.or.kr/mobile/nsi/qti/MoNSIContents.do?fileName=MoAWTTIGDetail10&header=%EC%B4%88%EA%B2%BD%EB%9F%89%EB%B9%84%ED%96%89%EC%9E%A5%EC%B9%98%EC%A1%B0%EC%A2%85%EC%82%AC"));
        startActivity(myIntent);
        return;
    }

    public void droni_license_Education_Office(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kaa.atims.kr/pubs/course/institution/list.do?subNum=4"));
        startActivity(myIntent);
        return;
    }
}
