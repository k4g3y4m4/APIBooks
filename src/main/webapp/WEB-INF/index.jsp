<%@ page import="com.codingodjo.demo2web.models.Book" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Books</title>
</head>
<body class="bg-dark">
<main>
    <div class="container py-5">
        <div class="card">
            <div class="card-header">
                <h3 class="text-center">All Books</h3>
            </div>
            <div class="card-body">
                <table class="table">
                    <thead class="thead-light">
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">Title</th>
                        <th scope="col">Author</th>
                        <th scope="col">Pages</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${books}" var="book">
                        <tr>
                            <td>${book.getId()}</td>
                            <td><a href="/books/${book.getId()}">${book.getTitle()}</a></td>
                            <td>${book.getAuthor()}</td>
                            <td>${book.getPages()}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>

    </div>
</main>
</body>
</html>

