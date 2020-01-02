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
                <div id="result">
                    <h2>Result</h2>
                    <?php
                        $point = $_SESSION['count'];
                        echo "<h3 style='color: #175782; text-align: center; margin-top: 10px;'>Your score: $point out of 10.</h3>";
                    ?>
                    <div id="resultTb">
                        <table id="resTable">
                            <tr>
                                <th>Question</th>
                                <th>Verdict</th>
                            </tr>
                            <?php 
                                for($i=1;$i<=10;$i++)
                                {
                                    echo "<tr><td>$i</td>";
                                        if($_SESSION['res'][$i-1]==true){
                                                $num = $i;
                                                echo "<td><img src='images/tick.png' height='20px' width='20px'></td></tr>";
                                        }
                                        else if($_SESSION['res'][$i-1]==false){
                                            $num = $i;
                                            echo "<td><img src='images/cross.png' height='20px' width='20px'></td></tr>";
                                        }
                                    echo "</tr>";
                                }
                            ?>
                        </table>
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