import data.ExpenseManager
import data.ExpenseRepoImpl

class ExpenseRepoTest {

    private val expenseManager = ExpenseManager
    private val expenseRepo = ExpenseRepoImpl(expenseManager)


}