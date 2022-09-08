package com.example.mydaggerhilt

class CourseRepositoryImpl:CourseRepository {

    override fun getCourse() = listOf(
        Course("https://1000logos.net/wp-content/uploads/2020/09/Java-Logo-500x313.png","JAVA"),
        Course("https://seeklogo.com/images/K/kotlin-logo-30C1970B05-seeklogo.com.png","Kotlin"),
        Course("https://upload.wikimedia.org/wikipedia/commons/0/0e/Microsoft_.NET_logo.png?20200524033331",".NET"),)

}