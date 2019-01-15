package com.bttprogramingtraining.bttmanagement.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.bttprogramingtraining.bttmanagement.R;
import com.bttprogramingtraining.bttmanagement.adapters.StudentListAdapter;

/**
 * Created by paikhantko on 12/28/18.
 */

public class StudentsListActivity extends AppCompatActivity {

    ListView lvStudents;
    FloatingActionButton fbStudents;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        StudentListAdapter adapter=new StudentListAdapter();
        lvStudents=findViewById(R.id.lv_students);
        fbStudents=findViewById(R.id.fab);
        lvStudents.setAdapter(adapter);

        setClickActions();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_students_list,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_export: break;
            case R.id.item_sorted_year: break;
        }
        return true;
    }

    private void setClickActions(){
        fbStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentsListActivity.this,RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}
