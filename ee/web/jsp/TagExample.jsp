<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" uri="/tld/MyTagDescriptor.tld" %>
<%@ taglib prefix="myTag" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tag:MyTag name="Jarik" >Hello from tag example<br/ >${one}<br/> 5-4=${tag:minus(5,4 )}
<tag:InnerTag></tag:InnerTag>
</tag:MyTag>
<myTag:MyJspTag name="Jarik">Hello from MyJSPTag  </myTag:MyJspTag>
</body>
</html>
