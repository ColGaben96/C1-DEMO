
function terminos(){
    var element = document.forms["miForm"]["validacion"].checked;
    if(element == true){
        alert("Los datos se guardaron exitosamente");
        return false;
    }else{
        alert("Acepta los terminos y Condiciones para seguir");
        return false;
    }
}
