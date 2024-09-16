/**
 * VARIABLES
 *      customers: list of type Customer
 *      name of the Retail Store
 *      total: float
 *      prodCategoryRevenue: Map <string, float>
 * METHODS:
 *      RetailStore constructor (args: string name)
 *          sets the name of the store
 *          set the product categories and float amounts to 0
 * 
 *      addCustomer (args: string name)
 *          customer.push (name)
 * 
 *      avgSpend
 *          return totalrevenue()/customers.length
 * 
 *      totalRevenue
 *          for customer in customers:
 *              total += customer.getTotal()
 * 
 *      revenueByCategory
 *          for each customer in customers
 *              x = customer.getCartTotalByCategory //this function returns a map <category, amtSpent>
 *              for key entry in x:
 *                  if key doesnt exist in prodCategories
 *                      add the key and value
 *                  else
 *                      add the value to prodCategories[key]
 *              
 * 
 *      startShopping
 *          for customer in customers
 *              customer.fillShoppingCart()
 *              customer.display()
 *          display()
 *              
 *      display
 *          print avgSpend(), totalRevenue(), productCategoryRevenue
 *              
 */
