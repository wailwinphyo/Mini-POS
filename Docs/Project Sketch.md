# Project sketch

## Tables

1. users
2. user_types <-[rename]- usertypes
3. items <-[rename]- products
4. categories
5. stock_transactions
    - Columns
        - id
        - quantity ( positive value for added stock and negative value for purchased stock )
        - price
        - item_id
        - transaction_date

## Reports
1. Report to check item and their quantity in stock [ Stock report ] 
    - sum all quantity by item_id in stock_transactions table -> remaining stock
2. Sale report by Cashier by Date interval
3. Monthly total sale report for a shop


## Progress

- [x] User registration with user type, Cashier, System Admin.

- [x] User login.

- [x] Item Category setup, For example, food, drink, medicine etc.
    - [x] db query
    - [x] GUI

- [x] Item registration with item category, unit price.
    - [x] DB query
    - [x] GUI

- [x] Stock handling.

- [x] Sale process by Cashier.
        - [x] Each sale voucher much contains item code, item name, quantity, price and date.
        - [x] At the end of the voucher, total for all item must be included.

- [x] Stock refill. (Will refill stock based on the purchase of item) 
        - [x] Need to keep track which items are purchased and refill and their quantity.
        - [x] After refilled, item quantity will be update.

- [x] Report to check item and their quantity in stock.

- [x] Sale report by Cashier by Date interval, for example How many item are sold and their total price amount within Jan 1 and Feb 2.

- [x] Monthly total sale report for a shop.
