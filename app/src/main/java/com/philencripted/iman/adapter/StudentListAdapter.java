package com.philencripted.iman.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.philencripted.iman.R;
import com.philencripted.iman.model.Student;



import java.util.ArrayList;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.StudentViewHolder> {

    private Context context;
    private ArrayList<Student> studentArrayList;

    public StudentListAdapter(Context context, ArrayList<Student> students){
        this.context = context;
        this.studentArrayList = students;
    }


    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_info_list_item,parent, false);
        return new StudentViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = studentArrayList.get(position);
        holder.nameOfStudent.setText(student.getFullName());
        holder.ageOfStudent.setText(student.getAge()+"");
        holder.regNo.setText(student.getRegNo());
        holder.phoneNo.setText(student.getPhoneNo());

    }

    @Override
    public int getItemCount() {

        if(studentArrayList != null){
            return  studentArrayList.size();
        }else {
            return 0;
        }

    }

    // inner class viewholder
    public class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView nameOfStudent;
        TextView ageOfStudent;
        TextView regNo;
        TextView phoneNo;

        public StudentViewHolder(View itemview){
            super(itemview);
            nameOfStudent = itemview.findViewById(R.id.student_name);
            ageOfStudent = itemview.findViewById(R.id.student_age);
            regNo = itemview.findViewById(R.id.student_reg_no);
            phoneNo  = itemview.findViewById(R.id.student_phone_no);

        }
    }
}
