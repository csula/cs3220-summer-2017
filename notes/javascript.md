# JavaScript

## Agenda

### Lecture

* JavaScript Intro
* JavaScript syntax
* Callback/Promise
* ES6
* You may not need jQuery
* Common JavaScript Usage
	* Add event listener
	* Class toggle
* Component pattern

### Lab

* Behavior of restaurant application
	* Shopping cart
	* Table sorting

## JavaScript Intro

JavaScript ("JS" for short) is a dynamic type language that is commonly used in
the front end development world. JS is also being used as a backend choice 
nowadays due to the raise of [Node.js](https://nodejs.org/en/) community.

In this lecture, we will learn JS in the context of browser and not Node.js
development. In browser, you can use JS to do many different things. These
includes creating carousel, response to button click, changing layout. More
advance usage includes creating browser games, animated 2D and 3D graphics.

Many people start learning JavaScript by using one of the third party libraries
or start by using JavaScript API in browser. Since this lecture is supposed to
be introduction to JavaScript. We will not confuse you by starting using API
nor libraries but learning plain JavaScript.

In other word, we will start by learning JavaScript syntax, data structure &
common pattern like callback. After learning the basic, we will have a short
exercise to test your JavaScript knowledge before we move onto the EcmaScript 6
features (e.g. arrow function, Promise ... etc.).

### Hello world

JavaScript as one of the most common yet powerful language is probably easier
to learn by doing than all the theories around it. To run the hello world example,
Please open the [hello-world.html](../front/js/hello-world.html) to see how
to load external JavaScript and open Chrome debugger console to see the console
output.

You should be able to see something like screenshot below:

![JavaScript hello world example](imgs/js-intro-screenshot.png)

Please modify the `hello.js` content to be like below to see how to use Browser
API to change HTML content:

```js
document.querySelector('p')
	.textContent = 'Hello JavaScript from CS-3220';
```

You should notice the message changes from "Please check your console!" to
"Hello JavaScript from CS-3220".

So what happened?

We change the HTML content by first using [querySelector()](https://developer.mozilla.org/en-US/docs/Web/API/Document/querySelector) API to find out
the right HTML node.

> You should notice the querySelector API selector is very similar to CSS
selector we learned from last class.

After that, we change the [textContent](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent) of the HTML node.

## JavaScript Syntax

### Variables

JavaScript is a *dynamic type language*; thus, to declare a variable, you don't
have to declare the type of it and simply put "var" for declaring a variable.

```js
// in JavaScript empty value of a variable is "undefined"
var newVariable;
```

> Although semicolon is optional, I highly recommend you to put semicolon on the
end of every statement!

Now lets put some value in the variable!

```js
// to assign variable, it is the same statement as Java using "="
newVariable = 'Hello CS3220';

// you can also combine declaration with assignment together if you want!
var newVariable2 = 'Hello CS-3220';

// and then to retrieve variable simply call variable
newVariable;

// After you declare and assign variable, you can always assign the variable again
newVariable = 'Hello cs-3220 again';
```

Now we know how to declare and assign variable, lets learn the basic types in
JavaScript:

* String
* Number
* Boolean
* Array
* Object

```js
var stringVariable = 'This is a string';
var numberVariable = 123;
var booleanVariable = true;
var array = [ 1, 2, 3 ];
var jsObject = {
	name: 'value',
	number: 123,
	array: [1234, 5678]
};
// as well as everything is an object in JavaScript
var h1 = document.querySelector('h1'); // is also an object
```

### Operators

* Add/concatenation

```js
6 + 4;
'A string' + 'another string';
```

* subtract, multiply, divide

```js
3 - 2;
2 * 3;
4 / 2;
```

* Identity operator

```js
1 === 1;
```

* Negative, not equals

```js
var t = true;
f = !t;

f !== t; // true
```

### Conditions

```js
if (1 === 2) {
	console.log('What!?!?!?!?');
} else {
	console.log('1 is not equal to 2');
}
```

### Functions

To declare a function in JavaScript, you simply use `function` keyword:

```js
// to delcare a function
function aFunction () {
	console.log('Calling a function');
}

// or you can declare function in usual assignment way
var anotherFunction = function () {
	console.log('Calling another function');
}

// to call a function, simply call the function name with "()"
aFunction();
anotherFunction();

// function can have arguments
function multiply (a, b) {
	return a * b;
}

multiply(2, 3); // return 6
```

### Events

One of the most important aspect of the JavaScript is **events**. To add a click
listener, you will need a event. To add a submit listener, you will need a event.

Events are used for JavaScript to listen for certain things happening in browser.
The most obvious one is "click" event like below:


```html
<button id="click_me">button</button>
```

```js
document.querySelector('#click_me').onClick = function () {
	alert('Hello there');
};
document.querySelector('#click_me').addEventListener('click', function() {
	alert('Hello there again');
});
```

**Practice**

From here, lets do a practice on having a color square that changes its color
on click.

```html
<span class="rgb-square"></span>

<style>
	.rgb-square {
		background-color: #fff;
		width: 2em;
		height: 2em;
	}

	.rgb-square.--red {
		background-color: red;
	}
	.rgb-square.--blue {
		background-color: blue;
	}
	.rgb-square.--green {
		background-color: green;
	}
</style>
```

```js
var dom = document.querySelector('.rgb-square');

dom.addEventListener('click', function () {
	// fill in the logic to change color of the square
	// hint: you can use https://developer.mozilla.org/en-US/docs/Web/API/Element/classList to change color
});
```

**Practice #2**

Lets do another practice on getting inputs from the browser. Lets say we want to
play a guessing game!

```html
<p>Hi there, I want to play a guessing game with you! Please guess a number
between 1 and 10; and I will tell you if it is my number or not!</p>
<button id="guess">Guess a number</button>
```

```js
var node = document.querySelector('#guess').addEventListener('click', function() {
	var number = prompt('Guess a number!');
});
```

## Callback

## ES6 features

## You may not need jQuery

http://youmightnotneedjquery.com/

## Common JavaScript usage

### Add event listener

### Class toggle

## Component Pattern

## Resources

* https://www.youtube.com/watch?v=8aGhZQkoFbQ
* https://www.youtube.com/watch?v=fju9ii8YsGs
* https://developer.mozilla.org/en/docs/Web/JavaScript/EventLoop
