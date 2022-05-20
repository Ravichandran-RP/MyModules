package sg.edu.rp.c346.id20026389.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView modcode;
    TextView modname;
    TextView modyear;
    TextView modsem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
    }
}