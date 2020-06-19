package com.pinenut.jong_ie_jupgi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    'GoingCatalog'라는 이름의 onClick 함수입니다.
//    이 함수를 적용한 버튼을 누르면 'activity_catalog.xml'의 화면으로 넘어갑니다.
//    intent 역시 'going_catalog'라고 지어주었습니다.
    public void GoingCatalog(View v)
    {
        Intent going_catalog = new Intent(this, CatalogActivity.class);
        startActivity(going_catalog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
