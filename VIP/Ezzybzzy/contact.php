<?php
    session_start();
    $_SESSION["last"] = "contact.php" ;
    
    if($_SERVER["REQUEST_METHOD"] == "POST"){
        $mailName = $_POST['mailName'];
        $mailEmail = $_POST['mailEmail'];
        $mailMessage = $_POST['mailMessage'];

        $formcontent="From: $mailName \nSender Email: $mailEmail \nMessage: $mailMessage";
        $recipient = "mehedihasanjohnt@gmail.com";
        $subject = "Contact Form";
        $mailheader = "From: $mailEmail \r\n" . "CC: mnh.nahid35@gmail.com";

        mail($recipient, $subject, $formcontent, $mailheader) or die("Error!");
        
        $_SESSION['mailMessage'] = "Thank You! We got your response.";
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
        <?php
            if (isset($_SESSION['message'])) { ?>
            <div>
                <?php 
                    $mms = $_SESSION['message'];
                    echo "<script type='text/javascript'>alert('$mms');</script>";
                    unset($_SESSION['message']);
                ?>
            </div>
        <?php } ?>
        <?php
            if (isset($_SESSION['mailMessage'])) { ?>
            <div>
                <?php 
                    $mailMessage = $_SESSION['mailMessage'];
                    echo "<script type='text/javascript'>alert('$mailMessage');</script>";
                    unset($_SESSION['mailMessage']);
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
                <div id="cInfo">
                    <div id="cInfoUp">
                        <form id="registrationForm" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
                            <h4>For any kind of enquiry, please</h4>
                            <h1>Leave A Message</h1>
                            <p>*All fields are required.</p>
                            <div>
                                <label for="mailName">Name :</label>
                                <input type="text" id="mailName" name="mailName" required>
                            </div>
                            <div>
                                <label for="mailEmail">Email :</label>
                                <input type="email" id="mailEmail" name="mailEmail" required>
                            </div>
                            <div>
                                <label for="mailMessage">Message :</label>
                                <textarea id="mailMessage" name="mailMessage" required></textarea>
                            </div>
                            <div>
                                <input type="reset" name="reset" value="Clear">
                                <input type="submit" name="send" value="Send">
                            </div>
                        </form>
                    </div>
                    <div id="cInfoDown"  style="padding-bottom: 15px;">
                        <h1>Get In Touch</h1>
                        <div id="cDownLeft" class="cDown">
                            <h2>Mehedi Hasan John</h2>
                            <p>Dept. of CSE</p>
                            <p>Stamford University Bangladesh.</p>
                            <div id="social">
                                <div id="icondiv">
                                    <a href="https://facebook.com/engrmhjohn"><img src="images/fb-icon.png" alt="Facebook-Icon" id="fbicon" style="margin-left:10px;"></a>
                                    <a href="https://github.com/engrmhjohn"><img src="images/github-icon.png" alt="Github-Icon" id="giticon" style="margin-left:40px;"></a>
                                    <a href="mailto:mehedihasanjohnt@gmail.com"><img src="images/gmail-icon.png" alt="Gmail-Icon" id="gicon" style="margin-left:35px;margin-right:30px;"></a>
                                    <a href="tel:+8801781398652"><img src="images/phone-icon.png" alt="Phone-Icon" id="plicon"></a>
                                </div>
                                <div id="linkdiv">
                                    <a href="https://facebook.com/engrmhjohn">Facebook</a>
                                    <a href="https://github.com/engrmhjohn">Github</a>
                                    <a href="mailto:mehedihasanjohnt@gmail.com">E-Mail</a>
                                    <a href="tel:+8801781398652">Phone</a>
                                </div>
                            </div>
                        </div>
                        <div id="cDownRight" class="cDown">
                            <h2>Md. Nahid Hasan</h2>
                            <p>Dept. of CSE</p>
                            <p>Stamford University Bangladesh.</p>
                            <div id="social">
                                <div id="icondiv">
                                    <a href="https://facebook.com/nahid.achromatic98"><img src="images/fb-icon.png" alt="Facebook-Icon" id="fbicon" style="margin-left:10px;"></a>
                                    <a href="https://github.com/nahidhasan98"><img src="images/github-icon.png" alt="Github-Icon" id="giticon" style="margin-left:40px;"></a>
                                    <a href="mailto:mnh.nahid35@gmail.com"><img src="images/gmail-icon.png" alt="Gmail-Icon" id="gicon" style="margin-left:35px;margin-right:30px;"></a>
                                    <a href="tel:+8801760781145"><img src="images/phone-icon.png" alt="Phone-Icon" id="plicon"></a>
                                </div>
                                <div id="linkdiv">
                                    <a href="https://facebook.com/nahid.achromatic98">Facebook</a>
                                    <a href="https://github.com/nahidhasan98">Github</a>
                                    <a href="mailto:mnh.nahid35@gmail.com">E-Mail</a>
                                    <a href="tel:+8801760781145">Phone</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>