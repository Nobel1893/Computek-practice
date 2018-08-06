package fistapplication.cls.com.routesurvey.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import fistapplication.cls.com.routesurvey.Model.Course;
import fistapplication.cls.com.routesurvey.R;

/**
 * Created by CLS on 7/30/2018.
 */

public class CoursesListAdapter extends RecyclerView.Adapter<CoursesListAdapter.ViewHolder>{

    ArrayList<Course> AllCourse;

    public CoursesListAdapter (ArrayList<Course> AllCourses){
        AllCourse=AllCourses;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_course,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Course c=AllCourse.get(position);

        holder.CourseName.setText(c.getCourseName());
        holder.instructor_name.setText(c.getCourseInstructor());
        holder.date.setText(c.getDate());

    }

    @Override
    public int getItemCount() {
        return AllCourse.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public  final TextView CourseName;
        public  final TextView instructor_name;
        public  final TextView date;
        public ViewHolder(View view){
            super(view);
            CourseName =view.findViewById(R.id.course_name);
            instructor_name=view.findViewById(R.id.instructor_name);
            date= view.findViewById(R.id.date);

        }

    }
}
