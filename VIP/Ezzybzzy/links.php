<?php
    session_start();
    $_SESSION["last"] = "links.php" ;
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Useful Links | EzzyBzzy</title>
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
                <div id="linkTb">
                    <table id="linkTable">
                        <tr>
                            <th>Topic</th>
                            <th>Web-Links</th>
                            <th>Video-Links</th>
                        </tr>
                        <tr>
                            <td class="tt">HTML</td>
                            <td><a href="https://www.w3schools.com/html/default.asp">HTML Tutorial</a></td>
                            <td><a href="https://www.youtube.com/playlist?list=PLog3UvAPcD8SDkIH-ri1xe3ZbSLC6FJhx">HTML Video Tutorial Bangla</a></td>
                        </tr>
                        <tr>
                            <td class="tt">CSS</td>
                            <td><a href="https://www.w3schools.com/css/default.asp">CSS Tutorial</a></td>
                            <td><a href="https://www.youtube.com/playlist?list=PLP9IO4UYNF0XQNx1OinMm84lyGzWSWDms">CSS Video Tutorial</a></td>
                        </tr>
                        <tr>
                            <td class="tt">Javascript</td>
                            <td><a href="https://www.w3schools.com/js/default.asp">JavaScript Tutorial</a></td>
                            <td><a href="https://www.youtube.com/watch?v=PkZNo7MFNFg">Javascript Video Tutorial</a></td>
                        </tr>
                        <tr>
                            <td class="tt">PHP</td>
                            <td><a href="https://www.tutorialrepublic.com/php-tutorial/">PHP Tutorial</a></td>
                            <td><a href="https://www.youtube.com/watch?v=OK_JCtrrv-c">PHP Video Tutorial</a></td>
                        </tr>
                        <tr>
                            <td class="tt">C</td>
                            <td><a href="https://jakir.me/c/">C Tutorial</a></td>
                            <td><a href="https://www.youtube.com/playlist?list=PLq-SIyBu2IPvls9X9OmujOQsECjupzwi6">C Video Tutorial Bangla</a></td>
                        </tr>
                        <tr>
                            <td class="tt">C++</td>
                            <td><a href="https://www.tutorialspoint.com/cplusplus/">C++ Tutorial</a></td>
                            <td><a href="https://www.youtube.com/watch?v=vLnPwxZdW4Y">C++ Video Tutorial</a></td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>