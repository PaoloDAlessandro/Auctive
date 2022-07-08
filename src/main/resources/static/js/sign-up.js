 //MOBILE SCRIPT - PAOLO

const next_button = document.getElementById("next");

next_button.addEventListener("click", function(){
    document.getElementById("name").style.display="none";
    document.getElementById("surname").style.display="none";
    document.getElementById("email").style.display="none";
    document.getElementById("username").style.display="block";
    document.getElementById("birthdate").style.display="block";
    document.getElementById("password").style.display="block";
    document.getElementById("confirm_password").style.display="block";
    document.getElementById("address").style.display="none";
    document.getElementById("next").style.display="none";
    document.getElementById("submit").style.display="block";
});