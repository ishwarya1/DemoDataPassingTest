package sg.edu.rp.soi.intentdatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnInteger,btnCharater,btnDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInteger = findViewById(R.id.btnint);
        btnCharater = findViewById(R.id.btnchar);
        btnDouble = findViewById(R.id.btndouble);
        btnInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });
        btnCharater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ThirdActivity.class);
                intent.putExtra("value2",'a');
                startActivity(intent);
            }
        });
        btnDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),FourthActivity.class);
                intent.putExtra("value3",0.0);
                startActivity(intent);
            }
        });
    }
}