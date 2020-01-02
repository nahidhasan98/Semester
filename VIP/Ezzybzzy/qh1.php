<?php
    session_start();
    $_SESSION["last"] = "index.php" ;

    require_once "config.php";

    if($_SERVER["REQUEST_METHOD"] == "POST"){
        $counter = 0;
        $answer="";
        $verdict = array(false,false,false,false,false,false,false,false,false,false); 

        for($i=1;$i<=10;$i++){
            $answerName = 'answer'.$i;

            if(!empty($_POST["$answerName"]))
                $answer = $_POST["$answerName"];

            if($answer==1 || $answer==2 || $answer==3 || $answer==4){
                $sql = "SELECT answer FROM qh1 WHERE id = '$i' ";

                if($stmt = $mysqli->prepare($sql)){
                    if($stmt->execute()){
                        $stmt->store_result();
                        $stmt->bind_result($originalanswer);

                        if($stmt->fetch()){
                            if($answer == $originalanswer){
                                $counter ++;
                                $verdict[$i-1]=true;
                            }
                        }
                    }
                    else
                        echo "Oops! Something went wrong. Please try again later.";
                }
                $stmt->close();
            }
        }
        $_SESSION['res'] = $verdict;
        $_SESSION['count'] = $counter;

        $uName = $_SESSION['username'];

        $sql2 = "SELECT point FROM user WHERE username = '$uName'";
        $result = $mysqli->query($sql2);
        $row = $result->fetch_array();

        $point= max($row['point'],$counter);

        $sql3 = "UPDATE user SET point='$point' WHERE username='$uName'";
        $mysqli->query($sql3);

        header("location: result.php");
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
                <div id="quizContent">
                    <h2>HTML QUIZ : Level 1</h2>
                    <form id="quiz" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
                        <p>1. What does HTML stand for?</p>
                        <input type="radio" name="answer1" value="1" id="i1"><label for="i1"> Home Tool Markup Language</label><br>
                        <input type="radio" name="answer1" value="2" id="i2"><label for="i2"> Hyper Text Markup Language</label><br>
                        <input type="radio" name="answer1" value="3" id="i3"><label for="i3"> Hyperlinks and Text Markup Language</label><br>
                        <input type="radio" name="answer1" value="4" id="i4"><label for="i4"> Hyper Trick Making Language</label><br>
                        <p>2. Who is making the Web standards?</p>
                        <input type="radio" name="answer2" value="1" id="i5"><label for="i5"> The World Wide Web Consortium</label><br>
                        <input type="radio" name="answer2" value="2" id="i6"><label for="i6"> Microsoft</label><br>
                        <input type="radio" name="answer2" value="3" id="i7"><label for="i7"> Google</label><br>
                        <input type="radio" name="answer2" value="4" id="i8"><label for="i8"> Mozilla</label><br>
                        <p>3. Choose the correct HTML element for the largest heading:</p>
                        <input type="radio" name="answer3" value="1" id="i9"><label for="i9"> &lth6&gt</label><br>
                        <input type="radio" name="answer3" value="2" id="i10"><label for="i10"> &lthead&gt</label><br>
                        <input type="radio" name="answer3" value="3" id="i11"><label for="i11"> &lth1&gt</label><br>
                        <input type="radio" name="answer3" value="4" id="i12"><label for="i12"> &ltheading&gt</label><br>
                        <p>4. What is the correct HTML element for inserting a line break?</p>
                        <input type="radio" name="answer4" value="1" id="i13"><label for="i13"> &ltlb&gt</label><br>
                        <input type="radio" name="answer4" value="2" id="i14"><label for="i14"> &ltbreak&gt</label><br>
                        <input type="radio" name="answer4" value="3" id="i15"><label for="i15"> &ltbr&gt</label><br>
                        <input type="radio" name="answer4" value="4" id="i16"><label for="i16"> &lt/r&gt</label><br>
                        <p>5. What is the correct HTML for adding a background color?</p>
                        <input type="radio" name="answer5" value="1" id="i17"><label for="i17"> &ltbody-bg="yellow"&gt</label><br>
                        <input type="radio" name="answer5" value="2" id="i18"><label for="i18"> &ltbody style="background-color:yellow;"&gt</label><br>
                        <input type="radio" name="answer5" value="3" id="i19"><label for="i19"> &ltbackground>yellow&lt/background&gt</label><br>
                        <input type="radio" name="answer5" value="4" id="i20"><label for="i20"> &ltbody-back="color:yellow;"&gt</label><br>
                        <p>6. Choose the correct HTML element to define important text:</p>
                        <input type="radio" name="answer6" value="1" id="i21"><label for="i21"> &ltimportant&gt</label><br>
                        <input type="radio" name="answer6" value="2" id="i22"><label for="i22"> &ltb&gt</label><br>
                        <input type="radio" name="answer6" value="3" id="i23"><label for="i23"> &lti&gt</label><br>
                        <input type="radio" name="answer6" value="4" id="i24"><label for="i24"> &ltstrong&gt</label><br>
                        <p>7. Choose the correct HTML element to define emphasized text:</p>
                        <input type="radio" name="answer7" value="1" id="i25"><label for="i25"> &ltem&gt</label><br>
                        <input type="radio" name="answer7" value="2" id="i26"><label for="i26"> &lti&gt</label><br>
                        <input type="radio" name="answer7" value="3" id="i27"><label for="i27"> &ltitalic&gt</label><br>
                        <input type="radio" name="answer7" value="4" id="i28"><label for="i28"> &ltet&gt</label><br>
                        <p>8. What is the correct HTML for creating a hyperlink?</p>
                        <input type="radio" name="answer8" value="1" id="i29"><label for="i29"> &lta name="http://www.w3schools.com"&gtW3schools.com&lt/a&gt</label><br>
                        <input type="radio" name="answer8" value="2" id="i30"><label for="i30"> &lta url="http://www.w3schools.com"&gtW3schools.com&lt/a&gt</label><br>
                        <input type="radio" name="answer8" value="3" id="i31"><label for="i31"> &lta&gtwww.w3schools.com&lt/a&gt</label><br>
                        <input type="radio" name="answer8" value="4" id="i32"><label for="i32"> &lta href="http://www.w3schools.com"&gtW3schools.com&lt/a&gt</label><br>
                        <p>9. Which character is used to indicate an end tag?</p>
                        <input type="radio" name="answer9" value="1" id="i33"><label for="i33"> &lt</label><br>
                        <input type="radio" name="answer9" value="2" id="i34"><label for="i34"> /</label><br>
                        <input type="radio" name="answer9" value="3" id="i35"><label for="i35"> *</label><br>
                        <input type="radio" name="answer9" value="4" id="i36"><label for="i36"> &gt</label><br>
                        <p>10. How can you open a link in a new tab/browser window?</p>
                        <input type="radio" name="answer10" value="1" id="i37"><label for="i37"> &lta href="url" new&gt</label><br>
                        <input type="radio" name="answer10" value="2" id="i38"><label for="i38"> &lta href="url" target="new"&gt</label><br>
                        <input type="radio" name="answer10" value="3" id="i39"><label for="i39"> &lta href="url" target="_blank"&gt</label><br>
                        <input type="radio" name="answer10" value="4" id="i40"><label for="i40"> &lta href="url" target="new_tab"&gt</label><br>

                        <input type="submit" class="quizSubmit" value="Submit" name="">
                    </form>
                </div>
            <div id="footer">
                <p><center>&copy; EzzyBzzy | All Right Reserved.</center></p>
            </div>
        </div>
        <script src="scripts/main.js"></script>
    </body>
</html>