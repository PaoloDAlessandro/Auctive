//MOBILE SCRIPT - PAOLO

const name_mobile_input = document.getElementById("name_mobile");
const surname_mobile_input = document.getElementById("surname_mobile");
const email_mobile_input = document.getElementById("email_mobile");
const username_mobile_input = document.getElementById("username_mobile");
const password_mobile_input = document.getElementById("password_mobile");
const confirm_password_mobile_input = document.getElementById("confirm_password_mobile");
const sign_in_next_button = document.getElementById("mobile_sign-in_next");

var step = 0;

sign_in_next_button.addEventListener("click", function(){
    switch(step){
        case 0:
            name_mobile_input.style.animation = "fade-out .4s ease-in";
            surname_mobile_input.style.animation = "fade-out .4s ease-in";
            setTimeout(function() {
                name_mobile_input.style.display = "none";
                surname_mobile_input.style.display = "none";
                email_mobile_input.style.animation = "fade-in .4s ease-in";
                username_mobile_input.style.animation = "fade-in .4s ease-in";
                email_mobile_input.style.display = "block";
                username_mobile_input.style.display = "block";
            }, 400);

            step++;
            break;
    
        case 1:
            email_mobile_input.style.animation = "fade-out .4s ease-in";
            username_mobile_input.style.animation = "fade-out .4s ease-in";
            setTimeout(function() {
                email_mobile_input.style.display = "none";
                username_mobile_input.style.display = "none";
                password_mobile_input.style.animation = "fade-in .4s ease-in";
                confirm_password_mobile_input.style.animation = "fade-in .4s ease-in";
                password_mobile_input.style.display = "block";
                confirm_password_mobile_input.style.display = "block";
            }, 400);
            
            sign_in_next_button.innerHTML = "Sign-in";
    }
});