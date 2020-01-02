<?php
    session_start();
    
    if(isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] === true){
        $_SESSION['message'] = "Already Logged In";
        header("location: index.php");
        exit;
    }
    
    require_once "config.php";
    
    $username = $password = "";
    $username_err = $password_err = "";

    if($_SERVER["REQUEST_METHOD"] == "POST"){
        if(empty(trim($_POST["username"])))
            $username_err = "Please enter username.";
        else
            $username = trim($_POST["username"]);
        
        if(empty(trim($_POST["password"])))
            $password_err = "Please enter your password.";
        else
            $password = trim($_POST["password"]);
        
        if(empty($username_err) && empty($password_err)){
            $sql = "SELECT id, username, password FROM user WHERE username = ?";
            
            if($stmt = $mysqli->prepare($sql)){
                $stmt->bind_param("s", $param_username);
                
                $param_username = $username;
                
                if($stmt->execute()){
                    $stmt->store_result();
                    if($stmt->num_rows == 1){
                        $stmt->bind_result($id, $username, $originalPassword);
                        
                        if($stmt->fetch()){
                            if($password == $originalPassword){
                                $_SESSION["loggedin"] = true;
                                $_SESSION["id"] = $id;
                                $_SESSION["username"] = $username;

                                $_SESSION['message'] = "Login Successful";
                                $go = $_SESSION["last"] ;

                                header("location: $go ");
                            }
                            else
                                $password_err = "The password you entered is not matched.";
                        }
                    }
                    else
                        $username_err = "No account found with that username.";
                }
                else
                    echo "Oops! Something went wrong. Please try again later.";
            }
            $stmt->close();
        }
        $mysqli->close();
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Login | EzzyBzzy</title>
        <link rel="stylesheet" type="text/css" href="styles/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css?family=Acme" rel="stylesheet">
    </head>
    <body style="background-image: url(images/bg2.jpg)">
        <?php
            if (isset($_SESSION['message2'])) { ?>
            <div>
                <?php 
                    $mms = $_SESSION['message2'];
                    echo "<script type='text/javascript'>alert('$mms');</script>";
                    unset($_SESSION['message2']);
                ?>
            </div>
        <?php } ?>
        <?php
            if (isset($_SESSION['resetMsg'])) { ?>
            <div>
                <?php 
                    $resetMsg = $_SESSION['resetMsg'];
                    echo "<script type='text/javascript'>alert('$resetMsg');</script>";
                    unset($_SESSION['resetMsg']);
                ?>
            </div>
        <?php } ?>
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
                <div id="login">
                    <form class="loginForm" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
                        <h1>LOGIN</h1>
                        <div class="form-group <?php echo (!empty($username_err)) ? 'has-error' : ''; ?>">
                            <input type="text" name="username" class="form-control" value="<?php echo $username; ?>" placeholder="Username" required>
                            <span class="help-block"><?php echo $username_err; ?></span>
                        </div>
                        <div class="form-group <?php echo (!empty($password_err)) ? 'has-error' : ''; ?>">
                            <input type="password" name="password" class="form-control" placeholder="Password" required>
                            <span class="help-block"><?php echo $password_err; ?></span>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btn btn-primary" value="Login" name="">
                        </div>
                        <span><a href="reset.php">Forgot Password?</a></span>
                    </form>
                </div>
            </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>