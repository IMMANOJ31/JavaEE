<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>New User Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f9f9f9;
    }

    .container {
      max-width: 700px;
      margin: 30px auto;
      background-color: #fff;
      border: 1px solid #ccc;
      padding: 25px 30px;
      border-radius: 8px;
      box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    }

    h2 {
      color: #2a5dad;
      margin-bottom: 20px;
      text-align: center;
    }

    label {
      display: block;
      margin: 10px 0 5px;
      font-weight: bold;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"],
    select {
      width: 100%;
      padding: 8px;
      border-radius: 4px;
      border: 1px solid #ccc;
      margin-bottom: 12px;
      box-sizing: border-box;
    }

    input[type="radio"] {
      margin-right: 5px;
      margin-left: 15px;
    }

    .buttons {
      text-align: center;
      margin-top: 20px;
    }

    .buttons input {
      padding: 10px 25px;
      font-size: 16px;
      margin: 0 10px;
      cursor: pointer;
      border: none;
      border-radius: 4px;
    }

    .buttons input[type="submit"] {
      background-color: #2a5dad;
      color: white;
    }

    .buttons input[type="reset"] {
      background-color: #aaa;
      color: white;
    }

    .asterisk {
      color: red;
    }
  </style>
</head>

<body>
  <div class="container">
    <h2>User Registration</h2>
    <form id="registrationForm" action="userRegistration" method="post">


      <label for="passportOffice">Passport Office<span class="asterisk">*</span></label>
      <select id="passportOffice" name="passportOffice" required>
        <option value="">----- Select -----</option>
        <option>Ahmedabad</option>
        <option>Bangalore</option>
        <option>Bhopal</option>
        <option>Bhubaneswar</option>
        <option>Chandigarh</option>
        <option>Chennai</option>
        <option>Delhi</option>
        <option>Guwahati</option>
        <option>Hyderabad</option>
        <option>Jaipur</option>
        <option>Kolkata</option>
        <option>Lucknow</option>
        <option>Mumbai</option>
        <option>Patna</option>
        <option>Pune</option>
      </select>

      <label for="givenName">Given Name<span class="asterisk">*</span></label>
      <input type="text" id="givenName" maxlength="45" name="givenName" required>

      <label for="surname">Surname</label>
      <input type="text" id="surname" name="surname" maxlength="45">

      <label for="dob">Date of Birth (DD/MM/YYYY)<span class="asterisk">*</span></label>
      <input type="text" id="dob" name="dob" placeholder="DD/MM/YYYY" required>

      <label for="email">E-mail Id<span class="asterisk">*</span></label>
      <input type="email" id="email" name="email" maxlength="35" required>



      <label for="loginId">Login Id<span class="asterisk">*</span></label>
      <input type="text" id="loginId" name="loginId" required>

      <label for="password">Password<span class="asterisk">*</span></label>
      <input type="password" id="password" name="password" required>

      <label for="confirmPassword">Confirm Password<span class="asterisk">*</span></label>
      <input type="password" id="confirmPassword" name="confirmPassword" required>


      <div class="buttons">
        <input type="submit" value="Register">
        <input type="reset" value="Clear">
      </div>
    </form>
  </div>

  <script>
    const cpvRadio = document.getElementById("registerAtCpv");
    const poRadio = document.getElementById("registerAtPo");
    const passportOffice = document.getElementById("passportOffice");
    const emailInput = document.getElementById("email");
    const loginIdInput = document.getElementById("loginId");

    function updatePassportOffice() {
      if (cpvRadio.checked) {
        passportOffice.value = "Delhi";
        passportOffice.disabled = true;
      } else {
        passportOffice.disabled = false;
        passportOffice.value = "";
      }
    }

    window.addEventListener("load", updatePassportOffice);
    cpvRadio.addEventListener("change", updatePassportOffice);
    poRadio.addEventListener("change", updatePassportOffice);

    document.querySelectorAll("input[name='sameEmail']").forEach(radio => {
      radio.addEventListener("change", () => {
        if (radio.value === "yes" && radio.checked) {
          loginIdInput.value = emailInput.value;
        } else if (radio.value === "no" && radio.checked) {
          loginIdInput.value = "";
        }
      });
    });

    emailInput.addEventListener("input", () => {
      const sameAsEmail = document.querySelector("input[name='sameEmail']:checked").value;
      if (sameAsEmail === "yes") {
        loginIdInput.value = emailInput.value;
      }
    });
  </script>
</body>

</html>