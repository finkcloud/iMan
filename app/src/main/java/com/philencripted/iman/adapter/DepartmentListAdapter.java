package com.philencripted.iman.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.philencripted.iman.R;
import com.philencripted.iman.StudentListActivity;
import com.philencripted.iman.model.Department;
import com.philencripted.iman.model.Student;

import java.util.ArrayList;

public class DepartmentListAdapter extends RecyclerView.Adapter<DepartmentListAdapter.DepartmentViewHolder> {

    private Context mContext;
    private ArrayList<Department> mDepartmentList;

    public DepartmentListAdapter(Context context, ArrayList<Department> deptlist){
        this.mContext = context;
        this.mDepartmentList  = deptlist;
    }


    @NonNull
    @Override
    public DepartmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.department_list_item,parent,false);
        return  new DepartmentViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull DepartmentViewHolder holder, final int position) {
        final Department department = mDepartmentList.get(position);

        holder.deptName.setText(department.getDepartmentName());
        holder.noOfStudents.setText(department.getAllStudents().size()+" Students");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Student> studentArrayList = department.getAllStudents();
                Intent goIntent = new Intent(mContext, StudentListActivity.class);
                Bundle args = new Bundle();
                args.putSerializable("student_list", studentArrayList);
                goIntent.putExtra("bundle",args);
                mContext.startActivity(goIntent);




            }
        });




    }

    @Override
    public int getItemCount() {
        if(mDepartmentList != null){
            return mDepartmentList.size();
        }else {
            return 0;
        }

    }

    public class DepartmentViewHolder  extends RecyclerView.ViewHolder{
        TextView deptName;
        TextView noOfStudents;

        public DepartmentViewHolder(View itemview){
            super(itemview);
            deptName = itemview.findViewById(R.id.dept_name);
            noOfStudents = itemview.findViewById(R.id.dept_student_count);
        }


    }
}
