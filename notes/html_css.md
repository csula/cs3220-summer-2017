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

### Lab

* User interface design

## Intro to HTML

Not a programming language, it's a mark up language.

### Syntax

* Open tag
* Close tag (sometimes tag are self closing)
* Content
* Can be nested

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

### HEAD element

* https://github.com/joshbuchea/HEAD
* http://ogp.me/
* CSS

### Text fundamental

* Headings
* Paragraph
* Lists
* Emphasize & important
* Italic, bold, underline

### Hyperlink

```html
<a href="google.com">google.com</a>
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


