# couchbase learning



#Case Study I. E-Commerce 

For this case study, imagine that you want to build dimestore, an online store. You use Couchbase Server to store a variety of data – everything from product details and customer information to purchase and review histories.
 
Now, let’s look at how N1QL can be used to solve some typical e-commerce scenarios. For this tutorial, our data is kept in 4 different buckets:
•	product This bucket contains a list of products to be sold, the categories to which they belong, price of each product, and other product info.
•	customers This bucket contains customer information such as the name, address, and the customers credit card details.
•	purchases This bucket contains a list of purchases made by a customer - each document contains a list of items purchased and the quantity of each item purchased.
•	reviews This bucket contains a list of reviews made by a customer or specific product. Each review is scored from 0 to 5.
There are 2 types of users of our application:
•	Shopper The shopper is the consumer and uses the application to buy products online.
•	Merchant An employee of dimestore.
Counting all the products
Don shops online at dimestore. When he visits the homepage, it displays a count of all the products.

Shopper - Browsing products from page to page
Don enjoys playing golf and he is looking for a driver that will bring a new swing to his game.
He selects the “golf” category and browses through the available golf gear. The webpage shows 10 items at a time, paging through the result set.
 
Get a list of all the golfing products limit by 10, and skip the first 10
Shopper - Listing product categories
Don also wants to buy a new cup for his everyday coffee.
He looks at the catalog of product categories to see if there is a category for cups.
 
Is there a “cup” category available? Run the query to see if there is one.
Shopper - Browsing and searching for a product
Because there is no category called “cup”, Don decides to search for product names that have the substring “cup”.
Did you know that ….
when researching branded products, 44% of online shoppers begin by performing a search?
Shopper - Listing products in a category
Don also wants to browse through some appliances. Maybe, a dishwasher to wash his cup. What do you think?
He clicks on the “Appliances” category on the site menu, and the website displays a list of appliances he can browse through.
Shopper - Finding the most popular products in a category
With so many appliances to choose from, Don wants to know the top 3 appliances so that he can easily pick which one to buy.
What are the top 3 highly rated appliances? Run the query to figure this out.
 
Previous Lesson
Lesson Index
Next Lesson
Shopper - Browsing products and sorting results
Don wants a list of new and popular items - i.e. items that are recently added to the product catalog and have many units sold.
 
How about sorting by price? Edit the query at the right to sort by unit price, lowest to highest.
Shopper - Shopping at a one-day sale
dimestore announces a one-day super sale, with deals for many products.
Are there any appliances on sale below $6.99?
 
Shopper - Listing the top 10 best selling products
Don wants to know what are the top 10 best selling products on the dimestore website.
Thanks to N1QL, we can now easily query the data in Couchbase to produce that list.
 
Shopper - Listing the highest rated products
There are so many choices when it comes to finding the right products, and sometimes it gets overwhelming. To get an un-biased view, why not use product ratings?
Don wants to know the top 5 highly rated products.
 
What you saw was just a handful of queries that were relevant to a shopper, but you can use N1QL for more advanced query scenarios in your applications. In the next few slides, we will go over queries from the merchant point of view.
Merchant - Preparing a purchase order
Merchants need to keep an eye on important customers, special promotions, popular products and ensure orders are processing as they should be. Let us cover some of these scenarios and learn how N1QL can be used to query relevant data in each case.
The dispatch team has been notified that an order has been placed and would like to review the purchase order.
 
Merchant - Finding the most valued shoppers
The marketing team at dimestore wants to e-mail special discount coupons to the top 10 loyal shoppers.
List the top 10 shoppers based on the total amount spent
 
Merchant - Reporting customers by region
dimestore wants to launch a regional marketing campaign and management wants a report of the number of customers per region grouped by postal code
 
Merchant - Reporting the active monthly customers
In the e-commerce world, purchases define user activity and growth. The dimestore sales team wants to know the number of unique customers that purchased something on the site in the last month. Dixon has been asked to produce a report.
He uses N1QL to query Couchbase and get the numbers he needs for his report.
 
How would you change this query to get a 7-day report or a 24-hr report?

Merchant - Identifying non-performing products
In order to maintain an assortment of products that reflect customer demand and inventory productivity, dimestore uses product reviews to get a list of low rated products to be removed.
Mary, a category manager at dimestore has asked Judy to come up with a list of products that have average review score less than 1.
Run the query to find out which products have an average rating below 1.
Merchant - Generating the month-over-month sales report
Sonia, the general manager of dimestore, has asked her sales staff to put together a month-over-month sales report.
 
Rudy runs the N1QL query to generate the data needed for his report. Try it out.
Merchant - Big ticket orders
Sonia now wants to find out which of the orders in the month of April exceeded the unit price of $500. The query on the right uses UNNEST and JOIN clauses to get the desired results.

