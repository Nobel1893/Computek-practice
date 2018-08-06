package fistapplication.cls.com.routesurvey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import fistapplication.cls.com.routesurvey.Adapter.CoursesListAdapter;
import fistapplication.cls.com.routesurvey.Model.Course;

public class CoursesList extends AppCompatActivity {

    RecyclerView CoursesList;
    CoursesListAdapter adapter;
    ArrayList<Course>courses;
    LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CoursesList= findViewById(R.id.coursesList);
        courses=new ArrayList<>();
        courses.add(new Course("Android","Mohamed Nabil","1/8/2020"));
        courses.add(new Course("IOS","Sleem","1/8/2019"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));
        courses.add(new Course("IOS-Android","sayed","1/8/202017"));

        layoutManager=new LinearLayoutManager(this);
        adapter=new CoursesListAdapter(courses);

        CoursesList.setAdapter(adapter);
        CoursesList.setLayoutManager(layoutManager);
    }

}
