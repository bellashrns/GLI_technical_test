package com.bella.gli_technical_test

import StudentAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val recyclerView: RecyclerView = findViewById(R.id.studentRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val students = generateStudentData() // Placeholder function to generate student data
        val adapter = StudentAdapter(students)
        recyclerView.adapter = adapter
    }

    private fun generateStudentData(): List<Student> {
        // Generating placeholder student data
        val studentList = mutableListOf<Student>()
        for (i in 1..10) {
            val student = Student("Student $i", R.drawable.kuromi, "Address $i")
            studentList.add(student)
        }
        return studentList
    }
}

data class Student(val name: String, val profilePictureResourceId: Int, val address: String)
