import data.ExpenseManager
import data.ExpenseRepoImpl
import model.Expense
import kotlin.test.Test
import kotlin.test.assertTrue

class ExpenseRepoTest {

    private val expenseManager = ExpenseManager
    private val expenseRepo = ExpenseRepoImpl(expenseManager)

    @Test
    fun expense_list_is_not_empty() {
        //GIVEN
        val expenseList = mutableListOf<Expense>()

        //WHEN
        expenseList.addAll(expenseRepo.getAllExpenses())

        //THEN
        assertTrue(expenseList.isNotEmpty())
    }
}