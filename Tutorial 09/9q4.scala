object Bank {
  def negativeBalanceAccounts(accounts: List[Account]): List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def calculateTotalBalance(accounts: List[Account]): Double = {
    accounts.map(account => account.getBalance).sum
  }

  def applyInterestToAccounts(accounts: List[Account]): Unit = {
    accounts.foreach(account => account.applyInterest())
  }
}

class Account(initialBalance: Double)
{
  private var balance: Double = initialBalance

  def getBalance: Double = balance

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
  }

  def applyInterest(): Unit = {
    val interestRate = if (balance > 0) 0.05 else 0.1
    balance += balance * interestRate
  }
}



object q4
{
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(-500.0)
    val account3 = new Account(2000.0)

    val accounts = List(account1, account2, account3)

    println("List of Accounts with negative balances:")
    val negativeBalances = Bank.negativeBalanceAccounts(accounts)
    negativeBalances.foreach(account => println(s"Account Balance: "+account.getBalance))

    val totalBalance = Bank.calculateTotalBalance(accounts)
    println(s"Total balance of all accounts: "+totalBalance)

    Bank.applyInterestToAccounts(accounts)
    println("Final balances of all accounts after applying interest:")
    accounts.foreach(account => println(s"Account Balance: "+account.getBalance))
  }
}