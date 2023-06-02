var UsuarioList = [];



function addUsuarioToSystem(pid, pnombre, pdireccion, ptelefono, ){

    var NuevoAmigo = {
        id : pid,
        nombre : pnombre,
        telefono : ptelefono,
        direccion : pdireccion,
        
    };
    console .log(NuevoAmigo);
    UsuarioList.push(NuevoAmigo);
}

function getUsuarioList(){
    return UsuarioList;
}

