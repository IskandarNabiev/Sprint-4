package ru.sber.functional

data class Student(
    val firstName: String,
    val lastName: String,
    val middleName: String = "Отчество не указано",
    val age: Int? = null,
    val averageRate: Double,
    val city: String = "Город отсутствует",
    val specialization: String = "Специализация отсутствует",
    val prevEducation: String? = "Образование отсутствует",
)
