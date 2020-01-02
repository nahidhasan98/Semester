<?php
    session_start();
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
                    <div id="authentication">
                        <ul>
                            <li id="name"><?php echo $_SESSION['username'] ?></li>
                            <li><a href="reset.php">Change Password</a></li>
                            <li><a href="logout.php"><i class="fa fa-user"></i>Logout</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div id="content">
                <div id="htmlLevel">
                    <h2>HTML Level</h2>
                    <img src="" alt="" height="25px" width="25px"><p><a href="qh1.php">Level 1</a></p>
                    <img src="" alt="" height="20px" width="20px"><p><a href="">Level 2</a><br></p>
                    <img src="" alt="" height="20px" width="20px"><p><a href="">Level 3</a></p>
                    <img src="" alt="" height="20px" width="20px"><p><a href="">Level 4</a></p>
                </div>
            </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>