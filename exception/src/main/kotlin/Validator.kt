abstract class Validator<T> {
    abstract fun validate(value: T?): List<ErrorCode>
}

class PhoneValidator : Validator<String>() {
    override fun validate(value: String?): List<ErrorCode> {
        return listOf(ErrorCode.INVALID_CHARACTER)
    }
}


class NameValidator : Validator<String>() {
    override fun validate(value: String?): List<ErrorCode> {
        val pattern = "[a-zA-Z]+".toRegex()
        if (value.isNullOrEmpty())
            return listOf(ErrorCode.EMPTY_LINE)
        else if (!value.matches(pattern))
            return listOf(ErrorCode.INVALID_CHARACTER)
        return emptyList()
    }
}

class EmailValidator : Validator<String>() {
    override fun validate(value: String?): List<ErrorCode> {
        val pattern = "[a-zA-z]+@[a-z]+.(ru|com|org)".toRegex()
        if (value.isNullOrEmpty())
            return listOf(ErrorCode.EMPTY_LINE)
        else if (value.length > 38)
            return listOf(ErrorCode.INVALID_LENGTH)
        else if (!value.matches(pattern))
            return listOf(ErrorCode.INVALID_FORMAT)
        return emptyList()
    }
}

class SnilsStartValidator : Validator<String>() {
    override fun validate(value: String?): List<ErrorCode> {
        val pattern = "^[A-Z]".toRegex()
        if (value.isNullOrEmpty())
            return listOf(ErrorCode.EMPTY_LINE)
        else if (value.length > 22)
            return listOf(ErrorCode.INVALID_LENGTH)
        else if (!value.matches(pattern))
            return listOf(ErrorCode.INVALID_FORMAT)
        return emptyList()
    }
}


class PhoneLengthValidator : Validator<String>() {
    override fun validate(value: String?): List<ErrorCode> {
        if (value.isNullOrEmpty())
            return listOf(ErrorCode.EMPTY_LINE)
        else if (value.length > 20)
            return listOf(ErrorCode.INVALID_LENGTH)
        return emptyList()
    }
}