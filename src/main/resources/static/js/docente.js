/**
 * 
 */
$('#addDocente').click(function () {
	$('#modalDocente').modal("show"); 
});

$(".btnGuardarDocente").click(function() {

    var jsonVar = {
        nombres: $(".d_nombres").val(),
        apellidos: $(".d_apellidos").val(),
        genero: $("#d_genero").val(),
        nacimiento: $(".d_nacimiento").val(),
        especialidad : $(".d_especialidad").val(),
        dni: $(".d_dni").val(),
        usuario: $(".d_usuario").val(),
        password: $(".d_password").val()
    };

    $.ajax({
        type:"POST",
        url:"/docente/create",
        data: JSON.stringify(jsonVar),
        contentType: "application/json",
        success: function(data){
        	Swal.fire({
        		  position: 'top-end',
        		  icon: 'success',
        		  title: 'Your work has been saved',
        		  showConfirmButton: false,
        		  timer: 1500
        		})
        },
        error: function(err) {
            console.log(err);
            alert(err);
        }
    });

});