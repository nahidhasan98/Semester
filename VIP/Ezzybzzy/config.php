<?php
    define('DB_SERVER', 'localhost');
    define('DB_USERNAME', 'id9390356_ezzybzzy');
    define('DB_PASSWORD', 'e33nahid');
    define('DB_NAME', 'id9390356_sample');
    
    $mysqli = new mysqli(DB_SERVER, DB_USERNAME, DB_PASSWORD, DB_NAME);
    
    if($mysqli === false){
        die("ERROR: Could not connect. " . $mysqli->connect_error);
    }
?>