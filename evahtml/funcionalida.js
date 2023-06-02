



function imprimirTablaUsuario(){
    var list = getUsuarioList(),
    tbody = document.querySelector('#UsuariosTabla tbody');


    tbody.innerHTML = "";

    for(var i = 0; i < list.length; i++){
        var row = tbody.insertRow(i),
        idCell = row.insertCell(0),
        NombreCell = row.insertCell(1),
        telefonoCell = row.insertCell(2),
        direccionCell = row.insertCell(3);
        
       

        idCell.innerHTML = list[i].id;
        NombreCell.innerHTML = list[i].nombre;
        telefonoCell.innerHTML = list[i].telefono;
        direccionCell.innerHTML = list[i].direccion;
        


        var inputSelect = document.createElement('input');
        inputSelect.type="radio"
        inputSelect.value = list[i].id
        selectCell.appendChild(inputSelect);
        
        tbody.appendChild(row);
    }
}