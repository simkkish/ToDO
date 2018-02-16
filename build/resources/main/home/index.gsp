<Html xmlns="http://www.w3.org/1999/html">
<head>
    <title>
        Home Page
    </title>
</head>

<body>
<g:form controller="home" action="save">
    <g:textField name="content"/>
    <button type="submit">Submit info</button>
</g:form>
<table class="table-row-cell">
    <tr>
        <th>Content</th>
        <th>Attr</th>
    </tr>
    <g:each var="b" in="${todoList}">

    <tr>
        <td>${b.content}</td>
        <td>${b.completed}</td>
    </tr>
    </br>
    </g:each>
</table>
</body>
</Html>