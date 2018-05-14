<?php

include('head_backup.php');
include('onnetvars.php');

$dbc = mysqli_connect($host, $user, $pass, $db) or die('Error connecting.');
echo 'Succes!';
include('footer.php');