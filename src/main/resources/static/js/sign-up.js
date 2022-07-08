

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
    document.getElementById("arrow").style.display="block";
});

const arrow_back = document.getElementById("arrow");

arrow_back.addEventListener("click", function(){
    document.getElementById("name").style.display="block";
    document.getElementById("surname").style.display="block";
    document.getElementById("email").style.display="block";
    document.getElementById("username").style.display="none";
    document.getElementById("birthdate").style.display="none";
    document.getElementById("password").style.display="none";
    document.getElementById("confirm_password").style.display="none";
    document.getElementById("address").style.display="block";
    document.getElementById("next").style.display="block";
    document.getElementById("submit").style.display="none";
    document.getElementById("arrow").style.display="none";

});

