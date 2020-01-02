<?php
    session_start();
    
    require_once "config.php";
    
    $username = $securityQuesVal = $securityAns = $new_password = $confirm_password = "";
    $username_err = $securityQuesVal_err = $securityAns_err = $new_password_err = $confirm_password_err = "";
    
    if($_SERVER["REQUEST_METHOD"] == "POST"){
        if(empty(trim($_POST["username"])))
            $username_err = "Please enter username.";
        else
            $username = trim($_POST["username"]);

        if(trim($_POST["securityQuesVal"]) == "0")
            $securityQuesVal_err = "<br><b>X</b> Please select a question.";     
        else
            $securityQuesVal = trim($_POST["securityQuesVal"]);
        
        if(empty(trim($_POST["securityAns"])))
            $securityAns_err = "Please enter a valid answer.";
        else
            $securityAns = trim($_POST["securityAns"]);

        if(empty($username_err) && empty($securityQuesVal_err) && empty($securityAns_err)){
            $sql = "SELECT id, username, securityQuesVal, securityAns FROM user WHERE username = ?";

            if($stmt = $mysqli->prepare($sql)){
                $stmt->bind_param("s", $param_username);
                
                $param_username = $username;

                if($stmt->execute()){
                    $stmt->store_result();
                    if($stmt->num_rows == 1){
                        $stmt->bind_result($id, $originalUsername, $originalQues, $originalAns);

                        if($stmt->fetch()){
                            if($securityQuesVal == $originalQues){
                                if($securityAns == $originalAns){
                                    if(empty(trim($_POST["new_password"]))){
                                        $new_password_err = "<br><b>X</b> Please enter the new password.";     
                                    } elseif(strlen(trim($_POST["new_password"])) < 6){
                                        $new_password_err = "<br><b>X</b> Password must have atleast 6 characters.";
                                    } else{
                                        $new_password = trim($_POST["new_password"]);
                                    }
                                    
                                    if(empty(trim($_POST["confirm_password"]))){
                                        $confirm_password_err = "<br><b>X</b> Please confirm the password.";
                                    } else{
                                        $confirm_password = trim($_POST["confirm_password"]);
                                        if(empty($new_password_err) && ($new_password != $confirm_password)){
                                            $confirm_password_err = "<br><b>X</b> Password did not match.";
                                        }
                                    }

                                    if(empty($new_password_err) && empty($confirm_password_err)){
                                        $sql2 = "UPDATE user SET password = ? WHERE username = ?";

                                        if($stmt2 = $mysqli->prepare($sql2)){
                                            $stmt2->bind_param("ss", $param_password, $param_username);
                                            
                                            $param_password = $new_password;
                                            $param_username = $username;
                                            
                                            if($stmt2->execute()){
                                                session_destroy();
                            
                                                session_start();
                                                $_SESSION["last"] = "index.php" ;
                                                $_SESSION['resetMsg'] = "Password changed successfully.";
                            
                                                header("location: login.php");
                                                exit();
                                            } else{
                                                echo "Oops! Something went wrong. Please try again later.";
                                            }
                                            $mysqli->close();
                                        }
                                        $stmt2->close();
                                    }
                                }
                                else
                                    $securityAns_err = "<br><b>X</b> Wrong Answer.";
                            }
                            else
                                $securityQuesVal_err = "<br><b>X</b> Wrong security question.";
                        }
                    }
                    else
                        $username_err = "<br><b>X</b> No account found with that username.";
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
        <title>EzzyBzzy | An Online Practice Platform</title>
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
                    <?php
                        if(isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] === true) { ?>
                        <div id="authentication">
                            <ul>
                                <li id="name"><?php echo $_SESSION['username'] ?></li>
                                <li><a href="reset.php">Change Password</a></li>
                                <li><a href="logout.php"><i class="fa fa-user"></i>Logout</a></li>
                            </ul>
                        </div>
                    <?php } else { ?>
                        <div id="authentication">
                            <ul>
                                <li><a href="login.php"><i class="fa fa-unlock-alt"></i>Login</a></li>
                                <li><a href="register.php"><i class="fa fa-user"></i>Register</a></li>
                            </ul>
                        </div>
                    <?php } ?>
                </div>
            </div>
            <div id="content">
                <form id="resetForm" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post"> 
                    <div class="form-group <?php echo (!empty($username_err)) ? 'has-error' : ''; ?>">
                        <label for="username">Username :</label>
                        <input type="text" id="username" name="username" class="form-control" value="<?php echo $username; ?>">
                        <span class="help-block"><?php echo $username_err; ?></span>
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
                        <span class="help-block"><?php echo $securityAns_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($new_password_err)) ? 'has-error' : ''; ?>">
                        <label>New Password :</label>
                        <input type="password" name="new_password" class="form-control" value="<?php echo $new_password; ?>">
                        <span class="help-block"><?php echo $new_password_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($confirm_password_err)) ? 'has-error' : ''; ?>">
                        <label>Confirm Password :</label>
                        <input type="password" name="confirm_password" class="form-control">
                        <span class="help-block"><?php echo $confirm_password_err; ?></span>
                    </div>
                    <div class="form-group">
                        <a class="btn btn-link" href="index.php" id="resetCancel">Cancel</a>
                        <input type="submit" class="btn btn-primary" id="resetSubmit" value="Submit">
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