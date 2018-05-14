<?php

require('../private/onnetvars.php');
include('helloworld.php');

$dbc = mysqli_connect(HOST, USER, PASS, DBNAME) or die('Error connecting.');
echo 'Succes!';