const profilo = document.getElementById("clicked-profilo");
const pagamento = document.getElementById("clicked-pagamento");
const record = document.getElementById("clicked-record");
const prodotti = document.getElementById("clicked-prodotti");

const profilo_title = document.getElementById("account-title");
const pagamento_title = document.getElementById("payment-title");
const record_title = document.getElementById("record-title");
const prodotti_title = document.getElementById("products-title");

const profilo_section = document.getElementById("account-section");
const pagamento_section = document.getElementById("payment-section");
const record_section = document.getElementById("record-section");
const prodotti_section = document.getElementById("prodotti-section");

const background_dorato = "#FFD43B";
const background_grigio = "#C4C4C41A";

const text_dark_blue = "#183153";
const text_gray = "#C4C4C4";

profilo.onclick = function(){
    profilo_click();
}

function profilo_click(){

        profilo_title.style.color = text_dark_blue;
        profilo.style.backgroundColor = background_dorato;
        profilo.style.border = "1px solid #183153";
        profilo_section.style.display = "block";

        pagamento_title.style.color = text_gray;
        pagamento.style.backgroundColor = background_grigio;
        pagamento.style.border = "0px";
        pagamento_section.style.display = "none";

        record_title.style.color = text_gray;
        record.style.backgroundColor = background_grigio;
        record.style.border = "0px";
        record_section.style.display = "none";

        prodotti_title.style.color = text_gray;
        prodotti.style.backgroundColor = background_grigio;
        prodotti.style.border = "0px";
        prodotti_section.style.display = "none";

}


pagamento.onclick = function(){
    pagamento_click();
}

function pagamento_click(){

    pagamento_title.style.color = text_dark_blue;
    pagamento.style.backgroundColor = background_dorato;
    pagamento.style.border = "1px solid #183153";
    pagamento_section.style.display = "block";

    profilo_title.style.color = text_gray;
    profilo.style.backgroundColor = background_grigio;
    profilo.style.border = "0px";
    profilo_section.style.display = "none";

    record_title.style.color = text_gray;
    record.style.backgroundColor = background_grigio;
    record.style.border = "0px";
    record_section.style.display = "none";

    prodotti_title.style.color = text_gray;
    prodotti.style.backgroundColor = background_grigio;
    prodotti.style.border = "0px";
    prodotti_section.style.display = "none";


}

record.onclick = function(){
    record_click();
}

function record_click(){

    record_title.style.color = text_dark_blue;
    record.style.backgroundColor = background_dorato;
    record.style.border = "1px solid #183153";
    record_section.style.display = "block";

    profilo_title.style.color = text_gray;
    profilo.style.backgroundColor = background_grigio;
    profilo.style.border = "0px";
    profilo_section.style.display = "none";

    pagamento_title.style.color = text_gray;
    pagamento.style.backgroundColor = background_grigio;
    pagamento.style.border = "0px";
    pagamento_section.style.display = "none";

    prodotti_title.style.color = text_gray;
    prodotti.style.backgroundColor = background_grigio;
    prodotti.style.border = "0px";
    prodotti_section.style.display = "none";

}

prodotti.onclick = function(){
    prodotti_click();
}

function prodotti_click(){

    prodotti_title.style.color = text_dark_blue;
    prodotti.style.backgroundColor = background_dorato;
    prodotti.style.border = "1px solid #183153";
    prodotti_section.style.display = "block";


    profilo_title.style.color = text_gray;
    profilo.style.backgroundColor = background_grigio;
    profilo.style.border = "0px";
    profilo_section.style.display = "none";

    pagamento_title.style.color = text_gray;
    pagamento.style.backgroundColor = background_grigio;
    pagamento.style.border = "0px";
    pagamento_section.style.display = "none";

    record_title.style.color = text_gray;
    record.style.backgroundColor = background_grigio;
    record.style.border = "0px";
    record_section.style.display = "none";

}


const add_card = document.getElementById("add-card");
const card = document.getElementById("card-information-div");

const close_tab = document.getElementById("close-tab");

add_card.onclick = function(){
    added_new_card();
}

function added_new_card(){
    card.style.display = "block";
}

close_tab.onclick = function(){
    close_tab_click();
}

function close_tab_click(){
    card.style.display = "none";
}