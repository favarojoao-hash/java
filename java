const formulario = document.getElementById("formulario-login"); 
formulario.addEventListener("submit", function (event) { event.preventDefault(); 
const usuario = document.getElementById("usuario").value;
const senha = document.getElementById("senha").value; const usuarioCorreto = "user"; 
const senhaCorreta = "123";
 if (usuario === usuarioCorreto && senha === senhaCorreta) { alert("Login feito com sucesso."); 
} else {
alert("Usuário ou senha incorreto."); } });
