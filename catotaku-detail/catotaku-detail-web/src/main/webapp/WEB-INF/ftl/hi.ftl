<pre class="java" name="code"><!DOCTYPE html><html>
<head>
    <meta charset="UTF-8">
    <title>test</title>
</head>
<body>
    <h1>${item.name}</h1>
    <#list item.specification as specification>
        ${specification.name}----${specification.explain}
    </#list>
<br/>
${indexPath}
</body>


</html>

</pre>