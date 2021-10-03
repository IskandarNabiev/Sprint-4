class ValidationException(val errorCode: Array<ErrorCode>) : RuntimeException(errorCode.joinToString(",") { it.msg })

enum class ErrorCode(val code: Int, val msg: String) {
    INVALID_CHARACTER(100, "Недопустимый символ"),
    EMPTY_LINE(101, "Пустая строка"),
    INVALID_LENGTH(102, "Недопустимая длина"),
    INVALID_FORMAT(103, "Недопустимый формат"),
}