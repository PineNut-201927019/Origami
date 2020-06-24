package com.pinenut.jong_ie_jupgi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Category_TraditionalApplication_Activity extends AppCompatActivity {

    public void GoingUnitTLB(View v)
    {
        Intent going_unit_tlb = new Intent(this, Unit_TwoLegBoat_Activity.class);
        startActivity(going_unit_tlb);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_traditional_application);
    }
}
