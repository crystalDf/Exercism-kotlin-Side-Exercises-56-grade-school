class School {

    private val students = sortedMapOf<Int, List<String>>()

    fun add(student: String, grade: Int) {
        students[grade] = grade(grade).plus(student).sorted()
    }

    fun grade(grade: Int): List<String> =
            students.getOrDefault(grade, emptyList())

    fun roster(): List<String> =
            students.values.flatten()
}
