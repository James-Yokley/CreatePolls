<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Poll</title>
</head>
<body>
<p><a href="ListPolls">Back to polls</a>
<p>${poll.question}</p>
<c:forEach items="${poll.answers}" var="answer">
	<div>
	${answer}
	</div>
</c:forEach>
<form method="post">
	<input type="text" name="answer"><button>Add</button>
</form>

</body>
</html>