import java.time.temporal.TemporalAmount

fun main(args: Array<String>) {
    val account = Account("Allan", 100, "New")
    account.deposit(30)
    account.withdraw(20)
}

class Account(val name: String, val balance: Int, val transaction: String) {
    private var amount = 0
    fun deposit( amtDeposited: Int) {
        println("$transaction transaction was done on $name's account")
        if (amtDeposited > 0) {
            amount = amtDeposited + balance
        }
        println("Account balance = $amount")
    }

    fun withdraw(withdrawAmount: Int) {
        if (amount > 0 && withdrawAmount != 0) {
            amount -= withdrawAmount
            println("$withdrawAmount was withdrawn balance = $amount")
        }
    }
}