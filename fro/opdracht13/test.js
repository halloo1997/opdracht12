const wrapper = document.getElementById('wrapper');
const myAssignment = document.getElementById('myAssignment');
const myAnswer = document.getElementById('myAnswer');
const feedback = document.getElementById('enter');

let mySum;
let sound = new Audio();

function makeSum() {
  var a = Math.floor(Math.random() * 9 + 1);
  var b = Math.floor(Math.random() * 9 + 1);
  mySum = a * b;
  myAssignment.innerHTML = a + " x " + b;
  myAnswer.focus();
}
function keyPressed(evt) {
  if (evt.keyCode == 13) {
    if (eval(mySum) == myAnswer.value) {
      feedback.src = "img/goed.jpg";
      sound.src = "img/ES_Happy Chiptune 1 - Josef Habib.mp3"
      sound.play();
    } else {
      feedback.src = "img/fout.jpg";
      sound.src = "img/ES_Sad Drama 5 - Merlean.mp3"
      sound.play();
    }

    window.setTimeout(waiting,2000);
  }
}
function waiting() {
  feedback.src = "img/feedback.png";
  myAnswer.value = "";
  makeSum();
}

makeSum();
myAnswer.addEventListener("keydown", keyPressed, false);
