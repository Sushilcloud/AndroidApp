package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfraCost extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText turnover,stockiestmargin,stockvalue,marketcredit,claim,avgcreditdays,ssmsalary,
            driversalary,marketdiscount,godownrent,unitexpense,printstationary,
            managersalary,accountantsalary,godownkeeper,telephoneexp,electricity,legalexp,computerexp,postage,
            costofborrowing;

    TextView tvGrossResult,tvGrossInvestment,tvStockiestCreditMontlyValue,tvNetInvestment,
            tvDirectInvestment,tvIndirectInvestment,tvDirectIndirectExp,tvNetProfit,tvRoi;

    Button Calculate;

    Double  Turnover1,Stockiestmargin1,GrossProfit1,StockValue1,MarketCredit1,Claim1,GrossInvestment1,
            AvgCreditDays1,UnpaidStock1,NetInvestment1,SsmSalary1,DriverSalary1,MarketDiscount1,
            GodownRent1,UnitExp1,PrintStationary1,DirectInvestment1,
            ManagerSalary1,AccountantSalary1,GodownKeeper1,TelephoneExp1,Electricity1,LegalExp1,ComputerExp1,Postage1,
            CostBorrowing1,IndirectInvestment1,DirectIndirectexp1,NetProfit1,Roi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infra_cost);

        turnover = findViewById(R.id.etTurnover);
        stockiestmargin = findViewById(R.id.etStockiestMargin);
        tvGrossResult = findViewById(R.id.tvGrossProfit);

        stockvalue=findViewById(R.id.etStock);
        marketcredit=findViewById(R.id.etCredit);
        claim=findViewById(R.id.etClaim);
        tvGrossInvestment=findViewById(R.id.tvTotalGrossInvestment);
        tvStockiestCreditMontlyValue=findViewById(R.id.tvStockiestCrMthlyValue);
        avgcreditdays=findViewById(R.id.etAvgCreditDays);
        tvNetInvestment=findViewById(R.id.tvTotalNetInvestment);



        ssmsalary=findViewById(R.id.etSsmSalary);
        driversalary=findViewById(R.id.etDriver);
        marketdiscount=findViewById(R.id.etMarketDiscount);
        godownrent=findViewById(R.id.etGodownRent);
        unitexpense=findViewById(R.id.etUnitExp);
        printstationary=findViewById(R.id.etPrintStationaryExp);

        tvDirectInvestment=findViewById(R.id.tvTotalDirect);
        tvIndirectInvestment=findViewById(R.id.tvTotalIndirectExp);
        tvDirectIndirectExp=findViewById(R.id.tvTotalDirectIndirectExp);
        tvNetProfit=findViewById(R.id.tvNetProfit);
        tvRoi=findViewById(R.id.tvRoi);


        managersalary=findViewById(R.id.etManagerSalary);
        accountantsalary=findViewById(R.id.etAccountantSalary);
        godownkeeper=findViewById(R.id.etGodownKeeper);
        telephoneexp=findViewById(R.id.etTelephone);
        electricity=findViewById(R.id.etElectricity);
        legalexp=findViewById(R.id.etLegal);
        computerexp=findViewById(R.id.etComputer);
        postage=findViewById(R.id.etPostage);
        costofborrowing=findViewById(R.id.etBorrowing);




        Calculate = findViewById(R.id.btnAdd);

        Calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Turnover1 = Double.parseDouble(turnover.getText().toString());
                Stockiestmargin1 = Double.parseDouble(stockiestmargin.getText().toString());

                AvgCreditDays1=Double.parseDouble(avgcreditdays.getText().toString());

                StockValue1=Double.parseDouble(stockvalue.getText().toString());
                MarketCredit1=Double.parseDouble(marketcredit.getText().toString());
                Claim1=Double.parseDouble(claim.getText().toString());

                SsmSalary1= Double.parseDouble(ssmsalary.getText().toString());
                DriverSalary1 = Double.parseDouble(driversalary.getText().toString());
                MarketDiscount1 = Double.parseDouble(marketdiscount.getText().toString());
                GodownRent1 = Double.parseDouble(godownrent.getText().toString());
                UnitExp1 = Double.parseDouble(unitexpense.getText().toString());
                PrintStationary1 = Double.parseDouble(printstationary.getText().toString());

                ManagerSalary1 =Double.parseDouble(managersalary.getText().toString());
                AccountantSalary1 = Double.parseDouble(accountantsalary.getText().toString());
                GodownKeeper1 = Double.parseDouble(godownkeeper.getText().toString());
                TelephoneExp1 = Double.parseDouble(telephoneexp.getText().toString());
                Electricity1 = Double.parseDouble(electricity.getText().toString());
                LegalExp1 = Double.parseDouble(legalexp.getText().toString());
                ComputerExp1 = Double.parseDouble(computerexp.getText().toString());
                Postage1 = Double.parseDouble(postage.getText().toString());
                CostBorrowing1 = Double.parseDouble(costofborrowing.getText().toString());


                GrossProfit1 = (Turnover1 * Stockiestmargin1) / 100;
                tvGrossResult.setText(Double.toString(GrossProfit1));

                GrossInvestment1=StockValue1+MarketCredit1+Claim1;
                tvGrossInvestment.setText(Double.toString(GrossInvestment1));


                UnpaidStock1=(Turnover1/30)*AvgCreditDays1;
                tvStockiestCreditMontlyValue.setText(Double.toString(UnpaidStock1));

                NetInvestment1=GrossInvestment1-UnpaidStock1;
                tvNetInvestment.setText(Double.toString(NetInvestment1));

                DirectInvestment1=SsmSalary1+DriverSalary1+MarketDiscount1+GodownRent1+UnitExp1+PrintStationary1;
                tvDirectInvestment.setText(Double.toString(DirectInvestment1));

                IndirectInvestment1=ManagerSalary1+AccountantSalary1+GodownKeeper1+TelephoneExp1+
                        Electricity1+LegalExp1+ComputerExp1+Postage1+CostBorrowing1;
                tvIndirectInvestment.setText(Double.toString(IndirectInvestment1));

                DirectIndirectexp1=DirectInvestment1+IndirectInvestment1;
                tvDirectIndirectExp.setText(Double.toString(DirectIndirectexp1));

                NetProfit1=GrossProfit1-DirectIndirectexp1;
                tvNetProfit.setText(Double.toString(NetProfit1));

                Roi1=(NetProfit1/NetInvestment1)*100*12;
                tvRoi.setText(Double.toString(Roi1));

            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}



