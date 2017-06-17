# Lab 2

## Deliverables

* Menu.html, checkout.html with cart component
* Statuses.html, checkout.html with table component
* app.js

## Description

![Lab 2 architecture](../imgs/lab2-architecture.png)

Using the component pattern learned in the lecture earlier, your job is
to implement shopping cart as well as the data table functionalities.

With shopping cart and data table added to our restaurant application, it should
have some basic e-commerce functionalities -- allowing our customer to order
food!

## Requirements

Functional requirements wise, you will need to implement an app.js with following code:

This is your entry point and the core "controller" that glue everything together.

Starting point can be found below:

```js
const CART_KEY = 'CART';
const QUEUE_KEY = 'QUEUE';
const FOODS_KEY = 'FOODS';

class Store {
    constructor (storage) {
        this.storage = storage; // assuming local storage will be passed in as storage
    }

    // you can get item by store.cartItems
    get cartItems () {
        return this.storage.getItem('CART'); // for example
    }

    // to call setter, simply "assign" like store.cartItems = something
    set cartItems (cartItems) {

    }

    get queue () {

    }

    set queue (queue) {

    }

    get foods () {

    }

    set foods (foods) {

    }
}

class Cart {
    // take dom element into JavaScript class to attachment events
    constructor(root, store) {
        this.root = root;
        this.store = store;
        init();
    }

    init () {
        // Render a list of items under root element
        render();
        // TODO: attach all necessary events
    }

    destroy () {
        // TODO: remove all the events attached from init
    }

    // add an item to shopp cart
    addItem (item) {
        // TODO: logic to add item to cart
        render();
    }

    // remove an item from shopping cart
    removeItem (item) {
        // TODO: logic to remove item from cart
        render();
    }

    // render a list of item under root element
    render () {
    }
}

class DataTable {
    // take dom element into JavaScript class to attachment events
    constructor(root, store) {
        this.root = root;
        this.store = store;
        init();
    }

    init () {
        // attach all necessary events
        render();
    }

    destroy () {
        // remove all the events attached from init
    }

    sort (columnName) {
        render();
    }

    // render rows of items under table using root.innerHTML
    render () {

    }
}

// DOMContentLoaded event will allow us to run the following function when
// everything is ready. Think of the following code will only be executed by
// the end of document
document.addEventListener('DOMContentLoaded', () => {
    // use querySelector to find the table element (preferably by id selector)
    let table = document.querySelector('');
    // use querySelector to find the cart element (preferably by id selector)
    let cart = document.querySelector('');

    let store = new Store(window.localStorage);
    if (table) {
        new Table(table, store);
    }
    if (cart) {
        let cartComponent = new Table(cart, store);
    }
});
```

## Instructions

Please be familiar with component pattern before start coding. If you don't
understand the component pattern. Please raise your hand and ask. I'm happy
to explain!

### Store

Please be familiar with localStorage (key value store)

### Shopping cart

For shopping cart, your responsibility is to implement a few functions
with browser storage (sessionStorage) so that you can carry over the
data between different pages.

First function being adding item to cart. In this function, you need to
allow the JavaScript function to add item to the shopping cart. One business
logic I want you to add here is -- identify same item added to cart and
group them by quantity. This implies, if I add item "Hamburger" twice,
I should see in "Hamburger" of quantity 2 instead of 2 Hamburger.

Second function in the cart is to remove an item from cart.
Use case is in checkout page, user may remove item before making purchase.

Third function is to render this list of items using JavaScript under root DOM
node. Going back to the example at the lecture of JavaScript, you can use
`innerHTML` to render under the DOM node. This function then will take a list
of purchased item and render them under the table.

### Data table

In data table, you only need to perform one core function, sorting. It's 
important to know how to sort in JavaScript array!

### App.js

You will need to provide the correct querySelector to app.js to feed the right
DOM element into Table and Cart component.
