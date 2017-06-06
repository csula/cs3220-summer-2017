# HTML & CSS

## Agenda

### Lecture

* Intro to HTML
	* Semantic HTML
	* Document and website structure
* Chrome debugging
* Intro to CSS
	* CSS Selector
	* CSS Syntax
* DOM
* Responsive design
* CSS Frameworks
* CSS Mythology

### Lab

* Create restaurant application pages
	* Index
		* Header
		* Navigation
		* Footer
	* Order status
	* Food menu
	* Recipes
	* Order

## Intro to HTML

HTML is not a programming language, it's a mark up language.

> At its heart, HTML is a fairly simple language made up of elements, which can be applied to pieces of text to give them different meaning in a document (is it a paragraph? is it a bulleted list? is it part of a table?), structure a document into logical sections (does it have a header? three columns of content? a navigation menu?) and embed content such as images and videos into a page. This module will introduce the first two of these, and introduce fundamental concepts and syntax you need to know to understand HTML.

Reference: https://developer.mozilla.org/en-US/docs/Learn/HTML/Introduction_to_HTML

### Syntax

* Open tag
* Close tag (sometimes tag are self closing)
* Content
* Can be nested
* [Optional] Attributes

```html
<p>This is a paragraph<p/>
<!--
<p> is the open tag
"This is a paragraph" is the content
</p> is the close tag
-->
```

```html
<article>
	<h2>Article title</h2>
	<p>Article content</p>
</article>
```

All above combine to establish an **element**.

### Block vs Inline elements

```html
<em>Inline element</em>
<em>Inline element</em>
<em>Inline element</em>

<p>Block element</p>
<p>Block element</p>
<p>Block element</p>
```

### Attributes

```html
<a href="https://google.com" title="Google">link to Google</a>
```

#### Boolean attribute

```html
<button disabled="true">Disabled button</button>

<button disabled>Disabled button</button>
```

### Side notes to HTML

**Spaces** in HTML

```html
<p>Cats are grumpy</p>

<!-- above is the same as below -->

<p>Cats                           are
grumpy</p>
```

No matter how many spaces you put between words, HTML will always trim it down to
one space.

> If you insist to put more spaces, you may put `&nbsp;` as literal space

**HTML Special Characters**

What if you want to put some special characters in HTML like `<`, `>`?

| Character | Reference |
| --- | --- |
| < | `&lt;` |
| > | `&gt;` |
| " | `&quot;` |
| ' | `&apos;` |
| & | `&amp;` |

### HEAD element

Head section is usually not displayed to end user but to mostly hold meta 
information and define assets.

In example:

```html
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- custom icon -->
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
	<!-- character encoding -->
	<meta charset="UTF-8">
	<title>Title</title>

	<style>
		.internal-style {

		}
	</style>
	<link rel="stylesheet" href="app.css">
	<script src="webcomponents.js"></script>
</head>
</html>
```

What should go under html head section?

See https://github.com/joshbuchea/HEAD for more detail.

For search engine and 3rd party parsing:

* http://ogp.me/

### Text fundamental

#### Headings

h1, h2, h3, h4, h5, h6

#### Paragraph

`<p>`

#### Lists

* Ordered list `<ol>`
* Unordered list `<ul>`
* List item `<li>`

Example:

```html
<ol>
	<li>one</li>
	<li>two</li>
	<li>three</li>
</ol>

<ul>
	<li>item</li>
	<li>item</li>
	<li>item</li>
</ul>
```

#### Emphasize & important

`<em>` vs `<strong>`

#### Italic, bold, underline

`<i>`, `<b>` and `<u>`

### Hyperlink

```html
<a href="https://google.com">google.com</a>
```

#### Absolute path vs relative path

#### Exercise: Navigation menu

#### Email link

```html
<a href="mailto:someone@domain.com">Mail to someone</a>
```

### Advance text formatting

* Blockquote
* Inline quote

### Semantic HTML

https://codepen.io/mi-lee/post/an-overview-of-html5-semantics

### Document & website structure

* Header
* Navigation
* Main content
* Side bar
* Footer

## Debugging

Chrome screenshots


## CSS Intro

### How does CSS works?

![CSS internal](imgs/how-css-works.svg)

### Load CSS

* External
* Internal
* Inline

### Syntax

```css
h1 { // selector
// start of block
	// property: value;
	font-size: 24px;
// end of block
}
```

* `property: value;`
* Comments

### Selectors

* Id
* Class
* Tag
* Value attribute
* Pseudo-elements
* Combinators
* Multiple selectors

### Values

* Percentage
* Pixels
* Ems
* Color
	* RGB
	* Hex
	* RGBA

### Cascade and inheritance

### CSS Specificity

https://www.smashingmagazine.com/2007/07/css-specificity-things-you-should-know/

### Box model

* Padding
* Border
* Margin

### Fonts

* Google font
* Em as unit

### CSS Layout

* Float
* Positioning
* Flexbox


## Response design

Use `em` over `px` as unit

https://css-tricks.com/why-ems/

## CSS Framework

* https://semantic-ui.com/
* http://getbootstrap.com/
* https://material.io/components/web/

## CSS Mythology

* BEM
