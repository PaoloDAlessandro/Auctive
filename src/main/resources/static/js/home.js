const search_input = document.getElementById("search_input");
const search_bar = document.getElementById("search_bar");
const body = document.getElementsByTagName("body");


body[0].addEventListener("click", function(event) {
    if(event.target === search_input) {
        search_bar.style.boxShadow = "0 0 0 5px #0000001a";
    }
    else {
        search_bar.style.boxShadow = "none";
    }
});