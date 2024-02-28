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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/insert.css">
  </head>
  <body>
    
    <div class="container border ">
        <!--Header row-->
        <header class="row text-center bg-light">
            <h1>Fair Registration Form</h1>
        </header>

        <!--Main row-->
        <main class="row mt-3">
            <form id="regForm" method="POST" action="${pageContext.request.contextPath}/insert" class="col-sm-6 bg-body-secondary">

                <div>
                    <label for="firstname" class="form-label">Firstname</label>
                    <input type="text" class="form-control" id="firstname" name="firstname" value="${param.firstname}" aria-describedby="firstname" placeholder="Enter text">
                    <div class="form-text">*A valid firstname contains only characters</div>
                </div>

                <div class="mt-3">
                    <label for="lastname" class="form-label">Lastname</label>
                    <input type="text" class="form-control" id="lastname" name="lastname" value="${param.lastname}" aria-describedby="lastname" placeholder="Enter text">
                    <div class="form-text">*A valid lastname contains only characters</div>
                </div> 

                <div class="mt-3">
                    <label for="mobilePhone" class="form-label">Mobile Phone</label>
                    <input type="text" class="form-control" id="mobilePhone" name="mobilePhone" value="${param.mobilePhone}" aria-describedby="mobilePhone" placeholder="Enter a number">
                    <div class="form-text">*A valid phone number contains only digits.</div>
                </div>

                <div class="mt-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" value="${param.email}" aria-describedby="email" placeholder="Enter an email">
                    <div class="form-text">*A valid email format is name@email.com. </div>
                </div>

                <div class="mt-3  text-center">
                    <button id="submitBtn" type="submit" class="btn btn-primary">Submit</button>
                    <button id="clearBtn" type="button" class="btn btn-primary">Clear</button>
                    <button id="returnBtn" type="button" class="btn btn-primary">Return</button>
                </div>

            </form>
        </main>

        <!--Footer row-->
        <footer class="row text-center bg-light mt-3">
            <span>Career Fair 2024</span>
        </footer>

    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="${pageContext.request.contextPath}/js/button-actions.js"></script>
  </body>
</html>