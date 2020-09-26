package com.philencripted.iman;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.philencripted.iman.adapter.StudentListAdapter;
import com.philencripted.iman.model.Student;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList;
    RecyclerView recyclerView;
    StudentListAdapter adapter;


    @Override
    protected void onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        recyclerView = findViewById(R.id.student_list_recycler_view);

        studentArrayList = new ArrayList<>();
        Intent getStudent = getIntent();

        Bundle args = getStudent.getBundleExtra("bundle");
        assert args != null;
        studentArrayList = (ArrayList<Student>) args.getSerializable("student_list");

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
       adapter = new StudentListAdapter(this, studentArrayList);

       recyclerView.setAdapter(adapter);




    }
}
