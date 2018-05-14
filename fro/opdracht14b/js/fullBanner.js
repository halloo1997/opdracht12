let Pam = document.querySelector('.fb__Pam');
let kan = document.querySelector('.fb__kan');
let alles = document.querySelector('.fb__alles');
let ballon = document.querySelector('.fb__ballon');
let waggel = document.querySelector('.fb__waggel');
let laag1 = document.querySelector('.fb__laag1');
let tuts = document.querySelector('.fb__tut');
let html = document.querySelector('.fb__html');
let css = document.querySelector('.fb__css');
let jcs = document.querySelector('.fb__js');

const animeren = () => {
    setTimeout( () => {Pam.classList.remove('fb--uit')}, 1);
    setTimeout( () => {kan.classList.remove('fb--uit')}, 300);
    setTimeout( () => {alles.classList.remove('fb--uit')}, 600);
    setTimeout( () => {ballon.classList.remove('fb--uit')}, 900);
    setTimeout( () => {waggel.classList.add('fb--waggel')}, 1000);

    // Over naar laag 2
    setTimeout( () => {laag1.classList.add('fb--uit')}, 1800);
    setTimeout( () => {tuts.classList.add('fb--uit')}, 2000);
    setTimeout( () => {html.classList.remove('fb--uit')}, 2300);
    setTimeout( () => {css.classList.remove('fb--uit')}, 2600);
    setTimeout( () => {jcs.classList.remove('fb--uit')}, 2900);

    // terug naar laag1
    setTimeout( () => terugzetten1(), 3500);
    setTimeout( () => {laag1.classList.remove('fb--uit')}, 4000);
    setTimeout( () => terugzetten2(), 4300);

}

const terugzetten1 = () => {
    Pam.classList.add('fb--uit');
    kan.classList.add('fb--uit');
    alles.classList.add('fb--uit');
    ballon.classList.add('fb--uit');
    waggel.classList.remove('fb--waggel');

}

const terugzetten2 = () => {
    tuts.classList.remove('fb--uit');
    html.classList.add('fb--uit');
    css.classList.add('fb--uit');
    jcs.classList.add('fb--uit');

}
animeren();

setInterval( () => animeren(), 4000);
// banner linken

const gaNaarPagina = () => window.open('https://www.youtube.com/', '_blank');
document.querySelector('.fb').addEventListener('click', gaNaarPagina);