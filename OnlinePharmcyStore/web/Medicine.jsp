<%-- 
    Document   : Medicine
    Created on : Jul 3, 2023, 1:00:11 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Medicines</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

<!-- Favicons -->
 <link href="assets/img/p3.png" rel="icon" >
  <link href="assets/img/p3.png" rel="apple-touch-icon" >
 

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">


</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-center">
    <div class="container d-flex align-items-center justify-content-between">

      <div class="logo">
       <h1><img src="assets/img/p3.png" class="img-fluid" alt="">
	    <a href="index.html" > Bandula</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
      </div>
	  <div class="wraptext">
      <div class="search">
        <input type="text" class="search-term" placeholder="Search here" />
        <button type="submit" class="search-button">
          <svg viewBox="0 0 1024 1024">
            <path
              class="path1"
              d="M848.471 928l-263.059-264.059c-48.941 37.707-111.120 56.060-178.412 55.060-172.296 0-315-145.708-315-314s145.708-315 315-314c173.298 0 315 144.708 314 314 0 69.296-28.474 129.475-58.060 179.414l276.060 265.060-80.529 80.530zM190.625 409.079c0 125.365 99.092 220.458 220.458 219.456s220.456-98.092 220.456-220.456c0-123.365-105.160-220.458-220.458-220.458-124.366 0-220.457 98.093-220.455 220.454z"
            ></path>
          </svg>
        </button>
      </div>
    </div>
	  

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto " href="index.html">Home</a></li>
          <li><a class="nav-link scrollto" href="about.html">About</a></li>
          <li><a class="nav-link scrollto active" href="medicines.html">Medicines</a></li>
         <li class="dropdown"><a href="#"><span>Healthcare</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="ayurvedic.html">Ayurvedic Care</a></li>
            
              <li><a href="mother.html">Mother & Baby Care</a></li>
              <li><a href="personal.html">Personal Care</a></li>
              <li><a href="pet.html">Pet Care</a></li>
            </ul>
          </li>
           <li><a class="nav-link scrollto" href="services.html">Services</a></li>
	
          <li><a class="nav-link scrollto" href="#contact">Contact</a></li>

          <li><a class="nav-link scrollto"><%=session.getAttribute("username") %></a></li>
          
           <li><a class="nav-link scrollto" href="Logout">Logout</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->

  <!-- ======= Clients Section ======= -->
    <section id="clients" class="clients clients">
      <div class="container">

        <div class="row">

          <div class="col-lg-2 col-md-4 col-6">
            <img src="assets/img/clients/client-1.png" class="img-fluid" alt="" data-aos="zoom-in">
          </div>

          <div class="col-lg-2 col-md-4 col-6">
            <img src="assets/img/clients/client-2.png" class="img-fluid" alt="" data-aos="zoom-in" data-aos-delay="100">
          </div>

          <div class="col-lg-2 col-md-4 col-6">
            <img src="assets/img/clients/client-3.png" class="img-fluid" alt="" data-aos="zoom-in" data-aos-delay="200">
          </div>

          <div class="col-lg-2 col-md-4 col-6">
            <img src="assets/img/clients/client-4.png" class="img-fluid" alt="" data-aos="zoom-in" data-aos-delay="300">
          </div>

          <div class="col-lg-2 col-md-4 col-6">
            <img src="assets/img/clients/client-5.png" class="img-fluid" alt="" data-aos="zoom-in" data-aos-delay="400">
          </div>

          <div class="col-lg-2 col-md-4 col-6">
            <img src="assets/img/clients/client-6.png" class="img-fluid" alt="" data-aos="zoom-in" data-aos-delay="500">
          </div>

        </div>

      </div>
    </section><!-- End Clients Section --> 

    <!-- ======= About Us Section ======= -->
   
              
     <!-- ======= Portfolio Section ======= -->
    <section id="portfolio" class="portfolio">
      <div class="container">

        <div class="section-title" data-aos="fade-up">
          <h2>Home Medicines</h2>
         
        </div>

        <div class="row" data-aos="fade-up" data-aos-delay="200">
          <div class="col-lg-12 d-flex justify-content-center">
            <ul id="portfolio-flters">
              <li data-filter="*" class="filter-active">All</li>
              <li data-filter=".filter-antiacids">Antiacids & Gastritis</li>
              <li data-filter=".filter-organic">Organic Care</li>
              <li data-filter=".filter-pain">Pain Care</li>
			  <li data-filter=".filter-wound">Wound Care</li>
			  
            </ul>
          </div>
        </div>

        <div class="row portfolio-container" data-aos="fade-up" data-aos-delay="400">

          <div class="col-lg-4 col-md-6 portfolio-item filter-antiacids">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-gas1.jpg" class="img-fluid" alt="" >
              <div class="portfolio-info">
                <h4>Eno Tray '5s</h4>
                <p>LKR 1,350.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-gas1.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title=">Eno Tray '5s"><i class="bx bx-plus"></i></a>
                  <a href="enoTray.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-organic">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-o1.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Dermavive Intensive Boby Hydrating Oil</h4>
                <p>LKR 2,300.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-o1.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Dermavive Intensive Boby Hydrating Oil"><i class="bx bx-plus"></i></a>
                  <a href="Dermavive-Intensive-Boby-Hydrating-Oil.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-antiacids">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-gas2.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Eno Panidodam 30'S</h4>
                <p>LKR 1,050.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-gas2.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Eno Panidodam 30'S"><i class="bx bx-plus"></i></a>
                  <a href="Eno-Panidodam.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-pain">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-pain1.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Panadol Tab</h4>
                <p>LKR 1.71</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-pain1.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Panadol Tab"><i class="bx bx-plus"></i></a>
                  <a href="PanadolTab.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-organic">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-o2.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Dermavive Dry Skin Crème</h4>
                <p>LKR 2,200.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-o2.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Dermavive Dry Skin Crème"><i class="bx bx-plus"></i></a>
                  <a href="Dermavive-Dry-Skin-Crème.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-pain">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-pain2.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Panadeine 120'S</h4>
                <p>LKR 960.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-pain2.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Panadeine 120'S"><i class="bx bx-plus"></i></a>
                  <a href="Panadeine.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-pain">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-pain3.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Pfc Liquid 100ml</h4>
                <p>LKR 200.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-pain3.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Pfc Liquid 100m"><i class="bx bx-plus"></i></a>
                  <a href="Pfc-Liquid.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-wound">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-w1.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>ISOPROPYL ALCOHOL SWABS - 100PCS - SMALL</h4>
                <p>LKR 600.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-w1.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="ISOPROPYL ALCOHOL SWABS - 100PCS - SMALL"><i class="bx bx-plus"></i></a>
                  <a href="ISOPROPYL-ALCOHOL SWABS.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 portfolio-item filter-organic">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-o3.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Dermavive Hydra Cleanser</h4>
                <p>LKR 2,000.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-o3.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Dermavive Hydra Cleanser"><i class="bx bx-plus"></i></a>
                  <a href="Dermavive-Hydra-Cleanser.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		  <div class="col-lg-4 col-md-6 portfolio-item filter-wound">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-w2.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>POP BANDAGE - 4CM X 10CM - WHITE</h4>
                <p>LKR 750.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-w2.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="POP BANDAGE - 4CM X 10CM - WHITE"><i class="bx bx-plus"></i></a>
                  <a href="POP-BANDAGE.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  <div class="col-lg-4 col-md-6 portfolio-item filter-organic">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-o4.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Dermavive Dry Skin Cleansing Bar</h4>
                <p>LKR 2,700.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-o4.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Dermavive Dry Skin Cleansing Bar"><i class="bx bx-plus"></i></a>
                  <a href="Dermavive-Dry-Skin-Cleansing-Bar.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		   <div class="col-lg-4 col-md-6 portfolio-item filter-pain">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-pain4.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>PANKAJAKASTHURI ORTHOHERB CREAM - 10G</h4>
                <p>LKR 390.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-pain4.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="PANKAJAKASTHURI ORTHOHERB CREAM - 10G"><i class="bx bx-plus"></i></a>
                  <a href="PANKAJAKASTHURI-ORTHOHERB-CREAM.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		  <div class="col-lg-4 col-md-6 portfolio-item filter-wound">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-w3.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>FIRST AID BOX - WOOD - SMALL</h4>
                <p>LKR 1,600.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-w3.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="FIRST AID BOX - WOOD - SMALL"><i class="bx bx-plus"></i></a>
                  <a href="FIRST-AID-BOX.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		   <div class="col-lg-4 col-md-6 portfolio-item filter-pain">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-pain5.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>MOOV RAPID RELIEF - BALM - 50G</h4>
                <p>LKR 790.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-pain5.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="MOOV RAPID RELIEF - BALM - 50G"><i class="bx bx-plus"></i></a>
                  <a href="MOOV-RAPID-RELIEF.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		   <div class="col-lg-4 col-md-6 portfolio-item filter-antiacids">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-gas3.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Eno 30'S Orange</h4>
                <p>LKR 1,050.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-gas3.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Eno 30'S Orange"><i class="bx bx-plus"></i></a>
                  <a href="Eno-Orange.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		   <div class="col-lg-4 col-md-6 portfolio-item filter-pain">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-pain10.jpg" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>AXE OIL - 3ML</h4>
                <p>LKR 590.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-pain10.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox" title="AXE OIL - 3ML"><i class="bx bx-plus"></i></a>
                  <a href="AXE-OIL.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		   <div class="col-lg-4 col-md-6 portfolio-item filter-organic">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-o5.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Dermavive Acne & Sensitive Skin Cleansing Bar</h4>
</h4>
                <p>LKR 2,700.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-o5.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Dermavive Acne & Sensitive Skin Cleansing Bar"><i class="bx bx-plus"></i></a>
                  <a href="Dermavive-Acne.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		   <div class="col-lg-4 col-md-6 portfolio-item filter-organic">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-o6.png" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4>Dermavive Oily Skin Cleansing Bar</h4>
                <p>LKR 2,500.00</p>
                <div class="portfolio-links">
                  <a href="assets/img/portfolio/portfolio-o6.png" data-gallery="portfolioGallery" class="portfolio-lightbox" title="Dermavive Oily Skin Cleansing Bar"><i class="bx bx-plus"></i></a>
                  <a href="Dermavive-Oily.html" title="Order Now"><i class="bx bx-link"></i></a>
                </div>
              </div>
            </div>
          </div>
		  
		  
		  
		  

        </div>

      </div>
    </section><!-- End Portfolio Section -->


   
 
  
 <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">

    <div class="footer-content">
      <div class="container">
        <div class="row gy-4">
          <div class="col-lg-5 col-md-12 footer-info">
            <a href="index.html" class="logo d-flex align-items-center">

              <span>Bandula</span>
            </a>
            <p>Welcome To Our Online Pharmacy<br>
			We Are Here For Your Care<br>
			 Take The Best Quality Pharmaceuticals<br>
			 Any help, Just call us.</p>
            <div class="social-links d-flex  mt-3">
              <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
              <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
              <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
              <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
            </div>
          </div>

          <div class="col-lg-2 col-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
              <li><i class="bi bi-dash"></i> <a href="index.html">Home</a></li>
              <li><i class="bi bi-dash"></i> <a href="about.html">About us</a></li>
              <li><i class="bi bi-dash"></i> <a href="services.html">Services</a></li>
              <li><i class="bi bi-dash"></i> <a href="medicines.html">Medicines</a></li>
              
            </ul>
          </div>

          <div class="col-lg-2 col-6 footer-links">
            <h4>Our Services</h4>
            <ul>
              <li><i class="bi bi-dash"></i> <a href="services.html">Quality Products</a></li>
              <li><i class="bi bi-dash"></i> <a href="services.html">license of government</a></li>
              <li><i class="bi bi-dash"></i> <a href="services.html">support 24/7</a></li>
              <li><i class="bi bi-dash"></i> <a href="services.html">Efficient Service</a></li>
             
            </ul>
          </div>

          <div class="col-lg-3 col-md-12 footer-contact text-center text-md-start">
            <h4>Contact Us</h4>
            <p>
              No:21,<br>
              Veyangoda Road,<br>
              Minuwangoda <br><br>
              <strong>Phone:</strong> +077 776 6598<br>
              <strong>Email:</strong> aprlankaperera@gmail.com<br>
            </p>

          </div>

        </div>
      </div>
    </div>

    
  </footer><!-- End Footer --><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>