import model.Expense
import model.ExpenseCategory
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class ExampleTest {

    @Test
    fun sum_must_success() {
        // Given: dado cierto valor, objeto, variable
        val x = 5
        val y  = 10

        // When: cuando realizamos cierta tarea, cierta accion
        val result = x + y

        // Then: quiero obtener un resultado
        assertEquals(15, result)
    }

    @Test
    fun sum_must_fail() {
        // Given: dado cierto valor, objeto, variable
        val x = 5
        val y  = 10

        // When: cuando realizamos cierta tarea, cierta accion
        val result = x + y

        // Then: quiero obtener un resultado
        assertNotEquals(10, result)
    }

    @Test
    fun expense_model_list_test() {
        // Given
        val expenseList = mutableListOf<Expense>()
        val expense = Expense(id = 1, amount = 100.0, category = ExpenseCategory.TRANSPORTE, description = "Combustible")

        // When
        expenseList.add(expense)

        // Then
        assertContains(expenseList, expense)
    }

    @Test
    fun expense_model_param_test_success() {
        // Given
        val expenseList = mutableListOf<Expense>()
        val expense = Expense(id = 1, amount = 100.0, category = ExpenseCategory.TRANSPORTE, description = "Combustible")
        val expense2 = Expense(id = 2, amount = 80.0, category = ExpenseCategory.TRANSPORTE, description = "Manteniemiento")

        // When
        expenseList.add(expense)
        expenseList.add(expense2)

        // Then
        assertEquals(expense.category, expense2.category)
        assertEquals(expenseList[0].category, expenseList[1].category)
    }

    @Test
    fun expense_model_param_test_fail() {
        // Given
        val expenseList = mutableListOf<Expense>()
        val expense = Expense(id = 1, amount = 100.0, category = ExpenseCategory.TRANSPORTE, description = "Combustible")
        val expense2 = Expense(id = 2, amount = 80.0, category = ExpenseCategory.CASA, description = "Limpieza")

        // When
        expenseList.add(expense)
        expenseList.add(expense2)

        // Then
        assertNotEquals(expenseList[0].category, expenseList[1].category)
    }
}