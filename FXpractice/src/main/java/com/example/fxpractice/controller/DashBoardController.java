
package com.example.fxpractice.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class DashBoardController implements Initializable {

    @FXML
    private AreaChart<Number,Number > dineinChart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private BarChart<?, ?> takeawayChart;
    @FXML
    private AreaChart<?, ?> deleveryChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         // Create a new series (dataset)
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Sales Data");

        // Add sample data points (X, Y values)
        series.getData().add(new XYChart.Data<>(1, 10));
        series.getData().add(new XYChart.Data<>(2, 20));
        series.getData().add(new XYChart.Data<>(3, 15));
        series.getData().add(new XYChart.Data<>(4, 25));
        series.getData().add(new XYChart.Data<>(5, 30));

        // Add the series to the chart
        dineinChart.getData().add(series);
        // TODO
    }    
    
}
