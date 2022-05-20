package sg.edu.rp.c346.id20026389.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAndroid;
    TextView tvItService;
    TextView tvData;
    TextView tvFYP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAndroid=findViewById(R.id.textViewAndroid);
        tvItService=findViewById(R.id.textViewItService);
        tvData=findViewById(R.id.textViewData);
        tvFYP=findViewById(R.id.textViewFYP);


        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module","C346");
                startActivity(intent);
            }
        });
        tvItService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module","C382");
                startActivity(intent);
            }
        });
        tvData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module","C322");
                startActivity(intent);
            }
        });
        tvFYP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("module","C300");
                startActivity(intent);
            }
        });

    }
}