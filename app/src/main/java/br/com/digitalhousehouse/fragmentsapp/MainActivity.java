package br.com.digitalhousehouse.fragmentsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhousehouse.fragmentsapp.fragments.fragment2;
import br.com.digitalhousehouse.fragmentsapp.fragments.fragmento1;

public class MainActivity extends AppCompatActivity {

    private Button btnfragment1;
    private Button btnfragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new fragmento1());
            }
        });

        btnfragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new fragment2());
            }
        });
    }

        private void addFragment (Fragment fragment){
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack("FRAGMENTS");
                transaction.commit();
    }


    private void initView() {
        btnfragment1 = findViewById(R.id.btnfragmento1);
        btnfragment2 = findViewById(R.id.btnfragmento2);
    }
}