const mobile_nav = document.getElementById('mobile-nav');
const mobile_nav_exit = document.getElementById('mobile-nav_options_container-exit');
const mobile_nav_options_container = document.getElementById("mobile-nav_options_container");
mobile_nav.addEventListener("click", function() {
    mobile_nav_options_container.style.transform = "translateX(0)";
    mobile_nav.style.animation = "none";
    mobile_nav.style.animation = "rotate .4s ease-in";
    setTimeout(function() {
        mobile_nav.style.display = "none";
    }, 500);
});

mobile_nav_exit.addEventListener("click", function() {
    mobile_nav_options_container.style.transform = "translateX(-100%)";
    mobile_nav.style.display = "flex";
});