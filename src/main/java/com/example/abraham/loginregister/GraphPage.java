package com.example.abraham.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;


import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class GraphPage extends AppCompatActivity {

    //mock data
    int amount[] = { 66, 45, 91, 450, 77};
    String categories[] = { "Gas", "Booze", "Food", "Rent", "Misc" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_page);

        setupPieChart();
    }

    //function to actually build my pieChart
    private void setupPieChart() {
        //populating a list of PieEntries
        List<PieEntry> pieEntries = new ArrayList<>();

        for (int i = 0; i<amount.length; i++){
            pieEntries.add(new PieEntry(amount[i], categories[i]) );

        }

        PieDataSet dataSet = new PieDataSet(pieEntries, "Budget Categories and Amount");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data = new PieData(dataSet );

        //get the Chart
        PieChart chart = (PieChart) findViewById(R.id.myChart);
        chart.setData(data);
        chart.animateY(1500);
        chart.invalidate();

    }
}
