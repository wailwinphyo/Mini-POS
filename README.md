# Mini POS

## Features
- User Account
- Stock handling
- Voucher
- Reports

## Configuration Steps

### Configuring DB
- Create pos_wlp schema in MySQL
- Restore db_backup.sql file from SQL folder
- DB connection string, username and password configuration can be edit in config.properties file in project directory

## Project User Guide
   Log in with default account [username-*admin*, password-*admin*]. **Sale voucher page** is set as home page. Adding item is implemented as real world logic as Barcode scanner can be used to read item code. However, in this project, add manually code and search item first to add into voucher and print voucher after created. Configuration is required before creating voucher. Configuration guide can be found in the following.

### System Preference Section
- **Adding and deleting cashier**
    - Configuring user is allowed for account type with **ROLE_ADMIN**
    - Adding cashier require username, password and usertype mandatory ( username must be unique )
- **Configuring items**
    - First need to configure category before item addition
    - Adding item require unique code for each item
- **Adding Stock**
    - Configure product before adding stock
    - Quantity must be greater than zero
    - Item price will be update each time stock is added

### Report Section
- **Stock Report**
    - All Items with existed stock transaction ( Newly created items with no stock transaction is not included )
- **Monthly Sale Report**
    - Total sale report for each month
    - Total price is calculated with sale price recorded in stock transaction
- **Sale Report**
    - Finding sale record by Date Interval for each cashier
    - Sale report for 2 Sep 2019, 3 Sep 2019 can be find using Start Date Thu 09/02/2019 and End Date Thu 09/03/2019

## Requirement Specification
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
