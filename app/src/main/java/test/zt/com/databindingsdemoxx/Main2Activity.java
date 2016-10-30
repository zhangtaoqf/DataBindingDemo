package test.zt.com.databindingsdemoxx;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

import test.zt.com.databindingsdemoxx.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {
    ActivityMain2Binding activityMain2Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain2Binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);
        activityMain2Binding.setAdapter(new TestAdapter(this));
        activityMain2Binding.setItemclicklistener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Main2Activity.this, "点击了"+i, Toast.LENGTH_SHORT).show();
            }
        });
        loadData();
    }
    private void loadData() {
        ArrayList<String> dd = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            dd.add("item:"+i);
        }
        activityMain2Binding.getAdapter().addAll(dd);
    }
}
