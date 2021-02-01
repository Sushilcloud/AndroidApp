package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TradeCalculation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText qty,margin,gst,scheme,mrp,Tmrp,cd,freeqty;
    TextView rate,gross,schemeamnt,gstamnt,netamnt,perpcs,percase,rateaftcd,rateafterfreeissue,
            perpcsaftcd,perpcsaftfree;
    Button Calculate,button;
    double Mrp,Margin,Gst,RateResult,GrossResult,Qty,SchemeAmnt,GstAmnt,NetAmnt,PerPcs,PerCase,CD
            ,FreeQty,PerPcsAftCD,PerPcsAftFree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_calculation);

        button=findViewById(R.id.btnScheme);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scheme();
            }
        });

        button=findViewById(R.id.btnMarginChart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marginchart();
            }
        });

        button=findViewById(R.id.btnStockiestRoi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roi();
            }
        });

        Tmrp = findViewById(R.id.etMrp);

        // First Define Edit Text to Enter Variable like freeissue and get value by findViewByID
        // Second Define Text View Variable to Show Result rateafterfreeissue..........
        // Third Define double Variable to show Final Result on Text View


        margin=findViewById(R.id.etMargin);
        gst=findViewById(R.id.etGst);
        rate=findViewById(R.id.txRate);
        cd=findViewById(R.id.etcd);
        freeqty=findViewById(R.id.etfreeissue);

        qty=findViewById(R.id.etQty);
        gross=findViewById(R.id.txGross);

        scheme=findViewById(R.id.etSchm);
        schemeamnt=findViewById(R.id.txSchAmnt);
        gstamnt=findViewById(R.id.txGstAmnt);
        netamnt=findViewById(R.id.txNetAmnt);
        perpcs=findViewById(R.id.txPerPcs);
        percase=findViewById(R.id.txPerCase);
        rateaftcd=findViewById(R.id.txPercd);
        rateafterfreeissue=findViewById(R.id.txFreeIssue);

        perpcsaftcd=findViewById(R.id.txRtAftCd);
        perpcsaftfree=findViewById(R.id.txRtAftFree);

        Calculate=findViewById(R.id.btnAdd);

        Calculate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {



                Margin=Double.parseDouble(margin.getText().toString());
                Mrp=Double.parseDouble(Tmrp.getText().toString());
                Gst=Double.parseDouble(gst.getText().toString());

                Qty=Double.parseDouble(qty.getText().toString());
                SchemeAmnt=Double.parseDouble(scheme.getText().toString());
                CD=Double.parseDouble(cd.getText().toString());
                // PerPcsAftCD=Double.parseDouble(perpcsaftcd.getText().toString());
                //   PerPcsAftFree=Double.parseDouble(perpcsaftfree.getText().toString());
                FreeQty=Double.parseDouble(freeqty.getText().toString());

                RateResult= Mrp*10000/(100+Margin)/(100+Gst);
                rate.setText(Double.toString(RateResult));

                GrossResult= Qty*RateResult;
                gross.setText(Double.toString(GrossResult));

                SchemeAmnt= GrossResult*SchemeAmnt/100;
                schemeamnt.setText(Double.toString(SchemeAmnt));

                GstAmnt= ((GrossResult-SchemeAmnt)*Gst)/100;
                gstamnt.setText(Double.toString(GstAmnt));

                NetAmnt= GrossResult+GstAmnt-SchemeAmnt;
                netamnt.setText(Double.toString(NetAmnt));

                PerPcs= NetAmnt/Qty;
                perpcs.setText(Double.toString(PerPcs));

                PerCase= PerPcs*Qty;
                percase.setText(Double.toString(PerCase));

                CD=NetAmnt-(( GrossResult-SchemeAmnt)*CD/100);
                rateaftcd.setText(Double.toString(CD));

                PerPcsAftCD=CD/Qty;
                perpcsaftcd.setText(Double.toString(PerPcsAftCD));
                perpcsaftcd.setText(String.format("%.2f",PerPcsAftCD));

                FreeQty=CD*Qty/(FreeQty+Qty);

                rateafterfreeissue.setText(Double.toString(FreeQty));
                rateafterfreeissue.setText(String.format("%.2f",FreeQty));



                PerPcsAftFree=FreeQty/Qty;
                perpcsaftfree.setText(Double.toString(PerPcsAftFree));
                perpcsaftfree.setText(String.format("%.2f",PerPcsAftFree));
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        String item= parent.getItemAtPosition(pos).toString();
        Tmrp.setText(item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Tmrp.setText("");

    }
    public void scheme()
    {
        Intent intent = new Intent(TradeCalculation.this,Scheme_All_Division_Recycler_Server.class);
        startActivity(intent);
    }

    public void marginchart()
    {
        Intent intent = new Intent(TradeCalculation.this,Foods_All_Margin_Details.class);
        startActivity(intent);
    }
    public void roi()
    {
        Intent intent = new Intent(TradeCalculation.this,InfraCost.class);
        startActivity(intent);
    }

}


