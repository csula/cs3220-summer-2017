# Java Servlet & Tomcat

## Agenda

### Lecture

* Java review
* Servlet
* Client/server
* Request/Response

### Lab

* Java environment setup
* Tomcat server setup
* Forms
* Implement basic server behavior

### Java Web Application Components

* Compiled Java Classes (.class files)
* Additional Java Libraries (.jar files)
* JavaServer Pages (JSPs)
* Static resources
	* HTML, CSS, images, JavaScripts ... etc.
* Meta data files
	* web.xml

Files structures on CS3 Server

```
/                        --> www folder
index.jsp                --> JSPs and static assets
other.jsp
WEB-INF/
  web.xml
  classes/               --> Compiled Java classes
  lib/                   --> Additional Java libraries
```

### Servlet Hello World

```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}
```

* Inherits from [HttpServlet](http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html)
* doGet()
	* Input: HttpServletRequest
	* Output: HttpServletResponse => sent back to browser

### Output HTML from Hello World Servlet

* Set content type to "text/html"
	* setContentType(String type)
* Generate an HTML page
	* getWriter().println(String output)

### Servlet mapping (routing)

```
@WebServlet(<URL Pattern(s)>)
```

### Java Annotations

Annotations is about a program that is not part of program itself and can be used
by compiler, VM and other software tools for various purposes

Examples:

```java
// for error detection
@Override
protected void doGet() {} 

// Suppress warning
@SuppressWarnings("unchecked")
public List<User> getAllUsers() {
	return (List<User>) new ArrayList();
}

// Servlet mapping
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet { }
```

### WebServlet elements for URL patterns

* value of the WebServlet annotation is the URL patterns of the Servlet

```java
@WebServlet("/HelloServlet")

@WebServlet({"/HelloServlet", "/members/*"}

@WebServlet( name="Hello", urlPatterns={"/HelloServlet", "/*.html"} )

@WebServlet(
	urlPatterns="/MyPattern",
	initParams={@WebInitParam(name="ccc", value="333")}
)
```

Notice that you can use wild card `*` in the Servlet mapping. e.g.

```
/*
/content/*
*.html
```

> Please be careful with the URL patterns because you might have conflicting patterns

### Servlet Life Cycle


* When servlet is loaded -- `init()`
	* Executed only once
	* Don't forget to call `super.init(config)`
* Per request - `service()`
	* Dispatch to `doXxx()` e.g. `doGet()`
When servlet is unloaded -- `destroy()`

**Why use `init()` instread of constructor

https://csns.calstatela.edu/wiki/content/cysun/notes/servlet_data_init

Also, ServletContext cannot be access in constructor

### Servlet example - SharedRequestCounter

```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}
```

### Application Scope

* A "storage area" where data can be stored and accessed
* Data in application scope will remain there as long as application is running
* Data in application scope is shared by all servlets

To access application scope:

* HttpServlet - `getServletContext()`
* HttpServletContext
	* setAttribute(String name, Object value)
	* getAttribute(String name)

### loadOnStartup

By default, a servlet is not created until it is accessed for the first time 
(lazy loading)
	* Could cause problem if one servlet must be run before another servlet

By using `loadOnStartup` element of `@WebServlet` to have servlet created during
application startup

```java
@WevServlet(
	name="Hello",
	urlPatterns={"/HelloServlet", "/*.html"},
	loadOnStartup=1
)
```

### web.xml

Web application deployment descriptor. In example:

```xml
<web-app>
	version
</web-app>
```

### Debugging Servlets

* 404 errors: check URL and URL mapping
* Display problem: check the source of generated HTML
* Logical errors: Use debugger to set break points
