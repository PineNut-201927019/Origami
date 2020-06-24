package com.pinenut.jong_ie_jupgi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DiagramSingle_TwoLegBoat_Activity extends AppCompatActivity {

    int i = 0;
    ImageView dl = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagramsingle_twolegboat);

        dl = (ImageView) findViewById(R.id.Diagram_Load);
        Button button_Prev = (Button)findViewById(R.id.button_Prev);
        Button button_Next = (Button)findViewById(R.id.button_Next);

        button_Next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                i = i + 1;

                if(i == 0)
                {
                    dl.setImageResource(R.drawable.tlb_b);
                }
                if(i == 1)
                {
                    dl.setImageResource(R.drawable.tlb_c);
                }
                if(i == 2)
                {
                    dl.setImageResource(R.drawable.tlb_c_reverse);
                }
                if(i == 3)
                {
                    dl.setImageResource(R.drawable.tlb_d);
                }
                if(i == 4)
                {
                    dl.setImageResource(R.drawable.tlb_e);
                }
                if(i == 5)
                {
                    dl.setImageResource(R.drawable.tlb_e_rotate);
                }
                if(i == 6)
                {
                    dl.setImageResource(R.drawable.tlb_f);
                }
                if(i == 7)
                {
                    dl.setImageResource(R.drawable.tlb_g);
                }
                if(i == 8)
                {
                    dl.setImageResource(R.drawable.tlb_h);
                }
                if(i == 9)
                {
                    dl.setImageResource(R.drawable.tlb_i);
                }
                if(i == 10)
                {
                    dl.setImageResource(R.drawable.tlb_j);
                }
                if(i == 11)
                {
                    dl.setImageResource(R.drawable.tlb_k);
                }
                if(i == 12)
                {
                    dl.setImageResource(R.drawable.tlb_l);
                }
                if(i == 13)
                {
                    dl.setImageResource(R.drawable.tlb_m);
                }
                if(i == 14)
                {
                    dl.setImageResource(R.drawable.tlb_n);
                }
                if(i == 15)
                {
                    dl.setImageResource(R.drawable.tlb_o);
                }
                if(i == 16)
                {
                    dl.setImageResource(R.drawable.tlb_p);
                }
                if(i == 17)
                {
                    dl.setImageResource(R.drawable.tlb_q);
                }
                if(i == 18)
                {
                    dl.setImageResource(R.drawable.tlb_r);
                }
                if(i == 19)
                {
                    dl.setImageResource(R.drawable.tlb_s);
                }
                if(i == 20)
                {
                    dl.setImageResource(R.drawable.tlb_t);
                }
            }
        });

        button_Prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                i = i - 1;
                if(i == 21)
                {
                    dl.setImageResource(R.drawable.tlb_s);
                }
                if(i == 20)
                {
                    dl.setImageResource(R.drawable.tlb_r);
                }
                if(i == 19)
                {
                    dl.setImageResource(R.drawable.tlb_q);
                }
                if(i == 18)
                {
                    dl.setImageResource(R.drawable.tlb_p);
                }
                if(i == 17)
                {
                    dl.setImageResource(R.drawable.tlb_o);
                }
                if(i == 16)
                {
                    dl.setImageResource(R.drawable.tlb_n);
                }
                if(i == 15)
                {
                    dl.setImageResource(R.drawable.tlb_m);
                }
                if(i == 14)
                {
                    dl.setImageResource(R.drawable.tlb_l);
                }
                if(i == 13)
                {
                    dl.setImageResource(R.drawable.tlb_k);
                }
                if(i == 12)
                {
                    dl.setImageResource(R.drawable.tlb_j);
                }
                if(i == 11)
                {
                    dl.setImageResource(R.drawable.tlb_i);
                }
                if(i == 10)
                {
                    dl.setImageResource(R.drawable.tlb_h);
                }
                if(i == 9)
                {
                    dl.setImageResource(R.drawable.tlb_g);
                }
                if(i == 8)
                {
                    dl.setImageResource(R.drawable.tlb_f);
                }
                if(i == 7)
                {
                    dl.setImageResource(R.drawable.tlb_e_rotate);
                }
                if(i == 6)
                {
                    dl.setImageResource(R.drawable.tlb_e);
                }
                if(i == 5)
                {
                    dl.setImageResource(R.drawable.tlb_d);
                }
                if(i == 4)
                {
                    dl.setImageResource(R.drawable.tlb_c_reverse);
                }
                if(i == 3)
                {
                    dl.setImageResource(R.drawable.tlb_c);
                }
                if(i == 2)
                {
                    dl.setImageResource(R.drawable.tlb_b);
                }
                if(i == 1)
                {
                    dl.setImageResource(R.drawable.tlb_a);
                }
            }
        });
    }
}
