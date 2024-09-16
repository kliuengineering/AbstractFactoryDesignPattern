/**
 * VARIABLES
 *      name: string
 *      cash: float
 *      store: string
 *      cart: object of type ShoppingCart
 * 
 * METHODS:
 *      Customer constructor (args: string name, float cash)
 *          set customer name and cash
 *          store = null
 *          cart = null
 * 
 *      addStore (args: string name)
 *          store = name
 * 
 *      fillShoppingCart
 *          cart.start
 * 
 *      addCash (double amt)
 *          cash += amt
 * 
 *      spendCash (double amt)
 *          cash -= amt
 * 
 *      getCartTotal
 *          cart.getTotal()
 * 
 *      getCartTotalByCategory
 *          cart.getCostByCategory
 *              
 *      display
 *          print name, cash, getCartTotal, getCartTotalByCategory
 *              
 */