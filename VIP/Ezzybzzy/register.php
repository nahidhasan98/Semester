<?php
    require_once "config.php";

    session_start();
    $_SESSION["last"] = "index.php" ;

    $firstName = $lastName = $username = $email = $password = $confirmPassword = $securityQuesVal = $securityAns ="";
    $username_err = $email_err = $password_err = $confirmPassword_err = $securityQuesVal_err = "";

    if($_SERVER["REQUEST_METHOD"] == "POST")
    {
        $firstName = trim($_POST["firstName"]);
        $lastName = trim($_POST["lastName"]);
        $securityAns = trim($_POST["securityAns"]);

        if(empty(trim($_POST["username"])))
            $username_err = "Please enter a username.";
        else
        {
            $sql = "SELECT * FROM user WHERE username = ?";
            
            if($stmt = $mysqli->prepare($sql))
            {
                $stmt->bind_param("s", $param_username);
                $param_username = trim($_POST["username"]);
                
                if($stmt->execute())
                {
                    $stmt->store_result();
                    
                    if($stmt->num_rows == 1)
                        $username_err = "<br><b>X</b> This username is already taken.";
                    else
                        $username = trim($_POST["username"]);
                }
                else
                    echo "Oops! Something went wrong. Please try again later.";
            }

            $stmt->close();
        }
        if(empty(trim($_POST["email"])))
            $email_err = "Please enter your email address.";
        else
        {
            $sql = "SELECT * FROM user WHERE email = ?";
            
            if($stmt = $mysqli->prepare($sql))
            {
                $stmt->bind_param("s", $param_email);
                $param_email = trim($_POST["email"]);
                
                if($stmt->execute())
                {
                    $stmt->store_result();
                    
                    if($stmt->num_rows == 1)
                        $email_err = "<br><b>X</b> This email is already registered.";
                    else
                        $email = trim($_POST["email"]);
                }
                else
                    echo "Oops! Something went wrong. Please try again later.";
            }

            $stmt->close();
        }
        
        if(empty(trim($_POST["password"])))
            $password_err = "Please enter a password.";     
        elseif(strlen(trim($_POST["password"])) < 6)
            $password_err = "<br><b>X</b> Password must have atleast 6 characters.";
        else
            $password = trim($_POST["password"]);
        
        if(empty(trim($_POST["confirmPassword"])))
            $confirmPassword_err = "<br><b>X</b> Please confirm password.";     
        else
        {
            $confirmPassword = trim($_POST["confirmPassword"]);

            if(empty($password_err) && ($password != $confirmPassword))
                $confirmPassword_err = "<br><b>X</b> Password did not match.";
        }
        if(trim($_POST["securityQuesVal"]) == "0")
            $securityQuesVal_err = "<br><b>X</b> Please select a question.";     
        else
            $securityQuesVal = trim($_POST["securityQuesVal"]);
        
        if(empty($username_err) && empty($email_err) && empty($password_err) && empty($confirmPassword_err) && empty($securityQuesVal_err))
        {
            $sql = "INSERT INTO user (firstName,lastName,username,email,password,securityQuesVal,securityAns,point) VALUES (?,?,?,?,?,?,?,?)";
            
            if($stmt = $mysqli->prepare($sql))
            {
                $stmt->bind_param("sssssssi", $param_firstName, $param_lastName, $param_username, $param_email, $param_password, $param_securityQuesVal, $param_securityAns,$param_point);
                $param_firstName = $firstName;
                $param_lastName = $lastName;
                $param_username = $username;
                $param_email = $email;
                $param_password = $password;
                $param_securityQuesVal = $securityQuesVal;
                $param_securityAns = $securityAns;
                $param_point = 0;
                
                if($stmt->execute())
                {
                    $greeting="Thank You fo registering on Ezzybzzy. We hope you will enjoy your journey with Ezzybzzy.\n\nGood luck\nEzzybzzy Team.";
                    $recipient = $email;
                    $subject = "Ezzybzzy Registration";
                    mail($recipient, $subject, $greeting) or die("Error!");
        
                    $_SESSION['message2'] = "Successfully Registered. An email has been sent to your mail.";
                    header("location: login.php");
                }
                else
                    echo "Something went wrong. Please try again later.";
            }
            
            $stmt->close();
        }
        
        $mysqli->close();
    }
?>

<!DOCTYPE html>
<html>
    <head>
        <title>Register | EzzyBzzy</title>
        <link rel="stylesheet" type="text/css" href="styles/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css?family=Acme" rel="stylesheet">
    </head>
    <body style="background-image: url(images/bg2.jpg)">
        <div id="main">
            <div id="header">
                <div id="logo">
                    <img src="images/logoT.png" alt="EzzyBzzy Logo" title="EzzyBzzy Logo" height="100px" width="330px">
                </div>
                <div id="headerRight">
                    <p>An Easy Practice Platform To <br><br><strong> &nbsp;"Be YOU-nique!"</strong></p>
                </div>
            </div>
            <div id="navBar">
                <div id="navLeft">
                    <ul>
                        <li><a href="index.php">Home</a></li>
                        <li><a href="quiz.php">Quiz</a></li>
                        <li><a href="rank.php">Rank</a></li>
                        <li><a href="links.php">Useful Links</a></li>
                        <li><a href="about.php">About</a></li>
                        <li><a href="contact.php">Contact Us</a></li>
                    </ul>
                </div>
                <div id="navRight">
                    <div id="authentication">
                        <ul>
                            <li><a href="login.php"><i class="fa fa-unlock-alt"></i>Login</a></li>
                            <li><a href="register.php"><i class="fa fa-user"></i>Register</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div id="content">
                <form id="registrationForm" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
                    <h1>User Registration</h1>
                    <p>*All fields are required.</p>
                    <div>
                        <label for="firstName">First Name :</label>
                        <input type="text" id="firstName" name="firstName" value="<?php echo $firstName; ?>" required>
                        <span class="help-block"></span>
                    </div>
                    <div>
                        <label for="lastName">Last Name :</label>
                        <input type="text" id="lastName" name="lastName" value="<?php echo $lastName; ?>" required>
                        <span class="help-block"></span>
                    </div>
                    <div class="form-group <?php echo (!empty($username_err)) ? 'has-error' : ''; ?>">
                        <label for="username">Username :</label>
                        <input type="text" id="username" name="username" class="form-control" value="<?php echo $username; ?>">
                        <span class="help-block"><?php echo $username_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($email_err)) ? 'has-error' : ''; ?>">
                        <label for="email">Email :</label>
                        <input type="email" id="email" name="email" class="form-control" value="<?php echo $email; ?>" required>
                        <span class="help-block"><?php echo $email_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($password_err)) ? 'has-error' : ''; ?>">
                        <label for="password">Password :</label>
                        <input type="password" id="password" name="password" class="form-control" value="<?php echo $password; ?>" required>
                        <span class="help-block"><?php echo $password_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($confirmPassword_err)) ? 'has-error' : ''; ?>">
                        <label for="confirmPassword">Confirm Password :</label>
                        <input type="password" id="confirmPassword" name="confirmPassword" class="form-control" value="<?php echo $confirmPassword; ?>" required>
                        <span class="help-block"><?php echo $confirmPassword_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($securityQuesVal_err)) ? 'has-error' : ''; ?>">
                        <label for="securityQuesVal">Security Question :</label>
                        <select id="securityQuesVal" name="securityQuesVal" placeholder="Select an option" required>
                            <option value="0">Select an option</option>
                            <option value="1">My childhood name:</option>
                            <option value="2">My birth place:</option>
                            <option value="3">My first Mobile number:</option>
                            <option value="4">My best friend name:</option>
                            <option value="5">My favourite food:</option>
                        </select>
                        <span class="help-block"><?php echo $securityQuesVal_err; ?></span>
                    </div>
                    <div>
                        <label for="securityAns">Security Answer :</label>
                        <input type="text" id="securityAns" name="securityAns" class="form-control" value="<?php echo $securityAns; ?>" required>
                    </div>
                    <div class="form-group">
                        <input type="reset" name="reset" value="Reset">
                        <input type="submit" name="register" value="Sign Up">
                    </div>
                </form>
            </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>