package ru.sber.functional

class StudentsGroup {

    private var students: List<Student> = listOf(
        Student(firstName = "Макс", lastName = "Максимов", averageRate = 80.0),
        Student(firstName = "Павел",lastName = "Дронов",averageRate = 60.0),
        Student(firstName = "Иван",lastName = "Шеглов",averageRate = 70.0, age = 28)
    )

    fun filterByPredicate(predicate: (Student) -> Boolean): List<Student> {
        return students.filter { it -> predicate(it) }
    }

}

fun main() {
    val studentsGroup = StudentsGroup().filterByPredicate { it.averageRate > 65 }
    studentsGroup.forEach { println(it) }
}
