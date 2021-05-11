package sg.edu.rp.c346.id20008787.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled.findViewById(R.id.cbEnabled);
        btnCheck.findViewById(R.id.btnCheck);
        tvShow.findViewById(R.id.tvShow);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", msg:"Checkbox Checked:" + cbEnabled.isChecked());
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                if (cbEnabled.isChecked()) {
                    double pay =calcPay(price:100, discount:20);
                    tvShow.setText("Discount is given, pay $" + pay);
                }
                else{
                    double pay = calcPay(price:100, discount:20);
                    tvShow.setText("Discount is not given, pay $" + pay);
                }
            }
        });
    }

    private double calcPay(double price, double discount){
        double pay = price * (1 - discount/100);
        return pay;
    }

}