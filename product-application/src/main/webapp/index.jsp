<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>ShopZone | Home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <style>
    body {
      font-family: 'Segoe UI', sans-serif;
      background-color: #f2f2f2;
    }

    .navbar-brand {
      font-weight: bold;
      font-size: 1.7rem;
      color: #0064d2;
    }

    .search-bar input {
      width: 100%;
      border-radius: 20px;
      padding: 10px 20px;
      border: 1px solid #ccc;
    }

    .hero-section {
      background: url('https://via.placeholder.com/1200x350') no-repeat center center;
      background-size: cover;
      height: 350px;
      border-radius: 10px;
      margin-bottom: 2rem;
    }

    .category-card {
      transition: transform 0.2s ease;
      cursor: pointer;
    }

    .category-card:hover {
      transform: translateY(-5px);
      box-shadow: 0 8px 16px rgba(0,0,0,0.1);
    }

    .footer {
      background-color: #343a40;
      color: #ccc;
      padding: 1rem;
      margin-top: 3rem;
      text-align: center;
    }

    .deal-card img {
      border-radius: 8px;
    }
  </style>
</head>
<body>

  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm sticky-top">
    <div class="container-fluid px-4">
      <a class="navbar-brand" href="#">ShopZone</a>
      <div class="d-flex w-50 mx-auto search-bar">
        <input type="text" class="form-control" placeholder="Search products, brands and more" />
      </div>
      <div>
        <a href="#" class="btn btn-outline-primary me-2">Login</a>
        <a href="#" class="btn btn-primary">Register</a>
      </div>
    </div>
  </nav>

  <!-- Hero Banner -->
  <div class="container mt-4">
    <div class="hero-section"></div>
  </div>

  <!-- Categories Section -->
  <div class="container my-5">
    <h4 class="mb-4">Shop by Category</h4>
    <div class="row g-4">
      <div class="col-md-3">
        <div class="card category-card p-3 text-center">
          <img src="https://via.placeholder.com/100" class="mx-auto mb-2" alt="Electronics">
          <h6>Electronics</h6>
        </div>
      </div>
      <div class="col-md-3">
        <div class="card category-card p-3 text-center">
          <img src="https://via.placeholder.com/100" class="mx-auto mb-2" alt="Fashion">
          <h6>Fashion</h6>
        </div>
      </div>
      <div class="col-md-3">
        <div class="card category-card p-3 text-center">
          <img src="https://via.placeholder.com/100" class="mx-auto mb-2" alt="Home Appliances">
          <h6>Home Appliances</h6>
        </div>
      </div>
      <div class="col-md-3">
        <div class="card category-card p-3 text-center">
          <img src="https://via.placeholder.com/100" class="mx-auto mb-2" alt="Toys">
          <h6>Toys & Games</h6>
        </div>
      </div>
    </div>
  </div>

  <!-- Deals Section -->
  <div class="container my-5">
    <h4 class="mb-4">Today’s Deals</h4>
    <div class="row g-4">
      <div class="col-md-3">
        <div class="card deal-card">
          <img src="https://via.placeholder.com/250x200" class="card-img-top" alt="Deal 1">
          <div class="card-body">
            <h6 class="card-title">Wireless Headphones</h6>
            <p class="card-text text-success">₹1,299 <small class="text-muted"><del>₹2,499</del></small></p>
            <a href="#" class="btn btn-sm btn-outline-primary">Buy Now</a>
          </div>
        </div>
      </div>
      <div class="col-md-3">
        <div class="card deal-card">
          <img src="https://via.placeholder.com/250x200" class="card-img-top" alt="Deal 2">
          <div class="card-body">
            <h6 class="card-title">Smartwatch</h6>
            <p class="card-text text-success">₹2,199 <small class="text-muted"><del>₹3,999</del></small></p>
            <a href="#" class="btn btn-sm btn-outline-primary">Buy Now</a>
          </div>
        </div>
      </div>
      <!-- Add more deal cards as needed -->
    </div>
  </div>

  <!-- Footer -->
  <div class="footer">
    <p>&copy; 2025 ShopZone. All rights reserved.</p>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
