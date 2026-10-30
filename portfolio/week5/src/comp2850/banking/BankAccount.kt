// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking


const val MAX_OVERDRAFT = 100
abstract class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance = 0
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    abstract fun withdraw(amount: Int) //overide later
}


class StudentAccount(holder: String) : BankAccount(holder) {
    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0 "}

        if (balance - amount >= -overdraft) {
            balance -= amount
        } else {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
    }

    fun withdrawalsAllowed(): Boolean {
        return balance + overdraft > 0 // not >= to zero cus 0 left to withdraw
    }

    var overdraft: Int = 0
        set(value) {
            require(value >= 0 && value <= 100) { "overdraft must be between 0 to 100" }
            field = value

        }

    override fun toString(): String { // Account for Sarah, balance = 120 (overdraft = 50)
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"

    }
}