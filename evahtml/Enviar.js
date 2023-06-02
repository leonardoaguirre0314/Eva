$(document).ready(function(){
    alert("Aquiiii ")
    $("#listar").on('click', function() {
//print"UsuariosTabla"console;
console.log(respuesta)
        let tabla = document.querySelector('#UsuariosTabla');
        tabla.innerHTML= '#UsuariosTabla';
        $.ajax({
            url:"http://localhost:8080/listarcliente",
            type: "GET",
            datatype:"JSON",
            
            success:function(respuesta){
                console.log(respuesta);
            for (i = 0 ;i<=respuesta.length; i++){
                tabla.innerHTML += '<tr><td>'+ respuesta[i].id +
                '<td><td>'+ respuesta[i].Nombre +
                '<td><td>'+ respuesta[i].telefono +
                '<td><td>'+ respuesta[i].direccion +
                '<td><tr>';
            }
            
            }

            
        })





        

    });


    $('#btnGuardarUsuario').on('click' ,function(){


        let datos ={
            id: parseInt($('#txtId').val()),
            nombre: $('#telefono').val(),
            telefono: $('#telefono').val(),
            direccion: $('#direccion').val(),
            
           
        }
        let datosEnvio = JSON.stringify(datos);
        $.ajax({
            url:"http://localhost:8080/agregarcliente",
            type:'POST',
            data:datosEnvio,
            contentType:"application/JSON",
            datatype:JSON,
            success: function(respuesta){
                console.log(respuesta);
            }
        })
    
    });


   
});