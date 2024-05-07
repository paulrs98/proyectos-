<?php
$dni = $_POST["txtDni"];
$contrasena = $_POST["txtContrasena"];
$handle = fopen("archivos/registroLogin.txt", "r");
$todo = fread($handle, filesize("archivos/registroLogin.txt"));
$lineas = explode(chr(13) . chr(10), $todo);
for ($i = 0; $i < count($lineas); $i++) {
    $palabra = explode("|", $lineas[$i]);
    if ($dni == $palabra[0] && $contrasena == $palabra[5]) {
        echo "<h2>Bienvenido:" . $palabra[1] . "," . $palabra[2] . "</h2>";
        header("location:intranet.html");
        $bandera = 1;
        break;
    } else {
        $bandera = 0;
        header("location:error.php");
    }
}
?>