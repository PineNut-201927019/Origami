package com.pinenut.jong_ie_jupgi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CatalogActivity extends AppCompatActivity {

    public void GoingCategoryTA(View v)
    {
        Intent going_category_ta = new Intent(this, Category_TraditionalApplication_Activity.class);
        startActivity(going_category_ta);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
    }
}
