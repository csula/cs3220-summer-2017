# Homework 3

## Deliverables

* Deploy to CS3 server
* index.jsp (menu)
* order.jsp
* statuses.jsp
* admin/inventory.jsp
* admin/create-food.jsp
* admin/order-statuses.jsp
* app.css

## Description

Your job here is to continue refactoring the existing application using JSP/JSTL.
By now, you should have most of the application written in Java Servlet with
rendering the HTML output in the `out.println`. In specific, you will need to
separate out the presentation concern into using JSP & JSTL.

There are a couple pages we have been working through so far:

* index.jsp (which is the same as food menu.jsp)
* order.jsp
* statuses.jsp
* admin/inventory.jsp
* admin/create-food.jsp

If you don't remember the mockup, this may be a refresher:

![Restaurant Sitemap](img/restaurant-sitemap.png)
![Restaurant menu](img/restaurant-menu.png)
![Restaurant order](img/restaurant-checkout.png)
![Restaurant statuses](img/restaurant-statuses.png)
![Restaurant inventory](img/restaurant-inventory.png)
![Restaurant create food form](img/restaurant-new-food.png)
![Restaurant inventory](img/restaurant-admin-statuses.png)

## Requirements

* Functional requirements stays the same from before:
	* Customer should be able to go to menu and start ordering foods
	* Customer should be able to go to order to finish his/her order
	* Customer should be able to go to statuses to see up to date statuses
	* Admin should be able to create new food from the create food form
	* Admin should be able to see its food inventory from the inventory page
	* Admin should be able to adjust the order statuses from the order-statuses
* Technical requirements:
	* All presentation logic should be done in JSP.
	* No processing is allowed in JSP
	* Request should be sent to controller and not to JSP directly
	* Servlets should not generate HTML output

