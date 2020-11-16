package com.example.nikestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {
    TextView txtinfo,txtrating,txtname;
    public void back(View view){
        Intent intent = new Intent(DetailsActivity.this,MainActivity.class);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txtinfo = findViewById(R.id.txtdetails);
        txtname = findViewById(R.id.txtdtname);
        txtrating = findViewById(R.id.txtdtrating);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        txtname.setText((CharSequence) bundle.get("name"));
        txtrating.setText((CharSequence) bundle.get("rating"));

    }
}