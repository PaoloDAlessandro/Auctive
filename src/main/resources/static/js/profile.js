const collectionButton = document.getElementById("profile-collection-button");
const infoButton = document.getElementById("profile-info-button");
const profileCollection = document.getElementById("profile-collection");
const profileInfo = document.getElementById("profile-info");

collectionButton.onclick = function() {
    collectionClick();
}

function collectionClick() {
    profileCollection.style.display = "block";
    profileInfo.style.display = "none";
}

infoButton.onclick = function() {
    infoClick();
}

function infoClick() {
    profileInfo.style.display = "block";
    profileCollection.style.display = "none";
}

const username_profile = document.getElementById("account-popup");
const account_menu = document.getElementById("account-popup-menu");

username_profile.addEventListener("click", function(){
    account_menu.style.display="block";
});