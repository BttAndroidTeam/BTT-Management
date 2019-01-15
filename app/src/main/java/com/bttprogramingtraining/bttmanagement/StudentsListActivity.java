package com.bttprogramingtraining.bttmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.bttprogramingtraining.bttmanagement.adapters.StudentListAdapter;

/**
 * Created by paikhantko on 12/28/18.
 */

public class StudentsListActivity extends AppCompatActivity {

    SwipeMenuListView lvStudents;
    FloatingActionButton fbStudents;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        StudentListAdapter adapter=new StudentListAdapter();
        lvStudents=findViewById(R.id.lv_students);
        fbStudents=findViewById(R.id.fab);
        lvStudents.setAdapter(adapter);
        lvStudents.setMenuCreator(new SwipeMenuCreator() {
            @Override
            public void create(SwipeMenu menu) {
                SwipeMenuItem callItem=new SwipeMenuItem(getApplicationContext());
                callItem.setWidth(180);
                callItem.setBackground(R.drawable.calm_bg_color);
                callItem.setIcon(R.drawable.ic_call_black_24dp);
                menu.addMenuItem(callItem);
                SwipeMenuItem deleteItem=new SwipeMenuItem(getApplicationContext());
                deleteItem.setWidth(180);
                deleteItem.setBackground(R.drawable.danger_bg_color);
                deleteItem.setIcon(R.drawable.ic_delete_white_24dp);
                menu.addMenuItem(deleteItem);
            }
        });
        lvStudents.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT);

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
