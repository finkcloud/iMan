package com.philencripted.iman;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.philencripted.iman.adapter.DepartmentListAdapter;
import com.philencripted.iman.model.Department;
import com.philencripted.iman.model.Institution;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Department> mDepartList;
    DepartmentListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.dept_recycler_view);

        mDepartList = new ArrayList<>();
        buildData();




    }


    public void buildData(){

        //created 2 institution
        Institution MIT = new Institution("Massachuset Institute of technology");
        Institution  Princeton = new Institution("Princeton University");

        // add studnets to MIT
        Department MITcs =  MIT.createNewDepartment("Dept of Computer science");
        MITcs.addStudent(MIT.createNewStudent("James Bond", 45, "MIT/007/CS","00712345678"));
        MITcs.addStudent(MIT.createNewStudent("Peter Thiel", 40, "MIT/002/CS","00712345678"));
        MITcs.addStudent(MIT.createNewStudent("Bill Gate", 45, "MIT/003/CS","00712345678"));
        MITcs.addStudent(MIT.createNewStudent("Mark Zuck", 45, "MIT/005/CS","00712345678"));
        MITcs.addStudent(MIT.createNewStudent("Larry Page", 45, "MIT/006/CS","00712345678"));

        Department MITbusiness = MIT.createNewDepartment("Dept of Business Administration");
        MITbusiness.addStudent(MIT.createNewStudent("Phil Nge", 85, "MIT/006/MBA","00712345678"));
        MITbusiness.addStudent(MIT.createNewStudent("Nonny Junior", 40, "MIT/006/MBA","00712345678"));
        MITbusiness.addStudent(MIT.createNewStudent("Josesh Newman", 50, "MIT/006/MBA","00712345678"));
        MITbusiness.addStudent(MIT.createNewStudent("Urch Roland", 45, "MIT/006/MBA","00712345678"));


        // add studnets to Priinceton
        Department  PRstat =  Princeton.createNewDepartment("Dept of Statistics");
        // add studnets to Princeton
        PRstat.addStudent(Princeton.createNewStudent("Angela Yan", 45, "PR/007/STA","00712345678"));
        PRstat.addStudent(Princeton.createNewStudent("Brandon Pete", 40, "PR/002/STAT","00712345678"));
        PRstat.addStudent(Princeton.createNewStudent("Martin Paul", 45, "PR/003/STAT","00712345678"));
        PRstat.addStudent(Princeton.createNewStudent("Joy chan", 45, "PR/005/STAT","00712345678"));
        PRstat.addStudent(Princeton.createNewStudent("Roland Brig", 45, "PR/006/STAT","00712345678"));


        Department PRlaw = Princeton.createNewDepartment("Dept of Law");

        PRlaw.addStudent(MIT.createNewStudent("Mary lucas", 85, "MIT/006/LLB","00712345678"));
        PRlaw.addStudent(MIT.createNewStudent("Tiffany James", 40, "MIT/006/LLB","00712345678"));
        PRlaw.addStudent(MIT.createNewStudent("Jane Newman", 50, "MIT/006/LLB","00712345678"));
        PRlaw.addStudent(MIT.createNewStudent("Jeff Chrisi", 45, "MIT/006/LLB","00712345678"));


        mDepartList.addAll(MIT.getAllDepartments());
        mDepartList.addAll(Princeton.getAllDepartments());

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter = new DepartmentListAdapter(this, mDepartList);
        recyclerView.setAdapter(adapter);






        /*displayInstitutionInfo(MIT,MITcs);
        displayInstitutionInfo(Princeton,PRstat);
        displayInstitutionInfo(MIT,MITbusiness);
        displayInstitutionInfo(Princeton,PRlaw);*/

    }









}