# Lab 2

## Deliverables

* Menu.html, checkout.html with cart & checkout component [3 pts]
* Statuses.html, checkout.html with table component [2 pts]
* app.js

## Description

![Lab 2 architecture](../imgs/lab2-architecture.png)

Using the component pattern learned in the lecture earlier, your job is
to implement shopping cart as well as the data table functionalities.

With shopping cart and data table added to our restaurant application, it should
have some basic e-commerce functionalities -- allowing our customer to order
food!

Visual representation can be found below:

![table visual attached](../imgs/lab2-table.png)
![checkout visual attached](../imgs/lab2-checkout.png)
![cart visual attached](../imgs/lab2-cart.png)

## Requirements

Functional requirements wise, you will need to implement an app.js starting 
with following code:

> Many instructions is included below in the comment, please read them wisely

```js
// single state store
class Store {
    // these are the key name you can use in Store
    const CART_KEY = 'CART';
    const QUEUE_KEY = 'QUEUE';
    const FOODS_KEY = 'FOODS';

    constructor (storage) {
        this.storage = storage; // assuming local storage will be passed in as storage
    }

    // you can get item by store.cartItems
    get cartItems () {
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

    // remove an item from shopping cart
    removeItem (item) {
        // TODO: logic to remove an item from cart
        // call render method when the item is removed to update view
        render();
    }

    placeOrder () {
        // add item to statuses in store as status "in progress"
    }

    // render a list of item under root element
    render () {
    }
}

class CheckoutButton {
    constructor(root, store) {
        this.root = root;
        this.store = store;
        this.init();
    }

    init () {

    }

    destroy () {

    }

    addItemToCart () {
        // hint: you can use `dataset` to access data attributes
        // See passing data from HTML to JavaScript from course note
    }
}

class StatusTable {
    // take dom element into JavaScript class to attachment events
    constructor(root, store) {
        this.root = root;
        this.store = store;
        init();
    }

    init () {
        // attach click event listener to table header row on each column
        render();
    }

    destroy () {
        // remove all the events attached from init
    }

    sort (columnName) {
        // after sorting the array of statuses, re render item to update view
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
    let statusTable = document.querySelector('');
    // use querySelector to find the cart element (preferably by id selector)
    let cart = document.querySelector('');
    let checkoutButtons = document.querySelectorAll('');

    let store = new Store(window.localStorage);
    if (table) {
        new StatusTable(table, store);
    }
    if (cart) {
        new Cart(cart, store);
    }
    if (checkoutButtons && checkoutButtons.length) {
        new CheckoutButton(checkoutButtons, store);
    }
});
```


