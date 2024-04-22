fun main(args: Array<String>) {

    val account = Account("Allan")
    account.deposit(2000)
    account.deposit(-500)
    account.withdraw(200)
    account.withdraw(-200)
    account.calculateBalance()
    println(account.balance)
    println(account.transactions)
}

class Account(val accountName: String, var balance: Int = 0) {
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount was deposited. Balance = ${this.balance} now")
        } else {
            println("Cannot deposit negative sum-d")
        }
    }
    fun withdraw (withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal was withdrawn. Balance = ${this.balance}")
        } else {
            println("Cannot withdraw negative sum")
        }
    }
    fun calculateBalance () : Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
            println("The balance is ${this.balance}")
        }
        return balance
    }
}