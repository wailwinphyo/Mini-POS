# Point of sale Project Specification

## Specification
1. User registration with user type, Cashier, System Admin.
2. User login.
3. Item Category setup, For example, food, drink, medicine etc.
4. Item registration with item category, unit price.
5. Stock handling.
6. Sale process by Cashier.
    - Each sale voucher much contains item code, item name, quantity, price and date.
    - At the end of the voucher, total for all item must be included.
7. Stock refill. (Will refill stock based on the purchase of item) Need to keep track which items are purchased and refill and their quantity. After refill, item quantity will be update.
8. Report to check item and their quantity in stock.
9. Sale report by Cashier by Date interval, for example How many item are sold and their total price amount within Jan 1 and Feb 2.

10. Monthly total sale report for a shop.

## Coding Spec
Code should be separated into 3 layer , UI, business and DAO.
Sample layering can be checked in SwingJDBC project in GitHub.

