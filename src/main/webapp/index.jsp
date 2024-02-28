<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
  </head>
  <body>

    <!--Outer container-->
    <div class="container">

        <!--Header row-->
        <header class="row bg-light border">

            <div class="col-sm">
                <img id="careerImg" src="${pageContext.request.contextPath}/img/career-services.jpg" alt="">
            </div>
            
            <div class="col-sm-9 p-5">
                <h1>Welcome to our Career Fair!</h1>
            </div>

        </header>

        <!--Main row-->
        <main class="row mt-3 text-center">
            <button id="regBtn" type="button" class="btn btn-primary">Register</button>
        </main>

        <!--Footer row-->
        <footer class="row mt-3 text-center">
            <span>Career Fair 2024</span>
        </footer>

    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/js/button-actions.js"></script>
  </body>
</html>
