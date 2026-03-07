<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Welcome</title>

  <!-- Bootstrap 5 CSS (CDN) -->
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
    crossorigin="anonymous"
  />
</head>
<body class="bg-light">

  <div class="container py-5">
    <div class="row justify-content-center">
      <div class="col-md-8 col-lg-6">

        <div class="card shadow-sm">
          <div class="card-body">
            <h1 class="h3 text-primary mb-3">
              Welcome ${uname}
            </h1>

            <h3 class="h5 text-secondary">Your Details</h3>
            <ul class="list-group list-group-flush my-3">
              <li class="list-group-item">
                <strong>Username:</strong> ${uname}
              </li>
              <li class="list-group-item">
                <strong>Email:</strong> ${email}
              </li>
              <li class="list-group-item">
                <strong>Mobile:</strong> ${mobile}
              </li>
            </ul>

            <div class="d-flex gap-2">
              <a href="index.jsp" class="btn btn-outline-secondary">Back</a>
              <a href="logout" class="btn btn-primary">Logout</a>
            </div>
          </div>
        </div>

      </div>
    </div>
  </div>

  <!-- (Optional) Bootstrap JS if you add interactive components later -->
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"
  ></script>
</body>
</html>