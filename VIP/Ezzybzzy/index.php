<?php
    session_start();
    $_SESSION["last"] = "index.php" ;
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
                <div id="home" style="height:500px;">
                    <?php
                        if(isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] === true){
                            $welcomeName = $_SESSION["username"];
                            echo "<marquee scrollamount='8' style='font-size:28px;padding:10px;color:#1f74ad; margin:200px 20px 0 20px;'>Hello $welcomeName! Welcome!!</marquee>";
                        }
                        else
                            echo "<marquee scrollamount='8' style='font-size:28px;padding:10px;color:#1f74ad; margin:200px 20px 0 20px;'>Hello Everyone! Welcome!!</marquee>";
                    ?>
                </div>
            </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>