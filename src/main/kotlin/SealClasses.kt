fun main(args: Array<String>) {

    val success = Result.Success("SUCCESS!")
    val progress = Result.Progress("Progress")

    getData(progress)
    getData(success)
}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
    }
}

sealed class Result(private val message: String) {
    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError( exception: Exception, message: String ) : Error(message)
        class NonRecoverableError(exception: Exception, message: String) : Error(message)
    }
    class Progress(message: String) : Result(message)
}