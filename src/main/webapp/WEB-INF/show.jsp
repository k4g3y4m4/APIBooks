<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Show Book</title>
</head>
<body class="bg-dark">
    <main>
        <div class="container py-5">
            <div class="card">
                <div class="card-header">
                    <h3>Book Details</h3>
                </div>
                <div class="card-body">
                    <h6>Title: <c:out value= "${book.getTitle()}"></c:out></h6>
                    <h6>Author: <c:out value="${book.getAuthor()}"></c:out></h6>
                    <h6>Number of pages: <c:out value="${book.getPages()}"></c:out></h6>
                </div>
            </div>
        </div>
    </main>
</body>
</html>

