<?php
$dni = $_POST["txtDni"];
$nombres = $_POST["txtNombres"];
$apellidos = $_POST["txtApellidos"];
$edad = $_POST["txtEdad"];
$correo = $_POST["txtCorreo"];
$contrasena = $_POST["txtContrasena"];

$handle = fopen("archivos/registroLogin.txt", "a+");
$todo = fread($handle, filesize("archivos/registroLogin.txt"));
$lineas = explode(chr(13) . chr(10), $todo);
for ($i = 0; $i < count($lineas); $i++) {
    $palabra = explode("|", $lineas[$i]);
    if ($dni == $palabra[0]) {
        $bandera = 1;
        break;
    } else {
        $bandera = 0;
    }
}

if ($bandera == 0) {
    $handle = fopen("archivos/registroLogin.txt", "a+");
    $texto = $dni . "|" . $nombres . "|" . $apellidos . "|" . $edad . "|" . $correo . "|" . $contrasena . chr(13) . chr(10);
    fwrite($handle, $texto);
    fclose($handle);
    header("location:registroSesion.html");
    
} else {
    echo"Ya existe el Dni";
}
?>
<a href="registroSesion.html">Retornar a Registro</a>

<?php
?>