package com.pinenut.jong_ie_jupgi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DiagramChart_TwoLegBoat_Activity extends AppCompatActivity {

    public void GoingDS(View v)
    {
        Intent going_ds = new Intent(this, DiagramSingle_TwoLegBoat_Activity.class);
        startActivity(going_ds);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagramchart_twolegboat);
    }
}
