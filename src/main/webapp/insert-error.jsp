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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/secondary.css">
  </head>
  <body>
    <div class="container border">

      <!--Header row-->
      <header class="row text-center bg-light">
        <h1>Error!</h1>
      </header>

      <!--Main row-->
      <main class="row mt-5">
        <div class="img-wrapper col-sm-2 ms-5">
          <img src="${pageContext.request.contextPath}/img/1200px-Cross_red_circle.svg.png" alt="">
        </div>

        <div class="col-sm-5">
          <span class="fs-2">Registration not successful!</span>
        </div>

        <div class="text-center mt-5">
          <button id="returnBtn" type="button" class="btn btn-primary">Return</button>
        </div>
      </main>

      <!--Footer row-->
      <footer class="row text-center bg-light mt-5">
        <span>Career Fair 2024</span>
      </footer>

    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/js/button-actions.js"></script>
  </body>
</html>