package objects

class BankAccount {
    private var _balance: Double = 0.0

    var balance: Double
        get() = _balance // Public getter
        set(value) {
            if (value >= 0) {
                _balance = value // Only allow non-negative balance
            } else {
                println("Balance cannot be negative!")
            }
        }
}

fun main() {
    val account = BankAccount()
    account.balance = 100.0
    println("Balance: ${account.balance}")
    account.balance = -50.0
    println("Balance: ${account.balance}")
}
